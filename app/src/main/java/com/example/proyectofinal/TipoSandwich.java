package com.example.proyectofinal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TipoSandwich extends AppCompatActivity {

    String nombre;
    int imagen;
    String descripcion;
    String precio;

    TextView Titulo;
    TextView Descripcion;
    TextView Precio;
    ImageView ImagenSandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_sandwich);

        nombre = getIntent().getStringExtra("nombre");
        imagen = getIntent().getIntExtra("imagen",0);
        Log.i("info",""+imagen);
        descripcion = getIntent().getStringExtra("descripcion");
        precio = getIntent().getStringExtra("precio");
        Titulo = (TextView) findViewById(R.id.NombreSandwitch);
        Titulo.setText(nombre);
        Descripcion = (TextView) findViewById(R.id.DescripcionSandwitch);
        Descripcion.setText(descripcion);
        Precio = (TextView) findViewById(R.id.PrecioSandwitch);
        Precio.setText(precio);
        ImagenSandwich = (ImageView) findViewById(R.id.ImagenSandwitch);
        ImagenSandwich.setImageResource(imagen);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detalles de: "+nombre);


    }


}
