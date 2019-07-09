package com.pucrs.sensores_plantas.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sensorTest {
	@Test
	public void sensor() {
		Sensor sensor = new Sensor();
		sensor.setId(1);
		sensor.setUmidade(30);
		assertEquals(1,sensor.getId());
		assertEquals(30,sensor.getUmidade());
	}
	
}
