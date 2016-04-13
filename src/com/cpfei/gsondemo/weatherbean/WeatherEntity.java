package com.cpfei.gsondemo.weatherbean;

import java.util.List;

public class WeatherEntity {
	public Double message;
	public int cnt;
	public String cod;
	public City city;
	public List<WeatherList> list;
	public Double getMessage() {
		return message;
	}
	public void setMessage(Double message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<WeatherList> getList() {
		return list;
	}
	public void setList(List<WeatherList> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "WeatherEntity [message=" + message + ", cnt=" + cnt + ", cod="
				+ cod + ", city=" + city + ", list=" + list + "]";
	}
	
}
