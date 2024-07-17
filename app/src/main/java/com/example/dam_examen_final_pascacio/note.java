package com.example.dam_examen_final_pascacio;

import android.os.Bundle;

class Nota {

    private String titulo;
    private String contenido;
    private boolean favorita;
    private int color;

    // Constructor
    public Nota() {
        this.titulo = "";
        this.contenido = "";
        this.favorita = false;
        this.color = 0; // Puedes establecer un valor predeterminado adecuado
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setArguments(Bundle args) {
        // Implementa el método según sea necesario
    }
}
