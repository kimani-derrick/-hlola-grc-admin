package u4;

import t3.C1244h;
import t3.C1251o;
import t3.InterfaceC1237a;
/* renamed from: u4.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1275C implements InterfaceC1237a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14976q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C1244h f14977r;

    public /* synthetic */ C1275C(C1244h c1244h, int i7) {
        this.f14976q = i7;
        this.f14977r = c1244h;
    }

    @Override // t3.InterfaceC1237a
    public final Object d(C1251o c1251o) {
        switch (this.f14976q) {
            case 0:
                boolean i7 = c1251o.i();
                C1244h c1244h = this.f14977r;
                if (i7) {
                    c1244h.b(c1251o.g());
                    return null;
                } else if (c1251o.f() != null) {
                    c1244h.a(c1251o.f());
                    return null;
                } else {
                    return null;
                }
            case 1:
                boolean i8 = c1251o.i();
                C1244h c1244h2 = this.f14977r;
                if (i8) {
                    c1244h2.b(c1251o.g());
                    return null;
                } else if (c1251o.f() != null) {
                    c1244h2.a(c1251o.f());
                    return null;
                } else {
                    return null;
                }
            default:
                boolean i9 = c1251o.i();
                C1244h c1244h3 = this.f14977r;
                if (i9) {
                    c1244h3.f14573a.l(c1251o.g());
                    return null;
                } else if (c1251o.f() != null) {
                    c1244h3.f14573a.k(c1251o.f());
                    return null;
                } else {
                    return null;
                }
        }
    }
}
