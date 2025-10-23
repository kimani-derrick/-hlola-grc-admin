package x6;

import java.lang.reflect.Type;
/* renamed from: x6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476i implements InterfaceC1472e {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f16309q;

    /* renamed from: r  reason: collision with root package name */
    public final Type f16310r;

    public /* synthetic */ C1476i(int i7, Type type) {
        this.f16309q = i7;
        this.f16310r = type;
    }

    @Override // x6.InterfaceC1472e
    public final Type a() {
        switch (this.f16309q) {
            case 0:
                return this.f16310r;
            default:
                return this.f16310r;
        }
    }

    @Override // x6.InterfaceC1472e
    public final Object d(C1488v c1488v) {
        switch (this.f16309q) {
            case 0:
                C1477j c1477j = new C1477j(c1488v);
                c1488v.f(new C1475h(c1477j, 0));
                return c1477j;
            default:
                C1477j c1477j2 = new C1477j(c1488v);
                c1488v.f(new C1475h(c1477j2, 1));
                return c1477j2;
        }
    }
}
