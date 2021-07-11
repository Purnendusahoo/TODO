package com.example.dailytask;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyAlaramReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int requestCode =intent.getIntExtra ("REQUEST_CODE",-1);
        //Toast.makeText (context, "", Toast.LENGTH_SHORT).show ();

    }
}
