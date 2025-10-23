package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465o0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8628u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f8629v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0465o0(C0430h0 c0430h0, String str, int i7) {
        super(c0430h0, true);
        this.f8628u = i7;
        this.f8629v = str;
        this.f8630w = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        switch (this.f8628u) {
            case 0:
                V v5 = this.f8630w.f8571h;
                g3.n.g(v5);
                v5.beginAdUnitExposure(this.f8629v, this.f8545r);
                return;
            default:
                V v7 = this.f8630w.f8571h;
                g3.n.g(v7);
                v7.endAdUnitExposure(this.f8629v, this.f8545r);
                return;
        }
    }
}
