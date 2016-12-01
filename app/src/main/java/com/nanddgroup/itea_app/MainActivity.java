package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf("lc : ", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("lc : ", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("lc : ", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("lc : ", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("lc : ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("lc : ", "onDestroy");
    }
}
