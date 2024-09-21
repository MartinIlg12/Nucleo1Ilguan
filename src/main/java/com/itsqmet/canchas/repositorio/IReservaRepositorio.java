package com.itsqmet.canchas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsqmet.canchas.modelo.Reserva;

public interface IReservaRepositorio extends JpaRepository<Reserva, Integer> {

}
