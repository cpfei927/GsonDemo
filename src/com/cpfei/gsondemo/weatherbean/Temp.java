package com.cpfei.gsondemo.weatherbean;

public class Temp {
	public Double min;
	public Double eve;
	public Double max;
	public Double morn;
	public Double night;
	public Double day;
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public Double getEve() {
		return eve;
	}
	public void setEve(Double eve) {
		this.eve = eve;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	public Double getMorn() {
		return morn;
	}
	public void setMorn(Double morn) {
		this.morn = morn;
	}
	public Double getNight() {
		return night;
	}
	public void setNight(Double night) {
		this.night = night;
	}
	public Double getDay() {
		return day;
	}
	public void setDay(Double day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Temp [min=" + min + ", eve=" + eve + ", max=" + max + ", morn="
				+ morn + ", night=" + night + ", day=" + day + "]";
	}
	
}
