package o6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import v6.C1341f;
import v6.C1344i;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public static final Logger f13077u;

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1343h f13078q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f13079r;

    /* renamed from: s  reason: collision with root package name */
    public final v f13080s;

    /* renamed from: t  reason: collision with root package name */
    public final C1075d f13081t;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        M5.g.e(logger, "getLogger(Http2::class.java.name)");
        f13077u = logger;
    }

    public w(InterfaceC1343h interfaceC1343h, boolean z7) {
        this.f13078q = interfaceC1343h;
        this.f13079r = z7;
        v vVar = new v(interfaceC1343h);
        this.f13080s = vVar;
        this.f13081t = new C1075d(vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0148, code lost:
        throw new java.io.IOException(M5.g.k(java.lang.Integer.valueOf(r9), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r19, o6.m r20) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.w.a(boolean, o6.m):boolean");
    }

    public final void b(m mVar) {
        M5.g.f(mVar, "handler");
        if (this.f13079r) {
            if (!a(true, mVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C1344i c1344i = g.f13014a;
        C1344i l7 = this.f13078q.l(c1344i.f15390q.length);
        Level level = Level.FINE;
        Logger logger = f13077u;
        if (logger.isLoggable(level)) {
            logger.fine(i6.b.i(M5.g.k(l7.e(), "<< CONNECTION "), new Object[0]));
        }
        if (M5.g.a(c1344i, l7)) {
            return;
        }
        throw new IOException(M5.g.k(l7.q(), "Expected a connection header but was "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13078q.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, v6.f] */
    public final void f(m mVar, int i7, int i8, int i9) {
        boolean z7;
        int i10;
        int i11;
        boolean z8;
        A a7;
        boolean z9;
        boolean z10;
        boolean z11;
        long j7;
        if (i9 != 0) {
            if ((i8 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i8 & 32) == 0) {
                if ((i8 & 8) != 0) {
                    byte readByte = this.f13078q.readByte();
                    byte[] bArr = i6.b.f11390a;
                    i11 = readByte & 255;
                    i10 = i7;
                } else {
                    i10 = i7;
                    i11 = 0;
                }
                int a8 = u.a(i10, i8, i11);
                InterfaceC1343h interfaceC1343h = this.f13078q;
                mVar.getClass();
                M5.g.f(interfaceC1343h, "source");
                mVar.f13025r.getClass();
                if (i9 != 0 && (i9 & 1) == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    s sVar = mVar.f13025r;
                    sVar.getClass();
                    ?? obj = new Object();
                    long j8 = a8;
                    interfaceC1343h.F(j8);
                    interfaceC1343h.L(obj, j8);
                    sVar.f13064z.c(new n(sVar.f13058t + '[' + i9 + "] onData", sVar, i9, obj, a8, z7), 0L);
                } else {
                    A f = mVar.f13025r.f(i9);
                    if (f == null) {
                        mVar.f13025r.y(i9, EnumC1073b.f12986s);
                        long j9 = a8;
                        mVar.f13025r.r(j9);
                        interfaceC1343h.p(j9);
                    } else {
                        byte[] bArr2 = i6.b.f11390a;
                        y yVar = f.f12966i;
                        long j10 = a8;
                        yVar.getClass();
                        while (true) {
                            if (j10 > 0) {
                                synchronized (yVar.f13091v) {
                                    z9 = yVar.f13087r;
                                    a7 = f;
                                    if (yVar.f13089t.f15388r + j10 > yVar.f13086q) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (z10) {
                                    interfaceC1343h.p(j10);
                                    yVar.f13091v.e(EnumC1073b.f12988u);
                                    break;
                                } else if (z9) {
                                    interfaceC1343h.p(j10);
                                    break;
                                } else {
                                    long L6 = interfaceC1343h.L(yVar.f13088s, j10);
                                    if (L6 != -1) {
                                        j10 -= L6;
                                        A a9 = yVar.f13091v;
                                        synchronized (a9) {
                                            try {
                                                if (yVar.f13090u) {
                                                    C1341f c1341f = yVar.f13088s;
                                                    j7 = c1341f.f15388r;
                                                    c1341f.b();
                                                } else {
                                                    C1341f c1341f2 = yVar.f13089t;
                                                    if (c1341f2.f15388r == 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    c1341f2.h0(yVar.f13088s);
                                                    if (z11) {
                                                        a9.notifyAll();
                                                    }
                                                    j7 = 0;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (j7 > 0) {
                                            yVar.a(j7);
                                        }
                                        f = a7;
                                    } else {
                                        throw new EOFException();
                                    }
                                }
                            } else {
                                a7 = f;
                                break;
                            }
                        }
                        if (z7) {
                            a7.j(i6.b.f11391b, true);
                        }
                    }
                }
                this.f13078q.p(i11);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final void h(m mVar, int i7, int i8) {
        EnumC1073b enumC1073b;
        Object[] array;
        if (i7 >= 8) {
            if (i8 == 0) {
                int readInt = this.f13078q.readInt();
                int readInt2 = this.f13078q.readInt();
                int i9 = i7 - 8;
                EnumC1073b[] values = EnumC1073b.values();
                int length = values.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        enumC1073b = values[i11];
                        if (enumC1073b.f12992q == readInt2) {
                            break;
                        }
                        i11++;
                    } else {
                        enumC1073b = null;
                        break;
                    }
                }
                if (enumC1073b != null) {
                    C1344i c1344i = C1344i.f15389t;
                    if (i9 > 0) {
                        c1344i = this.f13078q.l(i9);
                    }
                    mVar.getClass();
                    M5.g.f(c1344i, "debugData");
                    c1344i.d();
                    s sVar = mVar.f13025r;
                    synchronized (sVar) {
                        array = sVar.f13057s.values().toArray(new A[0]);
                        if (array != null) {
                            sVar.f13061w = true;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                    A[] aArr = (A[]) array;
                    int length2 = aArr.length;
                    while (i10 < length2) {
                        A a7 = aArr[i10];
                        i10++;
                        if (a7.f12960a > readInt && a7.h()) {
                            a7.k(EnumC1073b.f12989v);
                            mVar.f13025r.j(a7.f12960a);
                        }
                    }
                    return;
                }
                throw new IOException(M5.g.k(Integer.valueOf(readInt2), "TYPE_GOAWAY unexpected error code: "));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(M5.g.k(Integer.valueOf(i7), "TYPE_GOAWAY length < 8: "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
        throw new java.io.IOException(M5.g.k(java.lang.Integer.valueOf(r6.f13000a), "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.w.j(int, int, int, int):java.util.List");
    }

    public final void n(m mVar, int i7, int i8, int i9) {
        boolean z7;
        int i10;
        if (i9 != 0) {
            boolean z8 = false;
            if ((i8 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i8 & 8) != 0) {
                byte readByte = this.f13078q.readByte();
                byte[] bArr = i6.b.f11390a;
                i10 = readByte & 255;
            } else {
                i10 = 0;
            }
            if ((i8 & 32) != 0) {
                InterfaceC1343h interfaceC1343h = this.f13078q;
                interfaceC1343h.readInt();
                interfaceC1343h.readByte();
                byte[] bArr2 = i6.b.f11390a;
                mVar.getClass();
                i7 -= 5;
            }
            List j7 = j(u.a(i7, i8, i10), i10, i8, i9);
            mVar.getClass();
            mVar.f13025r.getClass();
            if (i9 != 0 && (i9 & 1) == 0) {
                z8 = true;
            }
            if (z8) {
                s sVar = mVar.f13025r;
                sVar.getClass();
                sVar.f13064z.c(new o(sVar.f13058t + '[' + i9 + "] onHeaders", sVar, i9, j7, z7), 0L);
                return;
            }
            s sVar2 = mVar.f13025r;
            synchronized (sVar2) {
                A f = sVar2.f(i9);
                if (f == null) {
                    if (!sVar2.f13061w && i9 > sVar2.f13059u && i9 % 2 != sVar2.f13060v % 2) {
                        A a7 = new A(i9, sVar2, false, z7, i6.b.v(j7));
                        sVar2.f13059u = i9;
                        sVar2.f13057s.put(Integer.valueOf(i9), a7);
                        sVar2.f13062x.f().c(new j(sVar2.f13058t + '[' + i9 + "] onStream", sVar2, a7, 1), 0L);
                    }
                    return;
                }
                f.j(i6.b.v(j7), z7);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void r(m mVar, int i7, int i8, int i9) {
        if (i7 == 8) {
            if (i9 == 0) {
                int readInt = this.f13078q.readInt();
                int readInt2 = this.f13078q.readInt();
                if ((i8 & 1) != 0) {
                    s sVar = mVar.f13025r;
                    synchronized (sVar) {
                        try {
                            if (readInt != 1) {
                                if (readInt != 2) {
                                    if (readInt == 3) {
                                        sVar.notifyAll();
                                    }
                                } else {
                                    sVar.F++;
                                }
                            } else {
                                sVar.f13042D++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                s sVar2 = mVar.f13025r;
                sVar2.f13063y.c(new k(M5.g.k(" ping", sVar2.f13058t), mVar.f13025r, readInt, readInt2), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(M5.g.k(Integer.valueOf(i7), "TYPE_PING length != 8: "));
    }

    public final void x(m mVar, int i7, int i8, int i9) {
        int i10;
        if (i9 != 0) {
            if ((i8 & 8) != 0) {
                byte readByte = this.f13078q.readByte();
                byte[] bArr = i6.b.f11390a;
                i10 = readByte & 255;
            } else {
                i10 = 0;
            }
            int readInt = this.f13078q.readInt() & Integer.MAX_VALUE;
            List j7 = j(u.a(i7 - 4, i8, i10), i10, i8, i9);
            mVar.getClass();
            s sVar = mVar.f13025r;
            sVar.getClass();
            synchronized (sVar) {
                if (sVar.f13054Q.contains(Integer.valueOf(readInt))) {
                    sVar.y(readInt, EnumC1073b.f12986s);
                    return;
                }
                sVar.f13054Q.add(Integer.valueOf(readInt));
                k6.c cVar = sVar.f13064z;
                cVar.c(new o(sVar.f13058t + '[' + readInt + "] onRequest", sVar, readInt, j7), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
