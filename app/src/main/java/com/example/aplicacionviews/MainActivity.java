package com.example.aplicacionviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEtiqueta,tvResultado; //en la misma linea siempre y cuando sean del mismo tipo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Identificar la vista
        tvEtiqueta = (TextView) findViewById(R.id.Texto);
        tvResultado = (TextView) findViewById(R.id.tvResultado);


        //Editar el texto de un TextView
        tvEtiqueta.setText("Hola Mundo");


        //Obtener el valor de un Text View
        String contenidoEtiqueta = tvEtiqueta.getText().toString();


        tvResultado.setText(contenidoEtiqueta);


    }//FIN OnCreate




}//Fin MainActivity
