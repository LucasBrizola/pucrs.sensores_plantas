package com.pucrs.sensores_plantas.model;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class PlantaTest {

	@Test
	public void cratePlanta() {
		Sensor sensor = new Sensor(2, 40);
		Tipo tipo = new Morangos();
		Planta planta = new Planta(tipo, sensor);

		assertEquals(43242, (int) planta.getId());
		assertEquals("Morangos", planta.getNome());
		assertEquals(40, planta.getUmidade());
		assertEquals(60, planta.getUmdMin());
		assertEquals(80, planta.getUmdMax());
	}
	
	@Test
	public void shouldPrintUmidadeIsOk() {
		Sensor sensor = new Sensor(2, 75);
		Tipo tipo = new Morangos();
		Planta planta = new Planta(tipo, sensor);
		planta.SetMensagem();
		
		assertEquals("A umidade está ideal!", planta.getMensagem());
	}
}