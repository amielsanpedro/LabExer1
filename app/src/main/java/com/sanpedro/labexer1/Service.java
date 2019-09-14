package com.sanpedro.labexer1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class Service extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public Service() {
        super("Service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("places" , "UST Field");
        Log.d("places" , "Arch of the Centuries");
        Log.d("places" , "Quadricentennial Park");
        Log.d("places" , "Benavides Lane");
    }
}
