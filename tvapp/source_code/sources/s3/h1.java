package s3;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class h1 extends AbstractC1184l {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f14074e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, C1175g0 c1175g0, int i7) {
        super(c1175g0);
        this.f14074e = i7;
        this.f = obj;
    }

    @Override // s3.AbstractC1184l
    public final void c() {
        switch (this.f14074e) {
            case 0:
                H2.X x7 = (H2.X) this.f;
                ((f1) x7.f1000t).D();
                f1 f1Var = (f1) x7.f1000t;
                ((C1175g0) f1Var.f2765q).f14037D.getClass();
                x7.a(SystemClock.elapsedRealtime(), false, false);
                C1175g0 c1175g0 = (C1175g0) f1Var.f2765q;
                C1164b m7 = c1175g0.m();
                c1175g0.f14037D.getClass();
                m7.H(SystemClock.elapsedRealtime());
                return;
            default:
                k1 k1Var = (k1) this.f;
                k1Var.K();
                k1Var.b().f13803D.d("Starting upload from DelayedRunnable");
                k1Var.f14116r.c0();
                return;
        }
    }
}
