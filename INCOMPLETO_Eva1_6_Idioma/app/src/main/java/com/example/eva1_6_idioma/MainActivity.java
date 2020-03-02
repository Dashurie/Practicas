package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtnom, txtape, txtedad;
EditText editnom, editape, editedad;
RadioGroup rgsex, rgidi;
RadioButton rbsex1,rbsex2,rbsex3, rbidi;
Button btnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgidi.findViewById(R.id.RgIdioma);

    }

    public void Checkbtn(View view) {
        int radiobuttonid = rgidi.getCheckedRadioButtonId();
        rbidi= findViewById(radiobuttonid);

    }

}
