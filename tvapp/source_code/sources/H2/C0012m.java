package H2;

import e2.C0591H;
/* renamed from: H2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0012m implements N3.l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1128q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f1129r;

    public /* synthetic */ C0012m(int i7, Object obj) {
        this.f1128q = i7;
        this.f1129r = obj;
    }

    @Override // N3.l
    public final Object get() {
        switch (this.f1128q) {
            case 0:
                try {
                    return (InterfaceC0024z) ((Class) this.f1129r).getConstructor(null).newInstance(null);
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
            default:
                return Boolean.valueOf(((C0591H) this.f1129r).f9521O);
        }
    }
}
