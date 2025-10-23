package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
/* renamed from: com.google.android.gms.internal.measurement.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0415e0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final long f8544q;

    /* renamed from: r  reason: collision with root package name */
    public final long f8545r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8546s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8547t;

    public AbstractRunnableC0415e0(C0430h0 c0430h0, boolean z7) {
        this.f8547t = c0430h0;
        c0430h0.f8567b.getClass();
        this.f8544q = System.currentTimeMillis();
        c0430h0.f8567b.getClass();
        this.f8545r = SystemClock.elapsedRealtime();
        this.f8546s = z7;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0430h0 c0430h0 = this.f8547t;
        if (c0430h0.f8570g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e3) {
            c0430h0.f(e3, false, this.f8546s);
            b();
        }
    }
}
