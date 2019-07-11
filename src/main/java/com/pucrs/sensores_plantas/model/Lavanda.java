package com.pucrs.sensores_plantas.model;

public class Lavanda implements Tipo {

	public void executar(int umidade) {
		System.out.println("Sou uma lavanda");
		if(umidade < 20) System.out.println("A umidade está abaixo do ideal!");
		else if(umidade > 30) System.out.println("A umidade está acima do ideal!");
		else System.out.println("A umidade está ideal!");

	}

}
