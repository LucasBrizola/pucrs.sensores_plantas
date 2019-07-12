package com.pucrs.sensores_plantas.service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.pucrs.sensores_plantas.controller.SensorController;
import com.pucrs.sensores_plantas.model.Sensor;

@RunWith(SpringRunner.class)
@WebMvcTest(SensorController.class)
public class SensorServiceTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SensorService service;

	@Test
	public void ShouldReturnSensorFromService() throws Exception {
		Sensor sensor;
		when(service.getSensorData()).thenReturn(sensor = new Sensor("2", 59));
		this.mockMvc.perform(get("/sensor")).andExpect(status().isOk());
		assertEquals(2, (String)sensor.getId());
		assertEquals(59, sensor.getHumidity());
	}

}
