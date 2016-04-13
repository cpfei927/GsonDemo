package com.cpfei.gsondemo;

/**
 * 2015-4-15
 * author cpfei
 */

import com.cpfei.gsondemo.weatherbean.WeatherEntity;

import android.util.Log;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private String url = "http://api.openweathermap.org/data/2.5/forecast/daily?lat=35&lon=139&cnt=10&mode=json";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getJsonString();
	}

	private void getJsonString() {

		new Thread() {

			public void run() {
				String weatherJsonString = HttpUtils.loadTextFromURL(url);
				WeatherEntity weatherEntity = GsonUtils.json2bean(
						weatherJsonString, WeatherEntity.class);

				Log.i("Tag", weatherEntity.toString());
			};
		}.start();

	}

}
