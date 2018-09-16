package com.example.administrator.mvpframent.present;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2017/3/3 0003.
 * T  对应着Activity 的UI抽象接口  视图
 */

public abstract class Presenter<T_View> {
    /**
     * 持有UI接口的弱引用
     */
    protected WeakReference<T_View> t_viewWeakReference;

    /**
     * 获取数据方法
     */
    public abstract void onFetch();

    public void attachView(T_View view) {
        t_viewWeakReference = new WeakReference<T_View>(view);
    }

    /**
     * 解绑
     */
    public void detach()
    {
        if(t_viewWeakReference !=null)
        {
            t_viewWeakReference.clear();
            t_viewWeakReference =null;
        }
    }
}
