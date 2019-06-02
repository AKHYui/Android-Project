package com.example.androidtemplate;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.androidtemplate.Http.HttpUtil;
import com.example.androidtemplate.Http.JsonData;
import com.example.androidtemplate.businmo.Test;
import com.example.androidtemplate.businmo.Xuexi;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.CustomDialog;
import com.example.androidtemplate.common.D;
import com.example.androidtemplate.common.T;
import com.example.androidtemplate.manager.ManagerComm;
import com.example.androidtemplate.utils.GsonUtil;
import com.example.androidtemplate.utils.ListUtil;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends BaseActivity {

    private final static int MSG_XUANZE = 100;
    private final static int MSG_PANDUAN = 200;

    @Bind(R.id.left_tv)
    TextView leftTv;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.right_tv)
    TextView rightTv;
    @Bind(R.id.title_ll)
    LinearLayout titleLl;
    @Bind(R.id.problem_tv)
    TextView problemTv;
    @Bind(R.id.radioButtonA)
    RadioButton radioButtonA;
    @Bind(R.id.radioButtonB)
    RadioButton radioButtonB;
    @Bind(R.id.radioButtonC)
    RadioButton radioButtonC;
    @Bind(R.id.radioButtonD)
    RadioButton radioButtonD;
    @Bind(R.id.xuanze_rg)
    RadioGroup xuanzeRg;
    @Bind(R.id.radioButtonRight)
    RadioButton radioButtonRight;
    @Bind(R.id.radioButtonError)
    RadioButton radioButtonError;
    @Bind(R.id.panduan_rg)
    RadioGroup panduanRg;
    @Bind(R.id.we_chat_et)
    EditText weChatEt;
    @Bind(R.id.wenda_ll)
    LinearLayout wendaLl;
    @Bind(R.id.pre_btn)
    Button preBtn;
    @Bind(R.id.next_btn)
    Button nextBtn;
    @Bind(R.id.xuanze_ll)
    LinearLayout xuanzeLl;
    @Bind(R.id.count_tv)
    TextView countTv;
    @Bind(R.id.commit_btn)
    Button commitBtn;
    @Bind(R.id.date_tv)
    TextView dateTv;
    @Bind(R.id.remain_tv)
    TextView remainTv;
    @Bind(R.id.answer_tv)
    TextView answerTv;
    @Bind(R.id.pre_next_ll)
    LinearLayout preNextLl;
    private Test test;
    private ArrayList<Test> testList = new ArrayList<Test>();

    private Handler handler;

    private int currentPosition = 1;
    private Double grade = 0.0;

//    int position;
//    String type = "";
//    String type02 = "";

    @Override
    protected void initData() {
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

//        position = getIntent().getIntExtra("position", 0);
//        type = getIntent().getStringExtra("type");
//        type02 = getIntent().getStringExtra("type02");

//        if (position == 3) {
//            commitBtn.setVisibility(View.VISIBLE);
//            answerTv.setVisibility(View.GONE);
//        } else {
//            commitBtn.setVisibility(View.GONE);
//            answerTv.setVisibility(View.VISIBLE);
//        }

        initHandler();

//        for (Test test : ManagerComm.tests) {
//            switch (position) {
//                case 0:
//                    if (test.getType().equals(type)) {
//                        testList.add(test);
//                    }
//                    break;
//                case 1:
//                    testList.add(test);
//                    break;
//                case 2:
//                    if (test.getType02().equals(type02)) {
//                        testList.add(test);
//                    }
//                    break;
//                case 3:
//                    testList.add(test);
//                    break;
//
//            }
//        }
//
//        if (position == 3) {
//            int s = testList.size() - 10;
//            if (s > 0) {
//                for (int i = 0; i < s; i++) {
//                    testList.remove(i + 2);
//                }
//            }
//        }




        weChatEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                testList.get(currentPosition - 1).setAnswerTemp(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    protected void recycle() {

    }

    @Override
    protected void onResume() {
        super.onResume();

        HttpUtil.post("TestServlet", null, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                List<Test> dates = GsonUtil.getInstance().fromJson(new JsonData(responseString).getData(),new TypeToken<List<Test>>(){}.getType());
                testList.clear();
                if (dates == null) {
                    dates = new ArrayList<Test>();
                }
                testList.addAll(dates);

                showTest();
            }
        });

    }

    private void initHandler() {
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case MSG_XUANZE:
                        radioButtonA.performClick();
                        break;
                    case MSG_PANDUAN:
                        radioButtonRight.performClick();
                        break;
                }
                super.handleMessage(msg);
            }
        };
    }

    private void showTest() {

        countTv.setText(currentPosition + "/" + testList.size());
        test = testList.get(currentPosition - 1);
        setTypeUi();
        problemTv.setText(currentPosition + "、" + test.getProblem());

        radioButtonA.setText("A、" + test.getAa());
        radioButtonB.setText("B、" + test.getAb());
        radioButtonC.setText("C、" + test.getAc());

        if (TextUtils.isEmpty(test.getAd())) {
            radioButtonD.setVisibility(View.GONE);
        } else {
            radioButtonD.setVisibility(View.VISIBLE);
            radioButtonD.setText("D、" + test.getAd());
        }


        if (!TextUtils.isEmpty(test.getAnswerTemp())) {
            if (test.getAnswerTemp().equals("A")) {
                radioButtonA.setChecked(true);
            } else if (test.getAnswerTemp().equals("B")) {
                radioButtonB.setChecked(true);
            } else if (test.getAnswerTemp().equals("C")) {
                radioButtonC.setChecked(true);
            } else if (test.getAnswerTemp().equals("D")) {
                radioButtonD.setChecked(true);
            }
        } else {
            handler.sendEmptyMessage(MSG_XUANZE);
        }

    }

    @OnClick(R.id.commit_btn)
    public void onClick() {
    }

    private void setTypeUi() {
        xuanzeRg.setVisibility(View.GONE);
        panduanRg.setVisibility(View.GONE);
        wendaLl.setVisibility(View.GONE);
        xuanzeRg.setVisibility(View.VISIBLE);
    }


    @OnClick({R.id.left_tv, R.id.right_tv, R.id.radioButtonA, R.id.radioButtonB, R.id.radioButtonC, R.id.radioButtonD, R.id.radioButtonRight, R.id.radioButtonError, R.id.pre_btn, R.id.next_btn, R.id.commit_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tv:
                finish();
                break;
            case R.id.right_tv:

                RequestParams params = new RequestParams();
                params.put("action", "add");
                params.put("username", ManagerComm.loginUser.getUsername());
                params.put("tid", testList.get(currentPosition - 1).getId());
                HttpUtil.post("CollectServlet", params, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                        T.showToast(this_, "收藏失败");
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {
                        T.showToast(this_, "收藏成功");
                    }
                });

                break;
            case R.id.radioButtonA:
                testList.get(currentPosition - 1).setAnswerTemp("A");
                commitBtn.performClick();
                break;
            case R.id.radioButtonB:
                testList.get(currentPosition - 1).setAnswerTemp("B");
                break;
            case R.id.radioButtonC:
                testList.get(currentPosition - 1).setAnswerTemp("C");
                break;
            case R.id.radioButtonD:
                testList.get(currentPosition - 1).setAnswerTemp("D");
                break;
            case R.id.radioButtonRight:
                testList.get(currentPosition - 1).setAnswerTemp("正确");
                D.out("======" + testList.get(currentPosition - 1).getAnswerTemp());
                break;
            case R.id.radioButtonError:
                testList.get(currentPosition - 1).setAnswerTemp("错误");
                break;
            case R.id.pre_btn:

                if (currentPosition == 1) {
                    T.showToast(this_, "现在已经是第一题了");
                    return;
                } else {
                    currentPosition--;
                    showTest();
                }


                break;
            case R.id.next_btn:

                if (currentPosition == testList.size()) {
                    T.showToast(this_, "现在已经是最后一题了");
                    return;
                } else {
                    currentPosition++;
                    showTest();
                }


                break;
            case R.id.commit_btn:

                final CustomDialog customDialog = CustomDialog.getInstance(this_);
                customDialog.show();
                customDialog.setHintMsg("是否提交?");
                customDialog.setOkBtnOnClick(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent it = new Intent(this_, XinwenActivity.class);
                        it.putExtra("grade", grade);
                        it.putParcelableArrayListExtra("testList",testList);
                        startActivity(it);
                        customDialog.dismiss();
                        this_.finish();

//                        grade = 0.0;
//
//                        for (Test test : testList) {
//                            D.out(test.toString());
//                            if (!TextUtils.isEmpty(test.getAnswerTemp())) {
//                                if (test.getAnswerTemp().contains(test.getAnswer())) {
//                                    grade = grade + Double.valueOf(test.getGrade());
//                                } else {
//                                    RequestParams params = new RequestParams();
//                                    params.put("action", "add");
//                                    params.put("username", ManagerComm.loginUser.getUsername());
//                                    params.put("mtid", test.getId());
//                                    HttpUtil.post("CollectServlet", params, new TextHttpResponseHandler() {
//                                        @Override
//                                        public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
//
//                                        }
//
//                                        @Override
//                                        public void onSuccess(int statusCode, Header[] headers, String responseString) {
//
//                                        }
//                                    });
//                                }
//                            }
//
//                        }

                    }
                });
                break;
        }
    }


}
