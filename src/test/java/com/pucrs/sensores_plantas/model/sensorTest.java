package com.pucrs.sensores_plantas.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pucrs.sensores_plantas.service.SensorService;

public class sensorTest {
	@Test
	public void sensor() {
		SensorService ss = new SensorService();

		Sensor sensor = ss.getSensorData();
		assertEquals(1, sensor.getId());
		assertEquals(30, sensor.getUmidade());
	}

}
