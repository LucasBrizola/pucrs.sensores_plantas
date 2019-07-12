package com.pucrs.sensores_plantas.model;

public class Morangos implements Tipo {
	public Morangos() {

	}

	protected Integer id = 43242;
	protected int umdMin = 60;
	protected int umdMax = 80;
	protected String nome = "Morangos";

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getUmdMin() {
		return umdMin;
	}

	public int getUmdMax() {
		return umdMax;
	}

	public String testUmidade(int umidade) {
		String msg = "";
		if (umidade < umdMin) {
			msg = "A umidade está abaixo do ideal!";
		} else if (umidade > umdMax) {
			msg = "A umidade está acima do ideal!";
		} else if (umidade >= umdMin && umidade <= umdMax) {
			msg = "A umidade está ideal!";
		}
		return msg;
	}

}
