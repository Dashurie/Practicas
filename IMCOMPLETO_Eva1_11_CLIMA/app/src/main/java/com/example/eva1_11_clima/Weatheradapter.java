package com.example.eva1_11_clima;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Weatheradapter extends ArrayAdapter <Weather> {
    @NonNull
    @Override

    Weather [] object;
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            //primera vez que se ejecuta la aolicacion crear layout
        }
        //hay que recuperar los omponentes
        TextView vwcity,vwtemp, vwsdesc;
        ImageView imgclima;
        imgclima = convertView.findViewById(R.id.ImgClima);
        vwcity = convertView.findViewById(R.id.Viewcity);
        vwtemp = convertView.findViewById(R.id.Viewtemp);
        vwsdesc = convertView.findViewById(R.id.ViewSen);
        imgclima.setImageResource(object(position).getImage());
        vwcity.setText(object(position).getCity);
        vwtemp.setText(object(position).getTemp);
        vwsdesc.setText(object(position).getDesc);
        return super.getView(position, convertView, parent);
    }

    public Weatheradapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
    }
}
