package com.pucrs.sensores_plantas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pucrs.sensores_plantas.model.Morangos;
import com.pucrs.sensores_plantas.model.Planta;
import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.model.Tipo;
import com.pucrs.sensores_plantas.service.SensorService;

@Controller
public class PlantaController {

	@Autowired
	private SensorService ss;

	@GetMapping("/sensor")
	public String showSensor(Model model) {
		Sensor sensor = ss.getSensorData();
		model.addAttribute("s", sensor);
		return "sensorDetails";
	}
	
	@GetMapping("/planta")
	public String showPlanta(Model model) {
		Sensor sensor = ss.getSensorData();
		Tipo morango = new Morangos();
		Planta planta = new Planta(morango, sensor);
		model.addAttribute("p", planta);
		return "plantaDetails";
	}
}
