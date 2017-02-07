package com.nanddgroup.itea_app.presenter;

import android.support.annotation.Nullable;
import com.nanddgroup.itea_app.view.interfaces.IView;

/**
 * Created by Nikita on 07.02.2017.
 */

public abstract class BasePresenter<V extends IView> {
  @Nullable
  private V v;

  public void bind(V v){
    this.v = v;
  }

  public void unbind() {
    this.v = null;
  }

  @Nullable public V getView() {
    return v;
  }
}
