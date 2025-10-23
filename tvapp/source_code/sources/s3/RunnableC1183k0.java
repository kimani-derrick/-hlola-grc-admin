package s3;

import com.google.android.gms.internal.measurement.C0408c3;
/* renamed from: s3.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1183k0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14101q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ BinderC1181j0 f14102r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ m1 f14103s;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14101q) {
            case 0:
                q1 q1Var = this.f14102r.d;
                q1Var.a0();
                q1Var.S(this.f14103s);
                return;
            case 1:
                q1 q1Var2 = this.f14102r.d;
                q1Var2.a0();
                q1Var2.U(this.f14103s);
                return;
            case 2:
                BinderC1181j0 binderC1181j0 = this.f14102r;
                binderC1181j0.d.a0();
                q1 q1Var3 = binderC1181j0.d;
                q1Var3.d().D();
                q1Var3.b0();
                m1 m1Var = this.f14103s;
                g3.n.c(m1Var.f14143q);
                q1Var3.k(m1Var);
                return;
            case 3:
                BinderC1181j0 binderC1181j02 = this.f14102r;
                binderC1181j02.d.a0();
                binderC1181j02.d.O(this.f14103s);
                return;
            case 4:
                BinderC1181j0 binderC1181j03 = this.f14102r;
                binderC1181j03.d.a0();
                q1 q1Var4 = binderC1181j03.d;
                q1Var4.d().D();
                q1Var4.b0();
                m1 m1Var2 = this.f14103s;
                g3.n.c(m1Var2.f14143q);
                if (q1Var4.R().O(null, AbstractC1203v.f14281L0)) {
                    q1Var4.U(m1Var2);
                    q1Var4.S(m1Var2);
                    return;
                }
                C1198s0 d = C1198s0.d(m1Var2.f14132L, m1Var2.f14137Q);
                String str = m1Var2.f14143q;
                C1198s0 I6 = q1Var4.I(str);
                q1Var4.b().f13803D.b(str, d, "Setting storage consent, package, consent");
                q1Var4.t(str, d);
                C0408c3.a();
                if (!q1Var4.R().O(null, AbstractC1203v.f14313b1) && d.l(I6)) {
                    q1Var4.Q(m1Var2);
                }
                C1188n c5 = C1188n.c(m1Var2.f14138R);
                if (!C1188n.f.equals(c5)) {
                    q1Var4.b().f13803D.b(str, c5, "Setting DMA consent. package, consent");
                    q1Var4.s(str, c5);
                    return;
                }
                return;
            default:
                BinderC1181j0 binderC1181j04 = this.f14102r;
                binderC1181j04.d.a0();
                binderC1181j04.d.Q(this.f14103s);
                return;
        }
    }

    public /* synthetic */ RunnableC1183k0(BinderC1181j0 binderC1181j0, m1 m1Var, int i7) {
        this.f14101q = i7;
        this.f14103s = m1Var;
        this.f14102r = binderC1181j0;
    }
}
