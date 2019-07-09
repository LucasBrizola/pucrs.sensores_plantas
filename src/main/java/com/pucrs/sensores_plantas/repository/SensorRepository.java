package com.pucrs.sensores_plantas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pucrs.sensores_plantas.model.Sensor;

public interface SensorRepository extends CrudRepository<Sensor, Integer>{
	List<Sensor> findAll();
	Optional<Sensor> findById(Integer id);
}
