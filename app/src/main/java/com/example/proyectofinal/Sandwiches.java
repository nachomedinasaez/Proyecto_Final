package com.example.proyectofinal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Sandwiches extends AppCompatActivity {

    LinearLayout contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitches);
        contenedor = (LinearLayout) findViewById(R.id.Boton1);
        ArrayList<Sandwich> lista = new ArrayList<Sandwich>();
        lista.add(new Sandwich(46,"Chacarero", R.drawable.chacarero ,"Los ingredientes son: Pan Marraqueta - 400 gramos de churrasco en laminas delgadas - Ocho Rodajas de tomate - 1 taza de porotos verdes - aji verde picado a eleccion","Precio: $4000"));
        lista.add(new Sandwich(45,"Barros Luco", R.drawable.barros_luco ,"Los ingredientes son: Pan frica o marraqueta - 4 Churrascos - 4 rebanadas de queso chanco","Precio: $3000"));
        lista.add(new Sandwich(44,"Chemilico", R.drawable.chemilico ,"Los ingredientes son: 1/2 cebolla en pluma frita - 1 huevo frito - 1 bistec delgado - 1 marraqueta, pan amasado o frica","Precio: $2000"));
        lista.add(new Sandwich(43,"Churrasco Italiano", R.drawable.churrasco_italiano ,"Los ingredientes son: 2 paltas maduras - 2 tomates - 4 marraquetas - 4 bistec - mayones (a eleccion)","Precio: $1000"));
        lista.add(new Sandwich(42,"King de Pollo", R.drawable.king_de_pollo ,"Los ingredientes son: Pollo empanizado - 2 rebanadas de queso amarillo - Lechuga - mayonesa casera - pan suave alargado con ajonjoli","Precio: $5000"));
        for (final Sandwich c:lista){
             Button boton1 = new Button(getApplicationContext());
             boton1.setText(c.Nombre);
             boton1.setTextSize(25);
             boton1.setTextColor(Color.parseColor("#FF9800"));
             contenedor.addView(boton1);

             boton1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                    Intent intentTipoSandwitch = new Intent(Sandwiches.this, TipoSandwich.class);
                    intentTipoSandwitch.putExtra("nombre", c.Nombre);
                    intentTipoSandwitch.putExtra("imagen", c.IdentImage);
                    intentTipoSandwitch.putExtra("descripcion", c.Descripcion);
                    intentTipoSandwitch.putExtra("precio", c.Precio);


                    startActivity(intentTipoSandwitch);
                 }
             });
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    class Sandwich {
        public int IdentBoton;
        public String Nombre;
        public int IdentImage;
        public String Descripcion;
        public String Precio;

        public Sandwich(int identBoton, String nombre, int identImage, String descripcion, String precio) {
            Nombre = nombre;
            IdentImage = identImage;
            Descripcion = descripcion;
            Precio = precio;
            IdentBoton = identBoton;
        }
    }
}
