package com.example.aplicacion_pm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Test";
    Persona DatosUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Nombre = findViewById(R.id.EditNombre);
        final EditText Peso = findViewById(R.id.EditPeso);
        Spinner Actividad = findViewById(R.id.Opc_Actividad);

        // Configurar el Spinner con un adaptador
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones_actividad, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Actividad.setAdapter(adapter);

        //Objeto con valores iniciales
        DatosUsuario = new Persona("","", "") ;

        //Capturo la opcion que se seleccione del spinner
        Actividad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String OpcionSelec = parent.getItemAtPosition(position).toString();
                DatosUsuario.setActividad(OpcionSelec);  // Asignar la actividad a la clase Persona
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Si no se selecciona ninguna opción
            }
        });
        //botones para mostrar el nombre
        Button buttonShowName = findViewById(R.id.button);
        Button buttonNextActivity = findViewById(R.id.buttonNextActivity);

        buttonShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = Nombre.getText().toString();
                String peso = Peso.getText().toString();
                DatosUsuario.setPeso(peso);
                DatosUsuario.setNombre(nombre);


                String actividad = DatosUsuario.getActividad();
                Toast.makeText(MainActivity.this, "Hola, " + nombre, Toast.LENGTH_SHORT).show();

                Intent PasarDatos = new Intent(MainActivity.this, MainActivity2.class);
                PasarDatos.putExtra("Nombre",DatosUsuario.getNombre());
                PasarDatos.putExtra("Peso",DatosUsuario.getPeso());
                PasarDatos.putExtra("Actividad Fisica",actividad);
                startActivity(PasarDatos);
            }
        });

        buttonNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = Nombre.getText().toString();
                String peso = Peso.getText().toString();
                DatosUsuario.setPeso(peso);

                String actividad = DatosUsuario.getActividad();
                Toast.makeText(MainActivity.this, "Hola, " + userName, Toast.LENGTH_SHORT).show();

                Intent PasarDatos = new Intent(MainActivity.this, MainActivity2.class);
                PasarDatos.putExtra("Nombre",DatosUsuario.getNombre());
                PasarDatos.putExtra("Peso",DatosUsuario.getPeso());
                PasarDatos.putExtra("Actividad Fisica",actividad);
                startActivity(PasarDatos);
            }
        });
        Log.d(TAG, "Estoy en el OnCREATE");
        Toast.makeText(this, "Estoy en el OnCREATE", Toast.LENGTH_SHORT).show();
    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Estoy en el OnStart");
        Toast.makeText(this, "Estoy en el OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Estoy en el OnResume");
        Toast.makeText(this, "Estoy en el OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Estoy en el OnPause");
        Toast.makeText(this, "Estoy en el OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Estoy en el Stop");
        Toast.makeText(this, "Estoy en el Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Estoy en el Destroy");
        Toast.makeText(this, "Estoy en el Destroy", Toast.LENGTH_SHORT).show();
    }
}