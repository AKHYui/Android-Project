package com.example.androidtemplate;

import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.user.BuRegisterActivity;
import com.example.androidtemplate.user.RegisterActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.androidtemplate.Http.HttpUtil;
import com.example.androidtemplate.R;
import com.example.androidtemplate.common.BaseActivity;
import com.example.androidtemplate.common.Constants;
import com.example.androidtemplate.common.D;
import com.example.androidtemplate.common.T;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
 //这个是注册选择界面的逻辑程序
public class SelectActivity extends BaseActivity {
	@Bind(R.id.cu_btn)
    Button btn1;
	@Bind(R.id.bu_btn)
    Button btn2;
	@Override
	protected void initData() {
		// TODO Auto-generated method stub
		setContentView(R.layout.a_dialog_select);
        ButterKnife.bind(this);
	}

	@Override
	protected void recycle() {
	}
	
	@OnClick({R.id.cu_btn, R.id.bu_btn})
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.cu_btn:
			startActivity(new Intent(this_,RegisterActivity.class));
			break;
		case R.id.bu_btn:
			startActivity(new Intent(this_,BuRegisterActivity.class));
			break;
		}
	}
	
}
