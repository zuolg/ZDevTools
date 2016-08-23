package com.z.zdev.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.Toast;

import com.z.zdev.R;
import com.z.zdev.adapter.ListAdapter;
import com.z.zdev.api.GitHubService;
import com.z.zdev.bean.HomeBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.listView) ListView listView;

    private Context context;

    //自定义Adapter
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        context = ListActivity.this;
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // App Logo
        toolbar.setLogo(R.mipmap.ic_launcher);
        // Title
        toolbar.setTitle("我是List");
        // Sub Title
        toolbar.setSubtitle("我是List滴呢");
        toolbar.setBackgroundResource(R.color.primary_light);

        setSupportActionBar(toolbar);


        //先获取数据

        Call<HomeBean> call = GitHubService.getService().getAllData();
        call.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                Toast.makeText(context, "===" + response.body().getMessage(), Toast.LENGTH_LONG).show();



                listAdapter = new ListAdapter(context, R.layout.item_messgae, response.body().getSudoku());
                listView.setAdapter(listAdapter);

            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {
                Toast.makeText(context, "===33333333333", Toast.LENGTH_LONG).show();

            }
        });


    }


}
