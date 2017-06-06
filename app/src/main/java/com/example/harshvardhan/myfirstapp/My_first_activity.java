package com.example.harshvardhan.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class My_first_activity extends AppCompatActivity {
    private final String KEY = "DEBUG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_activity);
        Log.d(KEY,"reached onCreate!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(KEY,"reached onStart!!");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(KEY,"reached onResume!!");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(KEY,"reached onPause!!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(KEY,"reached onStop!!");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(KEY,"reached onDestroy!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(KEY,"reached onRestart!!");

    }

}
