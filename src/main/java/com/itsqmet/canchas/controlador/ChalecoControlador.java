package com.itsqmet.canchas.controlador;

import com.itsqmet.canchas.modelo.Chaleco;
import com.itsqmet.canchas.servicio.IChalecoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chalecos")
public class ChalecoControlador {

    @Autowired
    private IChalecoServicio chalecoServicio;

    @PostMapping
    public ResponseEntity<Chaleco> agregarChaleco(@RequestBody Chaleco nuevoChaleco) {
        chalecoServicio.insertChaleco(nuevoChaleco);
        return ResponseEntity.ok(nuevoChaleco);
    }

    @GetMapping
    public ResponseEntity<List<Chaleco>> obtenerChalecos() {
        return ResponseEntity.ok(chalecoServicio.obtenerChalecos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chaleco> obtenerChaleco(@PathVariable int id) {
        Chaleco chaleco = chalecoServicio.obtenerChalecoPorId(id);
        return ResponseEntity.ok(chaleco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chaleco> actualizarChaleco(@PathVariable int id, @RequestBody Chaleco chalecoActualizado) {
        chalecoActualizado.setIdChaleco(id);
        chalecoServicio.insertChaleco(chalecoActualizado);
        return ResponseEntity.ok(chalecoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarChaleco(@PathVariable int id) {
        chalecoServicio.eliminarChaleco(id);
        return ResponseEntity.noContent().build();
    }
}
