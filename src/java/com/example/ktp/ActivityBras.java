package com.example.ktp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityBras extends AppCompatActivity {

    private String partie = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bras);

        //ouverture de la BDD
        final DatabaseAccess db = DatabaseAccess.getInstance(getApplicationContext());
        db.open();

        partie = db.getpartie("jambe");

        TextView BaseDeDonneesExercices = (TextView) findViewById(R.id.BaseDeDonneesExercices);
        BaseDeDonneesExercices.setText(partie);

        db.close();
    }
}