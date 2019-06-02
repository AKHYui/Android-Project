package com.example.androidtemplate;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.androidtemplate.Http.HttpUtil;
import com.example.androidtemplate.Http.JsonData;
import com.example.androidtemplate.businmo.Kejian;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.CommonAdapter;
import com.example.androidtemplate.common.CustomDialog;
import com.example.androidtemplate.common.T;
import com.example.androidtemplate.common.ViewHolder;
import com.example.androidtemplate.manager.ManagerApp;
import com.example.androidtemplate.user.PersonalActivity;
import com.example.androidtemplate.utils.GsonUtil;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.left_tv)
    TextView leftTv;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.right_tv)
    TextView rightTv;
    @Bind(R.id.title_ll)
    LinearLayout titleLl;
    @Bind(R.id.content_ll)
    LinearLayout contentLl;
    @Bind(R.id.shade_lv)
    LinearLayout shadeLv;
    @Bind(R.id.back_tv)
    TextView backTv;
    @Bind(R.id.one_tv)
    TextView oneTv;
    @Bind(R.id.two_tv)
    TextView twoTv;
    @Bind(R.id.three_tv)
    TextView threeTv;
    @Bind(R.id.four_tv)
    TextView fourTv;
    @Bind(R.id.five_tv)
    TextView fiveTv;
    @Bind(R.id.menu_lv)
    LinearLayout menuLv;
    @Bind(R.id.menu_rl)
    RelativeLayout menuRl;

    CommonAdapter<Kejian> adapter;
    List<Kejian> crudList = new ArrayList<Kejian>();
    @Bind(R.id.listview)
    ListView listview;

    @Override
    protected void initData() {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        menuRl.setVisibility(View.GONE);

        adapter = new CommonAdapter<Kejian>(this_, crudList, R.layout.item_message) {
            @Override
            public void convert(ViewHolder helper, Kejian item) {
               // helper.setImageUrl(R.id.img_iv, HttpUtil.BASE_URL_UPLOAD + item.getImg());
                helper.setText(R.id.name_tv, item.getName());
                helper.setText(R.id.msg_tv,item.getDate());
            }
        };

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(this_, KejianDescActivity.class).putExtra("item", crudList.get(position)));
            }
        });

//        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
//                final CustomDialog customDialog = CustomDialog.getInstance(this_);
//                customDialog.show();
//                customDialog.setHintMsg("是否删除？");
//                customDialog.setOkBtnOnClick(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        RequestParams params = new RequestParams();
//                        params.put("action", "delete");
//                        params.put("id", crudList.get(position).getId());
//                        HttpUtil.post("KejianServlet", params, new TextHttpResponseHandler() {
//                            @Override
//                            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
//
//                            }
//
//                            @Override
//                            public void onSuccess(int statusCode, Header[] headers, String responseString) {
//                                T.showToast(this_, "删除成功");
//                                customDialog.dismiss();
//                                onResume();
//                            }
//                        });
//                    }
//                });
//                return true;
//            }
//        });
    }

    @Override
    protected void onResume() {

        RequestParams params = new RequestParams();
        HttpUtil.post("KejianServlet", params, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(final int statusCode, Header[] headers, String responseString) {
                List<Kejian> dates = GsonUtil.getInstance().fromJson(new JsonData(responseString).getData(), new TypeToken<List<Kejian>>() {
                }.getType());

                crudList.clear();
                if (dates == null) {
                    dates = new ArrayList<Kejian>();
                }
                crudList.addAll(dates);
                adapter.notifyDataSetChanged();

            }
        });

        super.onResume();
    }

    @Override
    protected void recycle() {

    }

    @OnClick({R.id.left_tv, R.id.right_tv, R.id.back_tv, R.id.one_tv, R.id.two_tv, R.id.three_tv, R.id.four_tv, R.id.five_tv,R.id.four_one_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tv:
                menuRl.setVisibility(View.VISIBLE);
                Animation animation = AnimationUtils.loadAnimation(this_, R.anim.setting_mune_scale_right);
                menuLv.startAnimation(animation);
                break;
            case R.id.right_tv:
                break;
            case R.id.back_tv:
                Animation animation2 = AnimationUtils.loadAnimation(this_, R.anim.setting_mune_scale_left);
                menuLv.startAnimation(animation2);
                animation2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        menuRl.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });


                break;
            case R.id.one_tv:

                Animation animation3 = AnimationUtils.loadAnimation(this_, R.anim.setting_mune_scale_left);
                menuLv.startAnimation(animation3);
                animation3.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        menuRl.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                break;
            case R.id.two_tv:
                startActivity(new Intent(this_, MessageActivity.class));
                break;
            case R.id.three_tv:
                startActivity(new Intent(this_, XuexiActivity.class));
                break;
            case R.id.four_tv:
                startActivity(new Intent(this_, TestActivity.class));
                break;
            case R.id.four_one_tv:
                startActivity(new Intent(this_,XuexiDescActivity.class));
                break;
            case R.id.five_tv:
                startActivity(new Intent(this_, PersonalActivity.class));
                break;
        }
    }


    private long exitTime = 0;

    @Override
    public void onBackPressed() {

        if ((System.currentTimeMillis() - exitTime) > 2000) {
            T.showToast(this_, "再按一次退出程序");
            exitTime = System.currentTimeMillis();
        } else {

            super.onBackPressed();
            ManagerApp.exitApp();
        }

    }

}
