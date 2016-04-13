package com.cpfei.gsondemo;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtils {
	
	/**
	 * 实体类数据转化成json
	 * @param bean
	 * @return String
	 */
	public static String bean2json(Object bean) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss")
				.create();
		// .setPrettyPrinting()
		return gson.toJson(bean);
	}
	
	/**
	 * Json 转化成实体类
	 * @param json
	 * @param type
	 * @return bean
	 */

	@SuppressWarnings("unchecked")
	public static <T> T json2bean(String json, Type type) {
		try {
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss")
					.create();
			return (T) gson.fromJson(json, type);
		} catch (Exception e) {
			return null;
		}
	}
}
