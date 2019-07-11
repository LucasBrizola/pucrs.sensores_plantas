package com.pucrs.sensores_plantas.model;

public class Morangos implements Tipo{
	public Morangos() {
		
	}
	
	public void executar(int umidade) {
		System.out.println("Sou um morango");
		if(umidade < 60) System.out.println("A umidade está abaixo do ideal!");
		else if(umidade > 80) System.out.println("A umidade está acima do ideal!");
		else System.out.println("A umidade está ideal!");
	}
	
}
