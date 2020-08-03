package com.example.orion.agendapp;

/**
 * Created by Orion on 14/04/2017.
 */

public class Events {
    //private int idEvento;
    private String evento;
    private String fecha;
    private String hora;
    private String descripcion;
    private String tel;

    public Events(String evento,String fecha, String hora, String descripcion, String tel){
        this.evento=evento;
        this.fecha=fecha;
        this.hora=hora;
        this.descripcion=descripcion;
        this.tel=tel;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
