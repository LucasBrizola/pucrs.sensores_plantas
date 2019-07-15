package com.pucrs.sensores_plantas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pucrs.sensores_plantas.model.Cactos;
import com.pucrs.sensores_plantas.model.Cogumelos;
import com.pucrs.sensores_plantas.model.Lavandas;
import com.pucrs.sensores_plantas.model.Morangos;
import com.pucrs.sensores_plantas.model.Planta;
import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.model.Tipo;
import com.pucrs.sensores_plantas.model.Violetas;
import com.pucrs.sensores_plantas.service.SensorService;

@Controller
public class PlantaController {

	@Autowired
	private SensorService ss;

	Tipo morango = new Morangos();
	Tipo cacto = new Cactos();
	Tipo cogumelo = new Cogumelos();
	Tipo lavanda = new Lavandas();
	Tipo violeta = new Violetas();

	@GetMapping("/sensor")
	public String showSensor(Model model) {
		Sensor sensor = ss.getSensorData();
		model.addAttribute("s", sensor);
		return "sensorDetails";
	}

	@GetMapping("/planta")
	public String showPlanta(Model model) {
		Sensor sensor = ss.getSensorData();

		Planta planta = new Planta(lavanda, sensor);

		if (sensor.getId().equals(cacto.getId())) {
			planta.SetSensor(sensor);
			planta.mudarTipo(cacto);
		}
		if (sensor.getId().equals(cogumelo.getId())) {
			planta.SetSensor(sensor);
			planta.mudarTipo(cogumelo);
		}

		if (sensor.getId().equals(morango.getId())) {
			planta.SetSensor(sensor);
			planta.mudarTipo(morango);
		}
		if (sensor.getId().equals(violeta.getId())) {
			planta.SetSensor(sensor);
			planta.mudarTipo(violeta);
		}

		model.addAttribute("p", planta);
		return "plantaDetails";
	}
}
