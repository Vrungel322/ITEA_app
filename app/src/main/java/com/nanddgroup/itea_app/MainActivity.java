package com.nanddgroup.itea_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvTest;
    private LvAdapterTest adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTest = (ListView) findViewById(R.id.lvTest);
        adapter = new LvAdapterTest(this, R.layout.each_item);
        lvTest.setAdapter(adapter);
        List<ImageView> l = new ArrayList<ImageView>();
        l.add(new ImageView(getApplicationContext()));
        l.add(new ImageView(getApplicationContext()));
        adapter.updateList(l);

        lvTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                ArrayList<POJOTest> parcelableList = new ArrayList<POJOTest>();
                parcelableList.add(new POJOTest("TestNamem", "TestSurName"));
                intent.putParcelableArrayListExtra("ParcelableTest", parcelableList);
                startActivity(intent);
            }
        });
    }
}
