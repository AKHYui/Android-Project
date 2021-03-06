package com.example.androidtemplate.user;

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


public class BuRegisterActivity extends BaseActivity {

	@Bind(R.id.left_tva)
    TextView leftTv;
    @Bind(R.id.title_tva)
    TextView titleTv;
    @Bind(R.id.right_tva)
    TextView rightTv;
    @Bind(R.id.title_lla)
    LinearLayout titleLl;
    @Bind(R.id.username_eta)
    EditText usernameEt;
    @Bind(R.id.password_eta)
    EditText passwordEt;
    @Bind(R.id.password2_eta)
    EditText password2Et;
    @Bind(R.id.name_eta)
    EditText nameEt;
    @Bind(R.id.email_eta)
    EditText emailEt;
    @Bind(R.id.tel_eta)
    EditText telEt;
    @Bind(R.id.qq_eta)
    EditText qqEt;
    @Bind(R.id.birth_eta)
    EditText birthEt;
    @Bind(R.id.register_btna)
    Button registerBtn;
    @Bind(R.id.content_lla)
    LinearLayout contentLl;
    @Bind(R.id.activity_registera)
    LinearLayout activityRegister;
    @Bind(R.id.img_iva)
    ImageView imgIv;
    @Bind(R.id.we_chat_eta)
    EditText weChatEt;
    @Bind(R.id.pic_add_tva)
    TextView picAddTv;
    @Bind(R.id.pic_add2_tva)
    TextView picAdd2Tv;
    //@Bind(R.id.sex_spa)
    //Spinner sexSp;
    
    private int mYear, mMonth, mDay;
    private String img;

	@Override
	protected void initData() {
		// TODO Auto-generated method stub
		setContentView(R.layout.a_activity_buregister);
        ButterKnife.bind(this);

        Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);

        birthEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // 时间选择器
                    DatePickerDialog datePickerDialog = new DatePickerDialog(this_, mdateListener, mYear, mMonth, mDay);
                    datePickerDialog.show();
                }
            }
        });


	}
	private DatePickerDialog.OnDateSetListener mdateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            String monthOfYearNew = String.format("%02d", (monthOfYear + 1));
            birthEt.setText(year + "/" + monthOfYearNew + "/" + dayOfMonth);
        }
    };

	@Override
	protected void recycle() {
		// TODO Auto-generated method stub
		
	}
	
    @OnClick({R.id.left_tva, R.id.right_tva, R.id.birth_eta, R.id.register_btna,R.id.pic_add_tva, R.id.pic_add2_tva})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_tva:
                finish();
                break;
            case R.id.right_tva:
                break;

            case R.id.pic_add_tva:
                Intent intent = new Intent(Intent.ACTION_PICK, null);
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Constants.IMAGE_UNSPECIFIED);
                startActivityForResult(intent, Constants.ALBUM_REQUEST_CODE);
                break;
            case R.id.pic_add2_tva:
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(Environment.
                        getExternalStorageDirectory(), "temp.jpg")));
                startActivityForResult(intent, Constants.CROP_REQUEST_CODE);
                break;
            case R.id.birth_eta:
                break;
            case R.id.register_btna:


                if (photo == null) {
                    T.showToast(this_, getString(R.string.select_phote_require_str));
                    return;
                }

                final String username = usernameEt.getText().toString().trim();
                final String passwd = passwordEt.getText().toString().trim();
                String passwd2 = password2Et.getText().toString().trim();
                final String email = emailEt.getText().toString().trim();
                final String name = nameEt.getText().toString().trim();
                final String tel = telEt.getText().toString().trim();
                final String qq = qqEt.getText().toString().trim();
                final String weChat = weChatEt.getText().toString().trim();
                //final String sex = sexSp.getSelectedItem().toString();
                final String birth = birthEt.getText().toString().trim();

                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(passwd) || TextUtils.isEmpty(passwd2)) {
                    T.showToast(this_, getString(R.string.username_passe_is_no_null_str));
                    return;
                }
                if (!passwd.equals(passwd2)) {
                    T.showToast(this_, getString(R.string.pass_diff_str));
                    return;
                }


                File file = new File(Constants.ImageTempPath);
                RequestParams requestParams = new RequestParams();
//                if(!file.exists()){
//                    File file =
//                }
                try {
                    requestParams.put("file", file);
                    HttpUtil.post("UploadServlet", requestParams, new TextHttpResponseHandler() {
                        @Override
                        public void onFailure(int i, Header[] headers, String s, Throwable throwable) {

                        }

                        @Override
                        public void onSuccess(int i, Header[] headers, String s) {
                            D.out("img:" + s);
                            img = s;
                            RequestParams params = new RequestParams();
                            params.put("action", "register");
                            params.put("username", username);
                            params.put("passwd", passwd);
                            params.put("email", email);
                            params.put("name", name);
                            params.put("tel", tel);
                            params.put("qq", qq);
                            params.put("wechat", weChat);
                            //params.put("sex", sex);
                            params.put("birth", birth);
                            params.put("img", img);

                            HttpUtil.post("ClientServlet", params, new TextHttpResponseHandler() {
                                @Override
                                public void onFailure(int i, Header[] headers, String s, Throwable throwable) {
                                    T.showToast(this_, getString(R.string.register_fail_str));
                                }

                                @Override
                                public void onSuccess(int i, Header[] headers, String s) {
                                    T.showToast(this_, getString(R.string.register_success_to_login_str));
                                    startActivity(new Intent(this_, LoginActivity.class));

                                }
                            });

                        }
                    });
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


                break;
        }
    }

    Bitmap photo;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode) {
            case Constants.ALBUM_REQUEST_CODE:
                if (data == null) {
                    return;
                }
                startCrop(data.getData());
                break;
            case Constants.CAMERA_REQUEST_CODE:
                File picture = new File(Constants.ImageTempPath);
                startCrop(Uri.fromFile(picture));
                break;
            case Constants.CROP_REQUEST_CODE:


                photo = getLoacalBitmap(Constants.ImageTempPath);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                photo.compress(Bitmap.CompressFormat.JPEG, 75, stream);// (0-100)压缩文件
                imgIv.setImageBitmap(photo);
                imgIv.setVisibility(View.VISIBLE);

                break;
            default:
                break;
        }
    }

    /**
     * 开始裁剪
     *
     * @param uri
     */
    private void startCrop(Uri uri) {
        //调用Android系统自带的一个图片剪裁页面,
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, Constants.IMAGE_UNSPECIFIED);
        intent.putExtra("crop", "true");//进行修剪
        // aspectX aspectY 是宽高的比例
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        // outputX outputY 是裁剪图片宽高
        intent.putExtra("outputX", 500);
        intent.putExtra("outputY", 500);
        intent.putExtra("return-data", false);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(Environment.
                getExternalStorageDirectory(), "temp.jpg")));
        startActivityForResult(intent, Constants.CROP_REQUEST_CODE);
    }

    public static Bitmap getLoacalBitmap(String url) {
        try {
            FileInputStream fis = new FileInputStream(url);
            return BitmapFactory.decodeStream(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

