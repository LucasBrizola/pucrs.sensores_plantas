package com.pucrs.sensores_plantas.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Sensor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private int umidade;
	private String message;

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

	public String getMessage() {
		return message;
	}

}
