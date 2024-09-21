package com.itsqmet.canchas.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "db.Reserva")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    @Column(name = "fechaReserva", nullable = false)
    private LocalDateTime fechaReserva;

    @ManyToOne
    @JoinColumn(name = "idCancha", nullable = false)
    private Cancha cancha;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idHorario", nullable = false)
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "idChaleco", nullable = false)
    private Chaleco chaleco;

    @OneToMany(mappedBy = "reserva")
    private List<Pago> pagos;
}
