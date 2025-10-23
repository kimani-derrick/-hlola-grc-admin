package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class h0 implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final Iterator f9121q;

    public h0(i0 i0Var) {
        this.f9121q = i0Var.f9129q.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9121q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f9121q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
