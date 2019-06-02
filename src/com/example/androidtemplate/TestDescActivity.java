package com.example.androidtemplate;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.androidtemplate.businmo.Test;
import com.example.androidtemplate.common.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestDescActivity extends BaseActivity {

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
    @Bind(R.id.pre_next_ll)
    LinearLayout preNextLl;
    @Bind(R.id.answer_tv)
    TextView answerTv;
    private Test test;

    private Double grade = 0.0;


    @Override
    protected void initData() {
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        test = getIntent().getParcelableExtra("item");

        titleTv.setText("试题详情");

        commitBtn.setVisibility(View.GONE);
        rightTv.setVisibility(View.INVISIBLE);
        preNextLl.setVisibility(View.GONE);


        showTest();

    }

    @Override
    protected void recycle() {

    }


    private void showTest() {

        setTypeUi();
        problemTv.setText("( " + test.getGrade() + "分 )" + test.getProblem());

        radioButtonA.setText("A、" + test.getAa());
        radioButtonB.setText("B、" + test.getAb());
        radioButtonC.setText("C、" + test.getAc());

        if (TextUtils.isEmpty(test.getAd())) {
            radioButtonD.setVisibility(View.GONE);
        } else {
            radioButtonD.setVisibility(View.VISIBLE);
            radioButtonD.setText("D、" + test.getAd());
        }

        answerTv.setText("答案：" + test.getAnswer());

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

                break;
            case R.id.radioButtonA:

                break;
            case R.id.radioButtonB:

                break;
            case R.id.radioButtonC:

                break;
            case R.id.radioButtonD:

                break;
            case R.id.radioButtonRight:

                break;
            case R.id.radioButtonError:

                break;
            case R.id.pre_btn:

                break;
            case R.id.next_btn:

                break;
            case R.id.commit_btn:
                break;
        }
    }
}
