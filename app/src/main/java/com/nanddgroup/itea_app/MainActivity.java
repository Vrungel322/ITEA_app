package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvTest;
//    private LvAdapterTest adapter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        if (savedInstanceState != null && savedInstanceState.containsKey("count")) {
//            count = savedInstanceState.getInt("count");
//        }

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

//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        if (savedInstanceState != null && savedInstanceState.containsKey("count")) {
////            count = savedInstanceState.getInt("count");
//        }
//        super.onRestoreInstanceState(savedInstanceState);
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        outState.putInt("count", count);
//        super.onSaveInstanceState(outState);
//    }
}
