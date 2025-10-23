package o6;

import v6.C1341f;
import v6.H;
/* loaded from: classes.dex */
public final class x implements v6.D {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f13082q;

    /* renamed from: r  reason: collision with root package name */
    public final C1341f f13083r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f13084s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ A f13085t;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, v6.f] */
    public x(A a7, boolean z7) {
        M5.g.f(a7, "this$0");
        this.f13085t = a7;
        this.f13082q = z7;
        this.f13083r = new Object();
    }

    public final void a(boolean z7) {
        long min;
        boolean z8;
        boolean z9;
        A a7 = this.f13085t;
        synchronized (a7) {
            a7.f12969l.h();
            while (a7.f12963e >= a7.f && !this.f13082q && !this.f13084s && a7.f() == null) {
                a7.l();
            }
            a7.f12969l.l();
            a7.b();
            min = Math.min(a7.f - a7.f12963e, this.f13083r.f15388r);
            a7.f12963e += min;
            if (z7) {
                if (min == this.f13083r.f15388r) {
                    z8 = true;
                    z9 = z8;
                }
            }
            z8 = false;
            z9 = z8;
        }
        this.f13085t.f12969l.h();
        try {
            A a8 = this.f13085t;
            a8.f12961b.x(a8.f12960a, z9, this.f13083r, min);
        } finally {
            this.f13085t.f12969l.l();
        }
    }

    @Override // v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        A a7 = this.f13085t;
        byte[] bArr = i6.b.f11390a;
        synchronized (a7) {
            if (this.f13084s) {
                return;
            }
            if (a7.f() == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            A a8 = this.f13085t;
            if (!a8.f12967j.f13082q) {
                if (this.f13083r.f15388r > 0) {
                    while (this.f13083r.f15388r > 0) {
                        a(true);
                    }
                } else if (z7) {
                    a8.f12961b.x(a8.f12960a, true, null, 0L);
                }
            }
            synchronized (this.f13085t) {
                this.f13084s = true;
            }
            this.f13085t.f12961b.flush();
            this.f13085t.a();
        }
    }

    @Override // v6.D
    public final H d() {
        return this.f13085t.f12969l;
    }

    @Override // v6.D, java.io.Flushable
    public final void flush() {
        A a7 = this.f13085t;
        byte[] bArr = i6.b.f11390a;
        synchronized (a7) {
            a7.b();
        }
        while (this.f13083r.f15388r > 0) {
            a(false);
            this.f13085t.f12961b.flush();
        }
    }

    @Override // v6.D
    public final void v(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "source");
        byte[] bArr = i6.b.f11390a;
        C1341f c1341f2 = this.f13083r;
        c1341f2.v(c1341f, j7);
        while (c1341f2.f15388r >= 16384) {
            a(false);
        }
    }
}
