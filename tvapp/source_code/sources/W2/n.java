package W2;

import O3.AbstractC0079x;
import O3.C0077v;
import O3.S;
import O3.T;
import O3.b0;
import Z2.H;
/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: A  reason: collision with root package name */
    public final int f3851A;

    /* renamed from: B  reason: collision with root package name */
    public final int f3852B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f3853C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f3854D;

    /* renamed from: E  reason: collision with root package name */
    public final int f3855E;
    public final boolean F;

    /* renamed from: G  reason: collision with root package name */
    public final boolean f3856G;

    /* renamed from: H  reason: collision with root package name */
    public final int f3857H;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f3858u;

    /* renamed from: v  reason: collision with root package name */
    public final h f3859v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f3860w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f3861x;

    /* renamed from: y  reason: collision with root package name */
    public final int f3862y;

    /* renamed from: z  reason: collision with root package name */
    public final int f3863z;

    /* JADX WARN: Removed duplicated region for block: B:105:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(int r5, H2.m0 r6, int r7, W2.h r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.n.<init>(int, H2.m0, int, W2.h, int, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        T a7;
        T t5;
        if (nVar.f3858u && nVar.f3861x) {
            a7 = o.f3864j;
        } else {
            a7 = o.f3864j.a();
        }
        C0077v c0077v = AbstractC0079x.f2710a;
        int i7 = nVar.f3862y;
        Integer valueOf = Integer.valueOf(i7);
        Integer valueOf2 = Integer.valueOf(nVar2.f3862y);
        if (nVar.f3859v.f3918M) {
            t5 = o.f3864j.a();
        } else {
            t5 = o.f3865k;
        }
        return c0077v.b(valueOf, valueOf2, t5).b(Integer.valueOf(nVar.f3863z), Integer.valueOf(nVar2.f3863z), a7).b(Integer.valueOf(i7), Integer.valueOf(nVar2.f3862y), a7).e();
    }

    public static int d(n nVar, n nVar2) {
        AbstractC0079x c5 = AbstractC0079x.f2710a.c(nVar.f3861x, nVar2.f3861x).a(nVar.f3852B, nVar2.f3852B).c(nVar.f3853C, nVar2.f3853C).c(nVar.f3858u, nVar2.f3858u).c(nVar.f3860w, nVar2.f3860w);
        Integer valueOf = Integer.valueOf(nVar.f3851A);
        Integer valueOf2 = Integer.valueOf(nVar2.f3851A);
        S.f2620q.getClass();
        AbstractC0079x b7 = c5.b(valueOf, valueOf2, b0.f2654q);
        boolean z7 = nVar2.F;
        boolean z8 = nVar.F;
        AbstractC0079x c6 = b7.c(z8, z7);
        boolean z9 = nVar2.f3856G;
        boolean z10 = nVar.f3856G;
        AbstractC0079x c7 = c6.c(z10, z9);
        if (z8 && z10) {
            c7 = c7.a(nVar.f3857H, nVar2.f3857H);
        }
        return c7.e();
    }

    @Override // W2.m
    public final int a() {
        return this.f3855E;
    }

    @Override // W2.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (this.f3854D || H.a(this.f3850t.f9655B, nVar.f3850t.f9655B)) {
            if (!this.f3859v.f3825T) {
                if (this.F != nVar.F || this.f3856G != nVar.f3856G) {
                }
            }
            return true;
        }
        return false;
    }
}
