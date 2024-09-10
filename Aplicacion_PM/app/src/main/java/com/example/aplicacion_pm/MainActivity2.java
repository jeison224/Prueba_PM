package com.example.aplicacion_pm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    DatosUser Datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Mostrar los datos en la interfaz
        TextView TextNombre = findViewById(R.id.textNombre);
        TextView TextPeso = findViewById(R.id.textPeso);
        TextView TextActividad = findViewById(R.id.textActividad);
        TextView textViewWelcome = findViewById(R.id.Bienvenida);
        Button buttonBack = findViewById(R.id.buttonBack);
        RadioGroup opcinesSexo = findViewById(R.id.Opcsexo);
        EditText edadInput = findViewById(R.id.Textedad);
        EditText pesoInput = findViewById(R.id.Textpeso);
        EditText alturaInput = findViewById(R.id.Textaltura);
        Button btnSiguiente = findViewById(R.id.BotonSiguiente);

        // Obtener los datos del Intent
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("Nombre");
        String peso = intent.getStringExtra("Peso");
        String actividad = intent.getStringExtra("Actividad Fisica");


        textViewWelcome.setText("Bienvenido: " + nombre);
        TextNombre.setText("Nombre: " + nombre);
        TextPeso.setText("Peso: " + peso);
        TextActividad.setText("Actividad Física: " + actividad);

        // Inicializar DatosUser
        Datos = new DatosUser("",0,0,0,"","");
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Acción del botón para capturar datos y pasar a la siguiente Activity
        btnSiguiente.setOnClickListener(v -> {
            // Capturar datos del usuario
            int selectedSexoId = opcinesSexo.getCheckedRadioButtonId();
            RadioButton selectedSexo = findViewById(selectedSexoId);
            Datos.setSexo(selectedSexo.getText().toString());
            Datos.setEdad(Integer.parseInt(edadInput.getText().toString()));
            Datos.setPeso(Float.parseFloat(pesoInput.getText().toString()));
            Datos.setAltura(Float.parseFloat(alturaInput.getText().toString()));

            // Pasar a la siguiente Activity
            Intent intentDatoU = new Intent(MainActivity2.this, Pagina3.class);
            intentDatoU.putExtra("usuario", Datos);
            startActivity(intentDatoU);
        });

    }
}