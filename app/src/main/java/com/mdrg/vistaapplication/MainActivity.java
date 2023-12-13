package com.mdrg.vistaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView edCed;
    TextView edPro;
    TextView  edPla;
    TextView  edAnif;

    TextView  edMar;

    TextView  edCol;

    TextView  edTip;

    TextView  edValV;

    TextView  edMul;

    Button btnIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCed = findViewById(R.id.txtCed);
        edPro = findViewById(R.id.txtPro);
        edPla = findViewById(R.id.txtPla);
        edAnif = findViewById(R.id.txtCol);
        edMar = findViewById(R.id.txtMar);
        edCol = findViewById(R.id.txtCol);
        edTip = findViewById(R.id.txtTipVe);
        edValV = findViewById(R.id.txtValveh);
        edMul = findViewById(R.id.txtMul);

    }
    public void ingresar (View view){

                String cedula = edCed.getText().toString();
                String propietario = edPro.getText().toString();
                String placa = edPla.getText().toString();
                String fabricacion = edAnif.getText().toString();
                String marca = edMar.getText().toString();
                String color = edCol.getText().toString();
                String tipo = edTip.getText().toString();
                String valorV = edValV.getText().toString();
                String multa = edMul.getText().toString();


                Bundle parametros = new Bundle();
                parametros.putString("cedula", cedula);
                parametros.putString("propietario", propietario);
                parametros.putString("placa", placa);
                parametros.putString("fabricacion", fabricacion);
                parametros.putString("marca", marca);
                parametros.putString("color", color);
                parametros.putString("tipo", tipo);
                parametros.putString("valorV", valorV);
                parametros.putString("multa", multa);

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);







    }
}