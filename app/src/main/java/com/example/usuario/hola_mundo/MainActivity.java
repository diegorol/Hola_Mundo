package com.example.usuario.hola_mundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{

    Button btnSaludo;
    TextView txtSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        btnSaludo.setOnClickListener(this);
        btnSaludo.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View view) {
        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        String mensaje = new String();
        mensaje = getString(R.string.textClick);
        txtSaludo.setText(mensaje);
    }


    @Override
    public boolean onLongClick(View view) {
        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        //String mensaje = new String();
        //mensaje = getString(R.string.txtClickLargo);
        txtSaludo.setText(R.string.txtClickLargo);
        return false;
    }
}
