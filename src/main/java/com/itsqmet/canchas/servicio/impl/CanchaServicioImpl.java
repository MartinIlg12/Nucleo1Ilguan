package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Cancha;
import com.itsqmet.canchas.repositorio.ICanchaRepositorio;
import com.itsqmet.canchas.servicio.ICanchaServicio;

@Service
@Component

public class CanchaServicioImpl implements ICanchaServicio{
	
	@Autowired
	private ICanchaRepositorio insertarCancha;
	
	
	
	@Override
	public void insertCancha(Cancha nuevoCancha) {
		
		insertarCancha.save(nuevoCancha);
	}
	

}
