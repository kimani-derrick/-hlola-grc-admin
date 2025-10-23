package v6;

import java.io.IOException;
import java.io.InputStream;
import r0.AbstractC1111a;
/* renamed from: v6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337b implements F {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15375q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final Object f15376r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f15377s;

    public C1337b(InputStream inputStream, H h7) {
        M5.g.f(inputStream, "input");
        this.f15376r = inputStream;
        this.f15377s = h7;
    }

    @Override // v6.F
    public final long L(C1341f c1341f, long j7) {
        switch (this.f15375q) {
            case 0:
                M5.g.f(c1341f, "sink");
                F f = (F) this.f15377s;
                C1338c c1338c = (C1338c) this.f15376r;
                c1338c.h();
                try {
                    long L6 = f.L(c1341f, j7);
                    if (!c1338c.i()) {
                        return L6;
                    }
                    throw c1338c.j(null);
                } catch (IOException e3) {
                    if (!c1338c.i()) {
                        throw e3;
                    }
                    throw c1338c.j(e3);
                } finally {
                    c1338c.i();
                }
            default:
                M5.g.f(c1341f, "sink");
                int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
                if (i7 == 0) {
                    return 0L;
                }
                if (i7 >= 0) {
                    try {
                        ((H) this.f15377s).f();
                        A e02 = c1341f.e0(1);
                        int read = ((InputStream) this.f15376r).read(e02.f15354a, e02.f15356c, (int) Math.min(j7, 8192 - e02.f15356c));
                        if (read == -1) {
                            if (e02.f15355b == e02.f15356c) {
                                c1341f.f15387q = e02.a();
                                B.a(e02);
                            }
                            return -1L;
                        }
                        e02.f15356c += read;
                        long j8 = read;
                        c1341f.f15388r += j8;
                        return j8;
                    } catch (AssertionError e7) {
                        if (p6.l.y(e7)) {
                            throw new IOException(e7);
                        }
                        throw e7;
                    }
                }
                throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount < 0: ").toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f15375q) {
            case 0:
                F f = (F) this.f15377s;
                C1338c c1338c = (C1338c) this.f15376r;
                c1338c.h();
                try {
                    f.close();
                    if (!c1338c.i()) {
                        return;
                    }
                    throw c1338c.j(null);
                } catch (IOException e3) {
                    if (!c1338c.i()) {
                        throw e3;
                    }
                    throw c1338c.j(e3);
                } finally {
                    c1338c.i();
                }
            default:
                ((InputStream) this.f15376r).close();
                return;
        }
    }

    @Override // v6.F
    public final H d() {
        switch (this.f15375q) {
            case 0:
                return (C1338c) this.f15376r;
            default:
                return (H) this.f15377s;
        }
    }

    public final String toString() {
        switch (this.f15375q) {
            case 0:
                return "AsyncTimeout.source(" + ((F) this.f15377s) + ')';
            default:
                return "source(" + ((InputStream) this.f15376r) + ')';
        }
    }

    public C1337b(E e3, C1337b c1337b) {
        this.f15376r = e3;
        this.f15377s = c1337b;
    }
}
