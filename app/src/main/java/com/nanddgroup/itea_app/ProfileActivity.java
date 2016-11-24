package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;

public class ProfileActivity extends AppCompatActivity {
    private EditText etName;
    private String sName;
    private RadioButton rbCplusplus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        etName = (EditText) findViewById(R.id.etName);
        sName = etName.getText().toString();
        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sName = (String) charSequence;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        rbCplusplus.isChecked();

    }
}
