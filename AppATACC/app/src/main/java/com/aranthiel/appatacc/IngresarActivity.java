package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IngresarActivity extends AppCompatActivity {

    Button btnIngresar;
    TextView textAyuda;
    TextView textOlvide;
    TextView textCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        btnIngresar=findViewById(R.id.IngresarPageButtonIngresar);
        textAyuda = findViewById(R.id.IngresarPageTextAyuda);
        textOlvide = findViewById(R.id.IngresarPageTextForgot);
        textCrear = findViewById(R.id.IngresarPageTextRegistrar);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IngresarActivity.this, BienvenideActivity.class);
                startActivity(intent);
            }
        });


        textAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IngresarActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });

        textOlvide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IngresarActivity.this, ResetActivity.class);
                startActivity(intent);
            }
        });

        textCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IngresarActivity.this, RegistrarActivity.class);
                startActivity(intent);
            }
        });
    }
}