package com.example.singleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Compteur extends AppCompatActivity {

    // éléments graphiques à manipuler
    TextView compteur;
    Button btnPlus, btnReset, btnMoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // terminal
        Log.d("test", "OnCreate()");
        // relier les boutons au éléments graphiques du layout
        compteur=findViewById(R.id.compteurGR);
        btnPlus = findViewById(R.id.btnPlus);
        btnReset=findViewById(R.id.btnReset);
        btnMoins=findViewById(R.id.btnMoins);

        // au début de l'application on met le numéro a zero
        compteur.setText("0");
        // Attention le compteur n'est pas un text field mais un signed int

        // on ajoute les event listener
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // réaction
                // conversion chaine/entier
                int count = Integer.parseInt(compteur.getText().toString());
                count++;
                compteur.setText(String.valueOf(count));
            }
        });
        btnMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(compteur.getText().toString());
                count--;
                compteur.setText(String.valueOf(count));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                compteur.setText("0");
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("test", "OnStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("test", "OnResume()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("test", "OnPause()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("test", "OnDestroy()");
    }



}