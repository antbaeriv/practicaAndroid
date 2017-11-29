package com.example.uno.practicaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Portada extends AppCompatActivity {
    TextView user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        inicializarUI();
    }
    public void inicializarUI() {
        user = (TextView) findViewById(R.id.txt1User);
        pass = (TextView) findViewById(R.id.txt1Pass);

    }
    public void iniciarSesion(View v) {
        boolean ok = ((user.getText().toString().equals("Studium")) && (pass.getText().toString().equals("Studium")));
        int valor = ok ? R.string.autorizado : R.string.denegado;
        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();
        if (ok) {
            String usuario = user.getText().toString();
            Intent intencion = new Intent(getApplicationContext(), SeleccionGenero.class);
            intencion.putExtra("Usuario", usuario);
            startActivity(intencion);

        }
    }
}
