package com.example.firstfullflegd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight,heightft,heightin;
        TextView textResult;
        Button checkbt;
        LinearLayout back;



        weight=findViewById(R.id.weight);
        heightft=findViewById(R.id.heightft);
        heightin=findViewById(R.id.heightinch);
        textResult=findViewById(R.id.txtResult);
        checkbt= findViewById(R.id.btncheck);
        back=findViewById(R.id.colBackground);

        checkbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               int wt=Integer.parseInt(weight.getText().toString());
               int hft=Integer.parseInt(heightft.getText().toString());
               int hi=Integer.parseInt(heightin.getText().toString());
               int totalIn=hft*12+hi;
               double totalcm=totalIn*2.53;
               double totalM=totalcm/100;
               double bmi=wt/(totalM*totalM);
               if (bmi>25){
                   textResult.setText("You are Over-Weighted! ");
                   back.setBackgroundColor(getResources().getColor(R.color.over));
               }else if(bmi<18){
                   textResult.setText("You are Under-Weight! ");
                   back.setBackgroundColor(getResources().getColor(R.color.under));
               }else {
                   textResult.setText("You are Healthy! ");
                   back.setBackgroundColor(getResources().getColor(R.color.healthy));
               }

            }
        });



    }
}