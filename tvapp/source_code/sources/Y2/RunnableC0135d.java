package Y2;

import H2.A;
import O3.AbstractC0072p;
import f2.C0695a;
import java.util.HashMap;
import z4.C1518b;
/* renamed from: Y2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0135d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4384q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f4385r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f4386s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f4387t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f4388u;

    public /* synthetic */ RunnableC0135d(Object obj, int i7, long j7, long j8, int i8) {
        this.f4384q = i8;
        this.f4388u = obj;
        this.f4385r = i7;
        this.f4386s = j7;
        this.f4387t = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H2.A a7;
        Object obj = this.f4388u;
        switch (this.f4384q) {
            case 0:
                f2.f fVar = ((C0136e) obj).f4390b;
                C1518b c1518b = fVar.f10351t;
                if (((O3.E) c1518b.f16462b).isEmpty()) {
                    a7 = null;
                } else {
                    a7 = (H2.A) AbstractC0072p.i((O3.E) c1518b.f16462b);
                }
                final C0695a N6 = fVar.N(a7);
                final int i7 = this.f4385r;
                final long j7 = this.f4386s;
                final long j8 = this.f4387t;
                fVar.R(N6, 1006, new Z2.m(i7, j7, j8) { // from class: f2.e

                    /* renamed from: r  reason: collision with root package name */
                    public final /* synthetic */ int f10346r;

                    /* renamed from: s  reason: collision with root package name */
                    public final /* synthetic */ long f10347s;

                    @Override // Z2.m
                    public final void c(Object obj2) {
                        long longValue;
                        k kVar = (k) obj2;
                        kVar.getClass();
                        C0695a c0695a = C0695a.this;
                        A a8 = c0695a.d;
                        if (a8 != null) {
                            String d = kVar.f10371b.d(c0695a.f10335b, a8);
                            HashMap hashMap = kVar.f10375h;
                            Long l7 = (Long) hashMap.get(d);
                            HashMap hashMap2 = kVar.f10374g;
                            Long l8 = (Long) hashMap2.get(d);
                            long j9 = 0;
                            if (l7 == null) {
                                longValue = 0;
                            } else {
                                longValue = l7.longValue();
                            }
                            hashMap.put(d, Long.valueOf(longValue + this.f10347s));
                            if (l8 != null) {
                                j9 = l8.longValue();
                            }
                            hashMap2.put(d, Long.valueOf(j9 + this.f10346r));
                        }
                    }
                });
                return;
            default:
                a3.y yVar = (a3.y) obj;
                yVar.getClass();
                int i8 = Z2.H.f4603a;
                f2.f fVar2 = yVar.f5136c.f10095q.f9426H;
                C0695a Q4 = fVar2.Q();
                fVar2.R(Q4, 1011, new f2.b(Q4, this.f4385r, this.f4386s, this.f4387t));
                return;
        }
    }
}
