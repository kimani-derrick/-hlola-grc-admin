package com.google.android.material.datepicker;

import H2.C0002c;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public final class n extends BaseAdapter {

    /* renamed from: t  reason: collision with root package name */
    public static final int f8897t = u.c(null).getMaximum(4);

    /* renamed from: q  reason: collision with root package name */
    public final m f8898q;

    /* renamed from: r  reason: collision with root package name */
    public C0002c f8899r;

    /* renamed from: s  reason: collision with root package name */
    public final b f8900s;

    public n(m mVar, b bVar) {
        this.f8898q = mVar;
        this.f8900s = bVar;
        throw null;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final Long getItem(int i7) {
        m mVar = this.f8898q;
        if (i7 >= mVar.g() && i7 <= b()) {
            Calendar a7 = u.a(mVar.f8890q);
            a7.set(5, (i7 - mVar.g()) + 1);
            return Long.valueOf(a7.getTimeInMillis());
        }
        return null;
    }

    public final int b() {
        m mVar = this.f8898q;
        return (mVar.g() + mVar.f8894u) - 1;
    }

    public final void c(TextView textView, long j7) {
        if (textView == null) {
            return;
        }
        if (j7 < this.f8900s.f8846s.f8854q) {
            textView.setEnabled(false);
            c cVar = (c) this.f8899r.f1019t;
            cVar.getClass();
            J3.g gVar = new J3.g();
            J3.g gVar2 = new J3.g();
            J3.k kVar = (J3.k) cVar.f;
            gVar.setShapeAppearanceModel(kVar);
            gVar2.setShapeAppearanceModel(kVar);
            gVar.j((ColorStateList) cVar.d);
            gVar.f1362q.f1340k = cVar.f8850a;
            gVar.invalidateSelf();
            J3.f fVar = gVar.f1362q;
            ColorStateList colorStateList = fVar.d;
            ColorStateList colorStateList2 = (ColorStateList) cVar.f8853e;
            if (colorStateList != colorStateList2) {
                fVar.d = colorStateList2;
                gVar.onStateChange(gVar.getState());
            }
            ColorStateList colorStateList3 = (ColorStateList) cVar.f8852c;
            textView.setTextColor(colorStateList3);
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), gVar, gVar2);
            Rect rect = (Rect) cVar.f8851b;
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
            Field field = O.f1447a;
            textView.setBackground(insetDrawable);
            return;
        }
        textView.setEnabled(true);
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        m mVar = this.f8898q;
        return mVar.g() + mVar.f8894u;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7 / this.f8898q.f8893t;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        CharSequence format;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DateFormat instanceForSkeleton2;
        TimeZone timeZone2;
        Context context = viewGroup.getContext();
        if (this.f8899r == null) {
            this.f8899r = new C0002c(context, 25);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        m mVar = this.f8898q;
        int g7 = i7 - mVar.g();
        if (g7 >= 0 && g7 < mVar.f8894u) {
            int i8 = g7 + 1;
            textView.setTag(mVar);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i8)));
            Calendar a7 = u.a(mVar.f8890q);
            a7.set(5, i8);
            long timeInMillis = a7.getTimeInMillis();
            Calendar b7 = u.b();
            b7.set(5, 1);
            Calendar a8 = u.a(b7);
            a8.get(2);
            int i9 = a8.get(1);
            a8.getMaximum(7);
            a8.getActualMaximum(5);
            a8.getTimeInMillis();
            if (mVar.f8892s == i9) {
                Locale locale = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                    timeZone2 = TimeZone.getTimeZone("UTC");
                    instanceForSkeleton2.setTimeZone(timeZone2);
                    format = instanceForSkeleton2.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                    dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                    format = dateInstance.format(new Date(timeInMillis));
                }
            } else {
                Locale locale2 = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                    timeZone = TimeZone.getTimeZone("UTC");
                    instanceForSkeleton.setTimeZone(timeZone);
                    format = instanceForSkeleton.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                    dateInstance2.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                    format = dateInstance2.format(new Date(timeInMillis));
                }
            }
            textView.setContentDescription(format);
            textView.setVisibility(0);
            textView.setEnabled(true);
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i7);
        if (item != null) {
            c(textView, item.longValue());
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
