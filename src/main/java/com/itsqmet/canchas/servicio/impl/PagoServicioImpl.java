package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Pago;
import com.itsqmet.canchas.repositorio.IPagoRepositorio;
import com.itsqmet.canchas.servicio.IPagoServicio;

@Service
@Component
public class PagoServicioImpl implements IPagoServicio {
	
	@Autowired
	private IPagoRepositorio insertPago;
	
	@Override
	public void insertPago(Pago nuevoPago) {
		insertPago.save(nuevoPago);
	}

}
