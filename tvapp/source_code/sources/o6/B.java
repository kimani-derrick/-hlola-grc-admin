package o6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import v6.C1341f;
import v6.InterfaceC1342g;
/* loaded from: classes.dex */
public final class B implements Closeable {

    /* renamed from: w  reason: collision with root package name */
    public static final Logger f12971w = Logger.getLogger(g.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1342g f12972q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f12973r;

    /* renamed from: s  reason: collision with root package name */
    public final C1341f f12974s;

    /* renamed from: t  reason: collision with root package name */
    public int f12975t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12976u;

    /* renamed from: v  reason: collision with root package name */
    public final C1076e f12977v;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, v6.f] */
    public B(InterfaceC1342g interfaceC1342g, boolean z7) {
        this.f12972q = interfaceC1342g;
        this.f12973r = z7;
        ?? obj = new Object();
        this.f12974s = obj;
        this.f12975t = 16384;
        this.f12977v = new C1076e(obj);
    }

    public final void O(long j7, int i7) {
        int i8;
        while (j7 > 0) {
            long min = Math.min(this.f12975t, j7);
            j7 -= min;
            int i9 = (int) min;
            if (j7 == 0) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            f(i7, i9, 9, i8);
            this.f12972q.v(this.f12974s, min);
        }
    }

    public final synchronized void a(E e3) {
        int i7;
        try {
            M5.g.f(e3, "peerSettings");
            if (!this.f12976u) {
                int i8 = this.f12975t;
                int i9 = e3.f12982a;
                if ((i9 & 32) != 0) {
                    i8 = e3.f12983b[5];
                }
                this.f12975t = i8;
                int i10 = -1;
                if ((i9 & 2) != 0) {
                    i7 = e3.f12983b[1];
                } else {
                    i7 = -1;
                }
                if (i7 != -1) {
                    C1076e c1076e = this.f12977v;
                    if ((i9 & 2) != 0) {
                        i10 = e3.f12983b[1];
                    }
                    c1076e.getClass();
                    int min = Math.min(i10, 16384);
                    int i11 = c1076e.f13008e;
                    if (i11 != min) {
                        if (min < i11) {
                            c1076e.f13007c = Math.min(c1076e.f13007c, min);
                        }
                        c1076e.d = true;
                        c1076e.f13008e = min;
                        int i12 = c1076e.f13011i;
                        if (min < i12) {
                            if (min == 0) {
                                A5.j.U(r6, 0, c1076e.f.length);
                                c1076e.f13009g = c1076e.f.length - 1;
                                c1076e.f13010h = 0;
                                c1076e.f13011i = 0;
                            } else {
                                c1076e.a(i12 - min);
                            }
                        }
                    }
                }
                f(0, 0, 4, 1);
                this.f12972q.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z7, int i7, C1341f c1341f, int i8) {
        if (!this.f12976u) {
            f(i7, i8, 0, z7 ? 1 : 0);
            if (i8 > 0) {
                M5.g.c(c1341f);
                this.f12972q.v(c1341f, i8);
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f12976u = true;
        this.f12972q.close();
    }

    public final void f(int i7, int i8, int i9, int i10) {
        Level level = Level.FINE;
        Logger logger = f12971w;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i7, i8, i9, i10));
        }
        if (i8 <= this.f12975t) {
            if ((Integer.MIN_VALUE & i7) == 0) {
                byte[] bArr = i6.b.f11390a;
                InterfaceC1342g interfaceC1342g = this.f12972q;
                M5.g.f(interfaceC1342g, "<this>");
                interfaceC1342g.N((i8 >>> 16) & 255);
                interfaceC1342g.N((i8 >>> 8) & 255);
                interfaceC1342g.N(i8 & 255);
                interfaceC1342g.N(i9 & 255);
                interfaceC1342g.N(i10 & 255);
                interfaceC1342g.w(i7 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(M5.g.k(Integer.valueOf(i7), "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f12975t + ": " + i8).toString());
    }

    public final synchronized void flush() {
        if (!this.f12976u) {
            this.f12972q.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(int i7, EnumC1073b enumC1073b, byte[] bArr) {
        try {
            if (!this.f12976u) {
                if (enumC1073b.f12992q != -1) {
                    boolean z7 = false;
                    f(0, bArr.length + 8, 7, 0);
                    this.f12972q.w(i7);
                    this.f12972q.w(enumC1073b.f12992q);
                    if (bArr.length == 0) {
                        z7 = true;
                    }
                    if (!z7) {
                        this.f12972q.e(bArr);
                    }
                    this.f12972q.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(boolean z7, int i7, ArrayList arrayList) {
        int i8;
        if (!this.f12976u) {
            this.f12977v.d(arrayList);
            long j7 = this.f12974s.f15388r;
            long min = Math.min(this.f12975t, j7);
            int i9 = (j7 > min ? 1 : (j7 == min ? 0 : -1));
            if (i9 == 0) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            if (z7) {
                i8 |= 1;
            }
            f(i7, (int) min, 1, i8);
            this.f12972q.v(this.f12974s, min);
            if (i9 > 0) {
                O(j7 - min, i7);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void n(int i7, int i8, boolean z7) {
        if (!this.f12976u) {
            f(0, 8, 6, z7 ? 1 : 0);
            this.f12972q.w(i7);
            this.f12972q.w(i8);
            this.f12972q.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void r(int i7, EnumC1073b enumC1073b) {
        M5.g.f(enumC1073b, "errorCode");
        if (!this.f12976u) {
            if (enumC1073b.f12992q != -1) {
                f(i7, 4, 3, 0);
                this.f12972q.w(enumC1073b.f12992q);
                this.f12972q.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void x(E e3) {
        int i7;
        try {
            M5.g.f(e3, "settings");
            if (!this.f12976u) {
                int i8 = 0;
                f(0, Integer.bitCount(e3.f12982a) * 6, 4, 0);
                while (i8 < 10) {
                    int i9 = i8 + 1;
                    if (((1 << i8) & e3.f12982a) != 0) {
                        if (i8 != 4) {
                            if (i8 != 7) {
                                i7 = i8;
                            } else {
                                i7 = 4;
                            }
                        } else {
                            i7 = 3;
                        }
                        this.f12972q.s(i7);
                        this.f12972q.w(e3.f12983b[i8]);
                    }
                    i8 = i9;
                }
                this.f12972q.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void y(long j7, int i7) {
        if (!this.f12976u) {
            if (j7 != 0 && j7 <= 2147483647L) {
                f(i7, 4, 8, 0);
                this.f12972q.w((int) j7);
                this.f12972q.flush();
            } else {
                throw new IllegalArgumentException(M5.g.k(Long.valueOf(j7), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
