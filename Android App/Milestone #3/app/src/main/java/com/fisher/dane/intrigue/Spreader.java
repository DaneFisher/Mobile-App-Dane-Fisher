package com.fisher.dane.intrigue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Spreader extends AppCompatActivity {

    public double total;
    public int believestNum;
    public int believestPoints;
    public int believesfNum;
    public int believesfPoints;
    public int disbelievestNum;
    public double disbelievestPoints;
    public int disbelievesfNum;
    public int disbelievesfPoints;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    Intent intent1 = new Intent(Spreader.this, MainActivity.class);
                    intent1.putExtra("totalScore", total);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_voter:
                    Intent intent2 = new Intent(Spreader.this, Voter.class);
                    intent2.putExtra("totalScore", total);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_initiator:
                    Intent intent3 = new Intent(Spreader.this, Initiator.class);
                    intent3.putExtra("totalScore", total);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_spreader:
                    Intent intent4 = new Intent(Spreader.this, Spreader.class);
                    intent4.putExtra("totalScore", total);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_subject:
                    Intent intent5 = new Intent(Spreader.this, Subject.class);
                    intent5.putExtra("totalScore", total);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    public void btmin(View view) {
        total--;
        believestNum--;
        believestPoints--;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(believestNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(believestPoints));
    }

    public void btplu(View view) {
        total++;
        believestNum++;
        believestPoints++;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(believestNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(believestPoints));
    }

    public void bfplu(View view) {
        total = total + 2;
        believesfNum++;
        believesfPoints +=2;
        TextView textview3 = findViewById(R.id.tv3);
        textview3.setText(String.valueOf(believesfNum));
        TextView textview4 = findViewById(R.id.tv4);
        textview4.setText(String.valueOf(believesfPoints));
    }

    public void bfmin(View view) {
        total = total - 2;
        believesfNum--;
        believesfPoints -=2;
        TextView textview3 = findViewById(R.id.tv3);
        textview3.setText(String.valueOf(believesfNum));
        TextView textview4 = findViewById(R.id.tv4);
        textview4.setText(String.valueOf(believesfPoints));
    }

    //============================

    public void dtmin(View view) {
        total = + 0.5;
        disbelievestNum--;
        disbelievesfPoints +=.5;
        TextView textview5 = findViewById(R.id.tv5);
        textview5.setText(String.valueOf(disbelievestNum));
        TextView textview6 = findViewById(R.id.tv6);
        textview6.setText(String.valueOf(disbelievestPoints));
    }

    public void dtplu(View view) {
        total = - 0.5;
        disbelievestNum++;
        disbelievesfPoints -=.5;
        TextView textview5 = findViewById(R.id.tv5);
        textview5.setText(String.valueOf(disbelievestNum));
        TextView textview6 = findViewById(R.id.tv6);
        textview6.setText(String.valueOf(disbelievestPoints));
    }

    public void dfplu(View view) {
        total--;
        disbelievesfNum++;
        disbelievesfPoints--;
        TextView textview7 = findViewById(R.id.tv7);
        textview7.setText(String.valueOf(disbelievesfNum));
        TextView textview8 = findViewById(R.id.tv8);
        textview8.setText(String.valueOf(disbelievesfPoints));
    }

    public void dfmin(View view) {
        total ++;
        disbelievesfNum--;
        disbelievesfPoints++;
        TextView textview7 = findViewById(R.id.tv7);
        textview7.setText(String.valueOf(disbelievesfNum));
        TextView textview8 = findViewById(R.id.tv8);
        textview8.setText(String.valueOf(disbelievesfPoints));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spreader);

        //get intent
        Intent intent1 = getIntent();
        total = intent1.getDoubleExtra("totalScore",0);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_spreader).setChecked(true);
    }

}
