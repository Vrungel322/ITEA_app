package com.nanddgroup.itea_app.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.nanddgroup.itea_app.R;
import com.nanddgroup.itea_app.presenter.MainActivityPresenter;
import com.nanddgroup.itea_app.view.interfaces.IMainActivityView;

public class MainActivity extends AppCompatActivity implements IMainActivityView {
  private MainActivityPresenter mainActivityPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mainActivityPresenter = new MainActivityPresenter();
    mainActivityPresenter.bind(this);
    mainActivityPresenter.showText("My First MVP");
  }

  @Override public void showCustomText(String str) {
    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
  }
}
