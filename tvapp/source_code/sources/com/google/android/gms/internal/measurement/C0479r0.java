package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479r0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f8657u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f8658v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f8659w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ T f8660x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8661y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479r0(C0430h0 c0430h0, String str, String str2, boolean z7, T t5) {
        super(c0430h0, true);
        this.f8657u = str;
        this.f8658v = str2;
        this.f8659w = z7;
        this.f8660x = t5;
        this.f8661y = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        V v5 = this.f8661y.f8571h;
        g3.n.g(v5);
        v5.getUserProperties(this.f8657u, this.f8658v, this.f8659w, this.f8660x);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void b() {
        this.f8660x.d(null);
    }
}
