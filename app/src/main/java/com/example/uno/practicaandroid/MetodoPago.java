package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MetodoPago extends AppCompatActivity {
    TextView lblProducto;
    TextView lblPrecio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metodo_pago);
        inicializarUI();

    }


    public void inicializarUI(){
        lblPrecio = (TextView) findViewById(R.id.lbl5Precio);
        lblProducto = (TextView) findViewById(R.id.lbl5PeliculaAlquilada);
    }

    public void mostrarInicio(View v){
        Intent i = new Intent(getApplicationContext(),Portada.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void mostrarFinalizacionCompra(View v){

    }

    public void mostrarListaPeliculas(View v){
        onBackPressed();
    }
}
