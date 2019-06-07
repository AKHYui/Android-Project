// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class KejianDescActivity$$ViewBinder<T extends com.example.androidtemplate.KejianDescActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
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
    view = finder.findRequiredView(source, 2131361860, "field 'videoVv'");
    target.videoVv = finder.castView(view, 2131361860, "field 'videoVv'");
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
    view = finder.findRequiredView(source, 2131361858, "field 'msgTv'");
    target.msgTv = finder.castView(view, 2131361858, "field 'msgTv'");
    view = finder.findRequiredView(source, 2131361815, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361815, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361813, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361813, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361859, "field 'dateTv'");
    target.dateTv = finder.castView(view, 2131361859, "field 'dateTv'");
    view = finder.findRequiredView(source, 2131361833, "field 'imgIv'");
    target.imgIv = finder.castView(view, 2131361833, "field 'imgIv'");
    view = finder.findRequiredView(source, 2131361811, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361811, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361857, "field 'nameTv'");
    target.nameTv = finder.castView(view, 2131361857, "field 'nameTv'");
  }

  @Override public void unbind(T target) {
    target.rightTv = null;
    target.leftTv = null;
    target.videoVv = null;
    target.registerBtn = null;
    target.msgTv = null;
    target.contentLl = null;
    target.titleTv = null;
    target.dateTv = null;
    target.imgIv = null;
    target.titleLl = null;
    target.nameTv = null;
  }
}
