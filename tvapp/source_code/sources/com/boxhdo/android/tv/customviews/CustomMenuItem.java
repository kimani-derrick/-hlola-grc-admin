package com.boxhdo.android.tv.customviews;

import M5.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.b;
import androidx.databinding.d;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.customviews.CustomMenuItem;
import h1.p;
import j1.AbstractC0793K;
/* loaded from: classes.dex */
public final class CustomMenuItem extends LinearLayout {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f7775r = 0;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0793K f7776q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.f(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        g.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        d b7 = b.b((LayoutInflater) systemService, R.layout.item_menu, this, true);
        g.e(b7, "inflate(inflater, R.layout.item_menu, this, true)");
        AbstractC0793K abstractC0793K = (AbstractC0793K) b7;
        this.f7776q = abstractC0793K;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f10973a, 0, 0);
        g.e(obtainStyledAttributes, "context.theme.obtainStyl…ble.CustomMenuItem, 0, 0)");
        String string = obtainStyledAttributes.getString(1);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        abstractC0793K.f11572s.setText(string);
        abstractC0793K.f11571r.setImageDrawable(drawable);
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: i1.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                int i7 = CustomMenuItem.f7775r;
                CustomMenuItem customMenuItem = CustomMenuItem.this;
                g.f(customMenuItem, "this$0");
                if (g.a(view, customMenuItem)) {
                    AbstractC0793K abstractC0793K2 = customMenuItem.f7776q;
                    if (z7) {
                        abstractC0793K2.f11572s.setTypeface(Typeface.DEFAULT_BOLD);
                        TextView textView = abstractC0793K2.f11572s;
                        textView.setTextSize(0, customMenuItem.getResources().getDimensionPixelSize(R.dimen.sp_18));
                        textView.setTextColor(A.b.a(customMenuItem.getContext(), R.color.white));
                        abstractC0793K2.f11571r.setImageTintList(ColorStateList.valueOf(A.b.a(customMenuItem.getContext(), R.color.white)));
                        return;
                    }
                    abstractC0793K2.f11572s.setTypeface(Typeface.DEFAULT);
                    TextView textView2 = abstractC0793K2.f11572s;
                    textView2.setTextSize(0, customMenuItem.getResources().getDimensionPixelSize(R.dimen.sp_15));
                    textView2.setTextColor(A.b.a(customMenuItem.getContext(), R.color.color_text_gray));
                    abstractC0793K2.f11571r.setImageTintList(ColorStateList.valueOf(A.b.a(customMenuItem.getContext(), R.color.color_text_gray)));
                }
            }
        });
    }

    public final void setExpand(boolean z7) {
        TextView textView = this.f7776q.f11572s;
        g.e(textView, "binding.text");
        textView.setVisibility(z7 ? 0 : 8);
    }

    public final void setStateSelected(boolean z7) {
        View view = this.f7776q.f11573t;
        g.e(view, "binding.viewSelected");
        view.setVisibility(z7 ? 0 : 8);
    }
}
