package com.example.aplicacion_pm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewWelcome = findViewById(R.id.Bienvenida);
        Button buttonBack = findViewById(R.id.buttonBack);

        // Obtener los datos del Intent
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("Nombre");
        String peso = intent.getStringExtra("Peso");
        String actividad = intent.getStringExtra("Actividad Fisica");

        // Mostrar los datos en la interfaz
        TextView TextNombre = findViewById(R.id.textNombre);
        TextView TextPeso = findViewById(R.id.textPeso);
        TextView TextActividad = findViewById(R.id.textActividad);

        textViewWelcome.setText("Bienvenido: " + nombre);
        TextNombre.setText("Nombre: " + nombre);
        TextPeso.setText("Peso: " + peso);
        TextActividad.setText("Actividad Física: " + actividad);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}