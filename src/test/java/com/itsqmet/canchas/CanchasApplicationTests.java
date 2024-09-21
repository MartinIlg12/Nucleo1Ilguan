package com.itsqmet.canchas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itsqmet.canchas.modelo.Cancha;
import com.itsqmet.canchas.modelo.Chaleco;
import com.itsqmet.canchas.modelo.Horario;
import com.itsqmet.canchas.modelo.Pago;
import com.itsqmet.canchas.modelo.Reserva;
import com.itsqmet.canchas.modelo.Usuario;
import com.itsqmet.canchas.servicio.ICanchaServicio;
import com.itsqmet.canchas.servicio.IChalecoServicio;
import com.itsqmet.canchas.servicio.IHorarioServicio;
import com.itsqmet.canchas.servicio.IPagoServicio;
import com.itsqmet.canchas.servicio.IReservaServicio;
import com.itsqmet.canchas.servicio.IUsuarioServicio;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootTest
class CanchasApplicationTests {

   @Autowired
    private ICanchaServicio servicioCancha;

    @Autowired
    private IChalecoServicio servicioChaleco;

    @Autowired
    private IHorarioServicio servicioHorario;

    @Autowired
    private IPagoServicio servicioPago;

    @Autowired
    private IReservaServicio servicioReserva;

    @Autowired
    private IUsuarioServicio servicioUsuario;

    @Test
    void insertarDatos() {
   
    	Cancha nuevoCancha = new Cancha();
        nuevoCancha.setIdCancha(0);
        nuevoCancha.setNombre("Cancha 1");
        nuevoCancha.setCapacidad(20);
        servicioCancha.insertCancha(nuevoCancha);;

  
        Chaleco nuevoChaleco = new Chaleco();
        nuevoChaleco.setIdChaleco(0);  
        nuevoChaleco.setNombre("Chaleco Azul");
        servicioChaleco.insertChaleco(nuevoChaleco);


        Horario nuevoHorario = new Horario();
        nuevoHorario.setIdHorario(0);  
        nuevoHorario.setNombre("10:00 AM - 12:00 PM");
        nuevoHorario.setReservas(new ArrayList<>());
        servicioHorario.insertHorario(nuevoHorario);

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setIdUsuario(0);  
        nuevoUsuario.setNombre("Juan");
        nuevoUsuario.setApellido("Perez");
        nuevoUsuario.setDireccion("El Condado");
        nuevoUsuario.setEmail("juan@gmail.com");
        nuevoUsuario.setTelefono("0999999");
        servicioUsuario.insertUsuario(nuevoUsuario);


        Reserva nuevaReserva = new Reserva();
        nuevaReserva.setIdReserva(0);  
        nuevaReserva.setFechaReserva(LocalDateTime.now());
        nuevaReserva.setCancha(nuevoCancha);   
        nuevaReserva.setUsuario(nuevoUsuario); 
        nuevaReserva.setHorario(nuevoHorario); 
        nuevaReserva.setChaleco(nuevoChaleco); 
        servicioReserva.insertReserva(nuevaReserva);

     
        Pago nuevoPago = new Pago();
        nuevoPago.setIdPago(0);
        nuevoPago.setMonto(35);
        nuevoPago.setMetodo("Pago con Tarjeta");
        nuevoPago.setReserva(nuevaReserva); 
        nuevoPago.setUsuario(nuevoUsuario);
        servicioPago.insertPago(nuevoPago);
    }
}
