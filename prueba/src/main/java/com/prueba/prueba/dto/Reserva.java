package com.prueba.prueba.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Reserva {
    @Id
    @Column(name = "id_reserva")
    private String idReserva;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
}
