package H2;

import e2.H0;
import e2.I0;
import e2.J0;
/* renamed from: H2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017s extends AbstractC0014o {

    /* renamed from: u  reason: collision with root package name */
    public static final Object f1164u = new Object();

    /* renamed from: s  reason: collision with root package name */
    public final Object f1165s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f1166t;

    public C0017s(J0 j02, Object obj, Object obj2) {
        super(j02);
        this.f1165s = obj;
        this.f1166t = obj2;
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final int b(Object obj) {
        Object obj2;
        if (f1164u.equals(obj) && (obj2 = this.f1166t) != null) {
            obj = obj2;
        }
        return this.f1149r.b(obj);
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final H0 g(int i7, H0 h02, boolean z7) {
        this.f1149r.g(i7, h02, z7);
        if (Z2.H.a(h02.f9553r, this.f1166t) && z7) {
            h02.f9553r = f1164u;
        }
        return h02;
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final Object m(int i7) {
        Object m7 = this.f1149r.m(i7);
        if (Z2.H.a(m7, this.f1166t)) {
            return f1164u;
        }
        return m7;
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final I0 n(int i7, I0 i02, long j7) {
        this.f1149r.n(i7, i02, j7);
        if (Z2.H.a(i02.f9582q, this.f1165s)) {
            i02.f9582q = I0.f9561H;
        }
        return i02;
    }
}
