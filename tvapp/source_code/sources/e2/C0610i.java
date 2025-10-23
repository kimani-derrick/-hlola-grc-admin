package e2;

import Z2.AbstractC0156a;
/* renamed from: e2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610i {

    /* renamed from: a  reason: collision with root package name */
    public final Y2.r f9980a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9981b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9982c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9983e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9984g;

    /* renamed from: h  reason: collision with root package name */
    public int f9985h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9986i;

    public C0610i() {
        Y2.r rVar = new Y2.r();
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f9980a = rVar;
        long j7 = 50000;
        this.f9981b = Z2.H.J(j7);
        this.f9982c = Z2.H.J(j7);
        this.d = Z2.H.J(2500);
        this.f9983e = Z2.H.J(5000);
        this.f = -1;
        this.f9985h = 13107200;
        this.f9984g = Z2.H.J(0);
    }

    public static void a(int i7, int i8, String str, String str2) {
        boolean z7;
        if (i7 >= i8) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.e(str + " cannot be less than " + str2, z7);
    }

    public final void b(boolean z7) {
        int i7 = this.f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        this.f9985h = i7;
        this.f9986i = false;
        if (z7) {
            Y2.r rVar = this.f9980a;
            synchronized (rVar) {
                if (rVar.f4430a) {
                    rVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j7, float f) {
        int i7;
        boolean z7;
        Y2.r rVar = this.f9980a;
        synchronized (rVar) {
            i7 = rVar.d * rVar.f4431b;
        }
        if (i7 >= this.f9985h) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j8 = this.f9982c;
        long j9 = this.f9981b;
        if (i8 > 0) {
            j9 = Math.min(Z2.H.v(j9, f), j8);
        }
        if (j7 < Math.max(j9, 500000L)) {
            boolean z8 = !z7;
            this.f9986i = z8;
            if (!z8 && j7 < 500000) {
                AbstractC0156a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j7 >= j8 || z7) {
            this.f9986i = false;
        }
        return this.f9986i;
    }
}
