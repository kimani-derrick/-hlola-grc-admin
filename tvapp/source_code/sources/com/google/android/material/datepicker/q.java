package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import java.util.Calendar;
import w0.L;
import w0.V;
import w0.k0;
/* loaded from: classes.dex */
public final class q extends L {
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final b f8905e;
    public final Z5.n f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8906g;

    public q(ContextThemeWrapper contextThemeWrapper, b bVar, Z5.n nVar) {
        int i7;
        m mVar = bVar.f8844q;
        m mVar2 = bVar.f8847t;
        if (mVar.compareTo(mVar2) <= 0) {
            if (mVar2.compareTo(bVar.f8845r) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * n.f8897t;
                if (k.k0(contextThemeWrapper, 16843277)) {
                    i7 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i7 = 0;
                }
                this.d = contextThemeWrapper;
                this.f8906g = dimensionPixelSize + i7;
                this.f8905e = bVar;
                this.f = nVar;
                if (!this.f15466a.a()) {
                    this.f15467b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // w0.L
    public final int a() {
        return this.f8905e.f8849v;
    }

    @Override // w0.L
    public final long b(int i7) {
        Calendar a7 = u.a(this.f8905e.f8844q.f8890q);
        a7.add(2, i7);
        return new m(a7).f8890q.getTimeInMillis();
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        p pVar = (p) k0Var;
        b bVar = this.f8905e;
        Calendar a7 = u.a(bVar.f8844q.f8890q);
        a7.add(2, i7);
        m mVar = new m(a7);
        pVar.f8903u.setText(mVar.h(pVar.f15576a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.f8904v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && mVar.equals(materialCalendarGridView.a().f8898q)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new n(mVar, bVar);
        throw null;
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (k.k0(recyclerView.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new V(-1, this.f8906g));
            return new p(linearLayout, true);
        }
        return new p(linearLayout, false);
    }
}
