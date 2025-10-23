package N3;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class k implements Iterator {

    /* renamed from: r  reason: collision with root package name */
    public String f2502r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f2503s;

    /* renamed from: t  reason: collision with root package name */
    public final b f2504t;

    /* renamed from: w  reason: collision with root package name */
    public int f2507w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ T4.c f2508x;

    /* renamed from: q  reason: collision with root package name */
    public int f2501q = 2;

    /* renamed from: v  reason: collision with root package name */
    public int f2506v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2505u = false;

    public k(T4.c cVar, C.d dVar, CharSequence charSequence) {
        this.f2508x = cVar;
        this.f2504t = (b) dVar.f325s;
        this.f2507w = dVar.f324r;
        this.f2503s = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        r6 = r9.f2504t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r0 >= r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r6.b(r7.charAt(r0)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r1 <= r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r6.b(r7.charAt(r1 - 1)) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r9.f2505u == false) goto L58;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r9 = this;
            int r0 = r9.f2501q
            r1 = 4
            if (r0 == r1) goto La4
            int r0 = s.h.b(r0)
            r2 = 1
            if (r0 == 0) goto La3
            r3 = 2
            r4 = 0
            if (r0 == r3) goto La2
            r9.f2501q = r1
        L12:
            int r0 = r9.f2506v
        L14:
            int r1 = r9.f2506v
            r3 = -1
            r5 = 3
            if (r1 == r3) goto L94
            T4.c r6 = r9.f2508x
            java.lang.Object r6 = r6.f3382r
            N3.b r6 = (N3.b) r6
            java.lang.CharSequence r7 = r9.f2503s
            int r1 = r6.a(r1, r7)
            if (r1 != r3) goto L2f
            int r1 = r7.length()
            r9.f2506v = r3
            goto L33
        L2f:
            int r6 = r1 + 1
            r9.f2506v = r6
        L33:
            int r6 = r9.f2506v
            if (r6 != r0) goto L44
            int r6 = r6 + 1
            r9.f2506v = r6
            int r1 = r7.length()
            if (r6 <= r1) goto L14
            r9.f2506v = r3
            goto L14
        L44:
            N3.b r6 = r9.f2504t
            if (r0 >= r1) goto L55
            char r8 = r7.charAt(r0)
            boolean r8 = r6.b(r8)
            if (r8 == 0) goto L55
            int r0 = r0 + 1
            goto L44
        L55:
            if (r1 <= r0) goto L66
            int r8 = r1 + (-1)
            char r8 = r7.charAt(r8)
            boolean r8 = r6.b(r8)
            if (r8 == 0) goto L66
            int r1 = r1 + (-1)
            goto L55
        L66:
            boolean r8 = r9.f2505u
            if (r8 == 0) goto L6d
            if (r0 != r1) goto L6d
            goto L12
        L6d:
            int r8 = r9.f2507w
            if (r8 != r2) goto L88
            int r1 = r7.length()
            r9.f2506v = r3
        L77:
            if (r1 <= r0) goto L8b
            int r3 = r1 + (-1)
            char r3 = r7.charAt(r3)
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L8b
            int r1 = r1 + (-1)
            goto L77
        L88:
            int r8 = r8 - r2
            r9.f2507w = r8
        L8b:
            java.lang.CharSequence r0 = r7.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L97
        L94:
            r9.f2501q = r5
            r0 = 0
        L97:
            r9.f2502r = r0
            int r0 = r9.f2501q
            if (r0 == r5) goto La0
            r9.f2501q = r2
            goto La1
        La0:
            r2 = r4
        La1:
            return r2
        La2:
            return r4
        La3:
            return r2
        La4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.k.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2501q = 2;
            String str = this.f2502r;
            this.f2502r = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
