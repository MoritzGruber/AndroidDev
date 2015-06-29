package com.teamtreehouse.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;


public class FunFactsActivity extends Activity {

    public InputStream minputStream=null;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private static final String TAG= FunFactsActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        String result="default";




        try {
            minputStream=getAssets().open("text.txt");
            java.util.Scanner s = new java.util.Scanner(minputStream).useDelimiter("\\A");
            result= s.hasNext() ? s.next() : "";

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(minputStream!=null)
                try {
                    minputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }



        View.OnClickListener listener = null;

            listener = new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    String fact = mFactBook.getFact();
                    // Update the label with our dynamic fact
                    factLabel.setText(fact);

                    int color = mColorWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    showFactButton.setTextColor(color);
                }
            };

        showFactButton.setOnClickListener(listener);
        //a popup on the bottom of the screen
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        //this is just for debugging

        Log.d(TAG, "We are logging from the onCreate method");

    }
}









