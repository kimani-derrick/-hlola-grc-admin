package e2;
/* renamed from: e2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614k implements InterfaceC0604f {

    /* renamed from: q  reason: collision with root package name */
    public final int f9997q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9998r;

    /* renamed from: s  reason: collision with root package name */
    public final int f9999s;

    /* renamed from: t  reason: collision with root package name */
    public final String f10000t;

    static {
        new F3.m(0).a();
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public C0614k(F3.m mVar) {
        this.f9997q = mVar.f726a;
        this.f9998r = mVar.f727b;
        this.f9999s = mVar.f728c;
        mVar.getClass();
        this.f10000t = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0614k)) {
            return false;
        }
        C0614k c0614k = (C0614k) obj;
        if (this.f9997q == c0614k.f9997q && this.f9998r == c0614k.f9998r && this.f9999s == c0614k.f9999s && Z2.H.a(this.f10000t, c0614k.f10000t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = (((((527 + this.f9997q) * 31) + this.f9998r) * 31) + this.f9999s) * 31;
        String str = this.f10000t;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i7 + hashCode;
    }
}
