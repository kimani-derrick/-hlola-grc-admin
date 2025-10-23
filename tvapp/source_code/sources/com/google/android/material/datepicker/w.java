package com.google.android.material.datepicker;

import H2.C0002c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import java.util.Locale;
import w0.L;
import w0.k0;
/* loaded from: classes.dex */
public final class w extends L {
    public final j d;

    public w(j jVar) {
        this.d = jVar;
    }

    @Override // w0.L
    public final int a() {
        return this.d.f8868p0.f8848u;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        j jVar = this.d;
        int i8 = jVar.f8868p0.f8844q.f8892s + i7;
        TextView textView = ((v) k0Var).f8909u;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i8)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i8)));
        C0002c c0002c = jVar.f8871s0;
        if (u.b().get(1) == i8) {
            Object obj = c0002c.f1018s;
        } else {
            Object obj2 = c0002c.f1017r;
        }
        throw null;
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        return new v((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
