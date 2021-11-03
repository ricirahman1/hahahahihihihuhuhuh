package com.example.aplikasiantierror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OlahragaActivity extends AppCompatActivity {
    ImageButton imageButton1,imageButton2,imageButton3,imageButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahraga);

        imageButton1=findViewById(R.id.olahraga_sepeda);
        imageButton2=findViewById(R.id.olahraga_yoga);
        imageButton3=findViewById(R.id.olahraga_pilate);



        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),VideoSepeda.class));
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), VideoYoga.class));
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),VideoFilate.class));
            }
        });


    }
}