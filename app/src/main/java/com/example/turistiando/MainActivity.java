package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS


    //METODOS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   //CARGAR MENU XML CREADO PREVIAMENTE
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;



    }

    //DAR FUNCIONAMIENTO AL MENU

    public boolean onOptionsItemSelected(MenuItem item) {

        //OBSERVAMOS A QUE ITEM LE DAMOS CLIC
        int itemSeleccionado=item.getItemId();

        switch (itemSeleccionado){
            case (R.id.opcion1):
                Toast.makeText(this, "seleccionaste opcion1", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion2):
                Toast.makeText(this, "seleccionaste opcion2", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion3):
                Toast.makeText(this, "seleccionaste opcion3", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}