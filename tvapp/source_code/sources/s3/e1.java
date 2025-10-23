package s3;

import k.C0852F;
/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14011q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f14012r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f1 f14013s;

    public /* synthetic */ e1(f1 f1Var, long j7, int i7) {
        this.f14011q = i7;
        this.f14012r = j7;
        this.f14013s = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14011q) {
            case 0:
                f1 f1Var = this.f14013s;
                f1Var.D();
                f1Var.K();
                C1154I b7 = f1Var.b();
                long j7 = this.f14012r;
                b7.f13803D.c(Long.valueOf(j7), "Activity resumed, time");
                C1175g0 c1175g0 = (C1175g0) f1Var.f2765q;
                boolean O5 = c1175g0.f14062w.O(null, AbstractC1203v.f14273H0);
                C1170e c1170e = c1175g0.f14062w;
                H2.X x7 = f1Var.f14019v;
                boolean R6 = c1170e.R();
                if (!O5 ? R6 || f1Var.B().f13886J.b() : R6 || f1Var.f14017t) {
                    ((f1) x7.f1000t).D();
                    ((h1) x7.f999s).a();
                    x7.f997q = j7;
                    x7.f998r = j7;
                }
                androidx.fragment.app.D d = f1Var.f14020w;
                f1 f1Var2 = (f1) d.f5884s;
                f1Var2.D();
                g1 g1Var = (g1) d.f5883r;
                if (g1Var != null) {
                    f1Var2.f14016s.removeCallbacks(g1Var);
                }
                f1Var2.B().f13886J.a(false);
                f1Var2.D();
                f1Var2.f14017t = false;
                C0852F c0852f = f1Var.f14018u;
                ((f1) c0852f.f11874r).D();
                f1 f1Var3 = (f1) c0852f.f11874r;
                if (((C1175g0) f1Var3.f2765q).j()) {
                    ((C1175g0) f1Var3.f2765q).f14037D.getClass();
                    c0852f.N(false, System.currentTimeMillis());
                    return;
                }
                return;
            default:
                f1 f1Var4 = this.f14013s;
                f1Var4.D();
                f1Var4.K();
                C1154I b8 = f1Var4.b();
                long j8 = this.f14012r;
                b8.f13803D.c(Long.valueOf(j8), "Activity paused, time");
                androidx.fragment.app.D d7 = f1Var4.f14020w;
                f1 f1Var5 = (f1) d7.f5884s;
                ((C1175g0) f1Var5.f2765q).f14037D.getClass();
                g1 g1Var2 = new g1(d7, System.currentTimeMillis(), j8);
                d7.f5883r = g1Var2;
                f1Var5.f14016s.postDelayed(g1Var2, 2000L);
                if (((C1175g0) f1Var4.f2765q).f14062w.R()) {
                    ((h1) f1Var4.f14019v.f999s).a();
                    return;
                }
                return;
        }
    }
}
