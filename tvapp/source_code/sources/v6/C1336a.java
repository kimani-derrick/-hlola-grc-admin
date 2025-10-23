package v6;

import a.AbstractC0189a;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: v6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336a implements D {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15372q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f15373r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f15374s;

    public /* synthetic */ C1336a(Object obj, int i7, Object obj2) {
        this.f15372q = i7;
        this.f15373r = obj;
        this.f15374s = obj2;
    }

    @Override // v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f15372q) {
            case 0:
                D d = (D) this.f15374s;
                C1338c c1338c = (C1338c) this.f15373r;
                c1338c.h();
                try {
                    d.close();
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
                ((OutputStream) this.f15373r).close();
                return;
        }
    }

    @Override // v6.D
    public final H d() {
        switch (this.f15372q) {
            case 0:
                return (C1338c) this.f15373r;
            default:
                return (H) this.f15374s;
        }
    }

    @Override // v6.D, java.io.Flushable
    public final void flush() {
        switch (this.f15372q) {
            case 0:
                D d = (D) this.f15374s;
                C1338c c1338c = (C1338c) this.f15373r;
                c1338c.h();
                try {
                    d.flush();
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
                ((OutputStream) this.f15373r).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f15372q) {
            case 0:
                return "AsyncTimeout.sink(" + ((D) this.f15374s) + ')';
            default:
                return "sink(" + ((OutputStream) this.f15373r) + ')';
        }
    }

    @Override // v6.D
    public final void v(C1341f c1341f, long j7) {
        switch (this.f15372q) {
            case 0:
                M5.g.f(c1341f, "source");
                AbstractC0189a.m(c1341f.f15388r, 0L, j7);
                while (true) {
                    long j8 = 0;
                    if (j7 > 0) {
                        A a7 = c1341f.f15387q;
                        while (true) {
                            M5.g.c(a7);
                            if (j8 < 65536) {
                                j8 += a7.f15356c - a7.f15355b;
                                if (j8 >= j7) {
                                    j8 = j7;
                                } else {
                                    a7 = a7.f;
                                }
                            }
                        }
                        D d = (D) this.f15374s;
                        C1338c c1338c = (C1338c) this.f15373r;
                        c1338c.h();
                        try {
                            d.v(c1341f, j8);
                            if (!c1338c.i()) {
                                j7 -= j8;
                            } else {
                                throw c1338c.j(null);
                            }
                        } catch (IOException e3) {
                            if (!c1338c.i()) {
                                throw e3;
                            }
                            throw c1338c.j(e3);
                        } finally {
                            c1338c.i();
                        }
                    } else {
                        return;
                    }
                }
            default:
                M5.g.f(c1341f, "source");
                AbstractC0189a.m(c1341f.f15388r, 0L, j7);
                while (j7 > 0) {
                    ((H) this.f15374s).f();
                    A a8 = c1341f.f15387q;
                    M5.g.c(a8);
                    int min = (int) Math.min(j7, a8.f15356c - a8.f15355b);
                    ((OutputStream) this.f15373r).write(a8.f15354a, a8.f15355b, min);
                    int i7 = a8.f15355b + min;
                    a8.f15355b = i7;
                    long j9 = min;
                    j7 -= j9;
                    c1341f.f15388r -= j9;
                    if (i7 == a8.f15356c) {
                        c1341f.f15387q = a8.a();
                        B.a(a8);
                    }
                }
                return;
        }
    }
}
