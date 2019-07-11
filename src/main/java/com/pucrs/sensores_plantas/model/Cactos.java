package com.pucrs.sensores_plantas.model;

public class Cactos implements Tipo{
	public Cactos() {
		
	};
	
	public void executar(int umidade) {
		System.out.println("Sou um cacto");
		if(umidade < 20) System.out.println("A umidade está abaixo do ideal!");
		else if(umidade > 50) System.out.println("A umidade está acima do ideal!");
		else System.out.println("A umidade está ideal!");
	}

}
