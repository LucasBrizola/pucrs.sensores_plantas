package com.pucrs.sensores_plantas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {

	private Integer id;
	private int umidade;

	protected Sensor() {
		
	}
	
	public Sensor(Integer id, int umidade) {
		super();
		this.id = id;
		this.umidade = umidade;
	}

	public int getId() {
		return (int) id;
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


    @Override
    public String toString() {
        return "sensor{" +
                "id='" + id+ '\'' +
                ", umidade=" + umidade +
                '}';
    }
}
