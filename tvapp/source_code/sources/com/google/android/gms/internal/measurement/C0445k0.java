package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import l3.BinderC0971b;
/* renamed from: com.google.android.gms.internal.measurement.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445k0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8595u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f8596v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f8597w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8598x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f8599y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445k0(C0430h0 c0430h0, Activity activity, String str, String str2) {
        super(c0430h0, true);
        this.f8595u = 2;
        this.f8599y = activity;
        this.f8596v = str;
        this.f8597w = str2;
        this.f8598x = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        switch (this.f8595u) {
            case 0:
                V v5 = this.f8598x.f8571h;
                g3.n.g(v5);
                v5.clearConditionalUserProperty(this.f8596v, this.f8597w, (Bundle) this.f8599y);
                return;
            case 1:
                V v7 = this.f8598x.f8571h;
                g3.n.g(v7);
                v7.getConditionalUserProperties(this.f8596v, this.f8597w, (T) this.f8599y);
                return;
            default:
                V v8 = this.f8598x.f8571h;
                g3.n.g(v8);
                v8.setCurrentScreen(new BinderC0971b((Activity) this.f8599y), this.f8596v, this.f8597w, this.f8544q);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public void b() {
        switch (this.f8595u) {
            case 1:
                ((T) this.f8599y).d(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0445k0(C0430h0 c0430h0, String str, String str2, Object obj, int i7) {
        super(c0430h0, true);
        this.f8595u = i7;
        this.f8596v = str;
        this.f8597w = str2;
        this.f8599y = obj;
        this.f8598x = c0430h0;
    }
}
