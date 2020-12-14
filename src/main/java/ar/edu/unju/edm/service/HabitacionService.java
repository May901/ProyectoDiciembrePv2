package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.HabitacionModelo;
@Service
public interface HabitacionService {
	public void guardarhabitacion(HabitacionModelo UnaHabitacion);
	public void delate (Integer id);
}