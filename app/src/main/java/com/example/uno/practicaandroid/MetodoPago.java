package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MetodoPago extends AppCompatActivity {
    TextView lblProducto,lblPrecio;
    RadioButton rbT,rbE,rbP;
    RadioGroup radioGroup;
    String titulo, nombre;
    int imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metodo_pago);
        inicializarUI();
        nombre = getIntent().getStringExtra("usuario");
        titulo = getIntent().getStringExtra("titulo");
        imagen = getIntent().getIntExtra("imagen", 0);
        lblProducto.setText(titulo);

    }

    public void inicializarUI(){
        lblPrecio = (TextView) findViewById(R.id.lbl5Precio);
        lblProducto = (TextView) findViewById(R.id.lbl5PeliculaAlquilada);
        rbT = (RadioButton) findViewById(R.id.rb5Tarjeta);
        rbE = (RadioButton) findViewById(R.id.rb5Efectivo);
        rbP = (RadioButton) findViewById(R.id.rb5Paypal);
        radioGroup = (RadioGroup) findViewById(R.id.rg5Pago);
    }

    public void mostrarInicio(View v){
        Intent i = new Intent(getApplicationContext(),Portada.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void mostrarFinalizacionCompra(View v){
        Integer nPago=0;
        Integer id;
        if(rbT.isChecked() || rbE.isChecked() || rbP.isChecked()){
            Intent intencion = new Intent(getApplicationContext(),ConfirmaCompra.class);
            intencion.putExtra("titulo", titulo);
            intencion.putExtra("cartel", imagen);
            id =radioGroup.getCheckedRadioButtonId();
            if(id == rbT.getId()){
                nPago = R.string.lbl5MetodoPago1;
            }else if(id==rbE.getId()){
                nPago=R.string.lbl5MetodoPago2;
            }else if(id==rbP.getId()){
                nPago=R.string.lbl5MetodoPago3;
            }
            intencion.putExtra("usuario",nombre);
            intencion.putExtra("pago",nPago.toString());
            startActivity(intencion);
        }else{
            Toast.makeText(this,R.string.validez5Checkbox, Toast.LENGTH_SHORT).show();
        }
    }

    public void mostrarListaPeliculas(View v){
        onBackPressed();
    }
}
