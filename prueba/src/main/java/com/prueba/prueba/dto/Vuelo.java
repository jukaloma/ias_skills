package com.prueba.prueba.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Vuelo {
    @Id
    @Column(name = "id_vuelo")
    private String idVuelo;

    @Column
    private String descripcion;

    @Column(name = "fecha_vuelo")
    private Date fechaVuelo;

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }
}
