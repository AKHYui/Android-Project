// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegisterActivity$$ViewBinder<T extends com.example.androidtemplate.user.RegisterActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361840, "field 'sexSp'");
    target.sexSp = finder.castView(view, 2131361840, "field 'sexSp'");
    view = finder.findRequiredView(source, 2131361833, "field 'imgIv'");
    target.imgIv = finder.castView(view, 2131361833, "field 'imgIv'");
    view = finder.findRequiredView(source, 2131361814, "field 'rightTv' and method 'onClick'");
    target.rightTv = finder.castView(view, 2131361814, "field 'rightTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361815, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361815, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361837, "field 'qqEt'");
    target.qqEt = finder.castView(view, 2131361837, "field 'qqEt'");
    view = finder.findRequiredView(source, 2131361831, "field 'picAddTv' and method 'onClick'");
    target.picAddTv = finder.castView(view, 2131361831, "field 'picAddTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361830, "field 'activityRegister'");
    target.activityRegister = finder.castView(view, 2131361830, "field 'activityRegister'");
    view = finder.findRequiredView(source, 2131361834, "field 'password2Et'");
    target.password2Et = finder.castView(view, 2131361834, "field 'password2Et'");
    view = finder.findRequiredView(source, 2131361811, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361811, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361821, "field 'passwordEt'");
    target.passwordEt = finder.castView(view, 2131361821, "field 'passwordEt'");
    view = finder.findRequiredView(source, 2131361813, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361813, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361839, "field 'birthEt' and method 'onClick'");
    target.birthEt = finder.castView(view, 2131361839, "field 'birthEt'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361835, "field 'nameEt'");
    target.nameEt = finder.castView(view, 2131361835, "field 'nameEt'");
    view = finder.findRequiredView(source, 2131361838, "field 'weChatEt'");
    target.weChatEt = finder.castView(view, 2131361838, "field 'weChatEt'");
    view = finder.findRequiredView(source, 2131361832, "field 'picAdd2Tv' and method 'onClick'");
    target.picAdd2Tv = finder.castView(view, 2131361832, "field 'picAdd2Tv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361812, "field 'leftTv' and method 'onClick'");
    target.leftTv = finder.castView(view, 2131361812, "field 'leftTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361816, "field 'usernameEt'");
    target.usernameEt = finder.castView(view, 2131361816, "field 'usernameEt'");
    view = finder.findRequiredView(source, 2131361836, "field 'telEt'");
    target.telEt = finder.castView(view, 2131361836, "field 'telEt'");
    view = finder.findRequiredView(source, 2131361817, "field 'emailEt'");
    target.emailEt = finder.castView(view, 2131361817, "field 'emailEt'");
    view = finder.findRequiredView(source, 2131361841, "field 'registerBtn' and method 'onClick'");
    target.registerBtn = finder.castView(view, 2131361841, "field 'registerBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.sexSp = null;
    target.imgIv = null;
    target.rightTv = null;
    target.contentLl = null;
    target.qqEt = null;
    target.picAddTv = null;
    target.activityRegister = null;
    target.password2Et = null;
    target.titleLl = null;
    target.passwordEt = null;
    target.titleTv = null;
    target.birthEt = null;
    target.nameEt = null;
    target.weChatEt = null;
    target.picAdd2Tv = null;
    target.leftTv = null;
    target.usernameEt = null;
    target.telEt = null;
    target.emailEt = null;
    target.registerBtn = null;
  }
}
