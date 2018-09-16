package com.example.administrator.mvpframent.model;

import com.example.administrator.mvpframent.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3 0003.
 * 监听数据返回
 */

public interface IGirlModel {
    void loadGirl(GirlOnLoadListener girlOnLoadListener);
    interface GirlOnLoadListener
    {
        void  onComplete(List<Girl> girls);
    }
}
