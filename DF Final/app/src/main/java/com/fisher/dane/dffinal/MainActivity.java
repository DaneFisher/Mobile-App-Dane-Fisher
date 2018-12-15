package com.fisher.dane.dffinal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private pizza myPizza = new pizza();

    public void compilePizza (View view){

        RadioGroup rg = findViewById(R.id.radioGroup);
        int selectedId = rg.getCheckedRadioButtonId();

//        Switch gfSwitch = findViewById(R.id.glutenFreeSwitch);

        if (selectedId == -1)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please select a crust type.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        else
        {
            EditText name = findViewById(R.id.pizzaNameEditText);
            String nameValue = name.getText().toString();

            RadioButton rb = findViewById(selectedId);
            String rbtext = rb.getText().toString();

            Switch gfSwitch = findViewById(R.id.glutenFreeSwitch);
            boolean gluten = gfSwitch.isChecked();

            String glutenfree;
            if (gluten) {
               glutenfree = "gluten free ";
            }
            else {
                glutenfree = "";
            }

            TextView pizzaDescriptionText= findViewById(R.id.displayPizza);
            pizzaDescriptionText.setText("The " + nameValue + " is a " + glutenfree + rbtext + " crust pizza.");
        }
 }

 public void suggestPizza(View view){
     EditText name = findViewById(R.id.pizzaNameEditText);
     String nameValue = name.getText().toString();
     myPizza.setPizzaName(nameValue);

     RadioGroup rg = findViewById(R.id.radioGroup);
     int selectedId = rg.getCheckedRadioButtonId();
     RadioButton rb = findViewById(selectedId);
     String rbtext = rb.getText().toString();
     myPizza.setPizzaCrust(rbtext);

     Switch gfSwitch = findViewById(R.id.glutenFreeSwitch);
     boolean gluten = gfSwitch.isChecked();
     myPizza.setPizzaGF(gluten);

     String glooten;
     if (gluten)
     {
         glooten = "TRUE";
     }
     else
     {
         glooten = "FALSE";
     }

//     Context context = getApplicationContext();
//     CharSequence text = glooten;
//     int duration = Toast.LENGTH_SHORT;
//
//     Toast toast = Toast.makeText(context, text, duration);
//     toast.show();



     //create an Intent
     Intent intent = new Intent(MainActivity.this, recievePizza.class);

     //pass data
     intent.putExtra("pizzaname", nameValue);
     intent.putExtra("pizzacrust", rbtext);
     intent.putExtra("pizzagluten", glooten);

     //start intent
     startActivity(intent);
 }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
