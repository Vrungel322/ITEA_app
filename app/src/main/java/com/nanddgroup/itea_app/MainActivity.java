package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.tbMyToolbar);
        setSupportActionBar(toolbar);

//        toolbar.setBackground(null);
        toolbar.setTitle("MyTitle");
        toolbar.setNavigationIcon(android.R.drawable.sym_def_app_icon);
    }
    
}
