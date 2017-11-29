package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SeleccionGenero extends AppCompatActivity {

    String nom;
    String[]generos = {"Seleccione un género","Acción","Drama","Ciencia Ficción"};
    TextView lblUser;
    Spinner spnGen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seleccion_genero);
        nom = getIntent().getStringExtra("Usuario");
        InicializarUI();
        lblUser.setText("Bienvenido, "+nom);
        spnGen.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,generos));
    }
    public void InicializarUI(){
        lblUser = (TextView) findViewById(R.id.lbl2User);
        spnGen = (Spinner) findViewById(R.id.spn2Generos);
    }

    public void MostrarActividad1(View v){
        Intent intento = new Intent(getApplicationContext(),Portada.class);
        startActivity(intento);
    }

}
