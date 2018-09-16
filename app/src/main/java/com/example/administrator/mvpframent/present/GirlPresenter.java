package com.example.administrator.mvpframent.present;

import com.example.administrator.mvpframent.bean.Girl;
import com.example.administrator.mvpframent.model.GirlModelIml;
import com.example.administrator.mvpframent.model.IGirlModel;
import com.example.administrator.mvpframent.view.IGirlView;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3 0003.
 * present层
 */

public class GirlPresenter<T>  extends Presenter<IGirlView> {
    /**
     * 持有视图层 UI接口的引用  此时的视图层Activity
     */
    IGirlView mGirlView;

    public GirlPresenter(IGirlView mGirlView) {
        this.mGirlView = mGirlView;
    }

    /**
     * 持有模型Model的引用
     */
    IGirlModel iGirlModel =new GirlModelIml();
    @Override
    public  void onFetch()
    {
        mGirlView.onLoading();
        if(iGirlModel !=null)
        {
            /**
             * 参数为数据回调监听
             */
            iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //回调视图层
                    mGirlView.showGrils(girls);
                }
            });
        }
    }
}
