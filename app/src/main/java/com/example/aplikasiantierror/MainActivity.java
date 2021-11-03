package com.example.aplikasiantierror;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1=(CardView) findViewById(R.id.cardOlahraga);
        card2=(CardView) findViewById(R.id.cardDiet);
        card3=(CardView) findViewById(R.id.cardMakananMinuman);
        card4=(CardView) findViewById(R.id.cardManajemenWaktu);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.cardOlahraga:
                i= new Intent(this,OlahragaActivity.class);
                startActivity(i);
                break;
            case R.id.cardDiet:
                i= new Intent(this,DietActivity.class);
                startActivity(i);
                break;
            case R.id.cardMakananMinuman:
                i= new Intent(this,MakananMinumanActivity.class);
                startActivity(i);
                break;
            case R.id.cardManajemenWaktu:
                i= new Intent(this,WaktuActivity.class);
                startActivity(i);
                break;
        }
    }
}