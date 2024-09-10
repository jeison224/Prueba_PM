package com.example.aplicacion_pm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pagina3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);  // Asegúrate de tener un layout llamado "activity_pagina3"

        // Obtener el Intent y el objeto serializable
        Intent intent = getIntent();
        DatosUser usuario = (DatosUser) intent.getSerializableExtra("usuario");
        Button buttonBack = findViewById(R.id.botonRegresar);
        TextView textSexo = findViewById(R.id.textSexo);
        TextView textEdad = findViewById(R.id.textEdad);
        TextView textPeso = findViewById(R.id.textPeso);
        TextView textAltura = findViewById(R.id.textAltura);
        TextView textActividadFisica = findViewById(R.id.textActividadFisica);
        TextView textObjetivo = findViewById(R.id.textObjetivo);

        textSexo.setText("Sexo: " + usuario.getSexo());
        textEdad.setText("Edad: " + usuario.getEdad());
        textPeso.setText("Peso: " + usuario.getPeso());
        textAltura.setText("Altura: " + usuario.getAltura());
        textActividadFisica.setText("Actividad Física: " + usuario.getActividadFisica());
        textObjetivo.setText("Objetivo: " + usuario.getObjetivo());

        if (usuario != null) {
            // Aquí puedes trabajar con los datos del usuario
            String sexo = usuario.getSexo();
            int edad = usuario.getEdad();
            float peso = usuario.getPeso();
            float altura = usuario.getAltura();

            // Usa los datos según tus necesidades, como mostrarlos en la interfaz
        }
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}