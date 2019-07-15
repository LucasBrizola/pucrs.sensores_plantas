package com.pucrs.sensores_plantas.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SensorTest {
	@Test
	public void DeveCriarUmSensor() {
		Sensor sensor = new Sensor();
		sensor.setId("10");
		sensor.setHumidity(50);

		assertEquals(10, (int)sensor.getId());
		assertEquals(50, sensor.getHumidity());
	}
}