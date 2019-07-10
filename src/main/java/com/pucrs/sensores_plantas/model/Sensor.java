package com.pucrs.sensores_plantas.model;

public class Sensor {
	private Integer id;
	private int umidade;
	private String message;

	public Sensor(Integer id, int umidade, String message) {
		super();
		this.id = id;
		this.umidade = umidade;
		this.message = message;
	}

	public int getId() {
		return (int)id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getUmidade() {
		return umidade;
	}

	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}

	public String getMessage() {
		return message;
	}

}
