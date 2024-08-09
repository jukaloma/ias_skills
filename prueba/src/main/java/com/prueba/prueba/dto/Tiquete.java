package com.prueba.prueba.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Tiquete {
    @Id
    @Column(name = "id_tiquete")
    private String idTiquete;

    @Column
    private String descripcion;

    @Column
    private String fecha;

    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }
}
