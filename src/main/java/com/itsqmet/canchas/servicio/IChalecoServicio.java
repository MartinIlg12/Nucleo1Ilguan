package com.itsqmet.canchas.servicio;

import com.itsqmet.canchas.modelo.Chaleco;

import java.util.List;

public interface IChalecoServicio {
    void insertChaleco(Chaleco nuevoChaleco);
    List<Chaleco> obtenerChalecos();
    Chaleco obtenerChalecoPorId(int id);
    void eliminarChaleco(int id);
}
