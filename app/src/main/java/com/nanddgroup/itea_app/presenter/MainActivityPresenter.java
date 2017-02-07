package com.nanddgroup.itea_app.presenter;

import com.nanddgroup.itea_app.presenter.interfaces.IMainActivityPresenter;
import com.nanddgroup.itea_app.view.interfaces.IMainActivityView;

/**
 * Created by Nikita on 07.02.2017.
 */

public class MainActivityPresenter implements IMainActivityPresenter {
  private IMainActivityView iMainActivityView;
  public MainActivityPresenter() {
  }

  public void bind(IMainActivityView iMainActivityView){
    this.iMainActivityView = iMainActivityView;
  }

  @Override public void showText(String textToShow) {
    iMainActivityView.showCustomText(textToShow);
  }
}
