package com.example.administrator.mvpframent.view;

import com.example.administrator.mvpframent.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3 0003.
 */

public interface IGirlView {
    /**
     * UI业务逻辑   加载进度条
     */
    void onLoading();

    void showGrils(List<Girl> grils);
}
