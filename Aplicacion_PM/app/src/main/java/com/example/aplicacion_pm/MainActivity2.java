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

        Intent intent = getIntent();
        String userName = intent.getStringExtra("USER_NAME");

        textViewWelcome.setText("Bienvenido: " + userName);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}