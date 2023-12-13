package com.mdrg.vistaapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    TextView txtCedu;
    TextView txtNomb;
    TextView txtVehi;
    TextView txtPlaca;
    TextView txtReno;
    TextView txtConta;
    TextView txtMulta;
    TextView txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtCedu = findViewById(R.id.txtCedu);
        txtNomb = findViewById(R.id.txtNomb);
        txtVehi = findViewById(R.id.txtVehi);
        txtPlaca = findViewById(R.id.txtPlaca);
        txtReno = findViewById(R.id.txtReno);
        txtConta = findViewById(R.id.txtConta);
        txtMulta = findViewById(R.id.txtMulta);
        txtTotal = findViewById(R.id.txtTotal);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String cedula = extras.getString("cedula");
            String propietario = extras.getString("propietario");
            String vehiculo = extras.getString("vehiculo");
            String placa = extras.getString("placa");



            txtCedu.setText("Cédula: " + cedula);
            txtNomb.setText("Propietario: " + propietario);
            txtVehi.setText("Vehículo: " + vehiculo);
            txtPlaca.setText("Placa: " + placa);


            double sueldoBasico = 435.0;
            double importeRenovacion = 0.0;


            if (cedula.startsWith("1") && placa.startsWith("I")) {
                importeRenovacion = sueldoBasico * 0.05;
            }

            int añoFabricacion = Integer.parseInt(vehiculo);
            double multaContaminacion = 0.0;


            if (añoFabricacion < 2010) {
                int añosContaminacion = 2010 - añoFabricacion;
                multaContaminacion = sueldoBasico * 0.02 * añosContaminacion;
            }


            double valorMatriculacion = 0.0;


            String marca = extras.getString("marca");
            String tipo = extras.getString("tipo");
            String valorV = extras.getString("valorV");
            String multa = extras.getString("multa");


            if (marca.equals("Toyota") && tipo.equals("Jeep")) {
                valorMatriculacion = Double.parseDouble(valorV) * 0.08;
            } else if (marca.equals("Toyota") && tipo.equals("camioneta")) {
                valorMatriculacion = Double.parseDouble(valorV) * 0.12;
            } else if (marca.equals("Suzuki") && tipo.equals("vitara")) {
                valorMatriculacion = Double.parseDouble(valorV) * 0.10;
            } else if (marca.equals("Suzuki") && tipo.equals("automóvil")) {
                valorMatriculacion = Double.parseDouble(valorV) * 0.09;
            }

            double multaSueldo = 0.0;


            if (!multa.isEmpty()) {
                multaSueldo = sueldoBasico * 0.25;
            }


            double total = importeRenovacion + multaContaminacion + valorMatriculacion + multaSueldo;

            txtReno.setText("Renovación: $" + importeRenovacion);
            txtConta.setText("Contaminación: $" + multaContaminacion);
            txtMulta.setText("Multa: $" + multaSueldo);
            txtTotal.setText("Total: $" + total);

        }

    }
}
