package com.example.uno.practicaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ConfirmaCompra extends AppCompatActivity {
    String titulo, nombre;
    int imagen;
    TextView producto;
    ImageView imgProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirma_compra);
        nombre = getIntent().getStringExtra("usuario");
        titulo = getIntent().getStringExtra("titulo");
        imagen = getIntent().getIntExtra("cartel", 0);
        inicializarUI();
        producto.setText(titulo);
        imgProducto.setImageResource(imagen);
    }

    public void inicializarUI() {
        producto = (TextView) findViewById(R.id.lbl6Producto);
        imgProducto = (ImageView) findViewById(R.id.img6Prod);
    }

    public void salirAlquiler(View v) {
        Intent i = new Intent(getApplicationContext(), SeleccionGenero.class);
        i.putExtra("usuario",nombre);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
