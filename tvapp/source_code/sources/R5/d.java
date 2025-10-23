package R5;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class d implements Iterable, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final long f2930q;

    /* renamed from: r  reason: collision with root package name */
    public final long f2931r;

    /* renamed from: s  reason: collision with root package name */
    public final long f2932s;

    public d(long j7, long j8) {
        this.f2930q = j7;
        if (j7 < j8) {
            long j9 = j8 % 1;
            long j10 = j7 % 1;
            long j11 = ((j9 < 0 ? j9 + 1 : j9) - (j10 < 0 ? j10 + 1 : j10)) % 1;
            j8 -= j11 < 0 ? j11 + 1 : j11;
        }
        this.f2931r = j8;
        this.f2932s = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f2930q, this.f2931r, this.f2932s);
    }
}
