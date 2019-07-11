package com.pucrs.sensores_plantas.model;

public class Morangos implements Tipo {
	public Morangos() {

	}

	protected Integer id = 43242;

	public Integer getId() {
		return id;
	}

	public String testUmidade(int umidade) {
		String msg = null;
		if (umidade < 60) {
			msg = "A umidade está abaixo do ideal!";}
		else if(umidade > 80){
			msg = "A umidade está acima do ideal!";}
		else if(umidade >= 60 && umidade <= 80){
			msg = "A umidade está ideal!";}
		return msg;
	}

}
