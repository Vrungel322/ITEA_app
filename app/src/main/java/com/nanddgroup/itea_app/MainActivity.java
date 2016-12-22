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
    private FragmentTransaction ft;

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
//                TestDialogFragment testDialogFragment = new TestDialogFragment();

//                Bundle b = new Bundle();
//                b.putString("KEY", "for fragment");
//                testDialogFragment.setArguments(b);
                TestDialogFragment testDialogFragment = TestDialogFragment.newInstance("Hello from MainActivity");

                testDialogFragment.setStyle(DialogFragment.STYLE_NORMAL, 0); // - обычный диалог (значение по умолчанию);

//                testDialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE, 0); // -диалог без текста-заголовка;
//                testDialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, 0); // - диалог без фоновой подложки,
//                                                                                  отображаются только View - элементы, занесенные в контент диалога;

//                testDialogFragment.setStyle(DialogFragment.STYLE_NO_INPUT, 0); //- диалог, который не реагирует на воздействие пользователя
                //               (касание, клик) и является "прозрачным" для этих воздействий
                //               (диалог будет себя вести как незакрываемый самостоятельно Toast)


                ft = getSupportFragmentManager().beginTransaction();
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
