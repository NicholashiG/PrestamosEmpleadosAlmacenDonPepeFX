package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.dbModel;

public class Usuario {
    private String login;
    private String password;
    private int idUsuario;

    public Usuario() {
    }

    public Usuario(String login, String password, int idUsuario) {
        this.login = login;
        this.password = password;
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
