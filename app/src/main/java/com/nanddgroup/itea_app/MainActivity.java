package com.nanddgroup.itea_app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bAlertDialog)
    public void bAlertDialogClick(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setCancelable(true)
                .setPositiveButton("Positive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Positive button Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Negative button Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Neutral button Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setIcon(R.drawable.error_dialog)
                .setTitle("Test Alert dialog")
                .setView(R.layout.test_view_alert_dialog)
                .setMessage("My message")
                .create().show();
    }
}
