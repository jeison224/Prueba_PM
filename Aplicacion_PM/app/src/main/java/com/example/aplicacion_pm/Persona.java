package com.example.aplicacion_pm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Persona extends AppCompatActivity {
    String nombre, actividad,peso;

    public Persona(String nombre, String peso, String actividad) {
        this.nombre = nombre;
        this.peso = peso;
        this.actividad = actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}