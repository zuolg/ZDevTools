package com.z.zdev.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.z.zdev.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyTabActivity extends AppCompatActivity {

    @BindView(R.id.button2)
    Button PButton2;
    @BindView(R.id.button)
    Button PButton;
    @BindView(R.id.editText)
    EditText PEditText;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_tab);
        context = MyTabActivity.this;
        ButterKnife.bind(this);


    }

    @OnClick({R.id.button2, R.id.button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                break;
            case R.id.button:
                break;
        }
    }
}
