package s3;

import o.C1052e;
/* renamed from: s3.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1194q implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14178q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f14179r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f14180s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C1164b f14181t;

    public /* synthetic */ RunnableC1194q(C1164b c1164b, String str, long j7, int i7) {
        this.f14178q = i7;
        this.f14179r = str;
        this.f14180s = j7;
        this.f14181t = c1164b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14178q) {
            case 0:
                C1164b c1164b = this.f14181t;
                c1164b.D();
                String str = this.f14179r;
                g3.n.c(str);
                C1052e c1052e = c1164b.f13963s;
                Integer num = (Integer) c1052e.get(str);
                if (num != null) {
                    O0 L6 = c1164b.F().L(false);
                    int intValue = num.intValue() - 1;
                    if (intValue == 0) {
                        c1052e.remove(str);
                        C1052e c1052e2 = c1164b.f13962r;
                        Long l7 = (Long) c1052e2.get(str);
                        long j7 = this.f14180s;
                        if (l7 == null) {
                            c1164b.b().f13807v.d("First ad unit exposure time was never set");
                        } else {
                            c1052e2.remove(str);
                            c1164b.K(str, j7 - l7.longValue(), L6);
                        }
                        if (c1052e.isEmpty()) {
                            long j8 = c1164b.f13964t;
                            if (j8 == 0) {
                                c1164b.b().f13807v.d("First ad exposure time was never set");
                                return;
                            }
                            c1164b.J(j7 - j8, L6);
                            c1164b.f13964t = 0L;
                            return;
                        }
                        return;
                    }
                    c1052e.put(str, Integer.valueOf(intValue));
                    return;
                }
                c1164b.b().f13807v.c(str, "Call to endAdUnitExposure for unknown ad unit id");
                return;
            default:
                C1164b c1164b2 = this.f14181t;
                c1164b2.D();
                String str2 = this.f14179r;
                g3.n.c(str2);
                C1052e c1052e3 = c1164b2.f13963s;
                boolean isEmpty = c1052e3.isEmpty();
                long j9 = this.f14180s;
                if (isEmpty) {
                    c1164b2.f13964t = j9;
                }
                Integer num2 = (Integer) c1052e3.get(str2);
                if (num2 != null) {
                    c1052e3.put(str2, Integer.valueOf(num2.intValue() + 1));
                    return;
                } else if (c1052e3.f12809s >= 100) {
                    c1164b2.b().f13810y.d("Too many ads visible");
                    return;
                } else {
                    c1052e3.put(str2, 1);
                    c1164b2.f13962r.put(str2, Long.valueOf(j9));
                    return;
                }
        }
    }
}
