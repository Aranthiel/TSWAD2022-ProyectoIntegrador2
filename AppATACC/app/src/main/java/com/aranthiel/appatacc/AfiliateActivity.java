package com.aranthiel.appatacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AfiliateActivity extends AppCompatActivity {

    TextView btnVolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afiliate);

        btnVolver=findViewById(R.id.AfiliatePageBtnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AfiliateActivity.this, BienvenideActivity.class);
                startActivity(intent);
            }
        });
    }
}