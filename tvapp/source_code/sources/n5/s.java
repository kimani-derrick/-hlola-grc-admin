package n5;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class s implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public u f12728q;

    /* renamed from: r  reason: collision with root package name */
    public u f12729r = null;

    /* renamed from: s  reason: collision with root package name */
    public int f12730s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ v f12731t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12732u;

    public s(v vVar, int i7) {
        this.f12732u = i7;
        this.f12731t = vVar;
        this.f12728q = vVar.f12747s.f12738t;
        this.f12730s = vVar.f12749u;
    }

    public final Object a() {
        return b();
    }

    public final u b() {
        u uVar = this.f12728q;
        v vVar = this.f12731t;
        if (uVar != vVar.f12747s) {
            if (vVar.f12749u == this.f12730s) {
                this.f12728q = uVar.f12738t;
                this.f12729r = uVar;
                return uVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12728q != this.f12731t.f12747s) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f12732u) {
            case 1:
                return b().f12740v;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        u uVar = this.f12729r;
        if (uVar != null) {
            v vVar = this.f12731t;
            vVar.c(uVar, true);
            this.f12729r = null;
            this.f12730s = vVar.f12749u;
            return;
        }
        throw new IllegalStateException();
    }
}
