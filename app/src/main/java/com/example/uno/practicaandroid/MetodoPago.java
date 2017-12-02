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
    TextView lblProducto;
    TextView lblPrecio;
    RadioButton rbT;
    RadioButton rbE;
    RadioButton rbP;
    RadioGroup radioGroup;
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
        Integer nombre=0;
        Integer id;
        if(rbT.isChecked() || rbE.isChecked() || rbP.isChecked()){
            Intent intento = new Intent(getApplicationContext(),ConfirmaCompra.class);
            intento.putExtra("titulo", lblProducto.getText());
            intento.putExtra("cartel", cartel);
            id =radioGroup.getCheckedRadioButtonId();
            if(id == rbT.getId()){
                nombre = R.string.lbl5MetodoPago1;
            }else if(id==rbE.getId()){
                nombre=R.string.lbl5MetodoPago2;
            }else if(id==rbP.getId()){
                nombre=R.string.lbl5MetodoPago3;
            }

            intento.putExtra("pago",nombre.toString());
            startActivity(intento);
        }else{
            Toast.makeText(this,R.string.validez5Checkbox, Toast.LENGTH_SHORT).show();
        }
    }

    public void mostrarListaPeliculas(View v){
        onBackPressed();
    }
}
