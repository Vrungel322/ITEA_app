package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Observable<String> myObservable = Observable.create(new Observable.OnSubscribe<String>() {
    //  @Override public void call(Subscriber<? super String> sub) {
    //    sub.onNext("Hello, world!");
    //    sub.onCompleted();
    //  }
    //}).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

    //Subscriber<String> mySubscriber = new Subscriber<String>() {
    //  @Override public void onCompleted() {
    //
    //  }
    //
    //  @Override public void onError(Throwable e) {
    //
    //  }
    //
    //  @Override public void onNext(String s) {
    //    Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    //  }
    //};

    //myObservable.subscribe(mySubscriber);

    Observable.create(new Observable.OnSubscribe<String>() {
      @Override public void call(Subscriber<? super String> sub) {
        sub.onNext("Hello, world!");
        sub.onCompleted();
      }
    })
        .map(s -> s + "!!!!")
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Subscriber<String>() {
          @Override public void onCompleted() {

          }

          @Override public void onError(Throwable e) {

          }

          @Override public void onNext(String s) {
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
          }
        });
  }
}
