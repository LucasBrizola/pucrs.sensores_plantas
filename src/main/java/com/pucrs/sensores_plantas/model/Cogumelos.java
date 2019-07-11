package com.pucrs.sensores_plantas.model;

public class Cogumelos implements Tipo {

	public void executar(int umidade) {
		System.out.println("Sou um cogumelo");
		if(umidade < 80) System.out.println("A umidade está abaixo do ideal!");
		else if(umidade > 90) System.out.println("A umidade está acima do ideal!");
		else System.out.println("A umidade está ideal!");

	}

}
