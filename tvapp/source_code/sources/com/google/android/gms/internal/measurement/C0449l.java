package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.measurement.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449l implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Iterator f8604q;

    public C0449l(Iterator it) {
        this.f8604q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8604q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C0474q((String) this.f8604q.next());
    }
}
