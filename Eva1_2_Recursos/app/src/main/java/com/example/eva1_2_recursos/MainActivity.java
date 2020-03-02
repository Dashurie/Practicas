package com.example.eva1_2_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editnom, editap, editedad;
TextView ViewR;
RadioGroup rg;
RadioButton rb;
Button Br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.Ragrup);
        editnom = findViewById(R.id.EditNom);
        editap = findViewById(R.id.EditAp);
        editedad = findViewById(R.id.EditEdad);
        Br = findViewById(R.id.BtnReg);
        ViewR =findViewById(R.id.ViewR);
    }
public void checkbutton(View v){
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = findViewById(radiobuttonid);

    Toast.makeText(getBaseContext(),rb.getText(), Toast.LENGTH_SHORT).show();
}
public void registrardatos(View v){
        String name = editnom.getText().toString();
        String ape = editap.getText().toString();
        String edad = editedad.getText().toString();
    int radiobuttonid = rg.getCheckedRadioButtonId();
    rb = findViewById(radiobuttonid);

        ViewR.setText(name + ", " + ape + ", " + edad+", "+ rb.getText() +".");

}
    }



