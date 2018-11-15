package com.fisher.dane.reallab6;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changeBand(View view) {

        TextView bandName = findViewById(R.id.textView);

        ImageView bandImage = findViewById(R.id.imageView);

        Spinner colorText = findViewById(R.id.spinner);
        String textColor = String.valueOf(colorText.getSelectedItem());

        Switch switchFirst = findViewById(R.id.switch1);
        boolean caps = switchFirst.isChecked();

        RadioGroup rGroup = findViewById(R.id.radioGroup);
        int bandID = rGroup.getCheckedRadioButtonId();

        if (bandID == -1)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please select a band";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else
        {
            if (bandID == R.id.radioButton)
            {
                bandImage.setImageResource(R.drawable.alt);
                bandName.setText("Alt-J");
            }
            else if (bandID == R.id.radioButton2)
            {
                bandImage.setImageResource(R.drawable.glass);
                bandName.setText("Glass Animals");

            }
            else
            {
                bandImage.setImageResource(R.drawable.slender);
                bandName.setText("Slender Bodies");
            }

            if(caps)
            {
                bandName.setAllCaps(true);
            }
            else
            {
                bandName.setAllCaps(false);
            }

            switch (textColor)
            {
                case "Red":
                    bandName.setTextColor(Color.RED);
                    break;
                case "Yellow":
                    bandName.setTextColor(Color.YELLOW);
                    break;
                case "Green":
                    bandName.setTextColor(Color.GREEN);
                    break;
                case "Blue":
                    bandName.setTextColor(Color.BLUE);
                    break;
                case "Black":
                    bandName.setTextColor(Color.BLACK);
                    break;
                default:
                    bandName.setTextColor(Color.BLACK);
            }
        }
    }
}
