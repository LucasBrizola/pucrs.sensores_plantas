package com.pucrs.sensores_plantas.model;

public class Planta {
	private Integer id;
	private String nome;
	private String mensagem;
	private int umidade;
	private int umdMin;
	private int umdMax;
	private Tipo tipo;
	private Sensor sensor;

	protected Planta() {

	}

	public Planta(Tipo tipo, Sensor sensor) {
		this.id = tipo.getId();
		this.nome = tipo.getNome();
		this.umidade = sensor.getHumidity();
		this.umdMin = tipo.getUmdMin();
		this.umdMax = tipo.getUmdMax();
		this.sensor = sensor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public int getUmidade() {
		return umidade;
	}

	public int getUmdMin() {
		return umdMin;
	}

	public int getUmdMax() {
		return umdMax;
	}

	public Sensor getSensor() {
		return sensor;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void SetMensagem() {
		this.mensagem = tipo.testUmidade(umidade);
	}

	public void mudarTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}