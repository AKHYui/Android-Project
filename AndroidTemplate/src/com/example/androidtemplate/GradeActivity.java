package com.example.androidtemplate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.androidtemplate.businmo.Test;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.CommonAdapter;
import com.example.androidtemplate.common.ViewHolder;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GradeActivity extends BaseActivity {

    @Bind(R.id.left_tv)
    TextView leftTv;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.right_tv)
    TextView rightTv;
    @Bind(R.id.title_ll)
    LinearLayout titleLl;
    @Bind(R.id.grade_tv)
    TextView gradeTv;
    @Bind(R.id.content_ll)
    LinearLayout contentLl;
    @Bind(R.id.commit_btn)
    Button commitBtn;
    Double grade;
    String course;
    @Bind(R.id.listview)
    ListView listview;
    private ArrayList<Test> testList = new ArrayList<Test>();

    @Override
    protected void initData() {
        setContentView(R.layout.activity_grade);
        ButterKnife.bind(this);
        grade = getIntent().getDoubleExtra("grade", 0);
        gradeTv.setText("总成绩" + grade);

        testList = getIntent().getParcelableArrayListExtra("testList");

        listview.setAdapter(new CommonAdapter<Test>(this_,testList,R.layout.item_message) {
            @Override
            public void convert(ViewHolder helper, Test item) {
                helper.setText(R.id.name_tv,item.getProblem());
                helper.setText(R.id.msg_tv,item.getAnswer());
                helper.setText(R.id.msg2_tv,item.getMsg());
                helper.setVisible(R.id.msg2_tv,View.VISIBLE);
            }
        });
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


//    @OnClick(R.id.commit_btn)
//    public void onClick() {
//        RequestParams params = new RequestParams();
//        params.put("action","add");
//        params.put("username", ManagerComm.loginUser.getUsername());
//        params.put("name", ManagerComm.loginUser.getName());
//        params.put("grade",grade.intValue());
//        params.put("date", DateUtils.getCurrentDateStr());
//
//        HttpUtil.post("GradeServlet", params, new TextHttpResponseHandler() {
//            @Override
//            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
//                T.showToast(this_,"提交失败");
//            }
//
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, String responseString) {
//                T.showToast(this_,"提交成功");
//                finish();
//                ManagerApp.initData();
//            }
//        });
//
//    }
}
