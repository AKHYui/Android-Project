package com.example.androidtemplate;


import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.androidtemplate.Http.HttpUtil;
import com.example.androidtemplate.Http.JsonData;
import com.example.androidtemplate.businmo.Kejian;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.CommonAdapter;
import com.example.androidtemplate.common.CustomDialog;
import com.example.androidtemplate.common.T;
import com.example.androidtemplate.common.ViewHolder;
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

public class KejianActivity extends BaseActivity {

    @Bind(R.id.left_tv)
    TextView leftTv;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.right_tv)
    TextView rightTv;
    @Bind(R.id.title_ll)
    LinearLayout titleLl;
    @Bind(R.id.listview)
    ListView listview;
    @Bind(R.id.content_ll)
    LinearLayout contentLl;

    CommonAdapter<Kejian> adapter;
    List<Kejian> crudList = new ArrayList<Kejian>();

    @Override
    protected void initData() {
        setContentView(R.layout.activity_kejian);
        ButterKnife.bind(this);

        adapter = new CommonAdapter<Kejian>(this_,crudList,R.layout.item_kejian) {
            @Override
            public void convert(ViewHolder helper, Kejian item) {
				helper.setImageUrl(R.id.img_iv,HttpUtil.BASE_URL_UPLOAD+item.getImg());
                helper.setText(R.id.name_tv,item.getName());
            }
        };

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(this_,KejianDescActivity.class).putExtra("item",crudList.get(position)));
            }
        });

        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                final CustomDialog customDialog = CustomDialog.getInstance(this_);
                customDialog.show();
                customDialog.setHintMsg("是否删除？");
                customDialog.setOkBtnOnClick(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        RequestParams params = new RequestParams();
                        params.put("action","delete");
                        params.put("id",crudList.get(position).getId());
                        HttpUtil.post("KejianServlet", params, new TextHttpResponseHandler() {
                            @Override
                            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

                            }

                            @Override
                            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                                T.showToast(this_,"删除成功");
                                customDialog.dismiss();
                                onResume();
                            }
                        });
                    }
                });
                return true;
            }
        });
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


    @OnClick({R.id.left_tv, R.id.right_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tv:
                finish();
                break;
            case R.id.right_tv:
                startActivity(new Intent(this_,KejianAddActivity.class));
                break;
        }
    }
}
