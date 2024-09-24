package com.itsqmet.canchas.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsqmet.canchas.modelo.Chaleco;
import com.itsqmet.canchas.repositorio.IChalecoRepositorio;
import com.itsqmet.canchas.servicio.IChalecoServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChalecoServicioImpl implements IChalecoServicio {

    @Autowired
    private IChalecoRepositorio chalecoRepositorio;

    @Override
    public void insertChaleco(Chaleco nuevoChaleco) {
        chalecoRepositorio.save(nuevoChaleco);
    }

    @Override
    public List<Chaleco> obtenerChalecos() {
        List<Chaleco> chalecos = new ArrayList<>();
        chalecoRepositorio.findAll().forEach(chalecos::add);
        return chalecos;
    }

    @Override
    public Chaleco obtenerChalecoPorId(int id) {
        Optional<Chaleco> chaleco = chalecoRepositorio.findById(id);
        return chaleco.orElse(null); // Retorna null si no existe
    }

    @Override
    public void eliminarChaleco(int id) {
        chalecoRepositorio.deleteById(id);
    }
}
