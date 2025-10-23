package e2;
/* renamed from: e2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608h {

    /* renamed from: a  reason: collision with root package name */
    public final long f9964a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9965b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9966c;
    public long d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f9967e = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f9968g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f9969h = -9223372036854775807L;

    /* renamed from: k  reason: collision with root package name */
    public float f9972k = 0.97f;

    /* renamed from: j  reason: collision with root package name */
    public float f9971j = 1.03f;

    /* renamed from: l  reason: collision with root package name */
    public float f9973l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public long f9974m = -9223372036854775807L;
    public long f = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    public long f9970i = -9223372036854775807L;
    public long n = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public long f9975o = -9223372036854775807L;

    public C0608h(long j7, long j8, float f) {
        this.f9964a = j7;
        this.f9965b = j8;
        this.f9966c = f;
    }

    public final void a() {
        long j7 = this.d;
        if (j7 != -9223372036854775807L) {
            long j8 = this.f9967e;
            if (j8 != -9223372036854775807L) {
                j7 = j8;
            }
            long j9 = this.f9968g;
            if (j9 != -9223372036854775807L && j7 < j9) {
                j7 = j9;
            }
            long j10 = this.f9969h;
            if (j10 != -9223372036854775807L && j7 > j10) {
                j7 = j10;
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f == j7) {
            return;
        }
        this.f = j7;
        this.f9970i = j7;
        this.n = -9223372036854775807L;
        this.f9975o = -9223372036854775807L;
        this.f9974m = -9223372036854775807L;
    }
}
