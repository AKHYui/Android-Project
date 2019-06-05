// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UpdatePasswordActivity$$ViewBinder<T extends com.example.androidtemplate.user.UpdatePasswordActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361813, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361813, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361821, "field 'passwordEt'");
    target.passwordEt = finder.castView(view, 2131361821, "field 'passwordEt'");
    view = finder.findRequiredView(source, 2131361811, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361811, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361843, "field 'updatePasswordBtn' and method 'onClick'");
    target.updatePasswordBtn = finder.castView(view, 2131361843, "field 'updatePasswordBtn'");
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
    view = finder.findRequiredView(source, 2131361815, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361815, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361834, "field 'password2Et'");
    target.password2Et = finder.castView(view, 2131361834, "field 'password2Et'");
    view = finder.findRequiredView(source, 2131361842, "field 'originalPasswordEt'");
    target.originalPasswordEt = finder.castView(view, 2131361842, "field 'originalPasswordEt'");
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
  }

  @Override public void unbind(T target) {
    target.titleTv = null;
    target.passwordEt = null;
    target.titleLl = null;
    target.updatePasswordBtn = null;
    target.rightTv = null;
    target.contentLl = null;
    target.password2Et = null;
    target.originalPasswordEt = null;
    target.leftTv = null;
  }
}
