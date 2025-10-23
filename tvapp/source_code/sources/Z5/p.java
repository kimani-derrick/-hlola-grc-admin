package Z5;

import W5.C0100g;
import W5.I;
/* loaded from: classes.dex */
public final class p implements I {

    /* renamed from: q  reason: collision with root package name */
    public final r f4919q;

    /* renamed from: r  reason: collision with root package name */
    public final long f4920r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f4921s;

    /* renamed from: t  reason: collision with root package name */
    public final D5.d f4922t;

    public p(r rVar, long j7, Object obj, C0100g c0100g) {
        this.f4919q = rVar;
        this.f4920r = j7;
        this.f4921s = obj;
        this.f4922t = c0100g;
    }

    @Override // W5.I
    public final void d() {
        r rVar = this.f4919q;
        synchronized (rVar) {
            if (this.f4920r >= rVar.l()) {
                Object[] objArr = rVar.f4934w;
                M5.g.c(objArr);
                long j7 = this.f4920r;
                if (objArr[((int) j7) & (objArr.length - 1)] == this) {
                    s.c(objArr, j7, s.f4938a);
                    rVar.g();
                }
            }
        }
    }
}
