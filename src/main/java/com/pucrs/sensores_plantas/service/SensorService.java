package com.pucrs.sensores_plantas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pucrs.sensores_plantas.model.Sensor;

@Service
public class SensorService {
	private RestTemplate restTemplate;

	public SensorService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public Sensor getSensorData() {
		return restTemplate.getForObject("http://fundatec.dev.aioria.com.br/api/v1/humidity", Sensor.class);
	}

}
