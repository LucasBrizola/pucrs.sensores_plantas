package com.pucrs.sensores_plantas.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class sensorTest {
	@Before
	public void setup() {
		Sensor sensor1 = new Sensor(2, 80);
		Sensor sensor2 = new Sensor(2, 60);
		Sensor sensor3 = new Sensor(2, 75);
		Sensor sensor4 = new Sensor(2, 100);
		Sensor sensor5 = new Sensor(2, 0);
		Planta p = new Planta();
	}
	
//	@Test
//	public void sensor() {
//		Planta p = new Planta();
//		Sensor sensor1 = new Sensor(2, 80);
//		p.compararId(sensor1.getId());
//		assertEquals("A umidade está ideal!", p.executar(80));
//		assertEquals("A umidade está ideal!", p.executar(60));
//		assertEquals("A umidade está ideal!", p.executar(75));
//		assertEquals("A umidade está abaixo do ideal!", p.executar(0));
//		assertEquals("A umidade está acima do ideal!", p.executar(100));
//	}
//	

}
