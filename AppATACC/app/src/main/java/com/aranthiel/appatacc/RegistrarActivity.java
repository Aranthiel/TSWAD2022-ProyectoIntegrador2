package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrarActivity extends AppCompatActivity {

    Button btnRegistrar;
    TextView textAyuda;
    TextView textYaTengo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        btnRegistrar=findViewById(R.id.RegistrarPageButtonIngresar);
        textAyuda = findViewById(R.id.RegistrarPageTextAyuda);
        textYaTengo = findViewById(R.id.RegistrarPageAllReady);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrarActivity.this, BienvenideActivity.class);
                startActivity(intent);
            }
        });

        textAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrarActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });

        textYaTengo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrarActivity.this, IngresarActivity.class);
                startActivity(intent);
            }
        });
    }
}