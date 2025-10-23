package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import w0.Q;
/* loaded from: classes.dex */
public final class g extends Q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f8860a;

    public g(j jVar) {
        this.f8860a = jVar;
        u.c(null);
        u.c(null);
    }

    @Override // w0.Q
    public final void b(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            w wVar = (w) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            this.f8860a.getClass();
            throw null;
        }
    }
}
