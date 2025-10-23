package e2;

import a4.C0214f;
/* loaded from: classes.dex */
public abstract class O implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9709A;

    /* renamed from: B  reason: collision with root package name */
    public static final C0214f f9710B;

    /* renamed from: v  reason: collision with root package name */
    public static final P f9711v = new O(new N());

    /* renamed from: w  reason: collision with root package name */
    public static final String f9712w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9713x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9714y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9715z;

    /* renamed from: q  reason: collision with root package name */
    public final long f9716q;

    /* renamed from: r  reason: collision with root package name */
    public final long f9717r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9718s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9719t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f9720u;

    /* JADX WARN: Type inference failed for: r1v0, types: [e2.O, e2.P] */
    static {
        int i7 = Z2.H.f4603a;
        f9712w = Integer.toString(0, 36);
        f9713x = Integer.toString(1, 36);
        f9714y = Integer.toString(2, 36);
        f9715z = Integer.toString(3, 36);
        f9709A = Integer.toString(4, 36);
        f9710B = new C0214f(10);
    }

    public O(N n) {
        this.f9716q = n.f9705a;
        this.f9717r = n.f9706b;
        this.f9718s = n.f9707c;
        this.f9719t = n.d;
        this.f9720u = n.f9708e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        if (this.f9716q == o7.f9716q && this.f9717r == o7.f9717r && this.f9718s == o7.f9718s && this.f9719t == o7.f9719t && this.f9720u == o7.f9720u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f9716q;
        long j8 = this.f9717r;
        return (((((((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31) + (this.f9718s ? 1 : 0)) * 31) + (this.f9719t ? 1 : 0)) * 31) + (this.f9720u ? 1 : 0);
    }
}
