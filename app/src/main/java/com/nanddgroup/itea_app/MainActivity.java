package com.nanddgroup.itea_app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder adBuilder = new AlertDialog.Builder(this);
        adBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Positive button Clicked", Toast.LENGTH_SHORT).show();
                     }
        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Negative button Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Maybe", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Maybe buttom Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
        .setTitle("Test title")
        .setIcon(R.drawable.contact_icon);
        adBuilder.create().show();

    }
}
