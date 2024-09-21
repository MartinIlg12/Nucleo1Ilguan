package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Reserva;
import com.itsqmet.canchas.repositorio.IReservaRepositorio;
import com.itsqmet.canchas.servicio.IReservaServicio;

@Service
@Component
public class ReservaServicioImpl implements IReservaServicio {
	
	@Autowired
	private IReservaRepositorio insertReserva;
	
	@Override
	public void insertReserva(Reserva nuevoReserva) {
		insertReserva.save(nuevoReserva);
	}

}
