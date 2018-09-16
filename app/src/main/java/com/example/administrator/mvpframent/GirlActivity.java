package com.example.administrator.mvpframent;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.mvpframent.adapter.GirlListAdapter;
import com.example.administrator.mvpframent.bean.Girl;
import com.example.administrator.mvpframent.present.GirlPresenter;
import com.example.administrator.mvpframent.view.IGirlView;

import java.util.List;

/**
 * 属于视图层
 * View
 */
public class GirlActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView {
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v1);
        listView= (ListView) findViewById(R.id.listview);
        mPresenter.onFetch();
    }
    @Override
    public void onLoading() {
        Toast.makeText(this,"正在拼命加载",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGrils(List<Girl> grils) {
        listView.setAdapter(new GirlListAdapter(this,grils));
    }
    @Override
    protected GirlPresenter<IGirlView> onCreatePresenter() {
        return new GirlPresenter<>(this);
    }
}
