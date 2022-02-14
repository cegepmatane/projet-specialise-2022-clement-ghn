package com.example.poc;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String NombreDeParticipants = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ouverture de la BDD
        final DatabaseAccess db = DatabaseAccess.getInstance(getApplicationContext());

        db.open();

        NombreDeParticipants = db.getNombreDeParticipants("Clement");

        TextView testView_nombreDeParticipants = (TextView) findViewById(R.id.TestView_nombreDeParticipants);
        testView_nombreDeParticipants.setText(NombreDeParticipants);


        db.close();
    }
}