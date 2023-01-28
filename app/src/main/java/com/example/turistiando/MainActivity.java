package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS


    //METODOS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra=getSupportActionBar();

        //Cambiando el color del action bar
        ColorDrawable colorBarra=
                new ColorDrawable(Color.parseColor("#0A8680"));
        barra.setBackgroundDrawable(colorBarra);

    }

    //metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del tel
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //Configuracion global en el telefono
        Configuration configurationTelefono=getResources().getConfiguration();
        configurationTelefono.locale=lenguaje;

        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configurationTelefono,getBaseContext().getResources().getDisplayMetrics());

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
                this.cambiarIdioma("en");
                Intent intent1=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent1);
                break;

            case (R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent2=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent2);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}