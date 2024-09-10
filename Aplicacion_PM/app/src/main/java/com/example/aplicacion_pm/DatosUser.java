package com.example.aplicacion_pm;

import java.io.Serializable;

public class DatosUser implements Serializable{
    String sexo, ActFisica,Objetivo;
    int edad;
    float peso,altura;


    // Constructor vacío
    public DatosUser(String sexo, int edad, float peso, float altura, String ActFisica, String Objetivo) {
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.ActFisica = ActFisica;
        this.Objetivo = Objetivo;

    }

    // Getters y Setters
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    public String getActividadFisica() { return ActFisica; }
    public void setActividadFisica(String actividadFisica) { this.ActFisica = actividadFisica; }

    public String getObjetivo() { return Objetivo; }
    public void setObjetivo(String objetivo) { this.Objetivo = objetivo; }
}