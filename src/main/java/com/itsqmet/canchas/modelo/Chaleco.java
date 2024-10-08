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
@Table(name = "db.Chaleco")
public class Chaleco implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChaleco;

    @Column(name = "nombreChaleco", length = 50)
    private String nombre;

    @OneToMany(mappedBy = "chaleco")
    private List<Reserva> reservas;
}
