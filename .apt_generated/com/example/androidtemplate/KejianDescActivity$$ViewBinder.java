// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class KejianDescActivity$$ViewBinder<T extends com.example.androidtemplate.KejianDescActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361796, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361796, "field 'contentLl'");
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
    view = finder.findRequiredView(source, 2131361836, "field 'nameTv'");
    target.nameTv = finder.castView(view, 2131361836, "field 'nameTv'");
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
    view = finder.findRequiredView(source, 2131361839, "field 'videoVv'");
    target.videoVv = finder.castView(view, 2131361839, "field 'videoVv'");
    view = finder.findRequiredView(source, 2131361792, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361792, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361814, "field 'imgIv'");
    target.imgIv = finder.castView(view, 2131361814, "field 'imgIv'");
    view = finder.findRequiredView(source, 2131361837, "field 'msgTv'");
    target.msgTv = finder.castView(view, 2131361837, "field 'msgTv'");
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
    view = finder.findRequiredView(source, 2131361838, "field 'dateTv'");
    target.dateTv = finder.castView(view, 2131361838, "field 'dateTv'");
  }

  @Override public void unbind(T target) {
    target.contentLl = null;
    target.leftTv = null;
    target.titleTv = null;
    target.nameTv = null;
    target.registerBtn = null;
    target.videoVv = null;
    target.titleLl = null;
    target.imgIv = null;
    target.msgTv = null;
    target.rightTv = null;
    target.dateTv = null;
  }
}
