package s3;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13746q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ AtomicReference f13747r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ C1212z0 f13748s;

    public /* synthetic */ A0() {
        this.f13746q = 0;
    }

    private final void a() {
        synchronized (this.f13747r) {
            try {
                AtomicReference atomicReference = this.f13747r;
                C1175g0 c1175g0 = (C1175g0) this.f13748s.f2765q;
                C1170e c1170e = c1175g0.f14062w;
                String K6 = c1175g0.o().K();
                c1170e.getClass();
                atomicReference.set(Boolean.valueOf(c1170e.O(K6, AbstractC1203v.f14280L)));
                this.f13747r.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (this.f13747r) {
            try {
                AtomicReference atomicReference = this.f13747r;
                C1175g0 c1175g0 = (C1175g0) this.f13748s.f2765q;
                C1170e c1170e = c1175g0.f14062w;
                String K6 = c1175g0.o().K();
                c1170e.getClass();
                atomicReference.set(c1170e.K(K6, AbstractC1203v.f14282M));
                this.f13747r.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.f13747r) {
            try {
                AtomicReference atomicReference = this.f13747r;
                C1175g0 c1175g0 = (C1175g0) this.f13748s.f2765q;
                atomicReference.set(Integer.valueOf(c1175g0.f14062w.I(c1175g0.o().K(), AbstractC1203v.f14286O)));
                this.f13747r.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (this.f13747r) {
            try {
                AtomicReference atomicReference = this.f13747r;
                C1175g0 c1175g0 = (C1175g0) this.f13748s.f2765q;
                atomicReference.set(Long.valueOf(c1175g0.f14062w.J(c1175g0.o().K(), AbstractC1203v.f14284N)));
                this.f13747r.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13746q) {
            case 0:
                C1212z0 c1212z0 = this.f13748s;
                Bundle a02 = c1212z0.B().f13882E.a0();
                R0 r3 = ((C1175g0) c1212z0.f2765q).r();
                if (a02 == null) {
                    a02 = new Bundle();
                }
                r3.D();
                r3.H();
                m1 W = r3.W(false);
                r3.K(new j.d(r3, this.f13747r, W, a02, 4));
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            default:
                synchronized (this.f13747r) {
                    try {
                        AtomicReference atomicReference = this.f13747r;
                        C1175g0 c1175g0 = (C1175g0) this.f13748s.f2765q;
                        atomicReference.set(Double.valueOf(c1175g0.f14062w.E(c1175g0.o().K(), AbstractC1203v.f14288P)));
                        this.f13747r.notify();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ A0(C1212z0 c1212z0, AtomicReference atomicReference, int i7) {
        this.f13746q = i7;
        this.f13747r = atomicReference;
        this.f13748s = c1212z0;
    }
}
