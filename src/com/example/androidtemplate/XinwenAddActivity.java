package com.example.androidtemplate;


import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidtemplate.Http.HttpUtil;
import com.example.androidtemplate.businmo.Xinwen;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.D;
import com.example.androidtemplate.common.T;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class XinwenAddActivity extends BaseActivity {

    @Bind(R.id.left_tv)
    TextView leftTv;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.right_tv)
    TextView rightTv;
    @Bind(R.id.title_ll)
    LinearLayout titleLl;
    @Bind(R.id.name_et)
    EditText nameEt;
    @Bind(R.id.ok_btn)
    Button okBtn;
    @Bind(R.id.content_ll)
    LinearLayout contentLl;


    Xinwen item;

    @Override
    protected void initData() {
        setContentView(R.layout.activity_xinwen_add);
        ButterKnife.bind(this);
        item = getIntent().getParcelableExtra("item");

        if (item != null) {
            // 赋值
            //nameEt.setText(item.getName());

            titleTv.setText("修改");
            okBtn.setText("确认修改");

        }

    }

    @Override
    protected void recycle() {

    }


    @OnClick({R.id.left_tv, R.id.right_tv, R.id.ok_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tv:
                finish();
                break;
            case R.id.right_tv:
                break;
            case R.id.ok_btn:

                String name = nameEt.getText().toString().trim();
                if (TextUtils.isEmpty(name)) {
                    T.showToast(this_, "请填写标签");
                }

                RequestParams params = new RequestParams();
                if (item != null) {
                    params.add("action", "edit");
                    params.put("id", item.getId());
                } else {
                    params.add("action", "add");
                }

                params.put("name", name);
                HttpUtil.post("XinwenServlet", params, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                        D.out(throwable);
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {

                        if (item != null) {
                            T.showToast(this_, "修改成功");
                        } else {
                            T.showToast(this_, "添加成功");
                        }

                        finish();
                    }
                });

                break;
        }
    }

}
