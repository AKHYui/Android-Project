// Generated code from Butter Knife. Do not modify!
package com.example.androidtemplate.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UpdateUserActivity$$ViewBinder<T extends com.example.androidtemplate.user.UpdateUserActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361840, "field 'sexSp'");
    target.sexSp = finder.castView(view, 2131361840, "field 'sexSp'");
    view = finder.findRequiredView(source, 2131361815, "field 'contentLl'");
    target.contentLl = finder.castView(view, 2131361815, "field 'contentLl'");
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
    view = finder.findRequiredView(source, 2131361816, "field 'usernameEt'");
    target.usernameEt = finder.castView(view, 2131361816, "field 'usernameEt'");
    view = finder.findRequiredView(source, 2131361838, "field 'weChatEt'");
    target.weChatEt = finder.castView(view, 2131361838, "field 'weChatEt'");
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
    view = finder.findRequiredView(source, 2131361837, "field 'qqEt'");
    target.qqEt = finder.castView(view, 2131361837, "field 'qqEt'");
    view = finder.findRequiredView(source, 2131361844, "field 'updateBtn' and method 'onClick'");
    target.updateBtn = finder.castView(view, 2131361844, "field 'updateBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361839, "field 'birthEt'");
    target.birthEt = finder.castView(view, 2131361839, "field 'birthEt'");
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
    view = finder.findRequiredView(source, 2131361833, "field 'imgIv'");
    target.imgIv = finder.castView(view, 2131361833, "field 'imgIv'");
    view = finder.findRequiredView(source, 2131361817, "field 'emailEt'");
    target.emailEt = finder.castView(view, 2131361817, "field 'emailEt'");
    view = finder.findRequiredView(source, 2131361811, "field 'titleLl'");
    target.titleLl = finder.castView(view, 2131361811, "field 'titleLl'");
    view = finder.findRequiredView(source, 2131361813, "field 'titleTv'");
    target.titleTv = finder.castView(view, 2131361813, "field 'titleTv'");
    view = finder.findRequiredView(source, 2131361814, "field 'rightTv'");
    target.rightTv = finder.castView(view, 2131361814, "field 'rightTv'");
    view = finder.findRequiredView(source, 2131361836, "field 'telEt'");
    target.telEt = finder.castView(view, 2131361836, "field 'telEt'");
  }

  @Override public void unbind(T target) {
    target.sexSp = null;
    target.contentLl = null;
    target.picAdd2Tv = null;
    target.usernameEt = null;
    target.weChatEt = null;
    target.leftTv = null;
    target.qqEt = null;
    target.updateBtn = null;
    target.birthEt = null;
    target.picAddTv = null;
    target.imgIv = null;
    target.emailEt = null;
    target.titleLl = null;
    target.titleTv = null;
    target.rightTv = null;
    target.telEt = null;
  }
}
