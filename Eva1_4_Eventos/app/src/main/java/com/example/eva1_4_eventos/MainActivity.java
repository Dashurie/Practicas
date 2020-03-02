package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


  Button btnac,btnxml,btnc,btnlisten;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnac = findViewById(R.id.BtnAc);
        btnxml = findViewById(R.id.BtnXML);
        btnlisten = findViewById(R.id.Btnlisten);
        btnc = findViewById(R.id.BtnC);
        btnlisten.setOnClickListener(this);
        Porclase Clase= new Porclase();
        Clase.porclase=findViewById(R.id.BtnC);


     btnac.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(getApplicationContext(),"Por Clase anomima",Toast.LENGTH_SHORT).show();
         }
     });

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"Por Listener",Toast.LENGTH_SHORT).show();
    }

    public void PorXML(View view) {
        Toast.makeText(getApplicationContext(),"Por XML",Toast.LENGTH_SHORT).show();
    }
}
