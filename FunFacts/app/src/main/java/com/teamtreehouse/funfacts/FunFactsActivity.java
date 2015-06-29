package com.teamtreehouse.funfacts;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.teamtreehouse.funfacts.GenerateSentnce.getSentence;


public class FunFactsActivity extends Activity {

    public String[] mSentence=null;
    private InputStream minputStream=null;
    private GenerateSentnce mFactBook = new GenerateSentnce();
    private ColorWheel mColorWheel = new ColorWheel();
    private static final String TAG= FunFactsActivity.class.getSimpleName();



    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        try {
            minputStream=getAssets().open("text.txt");
            java.util.Scanner s = new java.util.Scanner(minputStream, "iso-8859-1").useDelimiter("\\A");
            //result= s.hasNext() ? s.next() : "";
            List<String> lines = new ArrayList<String>();
            while (s.hasNextLine()) {
                lines.add(s.nextLine());
            }

            mSentence = lines.toArray(new String[0]);

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
                    String fact = getSentence(mSentence);
                    // Update the label with our dynamic fact
                    factLabel.setText(fact);

                    int color = mColorWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    showFactButton.setTextColor(color);
                }
            };

        showFactButton.setOnClickListener(listener);
        //a popup on the bottom of the screen
//        String enc = Charset.defaultCharset().displayName()
//        Toast.makeText(this, enc, Toast.LENGTH_LONG).show();


        //this is just for debugging

        Log.d(TAG, "We are logging from the onCreate method");

    }
}









