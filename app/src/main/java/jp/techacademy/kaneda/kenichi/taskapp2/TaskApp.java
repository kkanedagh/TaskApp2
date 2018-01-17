package jp.techacademy.kaneda.kenichi.taskapp2;

/**
 * Created by kaneda on 2018/01/17.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
