package com.pucrs.sensores_plantas.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.pucrs.sensores_plantas.model.Sensor;
import com.pucrs.sensores_plantas.service.SensorService;


@Controller
public class SensorController {
	private static final Logger log = LoggerFactory.getLogger(SensorController.class);

	@Autowired
	private SensorService ss;

	@GetMapping("/sensores")
	public String showSensor(Model model) {
		Sensor sensor = ss.getSensorData();
		log.info(sensor.toString());
		model.addAttribute("s", sensor);
		return "sensorDetails";
	}

}
