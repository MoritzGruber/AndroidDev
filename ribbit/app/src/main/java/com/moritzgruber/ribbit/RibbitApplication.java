package com.moritzgruber.ribbit;

import android.app.Application;
import com.parse.Parse;

/**
 * Created by Bubble on 07.08.2015.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "MwReLs9vOvXiASL14ATYUiw69N6BHb7WIQeZEQdd", "V2k1Lj2rRXgn7RPq20bDkJnF4TCgTqzgSlua5L9W");
    }
}
