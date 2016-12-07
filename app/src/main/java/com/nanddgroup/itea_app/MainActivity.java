package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvTest;
    private LvAdapterTest adapter;
    private int count ;

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
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("ParcelableTest", new POJOTest("TestNamem", "TestSurName"));
//                startActivity(intent);
//                finish();
                count++;
                Toast.makeText(MainActivity.this, ""+ count, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        if (savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("count", count);
        super.onSaveInstanceState(outState);
    }
}
