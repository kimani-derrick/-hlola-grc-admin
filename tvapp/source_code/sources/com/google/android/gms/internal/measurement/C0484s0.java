package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* renamed from: com.google.android.gms.internal.measurement.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484s0 extends AbstractRunnableC0415e0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8666A;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f8668v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f8669w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Bundle f8670x;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Long f8667u = null;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f8671y = true;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8672z = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0484s0(C0430h0 c0430h0, String str, String str2, Bundle bundle) {
        super(c0430h0, true);
        this.f8668v = str;
        this.f8669w = str2;
        this.f8670x = bundle;
        this.f8666A = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        long longValue;
        Long l7 = this.f8667u;
        if (l7 == null) {
            longValue = this.f8544q;
        } else {
            longValue = l7.longValue();
        }
        long j7 = longValue;
        V v5 = this.f8666A.f8571h;
        g3.n.g(v5);
        v5.logEvent(this.f8668v, this.f8669w, this.f8670x, this.f8671y, this.f8672z, j7);
    }
}
