package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.net.Uri;

import com.airbnb.lottie.LottieAnimationView;

public class CalculadoraActivity extends AppCompatActivity {

    TextView btnVolver;
    LottieAnimationView calcLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnVolver=findViewById(R.id.CalculadoraPageBtnVolver);
        calcLink=findViewById(R.id.CalculadoraPageCalcLink);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraActivity.this, BienvenideActivity.class);
                startActivity(intent);
            }
        });

        calcLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // URL que deseas abrir en el navegador
                String url = "https://aranthiel.github.io/CalculadorATACC/";

                // Crea un Intent para abrir el navegador web
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Inicia el navegador web
                startActivity(intent);
            }
        });
    }
}