package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Chaleco;
import com.itsqmet.canchas.repositorio.IChalecoRepositorio;
import com.itsqmet.canchas.servicio.IChalecoServicio;

@Service
@Component
public class ChalecoServicioImpl  implements IChalecoServicio{
	
	@Autowired
	private IChalecoRepositorio insertChaleco;
	
	@Override
	public void insertChaleco(Chaleco nuevoChaleco) {
		
		insertChaleco.save(nuevoChaleco);
	}

}
