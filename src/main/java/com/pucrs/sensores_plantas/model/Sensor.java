package com.pucrs.sensores_plantas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {

	private String id;
	private int humidity;

	protected Sensor() {

	}

	public Sensor(String id, int humidity) {
		super();
		this.id = id;
		this.humidity = humidity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

/*	@Override
	public String toString() {
		return "sensor{" + "id='" + id + '\'' + ", umidade=" + umidade + '}';
	} */
}
