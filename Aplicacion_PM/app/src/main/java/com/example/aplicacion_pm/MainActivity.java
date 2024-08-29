package com.example.aplicacion_pm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextName = findViewById(R.id.editText);
        Button buttonShowName = findViewById(R.id.button);
        Button buttonNextActivity = findViewById(R.id.buttonNextActivity);
        Persona DatosUsuario;
        DatosUsuario = new Persona(1034916824, (byte) 24, "Juan", "Perez") ;
        buttonShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editTextName.getText().toString();
                String name = editTextName.getText().toString();
                Toast.makeText(MainActivity.this, "Hola, " + name, Toast.LENGTH_SHORT).show();
                Intent PasarDatos = new Intent(MainActivity.this, MainActivity2.class);
                PasarDatos.putExtra("Nombre",DatosUsuario.getNombre());
                PasarDatos.putExtra("Edad",DatosUsuario.getEdad());
                startActivity(PasarDatos);
            }
        });

        buttonNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editTextName.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("USER_NAME", userName);
                startActivity(intent);
            }
        });
        Log.d(TAG, "Estoy en el OnCREATE");
        Log.d(TAG,DatosUsuario.getNombre());
        DatosUsuario.setNombre("Alonso");
        Log.d(TAG,DatosUsuario.getNombre());

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