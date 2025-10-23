package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.TimeZone;
import w0.U;
import w0.X;
/* loaded from: classes.dex */
public final class h extends X {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f8861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f8862b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f8863c;

    public h(j jVar, q qVar, MaterialButton materialButton) {
        this.f8863c = jVar;
        this.f8861a = qVar;
        this.f8862b = materialButton;
    }

    @Override // w0.X
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            recyclerView.announceForAccessibility(this.f8862b.getText());
        }
    }

    @Override // w0.X
    public final void b(RecyclerView recyclerView, int i7, int i8) {
        int h12;
        j jVar = this.f8863c;
        if (i7 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f8873u0.getLayoutManager();
            View j12 = linearLayoutManager.j1(0, linearLayoutManager.y(), false);
            if (j12 == null) {
                h12 = -1;
            } else {
                h12 = U.O(j12);
            }
        } else {
            h12 = ((LinearLayoutManager) jVar.f8873u0.getLayoutManager()).h1();
        }
        q qVar = this.f8861a;
        Calendar a7 = u.a(qVar.f8905e.f8844q.f8890q);
        a7.add(2, h12);
        jVar.f8869q0 = new m(a7);
        Calendar a8 = u.a(qVar.f8905e.f8844q.f8890q);
        a8.add(2, h12);
        a8.set(5, 1);
        Calendar a9 = u.a(a8);
        a9.get(2);
        a9.get(1);
        a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        long timeInMillis = a9.getTimeInMillis();
        this.f8862b.setText(DateUtils.formatDateTime(qVar.d, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36));
    }
}
