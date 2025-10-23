package k2;

import Z2.H;
/* renamed from: k2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937b {

    /* renamed from: a  reason: collision with root package name */
    public final long f12145a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12146b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12147c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f12148e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f12149g;

    /* renamed from: h  reason: collision with root package name */
    public long f12150h;

    public C0937b(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f12145a = j7;
        this.f12146b = j8;
        this.d = j9;
        this.f12148e = j10;
        this.f = j11;
        this.f12149g = j12;
        this.f12147c = j13;
        this.f12150h = a(j8, j9, j10, j11, j12, j13);
    }

    public static long a(long j7, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 < j11 && j8 + 1 < j9) {
            long j13 = ((float) (j7 - j8)) * (((float) (j11 - j10)) / ((float) (j9 - j8)));
            return H.k(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
        }
        return j10;
    }
}
