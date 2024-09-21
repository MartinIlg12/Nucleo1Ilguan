package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Usuario;
import com.itsqmet.canchas.repositorio.IUsuarioRepositorio;
import com.itsqmet.canchas.servicio.IUsuarioServicio;

@Service
@Component
public class UsuarioServicioImpl implements IUsuarioServicio{
	
	@Autowired
	private IUsuarioRepositorio insertUsuario;
	
	@Override
	public void insertUsuario(Usuario nuevoUsuario) {
		insertUsuario.save(nuevoUsuario);
	}

}
