package com.fisher.dane.intrigue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Voter extends AppCompatActivity {

    public double total;
    public int correctNum;
    public double correctPoints;
    public int incorrectNum;
    public double incorrectPoints;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    Intent intent1 = new Intent(Voter.this, MainActivity.class);
                    intent1.putExtra("totalScore", total);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_voter:
                    Intent intent2 = new Intent(Voter.this, Voter.class);
                    intent2.putExtra("totalScore", total);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_initiator:
                    Intent intent3 = new Intent(Voter.this, Initiator.class);
                    intent3.putExtra("totalScore", total);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_spreader:
                    Intent intent4 = new Intent(Voter.this, Spreader.class);
                    intent4.putExtra("totalScore", total);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_subject:
                    Intent intent5 = new Intent(Voter.this, Subject.class);
                    intent5.putExtra("totalScore", total);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    public void addCorrect(View view) {
        total = total + 0.5;
        correctNum++;
        correctPoints +=.5;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(correctNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(correctPoints));
    }

    public void subtractCorrect(View view) {
        total = total - 0.5;
        correctNum--;
        correctPoints -=.5;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(correctNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(correctPoints));
    }

    public void addIncorrect(View view) {
        total = total - 0.5;
        incorrectNum++;
        incorrectPoints -=.5;
        TextView textview1 = findViewById(R.id.tv3);
        textview1.setText(String.valueOf(incorrectNum));
        TextView textview2 = findViewById(R.id.tv4);
        textview2.setText(String.valueOf(incorrectPoints));
    }

    public void subtractIncorrect(View view) {
        total = total + 0.5;
        incorrectNum--;
        incorrectPoints +=.5;
        TextView textview1 = findViewById(R.id.tv3);
        textview1.setText(String.valueOf(incorrectNum));
        TextView textview2 = findViewById(R.id.tv4);
        textview2.setText(String.valueOf(incorrectPoints));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voter);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_voter).setChecked(true);
    }

}
