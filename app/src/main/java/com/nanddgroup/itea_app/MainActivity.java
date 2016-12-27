package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         getFragmentManager().beginTransaction()
                 .add()
                 .commit();
        getFragmentManager().beginTransaction()
                 .add()
                 .commit();
        getFragmentManager().beginTransaction()
                 .remove()
                 .commit();
        getFragmentManager().beginTransaction()
                 .replace()
                 .commit();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Button d;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
            }
        }).start();
    }
}
