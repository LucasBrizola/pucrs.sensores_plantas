package com.pucrs.sensores_plantas.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.service.SensorService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class SensorControllerTests {

	@Autowired
	private SensorController sensorController;

	private MockMvc mockMvc;

	@MockBean
	private SensorService service;

	@Before
	public void init() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(sensorController).build();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldReturnSensorFromService() throws Exception {
		Sensor sensor;
		when(service.getSensorData()).thenReturn(sensor = new Sensor(2, 59));
		this.mockMvc.perform(get("/sensor")).andExpect(status().isOk());
		assertEquals(2, (int) sensor.getId());
		assertEquals(59, sensor.getHumidity());
	}

}
