package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.HabitacionModelo;
import ar.edu.unju.edm.repository.HabitacionDAO;
public class HabitacionServiceImp implements HabitacionService{
@Autowired
HabitacionDAO HabitacionDAO;

@Override
public void guardarhabitacion(HabitacionModelo UnaHabitacion) {
	HabitacionDAO.save(UnaHabitacion);
	// TODO Auto-generated method stub
}
@Override
public void delate(Integer id) {
	// TODO Auto-generated method stub
	
}
}
