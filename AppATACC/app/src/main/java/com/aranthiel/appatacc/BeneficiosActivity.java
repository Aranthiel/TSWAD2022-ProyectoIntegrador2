package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class BeneficiosActivity extends AppCompatActivity {
    TextView btnVolver;
    ScrollView scrollView;

    LinearLayout cardUno;
    LinearLayout cardOcho;
    LinearLayout cardDos;
    LinearLayout cardTres;
    LinearLayout cardCuatro;
    LinearLayout cardCinco;
    LinearLayout cardSeis;
    LinearLayout cardSiete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);
        btnVolver=findViewById(R.id.BeneficiosPageBtnVolver);
        scrollView=findViewById(R.id.BeneficiosPageScollView);
        cardUno=findViewById(R.id.BeneficiosPageCard1);
        cardOcho=findViewById(R.id.BeneficiosPageCard8);
        cardDos=findViewById(R.id.BeneficiosPageCard2);
        cardTres=findViewById(R.id.BeneficiosPageCard3);
        cardCuatro=findViewById(R.id.BeneficiosPageCard4);
        cardCinco=findViewById(R.id.BeneficiosPageCard5);
        cardSeis=findViewById(R.id.BeneficiosPageCard6);
        cardSiete=findViewById(R.id.BeneficiosPageCard7);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeneficiosActivity.this, BienvenideActivity.class);
                startActivity(intent);
            }
        });
    }
}