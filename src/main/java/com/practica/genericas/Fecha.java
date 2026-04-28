package com.practica.genericas;

public class Fecha {
    private int dia, mes, anio;

    public Fecha(int dia, int mes, int anio) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return String.format("%2d/%02d/%4d",dia,mes,anio);
    }



}