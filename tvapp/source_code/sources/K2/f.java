package K2;

import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class f implements J2.c {

    /* renamed from: q  reason: collision with root package name */
    public final long f1658q;

    /* renamed from: r  reason: collision with root package name */
    public long f1659r = -1;

    /* renamed from: s  reason: collision with root package name */
    public final List f1660s;

    /* renamed from: t  reason: collision with root package name */
    public final long f1661t;

    public f(long j7, List list) {
        this.f1658q = list.size() - 1;
        this.f1661t = j7;
        this.f1660s = list;
    }

    @Override // J2.c
    public final long d() {
        long j7 = this.f1659r;
        if (j7 >= 0 && j7 <= this.f1658q) {
            L2.g gVar = (L2.g) this.f1660s.get((int) j7);
            return this.f1661t + gVar.f1960u + gVar.f1958s;
        }
        throw new NoSuchElementException();
    }

    @Override // J2.c
    public final long f() {
        long j7 = this.f1659r;
        if (j7 >= 0 && j7 <= this.f1658q) {
            return this.f1661t + ((L2.g) this.f1660s.get((int) j7)).f1960u;
        }
        throw new NoSuchElementException();
    }

    @Override // J2.c
    public final boolean next() {
        boolean z7;
        long j7 = this.f1659r + 1;
        this.f1659r = j7;
        if (j7 > this.f1658q) {
            z7 = true;
        } else {
            z7 = false;
        }
        return !z7;
    }
}
