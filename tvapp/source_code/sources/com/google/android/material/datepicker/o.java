package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public final class o implements AdapterView.OnItemClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f8901q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q f8902r;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f8902r = qVar;
        this.f8901q = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        MaterialCalendarGridView materialCalendarGridView = this.f8901q;
        n a7 = materialCalendarGridView.a();
        if (i7 >= a7.f8898q.g() && i7 <= a7.b()) {
            if (materialCalendarGridView.a().getItem(i7).longValue() >= ((j) this.f8902r.f.f4918q).f8868p0.f8846s.f8854q) {
                throw null;
            }
        }
    }
}
