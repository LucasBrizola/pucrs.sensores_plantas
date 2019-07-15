package com.pucrs.sensores_plantas.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlantaTest {

	@Test
	public void criarUmaPlanta() {
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
	public void deveTrocarOTipoDaPlanta() {
		Sensor sensor = new Sensor(2, 75);
		Tipo morango = new Morangos();
		Tipo lavanda = new Lavandas();
		Planta planta = new Planta(lavanda, sensor);
		assertEquals("Lavandas", planta.getNome());
		planta.mudarTipo(morango);
		
		assertEquals("Morangos", planta.getNome());
	}
	
	@Test
	public void devePrintarUmidadeEstaOk() {
		Sensor sensor = new Sensor(2, 75);
		Tipo morango = new Morangos();
		Planta planta = new Planta(morango, sensor);

		assertEquals("A umidade está ideal!", planta.getMensagem());
	}

	@Test
	public void devePrintarUmidadeEstaAlta() {
		Sensor sensor = new Sensor(2, 95);
		Tipo morango = new Morangos();
		Planta planta = new Planta(morango, sensor);

		assertEquals("A umidade está acima do ideal!", planta.getMensagem());
	}

	@Test
	public void devePrintarUmidadeEstaBaixa() {
		Sensor sensor = new Sensor(2, 5);
		Tipo morango = new Morangos();
		Planta planta = new Planta(morango, sensor);

		assertEquals("A umidade está abaixo do ideal!", planta.getMensagem());
	}
}