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
        total = total + 2;
    }

    public void btgplu(View view) {
        total = total - 2;
    }

    public void btbplu(View view) {
        total = total - 1.5;
    }

    public void btbmin(View view) {
        total = total + 1.5;
    }

    //===========================

    public void bfgplu(View view) {
        total = total + 1.5;
    }

    public void bfgmin(View view) {
        total = total - 1.5;
    }

    public void bfbplu(View view) {
        total --;
    }

    public void bfbmin(View view) {
        total ++;
    }

    //===========================

    public void dtgplu(View view) {
        total = total - 0.5;
    }

    public void dtgmin(View view) {
        total = total + 0.5;
    }

    public void dtbplu(View view) {
        total ++;
    }

    public void dtbmin(View view) {
        total --;
    }

    //===========================

    public void dfgplu(View view) {
        total ++;
    }

    public void dfgmin(View view) {
        total --;
    }

    public void dfbplu(View view) {
        total ++;
    }

    public void dfbmin(View view) {
        total --;
    }

    //===========================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_subject).setChecked(true);
//        navigation.setSelectedItemId(R.id.navigation_subject);
    }

}
