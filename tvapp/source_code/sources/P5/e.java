package P5;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: q  reason: collision with root package name */
    public static final d f2815q = new e();

    /* renamed from: r  reason: collision with root package name */
    public static final a f2816r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [P5.e, P5.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [P5.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        c cVar;
        Integer num = I5.a.f1266a;
        if (num != null && num.intValue() < 34) {
            cVar = new c();
        } else {
            cVar = new e();
        }
        f2816r = cVar;
    }

    public abstract int a(int i7);

    public abstract int b();

    public abstract long c();

    public long d(long j7) {
        long c5;
        long j8;
        int b7;
        if (j7 > 0) {
            if (j7 > 0) {
                if (((-j7) & j7) == j7) {
                    int i7 = (int) j7;
                    int i8 = (int) (j7 >>> 32);
                    if (i7 != 0) {
                        b7 = a(31 - Integer.numberOfLeadingZeros(i7));
                    } else if (i8 == 1) {
                        b7 = b();
                    } else {
                        return (a(31 - Integer.numberOfLeadingZeros(i8)) << 32) + (b() & 4294967295L);
                    }
                    return b7 & 4294967295L;
                }
                do {
                    c5 = c() >>> 1;
                    j8 = c5 % j7;
                } while ((j7 - 1) + (c5 - j8) < 0);
                return j8;
            }
            while (true) {
                long c6 = c();
                if (0 <= c6 && c6 < j7) {
                    return c6;
                }
            }
        } else {
            Long valueOf = Long.valueOf(j7);
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0L) + ", " + valueOf + ").").toString());
        }
    }
}
