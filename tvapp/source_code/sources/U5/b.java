package U5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public int f3477q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f3478r;

    /* renamed from: s  reason: collision with root package name */
    public int f3479s;

    /* renamed from: t  reason: collision with root package name */
    public R5.c f3480t;

    /* renamed from: u  reason: collision with root package name */
    public int f3481u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f3482v;

    public b(c cVar) {
        this.f3482v = cVar;
        int i7 = cVar.f3484b;
        int length = cVar.f3483a.length();
        if (length >= 0) {
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > length) {
                i7 = length;
            }
            this.f3478r = i7;
            this.f3479s = i7;
            return;
        }
        throw new IllegalArgumentException(AbstractC1111a.n(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r6 < r3) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f3479s
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f3477q = r1
            r0 = 0
            r7.f3480t = r0
            goto L77
        Lb:
            U5.c r2 = r7.f3482v
            int r3 = r2.f3485c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f3481u
            int r6 = r6 + r5
            r7.f3481u = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f3483a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            R5.c r0 = new R5.c
            int r1 = r7.f3478r
            java.lang.CharSequence r2 = r2.f3483a
            int r2 = U5.f.f0(r2)
            r0.<init>(r1, r2, r5)
        L2f:
            r7.f3480t = r0
            r7.f3479s = r4
            goto L75
        L34:
            L5.p r0 = r2.d
            java.lang.CharSequence r3 = r2.f3483a
            int r6 = r7.f3479s
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.j(r3, r6)
            z5.f r0 = (z5.C1524f) r0
            if (r0 != 0) goto L54
            R5.c r0 = new R5.c
            int r1 = r7.f3478r
            java.lang.CharSequence r2 = r2.f3483a
            int r2 = U5.f.f0(r2)
            r0.<init>(r1, r2, r5)
            goto L2f
        L54:
            java.lang.Object r2 = r0.f16468q
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f16469r
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f3478r
            R5.c r3 = w4.l0.W(r3, r2)
            r7.f3480t = r3
            int r2 = r2 + r0
            r7.f3478r = r2
            if (r0 != 0) goto L72
            r1 = r5
        L72:
            int r2 = r2 + r1
            r7.f3479s = r2
        L75:
            r7.f3477q = r5
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3477q == -1) {
            a();
        }
        if (this.f3477q == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3477q == -1) {
            a();
        }
        if (this.f3477q != 0) {
            R5.c cVar = this.f3480t;
            M5.g.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f3480t = null;
            this.f3477q = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
