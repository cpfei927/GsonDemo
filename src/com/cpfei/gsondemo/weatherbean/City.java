package com.cpfei.gsondemo.weatherbean;

public class City {
	public int id;
	public String name;
	public int population;
	public String country;
	public Coord coord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population="
				+ population + ", country=" + country + ", coord=" + coord
				+ "]";
	}

}
