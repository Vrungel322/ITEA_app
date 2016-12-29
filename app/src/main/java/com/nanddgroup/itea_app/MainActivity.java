package com.nanddgroup.itea_app;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Handler h;
    private Button bStopThread;
    private boolean run = true;
    ValidAsyncTask validAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                String s = msg.getData().getString("KEY");

                Log.wtf("tag", "obtained msg is - " + s);

            }
        };

        bStopThread = (Button) findViewById(R.id.bStopThread);
        bStopThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                run = false;
                validAsyncTask = new ValidAsyncTask();
                validAsyncTask.execute("String");
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                Bundle b = new Bundle();
                b.putString("KEY", "STRING");
                Message m = new Message();
                m.setData(b);
                while (run) {
                    h.sendMessage(m);
                    Log.wtf("tag", "message send from Thread");
                }
            }
        }).start();
    }

    class ValidAsyncTask extends AsyncTask<String , Integer, Boolean> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Boolean doInBackground(String... params) {
            int i= 0;
            int i2 = 0;
            publishProgress(i, i2);
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }
    }
}
