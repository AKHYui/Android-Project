// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GradeActivity$$ViewBinder<T extends com.example.androidtemplate.GradeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361831, "field 'gradeTv'");
    target.gradeTv = finder.castView(view, 2131361831, "field 'gradeTv'");
    view = finder.findRequiredView(source, 2131361833, "field 'listview'");
    target.listview = finder.castView(view, 2131361833, "field 'listview'");
    view = finder.findRequiredView(source, 2131361795, "field 'rightTv' and method 'onClick'");
    target.rightTv = finder.castView(view, 2131361795, "field 'rightTv'");
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
    view = finder.findRequiredView(source, 2131361794, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361794, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361832, "field 'commitBtn'");
    target.commitBtn = finder.castView(view, 2131361832, "field 'commitBtn'");
    view = finder.findRequiredView(source, 2131361792, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361792, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361796, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361796, "field 'contentLl'");
  }

  @Override public void unbind(T target) {
    target.gradeTv = null;
    target.listview = null;
    target.rightTv = null;
    target.leftTv = null;
    target.titleTv = null;
    target.commitBtn = null;
    target.titleLl = null;
    target.contentLl = null;
  }
}
