package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MetodoPago extends AppCompatActivity {
    TextView lblProducto;
    TextView lblPrecio;
    CheckBox chkTarjeta;
    CheckBox chkEfectivo;
    CheckBox chkPaypal;

    String titulo;
    int cartel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metodo_pago);
        inicializarUI();

        titulo = getIntent().getStringExtra("titulo");
        cartel = getIntent().getIntExtra("imagen", 0);
        lblProducto.setText(titulo);

    }


    public void inicializarUI(){
        lblPrecio = (TextView) findViewById(R.id.lbl5Precio);
        lblProducto = (TextView) findViewById(R.id.lbl5PeliculaAlquilada);
        chkTarjeta = (CheckBox) findViewById(R.id.cbx5Pago1);
        chkEfectivo = (CheckBox) findViewById(R.id.cbx5Pago2);
        chkPaypal = (CheckBox) findViewById(R.id.cbx5Pago3);

    }

    public void mostrarInicio(View v){
        Intent i = new Intent(getApplicationContext(),Portada.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void mostrarFinalizacionCompra(View v){
        if(chkTarjeta.isChecked()){
            Intent intento = new Intent(getApplicationContext(),ConfirmaCompra.class);
            intento.putExtra("titulo", lblProducto.getText());
            intento.putExtra("cartel", cartel);
            startActivity(intento);
        }else if(chkEfectivo.isChecked()) {
            Intent intento = new Intent(getApplicationContext(), ConfirmaCompra.class);
            intento.putExtra("titulo", lblProducto.getText());
            intento.putExtra("cartel", cartel);
            startActivity(intento);
        }else if(chkEfectivo.isChecked()) {
            Intent intento = new Intent(getApplicationContext(), ConfirmaCompra.class);
            intento.putExtra("titulo", lblProducto.getText());
            intento.putExtra("cartel", cartel);
            startActivity(intento);
        }else{
            Toast.makeText(this,R.string.validez5Checkbox, Toast.LENGTH_SHORT).show();
        }
    }

    public void mostrarListaPeliculas(View v){
        onBackPressed();
    }
}
