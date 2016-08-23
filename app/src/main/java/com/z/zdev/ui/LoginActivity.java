package com.z.zdev.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.z.andutil.thread.Task;
import com.z.andutil.thread.ThreadWorker;
import com.z.zdev.R;
import com.z.zdev.api.GitHubService;
import com.z.zdev.bean.HomeBean;
import com.z.zdev.bean.UserBean;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.editText_name)
    EditText editText_name;
    @BindView(R.id.editText_pwd)
    EditText editText_pwd;
    @BindView(R.id.button_login)
    Button button_login;

    private Context context;

    HomeBean homeBean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_login);
        context = LoginActivity.this;
        ButterKnife.bind(this);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // App Logo
        toolbar.setLogo(R.mipmap.ic_launcher);
        // Title
        toolbar.setTitle("我是登录啦");
        // Sub Title
        toolbar.setSubtitle("登录滴呢");
        toolbar.setBackgroundResource(R.color.primary_light);

        setSupportActionBar(toolbar);

        onTest();
        //  editText_pwd.setText("111111111111111111111111111111");

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Call<UserBean> call = GitHubService.getService().getUser();
                    call.enqueue(new Callback<UserBean>() {
                        @Override
                        public void onResponse(Call<UserBean> call, Response<UserBean> response) {
                            Toast.makeText(context, "===" + response.body().getMessage(), Toast.LENGTH_LONG).show();

                            Intent intent = new Intent();
                            intent.setClass(context, ListActivity.class);
                            startActivity(intent);

                        }

                        @Override
                        public void onFailure(Call<UserBean> call, Throwable t) {
                            t.printStackTrace();
                            Toast.makeText(context, "===33333333333", Toast.LENGTH_LONG).show();

                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.print("11111Exception111");
                }
            }
        });


    }


    public void onTest() {
        Toast.makeText(context, "===888", Toast.LENGTH_SHORT).show();
        ThreadWorker.execuse(new Task(this) {
            @Override
            public void doInBackground() {
                super.doInBackground();
                //后台处理
                Call<HomeBean> call = GitHubService.getService().getAllData();
                try {
                    Response<HomeBean> response = call.execute();
                    homeBean = response.body();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                transfer("线程间的交互", 100);
            }

            @Override
            public void doInUI(Object obj, Integer what) {
                if (homeBean != null) {
                    Toast.makeText(context, "===" + homeBean.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
