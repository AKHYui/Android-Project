// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.example.androidtemplate.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361844, "field 'oneTv' and method 'onClick'");
    target.oneTv = finder.castView(view, 2131361844, "field 'oneTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361841, "field 'shadeLv'");
    target.shadeLv = finder.castView(view, 2131361841, "field 'shadeLv'");
    view = finder.findRequiredView(source, 2131361845, "field 'twoTv' and method 'onClick'");
    target.twoTv = finder.castView(view, 2131361845, "field 'twoTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361796, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361796, "field 'contentLl'");
    view = finder.findRequiredView(source, 2131361792, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361792, "field 'titleLl'");
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
    view = finder.findRequiredView(source, 2131361847, "field 'fourTv' and method 'onClick'");
    target.fourTv = finder.castView(view, 2131361847, "field 'fourTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361849, "field 'fiveTv' and method 'onClick'");
    target.fiveTv = finder.castView(view, 2131361849, "field 'fiveTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361843, "field 'backTv' and method 'onClick'");
    target.backTv = finder.castView(view, 2131361843, "field 'backTv'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361833, "field 'listview'");
    target.listview = finder.castView(view, 2131361833, "field 'listview'");
    view = finder.findRequiredView(source, 2131361846, "field 'threeTv' and method 'onClick'");
    target.threeTv = finder.castView(view, 2131361846, "field 'threeTv'");
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
    view = finder.findRequiredView(source, 2131361842, "field 'menuLv'");
    target.menuLv = finder.castView(view, 2131361842, "field 'menuLv'");
    view = finder.findRequiredView(source, 2131361840, "field 'menuRl'");
    target.menuRl = finder.castView(view, 2131361840, "field 'menuRl'");
    view = finder.findRequiredView(source, 2131361848, "method 'onClick'");
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
    target.oneTv = null;
    target.shadeLv = null;
    target.twoTv = null;
    target.contentLl = null;
    target.titleLl = null;
    target.rightTv = null;
    target.fourTv = null;
    target.fiveTv = null;
    target.backTv = null;
    target.listview = null;
    target.threeTv = null;
    target.leftTv = null;
    target.titleTv = null;
    target.menuLv = null;
    target.menuRl = null;
  }
}
