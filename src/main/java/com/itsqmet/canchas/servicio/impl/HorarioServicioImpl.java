package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Horario;
import com.itsqmet.canchas.repositorio.IHorarioRepositorio;
import com.itsqmet.canchas.servicio.IHorarioServicio;

@Service
@Component

public class HorarioServicioImpl implements IHorarioServicio {
	
	@Autowired
	private IHorarioRepositorio insertHorario;
	
	@Override
	public void insertHorario(Horario nuevoHorario) {
		insertHorario.save(nuevoHorario);
	}

}
