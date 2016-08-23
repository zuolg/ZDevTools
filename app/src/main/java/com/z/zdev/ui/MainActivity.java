package com.z.zdev.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.z.zdev.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @BindView(R.id.button_login)
    Button button_login;

    @BindView(R.id.button_list)
    Button button_list;

    @BindView(R.id.button_mvp)
    Button button_mvp;

    @BindView(R.id.button_o)
    Button button_o;


    @OnClick(R.id.button_login)
    public void button_login() {
        Intent intent = new Intent();
        intent.setClass(context, LoginActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.button_list)
    public void button_list() {
        Intent intent = new Intent();
        intent.setClass(context, ListActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button_mvp)
    public void button_mvp() {
        Intent intent = new Intent();
        intent.setClass(context, MVPDemoActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button_o)
    public void button_o() {
        Intent intent = new Intent();
        intent.setClass(context, BottomTabActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        ButterKnife.bind(this);

        button_login.setText("45555555555555555555555");

    }
}
