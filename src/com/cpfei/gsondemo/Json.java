package com.cpfei.gsondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Json extends Activity {

	private String str;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.fragment_main);
		tv = (TextView) findViewById(R.id.tv);
		getString(this);

		getJsonList();

	}

	private void getString(Context context) {
		InputStream is = context.getResources().openRawResource(R.raw.json);

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));

		StringBuilder sb = new StringBuilder();

		String line = null;

		try {
			while ((line = reader.readLine()) != null) {

				sb.append(line + "/n");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		str = sb.toString();

	}

	private void getJsonList() {
		JSONObject obj;
		try {
			obj = new JSONObject(str);
			JSONArray jsonArray = obj.getJSONArray("data");

			Log.i("Tag", jsonArray.toString());

			String string = jsonArray.toString();
			string.replace("[", "");
			string.replace("]", "");
			

			String[] split = string.split(",");

			String ss = "";
			
			for (int i = 0; i < split.length; i++) {
				
				Log.i("Tag", split[i]);
				
				ss += split[i];
				ss += "\n";

			}
			tv.setText(ss);

		} catch (JSONException e) {
			e.printStackTrace();
		}

	}

}
