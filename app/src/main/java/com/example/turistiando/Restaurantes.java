package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica = findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaRestaurantes();
        Adaptador adaptador = new Adaptador(lista);
        listaLogica.setAdapter(adaptador);


    }

    public void crearListaRestaurantes() {

        lista.add(new Hotel(R.drawable.restaurant1, "Restaurante El Campo", "$-100000-250000"));
        lista.add(new Hotel(R.drawable.restaurant2, "Restaurante Villa Alegria", "$35000-100000"));
        lista.add(new Hotel(R.drawable.restaurant3, "Restaurante Cordillera", "$200000-450000"));
        lista.add(new Hotel(R.drawable.restaurant4, "Restaurante Ven Aquí", "$550000"));

    }
}