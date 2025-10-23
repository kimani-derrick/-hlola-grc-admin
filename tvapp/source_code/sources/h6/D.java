package h6;

import v6.InterfaceC1342g;
/* loaded from: classes.dex */
public final class D extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f11077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11078b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f11079c;
    public final /* synthetic */ int d;

    public D(v vVar, int i7, byte[] bArr, int i8) {
        this.f11077a = vVar;
        this.f11078b = i7;
        this.f11079c = bArr;
        this.d = i8;
    }

    @Override // h6.E
    public final long a() {
        return this.f11078b;
    }

    @Override // h6.E
    public final v b() {
        return this.f11077a;
    }

    @Override // h6.E
    public final void c(InterfaceC1342g interfaceC1342g) {
        interfaceC1342g.g(this.f11079c, this.d, this.f11078b);
    }
}
