package com.example.administrator.mvpframent;

import android.app.Activity;
import android.os.Bundle;

import com.example.administrator.mvpframent.present.Presenter;

/**
 * Created by Administrator on 2017/3/3 0003.
 * V  IGrilView接口
 *
 */

public abstract  class BaseActivity<T_IGirlView, T_BasePresenter extends Presenter<T_IGirlView>> extends com.lythonliu.LinkActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    protected T_BasePresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = onCreatePresenter();
        mPresenter.attachView((T_IGirlView) this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.detach();
        super.onDestroy();

    }

    /**
     * 子类实现具体的构建过程
     * @return
     */
    protected abstract T_BasePresenter onCreatePresenter() ;
}
