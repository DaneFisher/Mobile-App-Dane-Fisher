package com.fisher.dane.dffinal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class recievePizza extends Activity {

    public String crust;
    public String name;
    public String gf;
    public String selection;
    public String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_pizza);

        //get intent
        Intent intent = getIntent();
        name = intent.getStringExtra("pizzaname");
        crust = intent.getStringExtra("pizzacrust");
        gf = intent.getStringExtra("pizzagluten");

        Context context = getApplicationContext();
        CharSequence text = crust;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //update text view
        TextView messageView = findViewById(R.id.textView);
        if (crust == "thin")
        {
            selection = "Pizzeria Locale";
            URL = "https://localeboulder.com/";
        }
        else
        {
            selection = "Backcontry Pizza";
            URL = "https://backcountrypizzaandtaphouse.info/";
        }

        if (gf == "TRUE")
        {
            selection = "Boss Lady";
            URL = "https://bossladypizza.com/";
        }

        messageView.setText("You should check out " + selection + ".");
    }

    private void loadWebSite(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(URL));
        startActivity(intent);
    }

}
