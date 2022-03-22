package com.example.ktp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity{
    private Button bouton_epaules, bouton_bras, bouton_pectoraux, bouton_abdominaux, bouton_dorsaux, bouton_fessiers, bouton_jambes;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_2);

        bouton_epaules = findViewById(R.id.boutonEpaules);
        bouton_epaules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEpaules();
            }


        });

        bouton_pectoraux = findViewById(R.id.boutonPectoraux);
        bouton_pectoraux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPectoraux();
            }


        });

        bouton_bras = findViewById(R.id.boutonBras);
        bouton_bras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBras();
            }


        });

        bouton_abdominaux = findViewById(R.id.boutonAbdos);
        bouton_abdominaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAbdominaux();
            }


        });

        bouton_dorsaux = findViewById(R.id.boutonDos);
        bouton_dorsaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDorsaux();
            }


        });

        bouton_fessiers = findViewById(R.id.boutonFesses);
        bouton_fessiers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFessiers();
            }


        });

        bouton_jambes = findViewById(R.id.boutonJambes);
        bouton_jambes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityJambes();
            }


        });
    }

    public void openActivityEpaules(){
        Intent intent = new Intent(this, ActivityEpaules.class);
        startActivity(intent);
    }

    public void openActivityPectoraux(){
        Intent intent = new Intent(this, ActivityPectoraux.class);
        startActivity(intent);
    }

    public void openActivityBras(){
        Intent intent = new Intent(this, ActivityBras.class);
        startActivity(intent);
    }

    public void openActivityAbdominaux(){
        Intent intent = new Intent(this, ActivityAbdominaux.class);
        startActivity(intent);
    }

    public void openActivityDorsaux(){
        Intent intent = new Intent(this, ActivityDorsaux.class);
        startActivity(intent);
    }

    public void openActivityFessiers(){
        Intent intent = new Intent(this, ActivityFessiers.class);
        startActivity(intent);
    }

    public void openActivityJambes(){
        Intent intent = new Intent(this, ActivityJambes.class);
        startActivity(intent);
    }
}