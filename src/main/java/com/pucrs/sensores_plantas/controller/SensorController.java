package com.pucrs.sensores_plantas.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.repository.SensorRepository;

@Controller
public class SensorController {
	private final SensorRepository sensores;
	
	public SensorController(SensorRepository sensores) {
		this.sensores = sensores;
	}
	
	@GetMapping("/sensores")
	public String processFindForm(Model model) {
		Collection<Sensor> sensorList = sensores.findAll();	
		model.addAttribute("sensores", sensorList);
		return "sensores/sensoresList";
	}
	
}
