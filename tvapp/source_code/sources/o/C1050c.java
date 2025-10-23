package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: o.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050c implements Iterator, Map.Entry {

    /* renamed from: q  reason: collision with root package name */
    public int f12785q;

    /* renamed from: r  reason: collision with root package name */
    public int f12786r = -1;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12787s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C1052e f12788t;

    public C1050c(C1052e c1052e) {
        this.f12788t = c1052e;
        this.f12785q = c1052e.f12809s - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f12787s) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i7 = this.f12786r;
            C1052e c1052e = this.f12788t;
            if (!M5.g.a(key, c1052e.f(i7)) || !M5.g.a(entry.getValue(), c1052e.i(this.f12786r))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12787s) {
            return this.f12788t.f(this.f12786r);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12787s) {
            return this.f12788t.i(this.f12786r);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12786r < this.f12785q) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f12787s) {
            int i7 = this.f12786r;
            C1052e c1052e = this.f12788t;
            Object f = c1052e.f(i7);
            Object i8 = c1052e.i(this.f12786r);
            int i9 = 0;
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            if (i8 != null) {
                i9 = i8.hashCode();
            }
            return hashCode ^ i9;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f12786r++;
            this.f12787s = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12787s) {
            this.f12788t.g(this.f12786r);
            this.f12786r--;
            this.f12785q--;
            this.f12787s = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12787s) {
            return this.f12788t.h(this.f12786r, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
