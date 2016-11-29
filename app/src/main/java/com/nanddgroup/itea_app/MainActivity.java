package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button bTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout llParentContaiter = new LinearLayout(getApplicationContext());
        llParentContaiter.setOrientation(LinearLayout.VERTICAL);

        Button b1 = new Button(getApplicationContext());
        b1.setText("First Button");
        b1.setTextSize(15);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button b2 = new Button(this);
        b2.setText("Second Button");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        CheckBox cb = new CheckBox(this);
        cb.setText("First CheckBox");
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        llParentContaiter.addView(b1);
        llParentContaiter.addView(b2);
        llParentContaiter.addView(cb);


        setContentView(llParentContaiter);

    }
}
