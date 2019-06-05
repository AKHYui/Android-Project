// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.example.androidtemplate.user.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361821, "field 'passwordEt'");
    target.passwordEt = finder.castView(view, 2131361821, "field 'passwordEt'");
    view = finder.findRequiredView(source, 2131361820, "field 'activityLogin'");
    target.activityLogin = finder.castView(view, 2131361820, "field 'activityLogin'");
    view = finder.findRequiredView(source, 2131361813, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361813, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361825, "field 'switchFunTv' and method 'onClick'");
    target.switchFunTv = finder.castView(view, 2131361825, "field 'switchFunTv'");
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
    view = finder.findRequiredView(source, 2131361824, "field 'forgetPassTv' and method 'onClick'");
    target.forgetPassTv = finder.castView(view, 2131361824, "field 'forgetPassTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361811, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361811, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361815, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361815, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361823, "field 'loginBtn' and method 'onClick'");
    target.loginBtn = finder.castView(view, 2131361823, "field 'loginBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361822, "field 'autoLoginSw'");
    target.autoLoginSw = finder.castView(view, 2131361822, "field 'autoLoginSw'");
    view = finder.findRequiredView(source, 2131361816, "field 'usernameEt'");
    target.usernameEt = finder.castView(view, 2131361816, "field 'usernameEt'");
  }

  @Override public void unbind(T target) {
    target.passwordEt = null;
    target.activityLogin = null;
    target.titleTv = null;
    target.switchFunTv = null;
    target.leftTv = null;
    target.rightTv = null;
    target.forgetPassTv = null;
    target.titleLl = null;
    target.contentLl = null;
    target.loginBtn = null;
    target.autoLoginSw = null;
    target.usernameEt = null;
  }
}
