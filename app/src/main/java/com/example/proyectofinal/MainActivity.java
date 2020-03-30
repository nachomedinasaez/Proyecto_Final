package com.example.proyectofinal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Sandwiches;
    private Button SobreNosotros;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sandwiches = (Button) findViewById(R.id.Sandwiches);
        SobreNosotros = (Button) findViewById(R.id.SobreNosotros);
    }

    public void Sandwiches(View view){
        Intent intentSandwiches = new Intent(this, Sandwiches.class);
        startActivity(intentSandwiches);
    }

    public void SobreNosotros(View view){
        Intent sobrenosotros = new Intent(this, SobreNosotros.class);
        startActivity(sobrenosotros);
    }


}
