package com.cpfei.gsondemo.weatherbean;

import java.util.List;

public class WeatherList {
	public int clouds;
	public int dt;
	public int humidity;
	public Double pressure;
	public Double speed;
	public int deg;
	public Temp temp;
	public List<Weather> weather;

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}

	public Temp getTemp() {
		return temp;
	}

	public void setTemp(Temp temp) {
		this.temp = temp;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "WeatherList [clouds=" + clouds + ", dt=" + dt + ", humidity="
				+ humidity + ", pressure=" + pressure + ", speed=" + speed
				+ ", deg=" + deg + ", temp=" + temp + ", weather=" + weather
				+ "]";
	}

}
