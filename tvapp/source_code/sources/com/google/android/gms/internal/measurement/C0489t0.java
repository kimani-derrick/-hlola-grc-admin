package com.google.android.gms.internal.measurement;

import android.app.Activity;
import l3.BinderC0971b;
/* renamed from: com.google.android.gms.internal.measurement.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489t0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8676u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Activity f8677v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0420f0 f8678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0489t0(C0420f0 c0420f0, Activity activity, int i7) {
        super(c0420f0.f8555q, true);
        this.f8676u = i7;
        switch (i7) {
            case 1:
                this.f8677v = activity;
                this.f8678w = c0420f0;
                super(c0420f0.f8555q, true);
                return;
            case 2:
                this.f8677v = activity;
                this.f8678w = c0420f0;
                super(c0420f0.f8555q, true);
                return;
            case 3:
                this.f8677v = activity;
                this.f8678w = c0420f0;
                super(c0420f0.f8555q, true);
                return;
            case 4:
                this.f8677v = activity;
                this.f8678w = c0420f0;
                super(c0420f0.f8555q, true);
                return;
            default:
                this.f8677v = activity;
                this.f8678w = c0420f0;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        switch (this.f8676u) {
            case 0:
                V v5 = this.f8678w.f8555q.f8571h;
                g3.n.g(v5);
                v5.onActivityStarted(new BinderC0971b(this.f8677v), this.f8545r);
                return;
            case 1:
                V v7 = this.f8678w.f8555q.f8571h;
                g3.n.g(v7);
                v7.onActivityPaused(new BinderC0971b(this.f8677v), this.f8545r);
                return;
            case 2:
                V v8 = this.f8678w.f8555q.f8571h;
                g3.n.g(v8);
                v8.onActivityResumed(new BinderC0971b(this.f8677v), this.f8545r);
                return;
            case 3:
                V v9 = this.f8678w.f8555q.f8571h;
                g3.n.g(v9);
                v9.onActivityStopped(new BinderC0971b(this.f8677v), this.f8545r);
                return;
            default:
                V v10 = this.f8678w.f8555q.f8571h;
                g3.n.g(v10);
                v10.onActivityDestroyed(new BinderC0971b(this.f8677v), this.f8545r);
                return;
        }
    }
}
