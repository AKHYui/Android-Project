// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BuRegisterActivity$$ViewBinder<T extends com.example.androidtemplate.user.BuRegisterActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361810, "field 'registerBtn' and method 'onClick'");
    target.registerBtn = finder.castView(view, 2131361810, "field 'registerBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361800, "field 'imgIv'");
    target.imgIv = finder.castView(view, 2131361800, "field 'imgIv'");
    view = finder.findRequiredView(source, 2131361803, "field 'password2Et'");
    target.password2Et = finder.castView(view, 2131361803, "field 'password2Et'");
    view = finder.findRequiredView(source, 2131361797, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361797, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361795, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361795, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361809, "field 'birthEt' and method 'onClick'");
    target.birthEt = finder.castView(view, 2131361809, "field 'birthEt'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361802, "field 'passwordEt'");
    target.passwordEt = finder.castView(view, 2131361802, "field 'passwordEt'");
    view = finder.findRequiredView(source, 2131361806, "field 'telEt'");
    target.telEt = finder.castView(view, 2131361806, "field 'telEt'");
    view = finder.findRequiredView(source, 2131361794, "field 'leftTv' and method 'onClick'");
    target.leftTv = finder.castView(view, 2131361794, "field 'leftTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361793, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361793, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361796, "field 'rightTv' and method 'onClick'");
    target.rightTv = finder.castView(view, 2131361796, "field 'rightTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361799, "field 'picAdd2Tv' and method 'onClick'");
    target.picAdd2Tv = finder.castView(view, 2131361799, "field 'picAdd2Tv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361805, "field 'nameEt'");
    target.nameEt = finder.castView(view, 2131361805, "field 'nameEt'");
    view = finder.findRequiredView(source, 2131361807, "field 'qqEt'");
    target.qqEt = finder.castView(view, 2131361807, "field 'qqEt'");
    view = finder.findRequiredView(source, 2131361798, "field 'picAddTv' and method 'onClick'");
    target.picAddTv = finder.castView(view, 2131361798, "field 'picAddTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361804, "field 'emailEt'");
    target.emailEt = finder.castView(view, 2131361804, "field 'emailEt'");
    view = finder.findRequiredView(source, 2131361801, "field 'usernameEt'");
    target.usernameEt = finder.castView(view, 2131361801, "field 'usernameEt'");
    view = finder.findRequiredView(source, 2131361792, "field 'activityRegister'");
    target.activityRegister = finder.castView(view, 2131361792, "field 'activityRegister'");
    view = finder.findRequiredView(source, 2131361808, "field 'weChatEt'");
    target.weChatEt = finder.castView(view, 2131361808, "field 'weChatEt'");
  }

  @Override public void unbind(T target) {
    target.registerBtn = null;
    target.imgIv = null;
    target.password2Et = null;
    target.contentLl = null;
    target.titleTv = null;
    target.birthEt = null;
    target.passwordEt = null;
    target.telEt = null;
    target.leftTv = null;
    target.titleLl = null;
    target.rightTv = null;
    target.picAdd2Tv = null;
    target.nameEt = null;
    target.qqEt = null;
    target.picAddTv = null;
    target.emailEt = null;
    target.usernameEt = null;
    target.activityRegister = null;
    target.weChatEt = null;
  }
}
