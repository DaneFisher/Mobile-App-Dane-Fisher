package com.fisher.dane.lab7;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ReceiveFourteenerActivity extends Activity {

    private String fourteener;
    private String fourteenerURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_fourteener);

        //get intent
        Intent intent = getIntent();
        fourteener = intent.getStringExtra("fourteenerName");
        fourteenerURL = intent.getStringExtra("fourteenerURL");
        Log.i("fourteener received", fourteener);
        Log.i("url received", fourteenerURL);

        //update text view
        TextView messageView = findViewById(R.id.fourteenerTextView);
        messageView.setText("You should check out " + fourteener);

        //get image button
        ImageButton imageButton = findViewById(R.id.imageButton);
        //create listener
        View.OnClickListener onclick = new View.OnClickListener(){
            public void onClick(View view){
                loadWebSite(view);
            }
        };

        //add listener to the button
        imageButton.setOnClickListener(onclick);
    }

    private void loadWebSite(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(fourteenerURL));
        startActivity(intent);
    }
}
