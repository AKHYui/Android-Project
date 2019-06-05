// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.example.androidtemplate.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
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
    view = finder.findRequiredView(source, 2131361865, "field 'oneTv' and method 'onClick'");
    target.oneTv = finder.castView(view, 2131361865, "field 'oneTv'");
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
    view = finder.findRequiredView(source, 2131361868, "field 'fourTv' and method 'onClick'");
    target.fourTv = finder.castView(view, 2131361868, "field 'fourTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361862, "field 'shadeLv'");
    target.shadeLv = finder.castView(view, 2131361862, "field 'shadeLv'");
    view = finder.findRequiredView(source, 2131361861, "field 'menuRl'");
    target.menuRl = finder.castView(view, 2131361861, "field 'menuRl'");
    view = finder.findRequiredView(source, 2131361870, "field 'fiveTv' and method 'onClick'");
    target.fiveTv = finder.castView(view, 2131361870, "field 'fiveTv'");
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
    view = finder.findRequiredView(source, 2131361866, "field 'twoTv' and method 'onClick'");
    target.twoTv = finder.castView(view, 2131361866, "field 'twoTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361863, "field 'menuLv'");
    target.menuLv = finder.castView(view, 2131361863, "field 'menuLv'");
    view = finder.findRequiredView(source, 2131361813, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361813, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361864, "field 'backTv' and method 'onClick'");
    target.backTv = finder.castView(view, 2131361864, "field 'backTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361867, "field 'threeTv' and method 'onClick'");
    target.threeTv = finder.castView(view, 2131361867, "field 'threeTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361854, "field 'listview'");
    target.listview = finder.castView(view, 2131361854, "field 'listview'");
    view = finder.findRequiredView(source, 2131361869, "method 'onClick'");
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
    target.leftTv = null;
    target.oneTv = null;
    target.rightTv = null;
    target.fourTv = null;
    target.shadeLv = null;
    target.menuRl = null;
    target.fiveTv = null;
    target.titleLl = null;
    target.contentLl = null;
    target.twoTv = null;
    target.menuLv = null;
    target.titleTv = null;
    target.backTv = null;
    target.threeTv = null;
    target.listview = null;
  }
}
