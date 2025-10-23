package com.boxhdo.android.tv.customviews;

import M5.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import h1.p;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public final class TvButton extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TvButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.f(context, "context");
        View inflate = View.inflate(context, R.layout.custom_button, this);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imageIcon);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f10974b, 0, 0);
        g.e(obtainStyledAttributes, "context.theme.obtainStyl…styleable.TvButton, 0, 0)");
        ((TextView) inflate.findViewById(R.id.textTitle)).setText(obtainStyledAttributes.getString(2));
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setIcon(int i7) {
        ((ImageView) findViewById(R.id.imageIcon)).setImageResource(i7);
    }

    public final void setText(String str) {
        g.f(str, "text");
        ((TextView) findViewById(R.id.textTitle)).setText(str);
    }
}
