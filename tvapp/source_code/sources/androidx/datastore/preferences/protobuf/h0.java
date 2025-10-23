package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class h0 implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public int f5777q = -1;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5778r;

    /* renamed from: s  reason: collision with root package name */
    public Iterator f5779s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ d0 f5780t;

    public h0(d0 d0Var) {
        this.f5780t = d0Var;
    }

    public final Iterator a() {
        if (this.f5779s == null) {
            this.f5779s = this.f5780t.f5751s.entrySet().iterator();
        }
        return this.f5779s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f5777q + 1;
        d0 d0Var = this.f5780t;
        if (i7 < d0Var.f5750r.size()) {
            return true;
        }
        if (!d0Var.f5751s.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next;
        this.f5778r = true;
        int i7 = this.f5777q + 1;
        this.f5777q = i7;
        d0 d0Var = this.f5780t;
        if (i7 < d0Var.f5750r.size()) {
            next = d0Var.f5750r.get(this.f5777q);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f5778r) {
            this.f5778r = false;
            int i7 = d0.f5748w;
            d0 d0Var = this.f5780t;
            d0Var.b();
            if (this.f5777q < d0Var.f5750r.size()) {
                int i8 = this.f5777q;
                this.f5777q = i8 - 1;
                d0Var.g(i8);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
