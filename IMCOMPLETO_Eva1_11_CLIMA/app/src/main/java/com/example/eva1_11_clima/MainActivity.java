package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ListView lstVwclima;
TextView vwcity,vwtemp, vwsdesc;
ImageView imgclima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwclima = findViewById(R.id.lstVwclima);
        Weather[] cities = (
                new Weather("Chihuahua", 20, "Nublado", R.drawable.light_rain),
                new Weather("Jalisco", 26, "Soleado", R.drawable.sunny ),
                new Weather("Juarez", 18, "Nevado", R.drawable.snow ),
                new Weather("Creel", 20, "Nublado", R.drawable.cloudy ),
                new Weather("Delicias", 13, "Lluvioso", R.drawable.rainy ),
                new Weather("Camargo", 20, "Llovisnando", R.drawable.light_rain )
        )
    }
    }

