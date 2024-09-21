package com.itsqmet.canchas.modelo;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "db.Pago")
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    
    @Column(name = "pago", nullable = false)
    private double monto;

    @Column(name = "metodo", length = 50)
    private String metodo;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Reserva reserva;
}
