package com.example.uno.practicaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class ConfirmaCompra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirma_compra);
    }
    public void inicializarUI() {

    }

public void finalizarCompra(View v){
    Intent i = new Intent(getApplicationContext(),SeleccionGenero.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(i);}
}
