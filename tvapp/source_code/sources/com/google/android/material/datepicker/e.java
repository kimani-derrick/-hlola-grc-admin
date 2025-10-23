package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: t  reason: collision with root package name */
    public static final int f8855t;

    /* renamed from: q  reason: collision with root package name */
    public final Calendar f8856q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8857r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8858s;

    static {
        f8855t = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar c5 = u.c(null);
        this.f8856q = c5;
        this.f8857r = c5.getMaximum(7);
        this.f8858s = c5.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8857r;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        int i8 = this.f8857r;
        if (i7 >= i8) {
            return null;
        }
        int i9 = i7 + this.f8858s;
        if (i9 > i8) {
            i9 -= i8;
        }
        return Integer.valueOf(i9);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i8 = i7 + this.f8858s;
        int i9 = this.f8857r;
        if (i8 > i9) {
            i8 -= i9;
        }
        Calendar calendar = this.f8856q;
        calendar.set(7, i8);
        textView.setText(calendar.getDisplayName(7, f8855t, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
