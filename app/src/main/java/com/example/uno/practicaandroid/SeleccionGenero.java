package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SeleccionGenero extends AppCompatActivity {

    String nombre;
    TextView lblUser;
    Spinner spnGen;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seleccion_genero);
        nombre = getIntent().getStringExtra("usuario");
        inicializarUI();
        lblUser.setText(getString(R.string.wlc)+" "+nombre);
        adapter = ArrayAdapter.createFromResource(this, R.array.spnGeneros, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnGen.setAdapter(adapter);

    }
    public void inicializarUI(){
        lblUser = (TextView) findViewById(R.id.lbl2User);
        spnGen = (Spinner) findViewById(R.id.spn2Generos);
    }

    public void mostrarInicio(View v){
        Intent i = new Intent(getApplicationContext(),Portada.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


    public void mostrarListaPeliculas(View v){
        //String generoS = spnGen.getSelectedItem().toString();
        Integer genero = spnGen.getSelectedItemPosition();
        if(genero==0){
            Toast.makeText(this, R.string.validez, Toast.LENGTH_SHORT).show();
        }else{
            Intent intencion = new Intent(getApplicationContext(),ListaPeliculas.class);
            intencion.putExtra("genero",genero);
            intencion.putExtra("usuario",nombre);
            startActivity(intencion);
        }

    }

}
