package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CustomUserInfoView cuivTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuivTextView = (CustomUserInfoView) findViewById(R.id.cuivTextView);

    }
}
