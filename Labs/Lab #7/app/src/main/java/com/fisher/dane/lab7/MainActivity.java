package com.fisher.dane.lab7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity {

    private Fourteener myFourteener = new Fourteener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get button
        Button button = findViewById(R.id.button);
        //create listener
        View.OnClickListener onclick = new View.OnClickListener(){
            public void onClick(View view){
                findFourteener(view);
            }
        };
        //add listener to the button
        button.setOnClickListener(onclick);
    }

    private void findFourteener(View view){
        //get spinner
        Spinner hikeSpinner = findViewById(R.id.spinner);
        //get spinner item array position
        Integer hike = hikeSpinner.getSelectedItemPosition();
        //set the coffee shop
        myFourteener.setFourteener(hike);
        //get suggested coffee shop
        String suggestedFourteener = myFourteener.getFourteener();
        //get URL of suggested coffee shop
        String suggestedFourteenerURL = myFourteener.getFourteenerURL();
        Log.i("shop", suggestedFourteener);
        Log.i("url", suggestedFourteenerURL);

        //create an Intent
        Intent intent = new Intent(this, ReceiveFourteenerActivity.class);

        //pass data
        intent.putExtra("fourteenerName", suggestedFourteener);
        intent.putExtra("fourteenerURL", suggestedFourteenerURL);

        //start intent
        startActivity(intent);
    }
}
