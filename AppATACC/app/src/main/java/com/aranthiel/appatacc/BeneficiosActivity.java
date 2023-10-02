package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BeneficiosActivity extends AppCompatActivity {
    TextView btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);
        btnVolver=findViewById(R.id.BeneficiosPageBtnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeneficiosActivity.this, BienvenideActivity.class);
                startActivity(intent);
            }
        });
    }
}