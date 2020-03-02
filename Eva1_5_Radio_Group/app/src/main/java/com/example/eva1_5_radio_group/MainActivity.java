package com.example.eva1_5_radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton rb;
RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.Rgroup);
    }
    public void Checkbutton(View v){
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = findViewById(radiobuttonid);

        Toast.makeText(this, "Haz escogido a "+ rb.getText()+ "!!!!", Toast.LENGTH_SHORT).show();
    }
}
