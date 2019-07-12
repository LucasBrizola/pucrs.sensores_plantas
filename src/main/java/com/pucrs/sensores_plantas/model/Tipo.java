package com.pucrs.sensores_plantas.model;

public interface Tipo {
	public String testUmidade(int umidade);
	public String getNome();
	public int getId();
	public int getUmdMin();
	public int getUmdMax();
}
