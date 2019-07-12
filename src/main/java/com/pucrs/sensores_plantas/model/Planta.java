package com.pucrs.sensores_plantas.model;

public class Planta {
	private String nome;
	private Integer id;
	private int umidMin;
	private int umidMax;
	private Tipo tipo;
	private Integer[] ids;
	
	public Planta() {
		this.nome = "";
		this.id = 0;
		this.umidMax = 0;
		this.umidMin = 0;
		this.tipo = null;
		this.ids = null;
	}
	
	public Planta(String nome, Integer id, int umidMin, int umidMax) {
		this.nome = nome;
		this.id = id;
		this.umidMax = umidMax;
		this.umidMin = umidMin;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getUmidMin() {
		return umidMin;
	}
	public void setUmidMin(int umidMin) {
		this.umidMin = umidMin;
	}
	public int getUmidMax() {
		return umidMax;
	}
	public void setUmidMax(int umidMax) {
		this.umidMax = umidMax;
	}
	
	public void mudarTipo(Tipo tipo) {
		this.tipo = tipo;
	}

//	public void compararId(int id2) {
//		
//		
//	}
}
