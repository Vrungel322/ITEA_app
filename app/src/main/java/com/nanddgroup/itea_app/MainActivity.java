package com.nanddgroup.itea_app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements TestDialogFragment.IChangeActivityState {
    private Button bShowDialog;
    private Button bStartPrefsActivity;
    private RelativeLayout activity_main;
    private boolean themeCYAN = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bShowDialog = (Button) findViewById(R.id.bShowDialog);
        bStartPrefsActivity = (Button) findViewById(R.id.bStartPrefsActivity);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);

        bShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                TestDialogFragment testDialogFragment = new TestDialogFragment();
//                testDialogFragment.setArguments(null);
                TestDialogFragment testDialogFragment = TestDialogFragment.newInstance("Hello from MainActivity");
//                testDialogFragment.setStyle(DialogFragment.STYLE_NORMAL, 0);
                testDialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE, 0);
//                testDialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, 0);
//                testDialogFragment.setStyle(DialogFragment.STYLE_NO_INPUT, 0);
                testDialogFragment.show(ft, "Some_tag");
            }
        });

        bStartPrefsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AppPreferencesActivity.class));
            }
        });
    }

    @Override
    public void changeActivityBackground() {
        if (themeCYAN){
            activity_main.setBackgroundColor(Color.WHITE);
            themeCYAN = false;
        }
        else {
            activity_main.setBackgroundColor(Color.CYAN);
            themeCYAN = true;
        }
    }
}
