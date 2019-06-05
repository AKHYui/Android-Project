package com.example.androidtemplate;


import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidtemplate.businmo.Xuexi;

import com.example.androidtemplate.common.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class XuexiDescActivity extends BaseActivity {

    @Bind(R.id.left_tv)
    TextView leftTv;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.right_tv)
    TextView rightTv;
    @Bind(R.id.title_ll)
    LinearLayout titleLl;
    @Bind(R.id.name_tv)
    TextView nameTv;
    @Bind(R.id.content_ll)
    LinearLayout contentLl;

    Xuexi item;

    @Override
    protected void initData() {
        setContentView(R.layout.activity_xuexi_desc);
        ButterKnife.bind(this);

        item = getIntent().getParcelableExtra("item");

        if (item != null) {
            // 赋值
           //nameTv.setText(item.getName());


        }
    }

    @Override
    protected void recycle() {

    }


    @OnClick({R.id.left_tv, R.id.right_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tv:
                finish();
                break;
            case R.id.right_tv:
                break;
        }
    }
}
