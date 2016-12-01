package com.nanddgroup.itea_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent secondIntent = getIntent();
        Bundle b = secondIntent.getExtras();
        String s = b.getString(Constants.KEY, "NO_VALUE");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "Second Activity", Toast.LENGTH_SHORT).show();

    }
}
