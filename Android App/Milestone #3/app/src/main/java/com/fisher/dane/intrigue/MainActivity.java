package com.fisher.dane.intrigue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public double total;
    public int alliancesNum;
    public int alliancesPoints;
    public int bAlliancesNum;
    public double bAlliancesPoints;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                    intent1.putExtra("totalScore", total);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_voter:
                    Intent intent2 = new Intent(MainActivity.this, Voter.class);
                    intent2.putExtra("totalScore", total);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_initiator:
                    Intent intent3 = new Intent(MainActivity.this, Initiator.class);
                    intent3.putExtra("totalScore", total);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_spreader:
                    Intent intent4 = new Intent(MainActivity.this, Spreader.class);
                    intent4.putExtra("totalScore", total);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_subject:
                    Intent intent5 = new Intent(MainActivity.this, Subject.class);
                    intent5.putExtra("totalScore", total);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    public void addOneAlliance(View view) {
        total++;
        alliancesNum++;
        alliancesPoints++;
        TextView textview = findViewById(R.id.totalTextView);
        textview.setText(String.valueOf(total));
        TextView textview1 = findViewById(R.id.textView1);
        textview1.setText(String.valueOf(alliancesNum));
        TextView textview2 = findViewById(R.id.textView2);
        textview2.setText(String.valueOf(alliancesPoints));
        checkStatus();
    }

    public void subtractOneAlliance(View view) {
        total--;
        alliancesNum--;
        alliancesPoints--;
        TextView textview = findViewById(R.id.totalTextView);
        textview.setText(String.valueOf(total));
        TextView textview1 = findViewById(R.id.textView1);
        textview1.setText(String.valueOf(alliancesNum));
        TextView textview2 = findViewById(R.id.textView2);
        textview2.setText(String.valueOf(alliancesPoints));
        checkStatus();
    }

    public void addOneBAlliance(View view) {
        total = total -1.5;
        bAlliancesNum++;
        bAlliancesPoints -=1.5;
        TextView textview = findViewById(R.id.totalTextView);
        textview.setText(String.valueOf(total));
        TextView textview3 = findViewById(R.id.textView3);
        textview3.setText(String.valueOf(bAlliancesNum));
        TextView textview4 = findViewById(R.id.textView4);
        textview4.setText(String.valueOf(bAlliancesPoints));
        checkStatus();
    }

    public void subtractOneBAlliance(View view) {
        total = total +1.5;
        bAlliancesNum--;
        bAlliancesPoints +=1.5;
        TextView textview = findViewById(R.id.totalTextView);
        textview.setText(String.valueOf(total));
        TextView textview3 = findViewById(R.id.textView3);
        textview3.setText(String.valueOf(bAlliancesNum));
        TextView textview4 = findViewById(R.id.textView4);
        textview4.setText(String.valueOf(bAlliancesPoints));
        checkStatus();
    }

    public void checkStatus() {
        TextView statusTextView = findViewById(R.id.statusTextView);
        if (total >= 25)
        {
            statusTextView.setText("President");
        }
        else if (total < 25 && total > 16.5 )
        {
            statusTextView.setText("Cabinet");
        }
        else if (total < 17 && total > 9.5 )
        {
            statusTextView.setText("Senator");
        }
        else{
            statusTextView.setText("Party Member");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //save current state
        outState.putDouble("total", total);

        //always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get intent
        Intent intent1 = getIntent();
        total = intent1.getDoubleExtra("totalScore",0);

        TextView textView5 = findViewById(R.id.totalTextView);
        textView5.setText(String.valueOf(total));
        checkStatus();

        //check for recovering the instance state
        if (savedInstanceState !=null){
            total = savedInstanceState.getDouble("total");

            textView5.setText(String.valueOf(total));
        }

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_main).setChecked(true);
    }

}
