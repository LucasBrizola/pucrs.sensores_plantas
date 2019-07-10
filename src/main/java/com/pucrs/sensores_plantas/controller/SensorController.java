package com.pucrs.sensores_plantas.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.repository.SensorRepository;

@Controller
public class SensorController {
	private final SensorRepository sensores;
	
	public SensorController(SensorRepository sensores) {
		this.sensores = sensores;
	}
	
	@GetMapping("/sensores")
	public String listAllSensores(@PathVariable Integer id, Model model) {
		Optional<Sensor> s = sensores.findById(id);	
		model.addAttribute("sensor", s.get());
		return "sensorDetails";
	}
	
}
