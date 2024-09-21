package com.itsqmet.canchas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsqmet.canchas.modelo.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
