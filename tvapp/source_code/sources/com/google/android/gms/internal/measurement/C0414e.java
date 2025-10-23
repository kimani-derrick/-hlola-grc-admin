package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.measurement.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414e implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Iterator f8542q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Iterator f8543r;

    public C0414e(Iterator it, Iterator it2) {
        this.f8542q = it;
        this.f8543r = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8542q.hasNext()) {
            return true;
        }
        return this.f8543r.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.f8542q;
        if (it.hasNext()) {
            return new C0474q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f8543r;
        if (it2.hasNext()) {
            return new C0474q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
