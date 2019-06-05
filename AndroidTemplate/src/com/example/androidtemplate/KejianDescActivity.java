package com.example.androidtemplate;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.androidtemplate.Http.HttpUtil;
import com.example.androidtemplate.businmo.Kejian;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.CustomDialog;
import com.example.androidtemplate.common.T;

import java.io.File;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KejianDescActivity extends BaseActivity {

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

    Kejian item;
    @Bind(R.id.img_iv)
    ImageView imgIv;
    @Bind(R.id.msg_tv)
    TextView msgTv;
    @Bind(R.id.date_tv)
    TextView dateTv;
    @Bind(R.id.register_btn)
    Button registerBtn;
    @Bind(R.id.video_vv)
    VideoView videoVv;

    @Override
    protected void initData() {
        setContentView(R.layout.activity_kejian_desc);
        ButterKnife.bind(this);

        item = getIntent().getParcelableExtra("item");

        if (item != null) {
            // 赋值
            nameTv.setText(item.getName());
            msgTv.setText(item.getMsg());
            dateTv.setText(item.getDate());

//            ImageLoader.getInstance().displayImage(HttpUtil.BASE_URL_UPLOAD + item.getImg(), imgIv, ManagerComm.displayImageOptions);
//            imgIv.setVisibility(View.VISIBLE);

            //String url = getIntent().getStringExtra("url");
            Uri uri = Uri.parse(HttpUtil.BASE_URL_UPLOAD+item.getImg() );
            videoVv.setMediaController(new MediaController(this_));
            videoVv.setVideoURI(uri);
            videoVv.start();
        }
    }

    @Override
    protected void recycle() {

    }


    public static Intent getFileIntent(String param)

    {

        Intent intent = new Intent("android.intent.action.VIEW");

        intent.addCategory("android.intent.category.DEFAULT");

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        Uri uri = Uri.fromFile(new File(param));

        intent.setDataAndType(uri, "application/msword");

        //intent.setDataAndType(uri, "application/vnd.ms-excel");

        //intent.setDataAndType(uri, "application/vnd.ms-powerpoint");

        return intent;

    }


    @OnClick({R.id.left_tv, R.id.right_tv, R.id.register_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tv:
                finish();
                break;
            case R.id.right_tv:
                break;
            case R.id.register_btn:

                final CustomDialog customDialog = CustomDialog.getInstance(this_);
                customDialog.show();
                customDialog.setHintMsg("确定下载吗？");
                customDialog.setOkBtnOnClick(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    //downLoad(HttpUtil.BASE_URL_UPLOAD+crudList.get(position).getImg(),this_);
                                    String path = item.getImg();
                                    //创建下载任务,downloadUrl就是下载链接
                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(HttpUtil.BASE_URL_UPLOAD + path));
                                    //指定下载路径和下载文件名
                                    String end = path.substring(path.lastIndexOf("."));
                                    request.setDestinationInExternalPublicDir("/download/", item.getName() + end);
                                    //获取下载管理器
                                    DownloadManager downloadManager = (DownloadManager) this_.getSystemService(Context.DOWNLOAD_SERVICE);
                                    //将下载任务加入下载队列，否则不会进行下载
                                    downloadManager.enqueue(request);

                                    T.showToast(this_, "下载完成");


                                    startActivity(getFileIntent(Environment.getExternalStorageDirectory() + "/download/" + item.getName() + end));

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();

                        T.showToast(this_, "开始下载");
                        customDialog.dismiss();
                    }

                });


                break;
        }
    }

}
