package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResetActivity extends AppCompatActivity {
    TextView btnVolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        btnVolver=findViewById(R.id.ResetPageBtnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResetActivity.this, IngresarActivity.class);
                startActivity(intent);
            }
        });
    }
}