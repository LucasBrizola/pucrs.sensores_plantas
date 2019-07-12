package com.pucrs.sensores_plantas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.service.SensorService;

@Controller
public class SensorController {

	@Autowired
	private SensorService ss;

	@GetMapping("/sensor")
	public String showSensor(Model model) {
		Sensor sensor = ss.getSensorData();
		sensor.toString();
		model.addAttribute("s", sensor);
		return "sensorDetails";
	}

}
