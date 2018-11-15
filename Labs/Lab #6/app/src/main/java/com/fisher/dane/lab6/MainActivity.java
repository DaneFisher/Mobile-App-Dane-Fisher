package com.fisher.dane.lab6;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSport(View view) {
        ToggleButton toggle = findViewById(R.id.toggleButton);
        boolean location = toggle.isChecked();

        Spinner exercise = findViewById(R.id.spinner);
        String exerciseType = String.valueOf(exercise.getSelectedItem());

        RadioGroup cost = findViewById(R.id.radioGroup);
        int cost_id = cost.getCheckedRadioButtonId();

        String perfectSport;

        //CHECK BOXES
        CheckBox springCheckBox = findViewById(R.id.checkBox);
        Boolean spring = springCheckBox.isChecked();

        CheckBox summerCheckBox = findViewById(R.id.checkBox2);
        Boolean summer = summerCheckBox.isChecked();

        CheckBox fallCheckBox = findViewById(R.id.checkBox3);
        Boolean fall = fallCheckBox.isChecked();

        CheckBox winterCheckBox = findViewById(R.id.checkBox4);
        Boolean winter = winterCheckBox.isChecked();

        if (cost_id == -1)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please select a cost level";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        if (location)
        {
            switch (exerciseType)
            {
                case "cardio":
                    perfectSport = "Spin Class";
                    break;
                case "strength":
                    perfectSport = "Weight Training";
                    break;
                case "flexibility":
                    perfectSport = "Yoga";
                    break;
                default:
                    perfectSport = "Yoga";
            }
        }
        else
        {
            if (cost_id == R.id.radioButton3)
            {
                if (winter)
                {
                    perfectSport = "Skiing";
                }
                else
                {
                    perfectSport = "Sky Diving";
                }
            }
            switch (exerciseType)
            {
                case "cardio":
                    perfectSport = "Running";
                    break;
                case "strength":
                    perfectSport = "Climbing";
                    break;
                case "flexibility":
                    perfectSport = "Yoga";
                    break;
                default:
                    perfectSport = "Yoga";
            }
        }

        TextView sportSelection = findViewById(R.id.sportTextView);
        sportSelection.setText(perfectSport + " is the sport for you.");
    }
}
