package com.itsqmet.canchas.modelo;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "db.Cancha")
public class Cancha implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCancha;

    @Column(name = "nombreCancha", length = 50)
    private String nombre;
    
    @Column(name = "capacidad")
    private int capacidad;

    @OneToMany(mappedBy = "cancha")
    private List<Reserva> reservas;
}
