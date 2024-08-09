package com.prueba.prueba.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Ciudad {
    @Id
    @Column(name = "id_ciudad")
    private String idCiudad;

    @Column
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }
}
