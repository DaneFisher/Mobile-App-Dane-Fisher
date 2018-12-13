package com.fisher.dane.intrigue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Subject extends AppCompatActivity {

    public double total;
    public int believestgNum;
    public int believestgPoints;
    public int believestbNum;
    public float believestbPoints;
    public int believesfgNum;
    public float believesfgPoints;
    public int believesfbNum;
    public int believesfbPoints;
    public int disbelievestgNum;
    public float disbelievestgPoints;
    public int disbelievestbNum;
    public int disbelievestbPoints;
    public int disbelievesfgNum;
    public int disbelievesfgPoints;
    public int disbelievesfbNum;
    public int disbelievesfbPoints;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    Intent intent1 = new Intent(Subject.this, MainActivity.class);
                    intent1.putExtra("totalScore", total);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_voter:
                    Intent intent2 = new Intent(Subject.this, Voter.class);
                    intent2.putExtra("totalScore", total);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_initiator:
                    Intent intent3 = new Intent(Subject.this, Initiator.class);
                    intent3.putExtra("totalScore", total);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_spreader:
                    Intent intent4 = new Intent(Subject.this, Spreader.class);
                    intent4.putExtra("totalScore", total);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_subject:
                    Intent intent5 = new Intent(Subject.this, Subject.class);
                    intent5.putExtra("totalScore", total);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    public void btgmin(View view) {
        total = total - 2;
        believestgNum--;
        believestgPoints -=2;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(believestgNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(believestgPoints));
    }

    public void btgplu(View view) {
        total = total + 2;
        believestgNum++;
        believestgPoints +=2;
        TextView textview1 = findViewById(R.id.tv1);
        textview1.setText(String.valueOf(believestgNum));
        TextView textview2 = findViewById(R.id.tv2);
        textview2.setText(String.valueOf(believestgPoints));
    }

    public void btbplu(View view) {
        total = total - 1.5;
        believestbNum++;
        believestbPoints -=1.5;
        TextView textview3 = findViewById(R.id.tv3);
        textview3.setText(String.valueOf(believestbNum));
        TextView textview4 = findViewById(R.id.tv4);
        textview4.setText(String.valueOf(believestbPoints));
    }

    public void btbmin(View view) {
        total = total + 1.5;
        believestbNum--;
        believestbPoints +=1.5;
        TextView textview3 = findViewById(R.id.tv3);
        textview3.setText(String.valueOf(believestbNum));
        TextView textview4 = findViewById(R.id.tv4);
        textview4.setText(String.valueOf(believestbPoints));
    }

    //===========================

    public void bfgplu(View view) {
        total = total + 1.5;
        believesfgNum++;
        believesfgPoints +=1.5;
        TextView textview5 = findViewById(R.id.tv5);
        textview5.setText(String.valueOf(believesfgNum));
        TextView textview6 = findViewById(R.id.tv6);
        textview6.setText(String.valueOf(believesfgPoints));
    }

    public void bfgmin(View view) {
        total = total - 1.5;
        believesfgNum--;
        believesfgPoints -=1.5;
        TextView textview5 = findViewById(R.id.tv5);
        textview5.setText(String.valueOf(believesfgNum));
        TextView textview6 = findViewById(R.id.tv6);
        textview6.setText(String.valueOf(believesfgPoints));
    }

    public void bfbplu(View view) {
        total --;
        believesfbNum++;
        believesfbPoints--;
        TextView textview7 = findViewById(R.id.tv7);
        textview7.setText(String.valueOf(believesfbNum));
        TextView textview8 = findViewById(R.id.tv8);
        textview8.setText(String.valueOf(believesfbPoints));
    }

    public void bfbmin(View view) {
        total ++;
        believesfbNum--;
        believesfbPoints++;
        TextView textview7 = findViewById(R.id.tv7);
        textview7.setText(String.valueOf(believesfbNum));
        TextView textview8 = findViewById(R.id.tv8);
        textview8.setText(String.valueOf(believesfbPoints));
    }

    //===========================

    public void dtgplu(View view) {
        total = total - 0.5;
        disbelievestgNum++;
        disbelievestgPoints -=.5;
        TextView textview9 = findViewById(R.id.tv9);
        textview9.setText(String.valueOf(disbelievestgNum));
        TextView textview10 = findViewById(R.id.tv10);
        textview10.setText(String.valueOf(disbelievestgPoints));
    }

    public void dtgmin(View view) {
        total = total + 0.5;
        disbelievestgNum--;
        disbelievestgPoints +=.5;
        TextView textview9 = findViewById(R.id.tv9);
        textview9.setText(String.valueOf(disbelievestgNum));
        TextView textview10 = findViewById(R.id.tv10);
        textview10.setText(String.valueOf(disbelievestgPoints));
    }

    public void dtbplu(View view) {
        total ++;
        disbelievestbNum++;
        disbelievestbPoints ++;
        TextView textview11 = findViewById(R.id.tv11);
        textview11.setText(String.valueOf(disbelievestbNum));
        TextView textview12 = findViewById(R.id.tv12);
        textview12.setText(String.valueOf(disbelievestbPoints));
    }

    public void dtbmin(View view) {
        total --;
        disbelievestbNum--;
        disbelievestbPoints--;
        TextView textview11 = findViewById(R.id.tv11);
        textview11.setText(String.valueOf(disbelievestbNum));
        TextView textview12 = findViewById(R.id.tv12);
        textview12.setText(String.valueOf(disbelievestbPoints));
    }

    //===========================

    public void dfgplu(View view) {
        total ++;
        disbelievesfgNum++;
        disbelievesfgPoints ++;
        TextView textview13 = findViewById(R.id.tv13);
        textview13.setText(String.valueOf(disbelievesfgNum));
        TextView textview14 = findViewById(R.id.tv14);
        textview14.setText(String.valueOf(disbelievesfgPoints));
    }

    public void dfgmin(View view) {
        total --;
        disbelievesfgNum--;
        disbelievesfgPoints--;
        TextView textview13 = findViewById(R.id.tv13);
        textview13.setText(String.valueOf(disbelievesfgNum));
        TextView textview14 = findViewById(R.id.tv14);
        textview14.setText(String.valueOf(disbelievesfgPoints));
    }

    public void dfbplu(View view) {
        total ++;
        disbelievesfbNum++;
        disbelievesfbPoints++;
        TextView textview15 = findViewById(R.id.tv15);
        textview15.setText(String.valueOf(disbelievesfbNum));
        TextView textview16 = findViewById(R.id.tv16);
        textview16.setText(String.valueOf(disbelievesfbPoints));
    }

    public void dfbmin(View view) {
        total --;
        disbelievesfbNum--;
        disbelievesfbPoints--;
        TextView textview15 = findViewById(R.id.tv15);
        textview15.setText(String.valueOf(disbelievesfbNum));
        TextView textview16 = findViewById(R.id.tv16);
        textview16.setText(String.valueOf(disbelievesfbPoints));
    }

    //===========================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        //get intent
        Intent intent1 = getIntent();
        total = intent1.getDoubleExtra("totalScore",0);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_subject).setChecked(true);
//        navigation.setSelectedItemId(R.id.navigation_subject);
    }

}
