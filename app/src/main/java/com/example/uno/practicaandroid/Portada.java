package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Portada extends AppCompatActivity {
    TextView txtUser, txtPass;
    int[] cuentas = {R.string.usuario1, R.string.usuario2, R.string.usuario3, R.string.usuario4, R.string.administrador};
    String cadena;
    String[] userPass;
    boolean ok = false;
    boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        inicializarUI();
    }

    public void inicializarUI() {
        txtUser = (TextView) findViewById(R.id.txt1User);
        txtPass = (TextView) findViewById(R.id.txt1Pass);

    }

    public void iniciarSesion(View v) {
        for (int i = 0; i < cuentas.length; i++) {
            cadena = getString(cuentas[i]);
            userPass = cadena.split("-");
            ok = ((txtUser.getText().toString().equals(userPass[0])) && (txtPass.getText().toString().equals(userPass[1])));
            if(ok){break;}
        }
        int valor = ok ? R.string.autorizado : R.string.denegado;
        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();
        if (ok) {
            String usuario = txtUser.getText().toString();
            Intent intencion = new Intent(getApplicationContext(), SeleccionGenero.class);
            intencion.putExtra("usuario", usuario);
            startActivity(intencion);

        }
    }


    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, R.string.salir,
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
}
