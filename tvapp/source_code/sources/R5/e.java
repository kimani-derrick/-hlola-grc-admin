package R5;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class e implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final long f2933q;

    /* renamed from: r  reason: collision with root package name */
    public final long f2934r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2935s;

    /* renamed from: t  reason: collision with root package name */
    public long f2936t;

    public e(long j7, long j8, long j9) {
        this.f2933q = j9;
        this.f2934r = j8;
        boolean z7 = false;
        if (j9 <= 0 ? j7 >= j8 : j7 <= j8) {
            z7 = true;
        }
        this.f2935s = z7;
        this.f2936t = z7 ? j7 : j8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2935s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j7 = this.f2936t;
        if (j7 == this.f2934r) {
            if (this.f2935s) {
                this.f2935s = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f2936t = this.f2933q + j7;
        }
        return Long.valueOf(j7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
