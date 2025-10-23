package O3;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class J extends i0 {

    /* renamed from: q  reason: collision with root package name */
    public boolean f2608q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f2609r;

    public J(Object obj) {
        this.f2609r = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f2608q;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2608q) {
            this.f2608q = true;
            return this.f2609r;
        }
        throw new NoSuchElementException();
    }
}
