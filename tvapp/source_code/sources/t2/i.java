package t2;

import H2.E;
import K.C0040p;
import N3.l;
import Z2.AbstractC0156a;
import Z2.C0163h;
import Z2.H;
import Z2.y;
import android.media.MediaCodec;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import b1.CallableC0357d;
import h6.G;
import h6.InterfaceC0755e;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k2.C0939d;
import k2.C0943h;
import k2.InterfaceC0940e;
import k2.InterfaceC0948m;
import n2.C1030a;
import o.C1054g;
import t3.C1251o;
import t3.InterfaceC1243g;
import u2.C1263A;
import u2.D;
import u2.F;
import u2.w;
import u2.z;
import u4.C1292p;
import w0.S;
import w0.k0;
import w0.q0;
import w0.s0;
import w2.C1381c;
import w2.C1387i;
import w2.InterfaceC1388j;
import x6.C1481n;
import x6.C1488v;
import x6.InterfaceC1470c;
import x6.InterfaceC1472e;
import x6.InterfaceC1473f;
import x6.N;
import x6.V;
import z4.C1518b;
/* loaded from: classes.dex */
public final class i implements InterfaceC0940e, z, InterfaceC1243g, InterfaceC1388j, InterfaceC1472e, InterfaceC1473f, InterfaceC0755e {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14555q;

    /* renamed from: r  reason: collision with root package name */
    public Object f14556r;

    /* renamed from: s  reason: collision with root package name */
    public Object f14557s;

    public /* synthetic */ i(char c5, int i7) {
        this.f14555q = i7;
    }

    public static int r(int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i9++;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = 1;
            }
        }
        if (i9 + 1 > i8) {
            return i10 + 1;
        }
        return i10;
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        switch (this.f14555q) {
            case 3:
                if (((B4.c) obj) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                } else {
                    CallableC0357d callableC0357d = (CallableC0357d) this.f14557s;
                    C1292p.b((C1292p) ((i) callableC0357d.f7050c).f14557s);
                    i iVar = (i) callableC0357d.f7050c;
                    ((C1292p) iVar.f14557s).f15031m.v(null, (Executor) this.f14556r);
                    ((C1292p) iVar.f14557s).f15034q.b(null);
                }
                return m3.g.m(null);
            default:
                return ((C1292p) this.f14557s).f15024e.Y(new CallableC0357d(this, 5, (Boolean) obj));
        }
    }

    public void B(k0 k0Var) {
        C1054g c1054g = (C1054g) this.f14557s;
        int l7 = c1054g.l() - 1;
        while (true) {
            if (l7 < 0) {
                break;
            } else if (k0Var == c1054g.m(l7)) {
                Object[] objArr = c1054g.f12798s;
                Object obj = objArr[l7];
                Object obj2 = o.h.f12800a;
                if (obj != obj2) {
                    objArr[l7] = obj2;
                    c1054g.f12796q = true;
                }
            } else {
                l7--;
            }
        }
        s0 s0Var = (s0) ((o.j) this.f14556r).remove(k0Var);
        if (s0Var != null) {
            s0Var.f15652a = 0;
            s0Var.f15653b = null;
            s0Var.f15654c = null;
            s0.d.c(s0Var);
        }
    }

    @Override // x6.InterfaceC1472e
    public Type a() {
        return (Type) this.f14556r;
    }

    @Override // u2.z
    public void c(y yVar) {
        D d;
        if (yVar.u() != 0 || (yVar.u() & 128) == 0) {
            return;
        }
        yVar.G(6);
        int a7 = yVar.a() / 4;
        int i7 = 0;
        while (true) {
            d = (D) this.f14557s;
            if (i7 >= a7) {
                break;
            }
            N2.f fVar = (N2.f) this.f14556r;
            yVar.e(fVar.f2472b, 0, 4);
            fVar.p(0);
            int i8 = fVar.i(16);
            fVar.s(3);
            if (i8 == 0) {
                fVar.s(13);
            } else {
                int i9 = fVar.i(13);
                if (d.f.get(i9) == null) {
                    d.f.put(i9, new C1263A(new C0163h(d, i9)));
                    d.f14714l++;
                }
            }
            i7++;
        }
        if (d.f14705a != 2) {
            d.f.remove(0);
        }
    }

    @Override // x6.InterfaceC1472e
    public Object d(C1488v c1488v) {
        Executor executor = (Executor) this.f14557s;
        if (executor != null) {
            return new C1481n(executor, c1488v);
        }
        return c1488v;
    }

    @Override // x6.InterfaceC1473f
    public void e(InterfaceC1470c interfaceC1470c, N n) {
        ((C1481n) this.f14557s).f16313q.execute(new E(this, (InterfaceC1473f) this.f14556r, n, 11));
    }

    @Override // x6.InterfaceC1473f
    public void f(InterfaceC1470c interfaceC1470c, Throwable th) {
        ((C1481n) this.f14557s).f16313q.execute(new E(this, (InterfaceC1473f) this.f14556r, th, 12));
    }

    @Override // h6.InterfaceC0755e
    public void g(G g7) {
        InterfaceC1473f interfaceC1473f = (InterfaceC1473f) this.f14556r;
        C1488v c1488v = (C1488v) this.f14557s;
        try {
            try {
                interfaceC1473f.e(c1488v, c1488v.d(g7));
            } catch (Throwable th) {
                V.o(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            V.o(th2);
            try {
                interfaceC1473f.f(c1488v, th2);
            } catch (Throwable th3) {
                V.o(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // k2.InterfaceC0940e
    public void h() {
        byte[] bArr = H.f;
        y yVar = (y) this.f14557s;
        yVar.getClass();
        yVar.D(bArr.length, bArr);
    }

    @Override // h6.InterfaceC0755e
    public void i(l6.i iVar, IOException iOException) {
        try {
            ((InterfaceC1473f) this.f14556r).f((C1488v) this.f14557s, iOException);
        } catch (Throwable th) {
            V.o(th);
            th.printStackTrace();
        }
    }

    @Override // k2.InterfaceC0940e
    public C0939d j(C0943h c0943h, long j7) {
        C0939d c0939d;
        long j8 = c0943h.f12166t;
        int min = (int) Math.min(20000L, c0943h.f12165s - j8);
        y yVar = (y) this.f14557s;
        yVar.C(min);
        c0943h.i(yVar.f4691a, 0, min, false);
        int i7 = -1;
        int i8 = -1;
        long j9 = -9223372036854775807L;
        while (yVar.a() >= 4) {
            if (C1030a.a(yVar.f4692b, yVar.f4691a) != 442) {
                yVar.G(1);
            } else {
                yVar.G(4);
                long c5 = w.c(yVar);
                if (c5 != -9223372036854775807L) {
                    long b7 = ((Z2.E) this.f14556r).b(c5);
                    if (b7 > j7) {
                        if (j9 == -9223372036854775807L) {
                            return new C0939d(-1, b7, j8);
                        }
                        c0939d = new C0939d(0, -9223372036854775807L, j8 + i8);
                    } else if (100000 + b7 > j7) {
                        c0939d = new C0939d(0, -9223372036854775807L, j8 + yVar.f4692b);
                    } else {
                        i8 = yVar.f4692b;
                        j9 = b7;
                    }
                    return c0939d;
                }
                int i9 = yVar.f4693c;
                if (yVar.a() >= 10) {
                    yVar.G(9);
                    int u7 = yVar.u() & 7;
                    if (yVar.a() >= u7) {
                        yVar.G(u7);
                        if (yVar.a() >= 4) {
                            if (C1030a.a(yVar.f4692b, yVar.f4691a) == 443) {
                                yVar.G(4);
                                int z7 = yVar.z();
                                if (yVar.a() >= z7) {
                                    yVar.G(z7);
                                }
                            }
                            while (yVar.a() >= 4) {
                                int a7 = C1030a.a(yVar.f4692b, yVar.f4691a);
                                if (a7 == 442 || a7 == 441 || (a7 >>> 8) != 1) {
                                    break;
                                }
                                yVar.G(4);
                                if (yVar.a() >= 2) {
                                    yVar.F(Math.min(yVar.f4693c, yVar.f4692b + yVar.z()));
                                }
                            }
                            i7 = yVar.f4692b;
                        }
                    }
                }
                yVar.F(i9);
                i7 = yVar.f4692b;
            }
        }
        if (j9 != -9223372036854775807L) {
            return new C0939d(-2, j9, j8 + i7);
        }
        return C0939d.d;
    }

    public void l(k0 k0Var, C0040p c0040p) {
        o.j jVar = (o.j) this.f14556r;
        s0 s0Var = (s0) jVar.get(k0Var);
        if (s0Var == null) {
            s0Var = s0.a();
            jVar.put(k0Var, s0Var);
        }
        s0Var.f15654c = c0040p;
        s0Var.f15652a |= 8;
    }

    public void m() {
        int[] iArr = (int[]) this.f14556r;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f14557s = null;
    }

    public void n() {
        String str = (String) this.f14556r;
        try {
            C1518b c1518b = (C1518b) this.f14557s;
            c1518b.getClass();
            new File((File) c1518b.f16462b, str).createNewFile();
        } catch (IOException e3) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + str, e3);
        }
    }

    @Override // w2.InterfaceC1388j
    /* renamed from: o */
    public C1381c k(C1387i c1387i) {
        MediaCodec mediaCodec;
        C1381c c1381c;
        String str = c1387i.f15776a.f15781a;
        C1381c c1381c2 = null;
        try {
            AbstractC0156a.b("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                c1381c = new C1381c(mediaCodec, (HandlerThread) ((l) this.f14556r).get(), (HandlerThread) ((l) this.f14557s).get(), false);
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e7) {
            e = e7;
            mediaCodec = null;
        }
        try {
            AbstractC0156a.s();
            C1381c.b(c1381c, c1387i.f15777b, c1387i.d, c1387i.f15779e);
            return c1381c;
        } catch (Exception e8) {
            e = e8;
            c1381c2 = c1381c;
            if (c1381c2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                c1381c2.a();
            }
            throw e;
        }
    }

    public void p(int i7) {
        int[] iArr = (int[]) this.f14556r;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i7, 10) + 1];
            this.f14556r = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int length = iArr.length;
            while (length <= i7) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f14556r = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f14556r;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View q(int i7, int i8, int i9, int i10) {
        int i11;
        S s6 = (S) this.f14556r;
        int e3 = s6.e();
        int d = s6.d();
        if (i8 > i7) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        View view = null;
        while (i7 != i8) {
            View a7 = s6.a(i7);
            int c5 = s6.c(a7);
            int b7 = s6.b(a7);
            R2.b bVar = (R2.b) this.f14557s;
            bVar.f2895b = e3;
            bVar.f2896c = d;
            bVar.d = c5;
            bVar.f2897e = b7;
            if (i9 != 0) {
                bVar.f2894a = i9;
                if (bVar.a()) {
                    return a7;
                }
            }
            if (i10 != 0) {
                bVar.f2894a = i10;
                if (bVar.a()) {
                    view = a7;
                }
            }
            i7 += i11;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int s(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14556r
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f14557s
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L14
        L12:
            r0 = r1
            goto L6f
        L14:
            r2 = 0
            if (r0 != 0) goto L18
            goto L33
        L18:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1e:
            if (r0 < 0) goto L33
            java.lang.Object r3 = r5.f14557s
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            w0.q0 r3 = (w0.q0) r3
            int r4 = r3.f15632q
            if (r4 != r6) goto L30
            r2 = r3
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L1e
        L33:
            if (r2 == 0) goto L3c
            java.lang.Object r0 = r5.f14557s
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3c:
            java.lang.Object r0 = r5.f14557s
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L45:
            if (r2 >= r0) goto L59
            java.lang.Object r3 = r5.f14557s
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            w0.q0 r3 = (w0.q0) r3
            int r3 = r3.f15632q
            if (r3 < r6) goto L56
            goto L5a
        L56:
            int r2 = r2 + 1
            goto L45
        L59:
            r2 = r1
        L5a:
            if (r2 == r1) goto L12
            java.lang.Object r0 = r5.f14557s
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            w0.q0 r0 = (w0.q0) r0
            java.lang.Object r3 = r5.f14557s
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f15632q
        L6f:
            if (r0 != r1) goto L7f
            java.lang.Object r0 = r5.f14556r
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f14556r
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L7f:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f14556r
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f14556r
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.i.s(int):int");
    }

    public void t() {
        ((SparseIntArray) this.f14556r).clear();
    }

    public boolean u(View view) {
        S s6 = (S) this.f14556r;
        int e3 = s6.e();
        int d = s6.d();
        int c5 = s6.c(view);
        int b7 = s6.b(view);
        R2.b bVar = (R2.b) this.f14557s;
        bVar.f2895b = e3;
        bVar.f2896c = d;
        bVar.d = c5;
        bVar.f2897e = b7;
        bVar.f2894a = 24579;
        return bVar.a();
    }

    public void v(int i7, int i8) {
        int[] iArr = (int[]) this.f14556r;
        if (iArr != null && i7 < iArr.length) {
            int i9 = i7 + i8;
            p(i9);
            int[] iArr2 = (int[]) this.f14556r;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill((int[]) this.f14556r, i7, i9, -1);
            List list = (List) this.f14557s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    q0 q0Var = (q0) ((List) this.f14557s).get(size);
                    int i10 = q0Var.f15632q;
                    if (i10 >= i7) {
                        q0Var.f15632q = i10 + i8;
                    }
                }
            }
        }
    }

    public void w(int i7, int i8) {
        int[] iArr = (int[]) this.f14556r;
        if (iArr != null && i7 < iArr.length) {
            int i9 = i7 + i8;
            p(i9);
            int[] iArr2 = (int[]) this.f14556r;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = (int[]) this.f14556r;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            List list = (List) this.f14557s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    q0 q0Var = (q0) ((List) this.f14557s).get(size);
                    int i10 = q0Var.f15632q;
                    if (i10 >= i7) {
                        if (i10 < i9) {
                            ((List) this.f14557s).remove(size);
                        } else {
                            q0Var.f15632q = i10 - i8;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d3, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.i.x(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public C0040p y(k0 k0Var, int i7) {
        s0 s0Var;
        C0040p c0040p;
        o.j jVar = (o.j) this.f14556r;
        int d = jVar.d(k0Var);
        if (d >= 0 && (s0Var = (s0) jVar.i(d)) != null) {
            int i8 = s0Var.f15652a;
            if ((i8 & i7) != 0) {
                int i9 = i8 & (~i7);
                s0Var.f15652a = i9;
                if (i7 == 4) {
                    c0040p = s0Var.f15653b;
                } else if (i7 == 8) {
                    c0040p = s0Var.f15654c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i9 & 12) == 0) {
                    jVar.g(d);
                    s0Var.f15652a = 0;
                    s0Var.f15653b = null;
                    s0Var.f15654c = null;
                    s0.d.c(s0Var);
                }
                return c0040p;
            }
        }
        return null;
    }

    public void z(k0 k0Var) {
        s0 s0Var = (s0) ((o.j) this.f14556r).get(k0Var);
        if (s0Var == null) {
            return;
        }
        s0Var.f15652a &= -2;
    }

    public i(final int i7) {
        this.f14555q = 14;
        l lVar = new l() { // from class: w2.b
            @Override // N3.l
            public final Object get() {
                switch (r2) {
                    case 0:
                        return new HandlerThread(C1381c.c("ExoPlayer:MediaCodecAsyncAdapter:", i7));
                    default:
                        return new HandlerThread(C1381c.c("ExoPlayer:MediaCodecQueueingThread:", i7));
                }
            }
        };
        l lVar2 = new l() { // from class: w2.b
            @Override // N3.l
            public final Object get() {
                switch (r2) {
                    case 0:
                        return new HandlerThread(C1381c.c("ExoPlayer:MediaCodecAsyncAdapter:", i7));
                    default:
                        return new HandlerThread(C1381c.c("ExoPlayer:MediaCodecQueueingThread:", i7));
                }
            }
        };
        this.f14556r = lVar;
        this.f14557s = lVar2;
    }

    public i(int i7, byte b7) {
        this.f14555q = i7;
        switch (i7) {
            case 10:
                this.f14556r = new SparseIntArray();
                this.f14557s = new SparseIntArray();
                return;
            case 13:
                this.f14556r = new o.j();
                this.f14557s = new C1054g();
                return;
            case 18:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14556r = byteArrayOutputStream;
                this.f14557s = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f14556r = new AtomicInteger();
                this.f14557s = new AtomicInteger();
                return;
        }
    }

    public i(Z2.E e3) {
        this.f14555q = 1;
        this.f14556r = e3;
        this.f14557s = new y();
    }

    public /* synthetic */ i(Object obj, int i7, Object obj2) {
        this.f14555q = i7;
        this.f14557s = obj;
        this.f14556r = obj2;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i7, boolean z7) {
        this.f14555q = i7;
        this.f14556r = obj;
        this.f14557s = obj2;
    }

    public i(D d) {
        this.f14555q = 2;
        this.f14557s = d;
        this.f14556r = new N2.f(4, new byte[4]);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R2.b, java.lang.Object] */
    public i(S s6) {
        this.f14555q = 12;
        this.f14556r = s6;
        ?? obj = new Object();
        obj.f2894a = 0;
        this.f14557s = obj;
    }

    @Override // u2.z
    public void b(Z2.E e3, InterfaceC0948m interfaceC0948m, F f) {
    }
}
