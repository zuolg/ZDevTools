package com.z.zdev.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.z.andutil.dialog.DialogTools;
import com.z.zdev.R;
import com.z.zdev.adapter.ListAdapter;
import com.z.zdev.bean.HomeBean;
import com.z.zdev.presenter.HomeDataPresenter;
import com.z.zdev.views.HomeDataView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MVPDemoActivity extends AppCompatActivity implements HomeDataView {

    private Context context;

    private HomeDataPresenter presenter;

    private Dialog dialog;

    //自定义Adapter
    private ListAdapter listAdapter;

    @BindView(R.id.textView_errot)
    TextView textView_errot;

    @BindView(R.id.textView_data)
    TextView textView_data;

    @BindView(R.id.listView_mvp)
    ListView listView_mvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp_test);
        context = MVPDemoActivity.this;
        ButterKnife.bind(MVPDemoActivity.this);//加入绑定

        presenter = new HomeDataPresenter(this);


        showProgressDialog();
        presenter.getDataHome("1");




    }

    @Override
    public void showProgressDialog() {
        dialog = DialogTools.showProgressDialog(context, "加载提示啦。。。");
    }

    @Override
    public void hideProgressDialog() {
        DialogTools.closeProgressDialog();
    }

    @Override
    public void onLoad(HomeBean homeBean) {
        textView_data.setText(homeBean.getMessage());
        listAdapter = new ListAdapter(context, R.layout.item_messgae, homeBean.getSudoku());
        listView_mvp.setAdapter(listAdapter);
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onReset() {

    }

    @Override
    public void onCommit() {

    }

    @Override
    public void showError(String msg) {
        textView_errot.setText(msg);
    }
}
