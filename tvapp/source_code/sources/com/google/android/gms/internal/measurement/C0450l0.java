package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* renamed from: com.google.android.gms.internal.measurement.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450l0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8605u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8606v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f8607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0450l0(C0430h0 c0430h0, Object obj, int i7) {
        super(c0430h0, true);
        this.f8605u = i7;
        this.f8607w = obj;
        this.f8606v = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        switch (this.f8605u) {
            case 0:
                V v5 = this.f8606v.f8571h;
                g3.n.g(v5);
                v5.setConditionalUserProperty((Bundle) this.f8607w, this.f8544q);
                return;
            default:
                V v7 = this.f8606v.f8571h;
                g3.n.g(v7);
                v7.registerOnMeasurementEventListener((BinderC0425g0) this.f8607w);
                return;
        }
    }
}
