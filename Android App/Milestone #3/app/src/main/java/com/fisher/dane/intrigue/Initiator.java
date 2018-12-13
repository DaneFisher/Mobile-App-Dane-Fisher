package com.fisher.dane.intrigue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Initiator extends AppCompatActivity {

    public double total;
    public int believesNum;
    public double believesPoints;
    public int disbelievesNum;
    public double disbelievesPoints;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    Intent intent1 = new Intent(Initiator.this, MainActivity.class);
                    intent1.putExtra("totalScore", total);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_voter:
                    Intent intent2 = new Intent(Initiator.this, Voter.class);
                    intent2.putExtra("totalScore", total);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_initiator:
                    Intent intent3 = new Intent(Initiator.this, Initiator.class);
                    intent3.putExtra("totalScore", total);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_spreader:
                    Intent intent4 = new Intent(Initiator.this, Spreader.class);
                    intent4.putExtra("totalScore", total);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_subject:
                    Intent intent5 = new Intent(Initiator.this, Subject.class);
                    intent5.putExtra("totalScore", total);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    public void addBelieve(View view) {
        total ++;
        believesNum++;
        believesPoints ++;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(believesNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(believesPoints));
    }

    public void subtractBelieve(View view) {
        total --;
        believesNum--;
        believesPoints--;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(believesNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(believesPoints));
    }

    public void addDis(View view) {
        total = total + 0.5;
        disbelievesNum++;
        disbelievesPoints +=.5;
        TextView textview3 = findViewById(R.id.tv3);
        textview3.setText(String.valueOf(disbelievesNum));
        TextView textview4 = findViewById(R.id.tv4);
        textview4.setText(String.valueOf(disbelievesPoints));
    }

    public void subtractDis(View view) {
        total = total - 0.5;
        disbelievesNum--;
        disbelievesPoints -=.5;
        TextView textview3 = findViewById(R.id.tv3);
        textview3.setText(String.valueOf(disbelievesNum));
        TextView textview4 = findViewById(R.id.tv4);
        textview4.setText(String.valueOf(disbelievesPoints));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initiator);

        //get intent
        Intent intent1 = getIntent();
        total = intent1.getDoubleExtra("totalScore",0);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_initiator).setChecked(true);
    }

}
