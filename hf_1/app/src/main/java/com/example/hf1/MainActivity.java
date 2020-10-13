package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1= findViewById(R.id.nbr1);
        final EditText szam2= findViewById(R.id.nbr2);
        Button gomb1= findViewById(R.id.plusz);
        Button gomb2= findViewById(R.id.kivonas);
        Button gomb3= findViewById(R.id.szorzas);
        Button gomb4= findViewById(R.id.osztas);
        final TextView eredmeny=findViewById(R.id.eredmeny);

        gomb1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double number1=Double.parseDouble(szam1.getText().toString());
                double number2=Double.parseDouble(szam2.getText().toString());
                double osszeg= number1+number2;
                eredmeny.setText( String.valueOf(osszeg));
            }
        });

        gomb2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double number1=Double.parseDouble(szam1.getText().toString());
                double number2=Double.parseDouble(szam2.getText().toString());
                double osszeg= number1-number2;
                eredmeny.setText( String.valueOf(osszeg));
            }
        });

        gomb3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double number1=Double.parseDouble(szam1.getText().toString());
                double number2=Double.parseDouble(szam2.getText().toString());
                double osszeg= number1*number2;
                eredmeny.setText( String.valueOf(osszeg));
            }
        });


        gomb4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double number1=Double.parseDouble(szam1.getText().toString());
                double number2=Double.parseDouble(szam2.getText().toString());
                double osszeg= number1/number2;
                eredmeny.setText( String.valueOf(osszeg));
            }
        });

    }
}