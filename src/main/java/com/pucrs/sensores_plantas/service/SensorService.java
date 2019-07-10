package com.pucrs.sensores_plantas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pucrs.sensores_plantas.model.Sensor;

@Service
public class SensorService {
//	private RestTemplate restTemplate;

	public SensorService() {
		super();
//		this.restTemplate = restTemplate;
	}

	public Sensor getSensorData() {
		Sensor sensor = new Sensor(1,30);
		//return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Sensor.class);
		return sensor;
	}
}
