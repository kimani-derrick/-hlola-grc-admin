package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.measurement.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0394a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8502a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ C0503w f8503b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8502a) {
            case 0:
                C0503w c0503w = this.f8503b;
                c0503w.getClass();
                C0506w2 c0506w2 = new C0506w2("internal.registerCallback");
                c0506w2.f8710t = c0503w.d;
                return c0506w2;
            default:
                return new C0506w2(this.f8503b.f8708c);
        }
    }
}
