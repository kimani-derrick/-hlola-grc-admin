package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import w0.U;
/* loaded from: classes.dex */
public final class i implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f8864q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q f8865r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ j f8866s;

    public /* synthetic */ i(j jVar, q qVar, int i7) {
        this.f8864q = i7;
        this.f8866s = jVar;
        this.f8865r = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int O5;
        switch (this.f8864q) {
            case 0:
                j jVar = this.f8866s;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f8873u0.getLayoutManager();
                View j12 = linearLayoutManager.j1(0, linearLayoutManager.y(), false);
                if (j12 == null) {
                    O5 = -1;
                } else {
                    O5 = U.O(j12);
                }
                int i7 = O5 + 1;
                if (i7 < jVar.f8873u0.getAdapter().a()) {
                    Calendar a7 = u.a(this.f8865r.f8905e.f8844q.f8890q);
                    a7.add(2, i7);
                    jVar.f0(new m(a7));
                    return;
                }
                return;
            default:
                j jVar2 = this.f8866s;
                int h12 = ((LinearLayoutManager) jVar2.f8873u0.getLayoutManager()).h1() - 1;
                if (h12 >= 0) {
                    Calendar a8 = u.a(this.f8865r.f8905e.f8844q.f8890q);
                    a8.add(2, h12);
                    jVar2.f0(new m(a8));
                    return;
                }
                return;
        }
    }
}
