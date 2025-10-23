package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class m0 implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final Iterator f5798q;

    public m0(n0 n0Var) {
        this.f5798q = n0Var.f5801q.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5798q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f5798q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
