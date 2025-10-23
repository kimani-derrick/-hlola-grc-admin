package W2;

import O3.AbstractC0079x;
import e2.K;
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f3804q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f3805r;

    public f(K k5, int i7) {
        this.f3804q = (k5.f9679t & 1) != 0;
        this.f3805r = o.g(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return AbstractC0079x.f2710a.c(this.f3805r, fVar.f3805r).c(this.f3804q, fVar.f3804q).e();
    }
}
