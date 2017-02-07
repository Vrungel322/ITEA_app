package com.nanddgroup.itea_app.presenter;

import com.nanddgroup.itea_app.presenter.interfaces.IMainActivityPresenter;
import com.nanddgroup.itea_app.view.interfaces.IMainActivityView;

/**
 * Created by Nikita on 07.02.2017.
 */

public class MainActivityPresenter extends BasePresenter<IMainActivityView> implements IMainActivityPresenter {

  public MainActivityPresenter() {
  }

  @Override public void showText(String textToShow) {
    getView().showTextInActivity(textToShow);
  }
}
