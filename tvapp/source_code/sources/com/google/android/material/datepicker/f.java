package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import w0.C;
import w0.g0;
/* loaded from: classes.dex */
public final class f extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ int f8859E;
    public final /* synthetic */ j F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, int i7, int i8) {
        super(i7);
        this.F = jVar;
        this.f8859E = i8;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final void U0(RecyclerView recyclerView, g0 g0Var, int i7) {
        C c5 = new C(recyclerView.getContext());
        c5.f15445a = i7;
        V0(c5);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(g0 g0Var, int[] iArr) {
        int i7 = this.f8859E;
        j jVar = this.F;
        if (i7 == 0) {
            iArr[0] = jVar.f8873u0.getWidth();
            iArr[1] = jVar.f8873u0.getWidth();
            return;
        }
        iArr[0] = jVar.f8873u0.getHeight();
        iArr[1] = jVar.f8873u0.getHeight();
    }
}
