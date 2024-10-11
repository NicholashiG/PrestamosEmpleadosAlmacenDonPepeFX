package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

public class Usuario {
    private int idUsuario;
    private String nivelAcceso;
    private String login;
    private String clave;


    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public String getLogin() {
        return login;
    }

    public String getClave() {
        return clave;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
