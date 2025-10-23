package e2;
/* loaded from: classes.dex */
public final class H0 implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9547A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f9548B;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9549x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9550y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9551z;

    /* renamed from: q  reason: collision with root package name */
    public Object f9552q;

    /* renamed from: r  reason: collision with root package name */
    public Object f9553r;

    /* renamed from: s  reason: collision with root package name */
    public int f9554s;

    /* renamed from: t  reason: collision with root package name */
    public long f9555t;

    /* renamed from: u  reason: collision with root package name */
    public long f9556u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9557v;

    /* renamed from: w  reason: collision with root package name */
    public I2.b f9558w = I2.b.f1233w;

    static {
        int i7 = Z2.H.f4603a;
        f9549x = Integer.toString(0, 36);
        f9550y = Integer.toString(1, 36);
        f9551z = Integer.toString(2, 36);
        f9547A = Integer.toString(3, 36);
        f9548B = Integer.toString(4, 36);
    }

    public final long a(int i7, int i8) {
        I2.a a7 = this.f9558w.a(i7);
        if (a7.f1223r != -1) {
            return a7.f1227v[i8];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(long r10) {
        /*
            r9 = this;
            I2.b r0 = r9.f9558w
            long r1 = r9.f9555t
            r0.getClass()
            r3 = -9223372036854775808
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r6 = -1
            if (r5 == 0) goto L4b
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L1c
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L1c
            goto L4b
        L1c:
            int r1 = r0.f1241u
        L1e:
            int r2 = r0.f1238r
            if (r1 >= r2) goto L48
            I2.a r5 = r0.a(r1)
            long r7 = r5.f1222q
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L36
            I2.a r5 = r0.a(r1)
            long r7 = r5.f1222q
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 <= 0) goto L45
        L36:
            I2.a r5 = r0.a(r1)
            int r7 = r5.f1223r
            if (r7 == r6) goto L48
            int r5 = r5.a(r6)
            if (r5 >= r7) goto L45
            goto L48
        L45:
            int r1 = r1 + 1
            goto L1e
        L48:
            if (r1 >= r2) goto L4b
            r6 = r1
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.H0.b(long):int");
    }

    public final int c(long j7) {
        I2.b bVar = this.f9558w;
        long j8 = this.f9555t;
        int i7 = bVar.f1238r - 1;
        int i8 = i7 - (bVar.b(i7) ? 1 : 0);
        while (i8 >= 0 && j7 != Long.MIN_VALUE) {
            I2.a a7 = bVar.a(i8);
            long j9 = a7.f1222q;
            if (j9 == Long.MIN_VALUE) {
                if (j8 != -9223372036854775807L && ((!a7.f1229x || a7.f1223r != -1) && j7 >= j8)) {
                    break;
                }
                i8--;
            } else if (j7 >= j9) {
                break;
            } else {
                i8--;
            }
        }
        if (i8 >= 0) {
            I2.a a8 = bVar.a(i8);
            int i9 = a8.f1223r;
            if (i9 != -1) {
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = a8.f1226u[i10];
                    if (i11 == 0 || i11 == 1) {
                        return i8;
                    }
                }
            } else {
                return i8;
            }
        }
        return -1;
    }

    public final long d(int i7) {
        return this.f9558w.a(i7).f1222q;
    }

    public final int e(int i7, int i8) {
        I2.a a7 = this.f9558w.a(i7);
        if (a7.f1223r != -1) {
            return a7.f1226u[i8];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !H0.class.equals(obj.getClass())) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (Z2.H.a(this.f9552q, h02.f9552q) && Z2.H.a(this.f9553r, h02.f9553r) && this.f9554s == h02.f9554s && this.f9555t == h02.f9555t && this.f9556u == h02.f9556u && this.f9557v == h02.f9557v && Z2.H.a(this.f9558w, h02.f9558w)) {
            return true;
        }
        return false;
    }

    public final int f(int i7) {
        return this.f9558w.a(i7).a(-1);
    }

    public final long g() {
        return this.f9556u;
    }

    public final boolean h(int i7) {
        I2.b bVar = this.f9558w;
        if (i7 == bVar.f1238r - 1 && bVar.b(i7)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f9552q;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = (217 + hashCode) * 31;
        Object obj2 = this.f9553r;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        long j7 = this.f9555t;
        long j8 = this.f9556u;
        return this.f9558w.hashCode() + ((((((((((i8 + i7) * 31) + this.f9554s) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f9557v ? 1 : 0)) * 31);
    }

    public final boolean i(int i7) {
        return this.f9558w.a(i7).f1229x;
    }

    public final void j(Object obj, Object obj2, int i7, long j7, long j8, I2.b bVar, boolean z7) {
        this.f9552q = obj;
        this.f9553r = obj2;
        this.f9554s = i7;
        this.f9555t = j7;
        this.f9556u = j8;
        this.f9558w = bVar;
        this.f9557v = z7;
    }
}
