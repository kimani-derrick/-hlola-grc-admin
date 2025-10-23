package t3;

import java.util.concurrent.ExecutionException;
/* renamed from: t3.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246j implements InterfaceC1241e, InterfaceC1240d, InterfaceC1238b {

    /* renamed from: q  reason: collision with root package name */
    public final Object f14576q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public final int f14577r;

    /* renamed from: s  reason: collision with root package name */
    public final C1251o f14578s;

    /* renamed from: t  reason: collision with root package name */
    public int f14579t;

    /* renamed from: u  reason: collision with root package name */
    public int f14580u;

    /* renamed from: v  reason: collision with root package name */
    public int f14581v;

    /* renamed from: w  reason: collision with root package name */
    public Exception f14582w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14583x;

    public C1246j(int i7, C1251o c1251o) {
        this.f14577r = i7;
        this.f14578s = c1251o;
    }

    public final void a() {
        int i7 = this.f14579t + this.f14580u + this.f14581v;
        int i8 = this.f14577r;
        if (i7 == i8) {
            Exception exc = this.f14582w;
            C1251o c1251o = this.f14578s;
            if (exc != null) {
                int i9 = this.f14580u;
                c1251o.k(new ExecutionException(i9 + " out of " + i8 + " underlying tasks failed", this.f14582w));
            } else if (this.f14583x) {
                c1251o.m();
            } else {
                c1251o.l(null);
            }
        }
    }

    @Override // t3.InterfaceC1238b
    public final void b() {
        synchronized (this.f14576q) {
            this.f14581v++;
            this.f14583x = true;
            a();
        }
    }

    @Override // t3.InterfaceC1240d
    public final void c(Exception exc) {
        synchronized (this.f14576q) {
            this.f14580u++;
            this.f14582w = exc;
            a();
        }
    }

    @Override // t3.InterfaceC1241e
    public final void f(Object obj) {
        synchronized (this.f14576q) {
            this.f14579t++;
            a();
        }
    }
}
