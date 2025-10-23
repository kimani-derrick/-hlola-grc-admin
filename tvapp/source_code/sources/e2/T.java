package e2;

import a4.C0214f;
/* loaded from: classes.dex */
public final class T implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9742A;

    /* renamed from: B  reason: collision with root package name */
    public static final C0214f f9743B;

    /* renamed from: v  reason: collision with root package name */
    public static final T f9744v = new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: w  reason: collision with root package name */
    public static final String f9745w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9746x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9747y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9748z;

    /* renamed from: q  reason: collision with root package name */
    public final long f9749q;

    /* renamed from: r  reason: collision with root package name */
    public final long f9750r;

    /* renamed from: s  reason: collision with root package name */
    public final long f9751s;

    /* renamed from: t  reason: collision with root package name */
    public final float f9752t;

    /* renamed from: u  reason: collision with root package name */
    public final float f9753u;

    static {
        int i7 = Z2.H.f4603a;
        f9745w = Integer.toString(0, 36);
        f9746x = Integer.toString(1, 36);
        f9747y = Integer.toString(2, 36);
        f9748z = Integer.toString(3, 36);
        f9742A = Integer.toString(4, 36);
        f9743B = new C0214f(12);
    }

    public T(long j7, long j8, long j9, float f, float f7) {
        this.f9749q = j7;
        this.f9750r = j8;
        this.f9751s = j9;
        this.f9752t = f;
        this.f9753u = f7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e2.S] */
    public final S a() {
        ?? obj = new Object();
        obj.f9738a = this.f9749q;
        obj.f9739b = this.f9750r;
        obj.f9740c = this.f9751s;
        obj.d = this.f9752t;
        obj.f9741e = this.f9753u;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t5 = (T) obj;
        if (this.f9749q == t5.f9749q && this.f9750r == t5.f9750r && this.f9751s == t5.f9751s && this.f9752t == t5.f9752t && this.f9753u == t5.f9753u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j7 = this.f9749q;
        long j8 = this.f9750r;
        long j9 = this.f9751s;
        int i8 = ((((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31;
        float f = this.f9752t;
        int i9 = 0;
        if (f != 0.0f) {
            i7 = Float.floatToIntBits(f);
        } else {
            i7 = 0;
        }
        int i10 = (i8 + i7) * 31;
        float f7 = this.f9753u;
        if (f7 != 0.0f) {
            i9 = Float.floatToIntBits(f7);
        }
        return i10 + i9;
    }
}
