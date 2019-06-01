// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class IpActivity$$ViewBinder<T extends com.example.androidtemplate.user.IpActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361834, "field 'ipTv'");
    target.ipTv = finder.castView(view, 2131361834, "field 'ipTv'");
    view = finder.findRequiredView(source, 2131361822, "field 'registerBtn' and method 'onClick'");
    target.registerBtn = finder.castView(view, 2131361822, "field 'registerBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361793, "field 'leftTv' and method 'onClick'");
    target.leftTv = finder.castView(view, 2131361793, "field 'leftTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361835, "field 'ipEt'");
    target.ipEt = finder.castView(view, 2131361835, "field 'ipEt'");
    view = finder.findRequiredView(source, 2131361796, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361796, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361795, "field 'rightTv'");
    target.rightTv = finder.castView(view, 2131361795, "field 'rightTv'");
    view = finder.findRequiredView(source, 2131361792, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361792, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361794, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361794, "field 'titleTv'");
  }

  @Override public void unbind(T target) {
    target.ipTv = null;
    target.registerBtn = null;
    target.leftTv = null;
    target.ipEt = null;
    target.contentLl = null;
    target.rightTv = null;
    target.titleLl = null;
    target.titleTv = null;
  }
}
