package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BienvenideActivity extends AppCompatActivity {

    TextView btnVolver;
    LinearLayout cardAfiliate;
    LinearLayout cardBeneficios;
    LinearLayout cardCalculadora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenide);

        btnVolver=findViewById(R.id.BienvenidePageBtnVolver);
        cardAfiliate=findViewById(R.id.WellcomePageJoinCard);
        cardBeneficios=findViewById(R.id.WellcomePageBenefitsCard);
        cardCalculadora = findViewById(R.id.WellcomePageCalculatorCard);


        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BienvenideActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cardAfiliate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BienvenideActivity.this, AfiliateActivity.class);
                startActivity(intent);
            }
        });


        cardBeneficios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BienvenideActivity.this, BeneficiosActivity.class);
                startActivity(intent);
            }
        });

        cardCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BienvenideActivity.this, CalculadoraActivity.class);
                startActivity(intent);
            }
        });
    }
}