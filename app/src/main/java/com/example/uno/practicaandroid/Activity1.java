package com.example.uno.practicaandroid;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    TextView user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        inicializarUI();
    }
    public void inicializarUI() {
        user = (TextView) findViewById(R.id.txt1User);
        pass = (TextView) findViewById(R.id.txt1Pass);

    }
    public void mostrarAct2(View v) {
        boolean ok = ((user.getText().toString().equals("Studium")) && (pass.getText().toString().equals("Studium")));
        int valor = ok ? R.string.autorizado : R.string.denegado;
        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();
        if (ok) {
            String usuario = user.getText().toString();
            Intent intencion = new Intent(getApplicationContext(), Activity2.class);
            intencion.putExtra("Usuario", "Studium");
            startActivity(intencion);

        }
    }
}
