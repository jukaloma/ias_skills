package com.prueba.prueba.dto;

import java.util.Date;

public class RequestDTO {
    private String usuario;
    private Date fecReserva;
    private String ciudad;

    public Date getFecReserva() {
        return fecReserva;
    }

    public void setFecReserva(Date fecReserva) {
        this.fecReserva = fecReserva;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
