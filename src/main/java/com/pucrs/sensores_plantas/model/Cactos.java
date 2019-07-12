package com.pucrs.sensores_plantas.model;

public class Cactos implements Tipo{
	public Cactos() {

	}
	protected Integer id = 40000;
	protected int umdMin = 20;
	protected int umdMax = 50;
	protected String nome = "Cactos";

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
		String msg = null;
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
