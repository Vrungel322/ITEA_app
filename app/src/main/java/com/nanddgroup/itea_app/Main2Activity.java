package com.nanddgroup.itea_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        POJOTest pojoTest = b.getParcelable("ParcelableTest");
        Toast.makeText(this, pojoTest.getName() + " " + pojoTest.getSurName(), Toast.LENGTH_SHORT).show();
    }
}
