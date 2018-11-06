package com.fisher.dane.lab5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void affirm(View view) {
        EditText name = findViewById(R.id.editText);
        String nameValue = name.getText().toString();

        TextView booText= findViewById(R.id.message);
        booText.setText("You are a valuable person " + nameValue + " !");

        ImageView ghost = findViewById(R.id.imageView);
        ghost.setImageResource(R.drawable.thumbs);
    }
}
