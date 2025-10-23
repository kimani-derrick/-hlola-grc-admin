package androidx.datastore.preferences.protobuf;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0526d;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0534l;
import com.google.crypto.tink.shaded.protobuf.AbstractC0544w;
import com.google.crypto.tink.shaded.protobuf.AbstractC0547z;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5781a;

    /* renamed from: b  reason: collision with root package name */
    public int f5782b;

    /* renamed from: c  reason: collision with root package name */
    public int f5783c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5784e;

    public /* synthetic */ C0230i(int i7) {
        this.f5781a = i7;
    }

    public static void j0(int i7) {
        if ((i7 & 3) == 0) {
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.f();
    }

    public static void k0(int i7) {
        if ((i7 & 3) == 0) {
            return;
        }
        throw B.e();
    }

    public static void l0(int i7) {
        if ((i7 & 7) == 0) {
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.f();
    }

    public static void m0(int i7) {
        if ((i7 & 7) == 0) {
            return;
        }
        throw B.e();
    }

    public Object A(InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        g0(3);
        return z(interfaceC0223b0, c0235n);
    }

    public void B(List list, InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        int C3;
        int i7 = this.f5782b;
        if ((i7 & 7) == 3) {
            do {
                list.add(z(interfaceC0223b0, c0235n));
                C0229h c0229h = (C0229h) this.f5784e;
                if (!c0229h.c() && this.d == 0) {
                    C3 = c0229h.C();
                } else {
                    return;
                }
            } while (C3 == i7);
            this.d = C3;
            return;
        }
        throw B.b();
    }

    public int C() {
        g0(0);
        return ((C0229h) this.f5784e).m();
    }

    public void D(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0244x;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.m();
                        throw null;
                    }
                    c0229h.m();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Integer.valueOf(c0229h.m()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Integer.valueOf(c0229h.m()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof AbstractC0544w;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0544w abstractC0544w = (AbstractC0544w) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 0) {
                        if (i10 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                abstractC0544w.f(eVar.v());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            abstractC0544w.f(eVar.v());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Integer.valueOf(eVar.v()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Integer.valueOf(eVar.v()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public long E() {
        g0(0);
        return ((C0229h) this.f5784e).n();
    }

    public void F(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof I;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.n();
                        throw null;
                    }
                    c0229h.n();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Long.valueOf(c0229h.n()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Long.valueOf(c0229h.n()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    com.google.crypto.tink.shaded.protobuf.I i10 = (com.google.crypto.tink.shaded.protobuf.I) list;
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                i10.f(eVar.w());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            i10.f(eVar.w());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i12 = this.f5782b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Long.valueOf(eVar.w()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Long.valueOf(eVar.w()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        r1.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(androidx.datastore.preferences.protobuf.M r10, C4.b r11, androidx.datastore.preferences.protobuf.C0235n r12) {
        /*
            r9 = this;
            r0 = 2
            r9.g0(r0)
            java.lang.Object r1 = r9.f5784e
            androidx.datastore.preferences.protobuf.h r1 = (androidx.datastore.preferences.protobuf.C0229h) r1
            int r2 = r1.D()
            int r2 = r1.e(r2)
            java.lang.Object r3 = r11.f422s
            java.lang.Object r4 = r11.f424u
            r5 = r4
        L15:
            int r6 = r9.f()     // Catch: java.lang.Throwable -> L39
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5f
            boolean r7 = r1.c()     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L25
            goto L5f
        L25:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L48
            if (r6 == r0) goto L3b
            boolean r6 = r9.i0()     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            if (r6 == 0) goto L33
            goto L15
        L33:
            androidx.datastore.preferences.protobuf.B r6 = new androidx.datastore.preferences.protobuf.B     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            throw r6     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
        L39:
            r10 = move-exception
            goto L66
        L3b:
            java.lang.Object r6 = r11.f423t     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            androidx.datastore.preferences.protobuf.A0 r6 = (androidx.datastore.preferences.protobuf.A0) r6     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            java.lang.Object r5 = r9.s(r6, r7, r12)     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            goto L15
        L48:
            java.lang.Object r6 = r11.f421r     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            androidx.datastore.preferences.protobuf.A0 r6 = (androidx.datastore.preferences.protobuf.A0) r6     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            r7 = 0
            java.lang.Object r3 = r9.s(r6, r7, r7)     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.A -> L52
            goto L15
        L52:
            boolean r6 = r9.i0()     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L59
            goto L15
        L59:
            androidx.datastore.preferences.protobuf.B r10 = new androidx.datastore.preferences.protobuf.B     // Catch: java.lang.Throwable -> L39
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L39
            throw r10     // Catch: java.lang.Throwable -> L39
        L5f:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L39
            r1.d(r2)
            return
        L66:
            r1.d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0230i.G(androidx.datastore.preferences.protobuf.M, C4.b, androidx.datastore.preferences.protobuf.n):void");
    }

    public Object H(InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        C0229h c0229h = (C0229h) this.f5784e;
        int D6 = c0229h.D();
        if (c0229h.f5767a < c0229h.f5768b) {
            int e3 = c0229h.e(D6);
            Object e7 = interfaceC0223b0.e();
            c0229h.f5767a++;
            interfaceC0223b0.h(e7, this, c0235n);
            interfaceC0223b0.f(e7);
            c0229h.a(0);
            c0229h.f5767a--;
            c0229h.d(e3);
            return e7;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object I(InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        g0(2);
        return H(interfaceC0223b0, c0235n);
    }

    public void J(List list, InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        int C3;
        int i7 = this.f5782b;
        if ((i7 & 7) == 2) {
            do {
                list.add(H(interfaceC0223b0, c0235n));
                C0229h c0229h = (C0229h) this.f5784e;
                if (!c0229h.c() && this.d == 0) {
                    C3 = c0229h.C();
                } else {
                    return;
                }
            } while (C3 == i7);
            this.d = C3;
            return;
        }
        throw B.b();
    }

    public int K() {
        g0(5);
        return ((C0229h) this.f5784e).w();
    }

    public void L(List list) {
        int C3;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0244x;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i7 = this.f5782b & 7;
                    if (i7 != 2) {
                        if (i7 != 5) {
                            throw B.b();
                        }
                        c0229h.w();
                        throw null;
                    }
                    k0(c0229h.D());
                    c0229h.w();
                    throw null;
                }
                int i8 = this.f5782b & 7;
                if (i8 != 2) {
                    if (i8 == 5) {
                        do {
                            list.add(Integer.valueOf(c0229h.w()));
                            if (!c0229h.c()) {
                                C3 = c0229h.C();
                            } else {
                                return;
                            }
                        } while (C3 == this.f5782b);
                        this.d = C3;
                        return;
                    }
                    throw B.b();
                }
                int D8 = c0229h.D();
                k0(D8);
                int b7 = c0229h.b() + D8;
                do {
                    list.add(Integer.valueOf(c0229h.w()));
                } while (c0229h.b() < b7);
                return;
            default:
                boolean z8 = list instanceof AbstractC0544w;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0544w abstractC0544w = (AbstractC0544w) list;
                    int i9 = this.f5782b & 7;
                    if (i9 != 2) {
                        if (i9 == 5) {
                            do {
                                abstractC0544w.f(eVar.x());
                                if (!eVar.k()) {
                                    D7 = eVar.D();
                                } else {
                                    return;
                                }
                            } while (D7 == this.f5782b);
                            this.d = D7;
                            return;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.c();
                    }
                    int E4 = eVar.E();
                    j0(E4);
                    int i10 = eVar.i() + E4;
                    do {
                        abstractC0544w.f(eVar.x());
                    } while (eVar.i() < i10);
                    return;
                }
                int i11 = this.f5782b & 7;
                if (i11 != 2) {
                    if (i11 == 5) {
                        do {
                            list.add(Integer.valueOf(eVar.x()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                int E6 = eVar.E();
                j0(E6);
                int i12 = eVar.i() + E6;
                do {
                    list.add(Integer.valueOf(eVar.x()));
                } while (eVar.i() < i12);
                return;
        }
    }

    public long M() {
        g0(1);
        return ((C0229h) this.f5784e).x();
    }

    public void N(List list) {
        int C3;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof I;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i7 = this.f5782b & 7;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw B.b();
                        }
                        m0(c0229h.D());
                        c0229h.x();
                        throw null;
                    }
                    c0229h.x();
                    throw null;
                }
                int i8 = this.f5782b & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int D8 = c0229h.D();
                        m0(D8);
                        int b7 = c0229h.b() + D8;
                        do {
                            list.add(Long.valueOf(c0229h.x()));
                        } while (c0229h.b() < b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Long.valueOf(c0229h.x()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int E4 = eVar.E();
                            l0(E4);
                            int i11 = eVar.i() + E4;
                            do {
                                i9.f(eVar.y());
                            } while (eVar.i() < i11);
                            return;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.c();
                    }
                    do {
                        i9.f(eVar.y());
                        if (!eVar.k()) {
                            D7 = eVar.D();
                        } else {
                            return;
                        }
                    } while (D7 == this.f5782b);
                    this.d = D7;
                    return;
                }
                int i12 = this.f5782b & 7;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int E6 = eVar.E();
                        l0(E6);
                        int i13 = eVar.i() + E6;
                        do {
                            list.add(Long.valueOf(eVar.y()));
                        } while (eVar.i() < i13);
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                do {
                    list.add(Long.valueOf(eVar.y()));
                    if (!eVar.k()) {
                        D6 = eVar.D();
                    } else {
                        return;
                    }
                } while (D6 == this.f5782b);
                this.d = D6;
                return;
        }
    }

    public int O() {
        g0(0);
        return ((C0229h) this.f5784e).y();
    }

    public void P(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0244x;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.y();
                        throw null;
                    }
                    c0229h.y();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Integer.valueOf(c0229h.y()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Integer.valueOf(c0229h.y()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof AbstractC0544w;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0544w abstractC0544w = (AbstractC0544w) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 0) {
                        if (i10 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                abstractC0544w.f(eVar.z());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            abstractC0544w.f(eVar.z());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Integer.valueOf(eVar.z()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Integer.valueOf(eVar.z()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public long Q() {
        g0(0);
        return ((C0229h) this.f5784e).z();
    }

    public void R(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof I;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.z();
                        throw null;
                    }
                    c0229h.z();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Long.valueOf(c0229h.z()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Long.valueOf(c0229h.z()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    com.google.crypto.tink.shaded.protobuf.I i10 = (com.google.crypto.tink.shaded.protobuf.I) list;
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                i10.f(eVar.A());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            i10.f(eVar.A());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i12 = this.f5782b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Long.valueOf(eVar.A()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Long.valueOf(eVar.A()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public String S() {
        g0(2);
        return ((C0229h) this.f5784e).A();
    }

    public void T(List list) {
        U(list, false);
    }

    public void U(List list, boolean z7) {
        String S6;
        int C3;
        int C6;
        String B6;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                if ((this.f5782b & 7) == 2) {
                    boolean z8 = list instanceof E;
                    C0229h c0229h = (C0229h) this.f5784e;
                    if (z8 && !z7) {
                        E e3 = (E) list;
                        do {
                            e3.p(l());
                            if (!c0229h.c()) {
                                C6 = c0229h.C();
                            } else {
                                return;
                            }
                        } while (C6 == this.f5782b);
                        this.d = C6;
                        return;
                    }
                    do {
                        if (z7) {
                            S6 = W();
                        } else {
                            S6 = S();
                        }
                        list.add(S6);
                        if (!c0229h.c()) {
                            C3 = c0229h.C();
                        } else {
                            return;
                        }
                    } while (C3 == this.f5782b);
                    this.d = C3;
                    return;
                }
                throw B.b();
            default:
                if ((this.f5782b & 7) == 2) {
                    boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.E;
                    B5.e eVar = (B5.e) this.f5784e;
                    if (z9 && !z7) {
                        com.google.crypto.tink.shaded.protobuf.E e7 = (com.google.crypto.tink.shaded.protobuf.E) list;
                        do {
                            e7.q(m());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                    do {
                        if (z7) {
                            f0(2);
                            B6 = eVar.C();
                        } else {
                            f0(2);
                            B6 = eVar.B();
                        }
                        list.add(B6);
                        if (!eVar.k()) {
                            D6 = eVar.D();
                        } else {
                            return;
                        }
                    } while (D6 == this.f5782b);
                    this.d = D6;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
    }

    public void V(List list) {
        U(list, true);
    }

    public String W() {
        g0(2);
        return ((C0229h) this.f5784e).B();
    }

    public int X() {
        g0(0);
        return ((C0229h) this.f5784e).D();
    }

    public void Y(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0244x;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.D();
                        throw null;
                    }
                    c0229h.D();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Integer.valueOf(c0229h.D()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Integer.valueOf(c0229h.D()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof AbstractC0544w;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0544w abstractC0544w = (AbstractC0544w) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 0) {
                        if (i10 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                abstractC0544w.f(eVar.E());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            abstractC0544w.f(eVar.E());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Integer.valueOf(eVar.E()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Integer.valueOf(eVar.E()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public long Z() {
        g0(0);
        return ((C0229h) this.f5784e).E();
    }

    public void a(n5.u uVar) {
        uVar.f12737s = null;
        uVar.f12735q = null;
        uVar.f12736r = null;
        uVar.f12743y = 1;
        int i7 = this.f5782b;
        if (i7 > 0) {
            int i8 = this.d;
            if ((i8 & 1) == 0) {
                this.d = i8 + 1;
                this.f5782b = i7 - 1;
                this.f5783c++;
            }
        }
        uVar.f12735q = (n5.u) this.f5784e;
        this.f5784e = uVar;
        int i9 = this.d;
        int i10 = i9 + 1;
        this.d = i10;
        int i11 = this.f5782b;
        if (i11 > 0 && (i10 & 1) == 0) {
            this.d = i9 + 2;
            this.f5782b = i11 - 1;
            this.f5783c++;
        }
        int i12 = 4;
        while (true) {
            int i13 = i12 - 1;
            if ((this.d & i13) == i13) {
                int i14 = this.f5783c;
                if (i14 == 0) {
                    n5.u uVar2 = (n5.u) this.f5784e;
                    n5.u uVar3 = uVar2.f12735q;
                    n5.u uVar4 = uVar3.f12735q;
                    uVar3.f12735q = uVar4.f12735q;
                    this.f5784e = uVar3;
                    uVar3.f12736r = uVar4;
                    uVar3.f12737s = uVar2;
                    uVar3.f12743y = uVar2.f12743y + 1;
                    uVar4.f12735q = uVar3;
                    uVar2.f12735q = uVar3;
                } else {
                    if (i14 == 1) {
                        n5.u uVar5 = (n5.u) this.f5784e;
                        n5.u uVar6 = uVar5.f12735q;
                        this.f5784e = uVar6;
                        uVar6.f12737s = uVar5;
                        uVar6.f12743y = uVar5.f12743y + 1;
                        uVar5.f12735q = uVar6;
                    } else if (i14 != 2) {
                    }
                    this.f5783c = 0;
                }
                i12 *= 2;
            } else {
                return;
            }
        }
    }

    public void a0(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof I;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.E();
                        throw null;
                    }
                    c0229h.E();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Long.valueOf(c0229h.E()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Long.valueOf(c0229h.E()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    com.google.crypto.tink.shaded.protobuf.I i10 = (com.google.crypto.tink.shaded.protobuf.I) list;
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                i10.f(eVar.F());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            i10.f(eVar.F());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i12 = this.f5782b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Long.valueOf(eVar.F()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Long.valueOf(eVar.F()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public void b(int i7, int i8) {
        if (i7 >= 0) {
            if (i8 >= 0) {
                int i9 = this.d;
                int i10 = i9 * 2;
                int[] iArr = (int[]) this.f5784e;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5784e = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i10 >= iArr.length) {
                    int[] iArr3 = new int[i9 * 4];
                    this.f5784e = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.f5784e;
                iArr4[i10] = i7;
                iArr4[i10 + 1] = i8;
                this.d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void b0(int i7) {
        int i8;
        if (i7 <= 0) {
            return;
        }
        if (i7 <= h0()) {
            int i9 = this.f5783c;
            if (i7 < i9) {
                i8 = i9 - i7;
            } else {
                i8 = 0;
            }
            for (int i10 = i8; i10 < i9; i10++) {
                ((Object[]) this.f5784e)[i10] = null;
            }
            int i11 = this.f5783c;
            int i12 = i11 - i8;
            int i13 = i7 - i12;
            this.f5783c = i11 - i12;
            if (i13 > 0) {
                int length = ((Object[]) this.f5784e).length;
                this.f5783c = length;
                int i14 = length - i13;
                for (int i15 = i14; i15 < length; i15++) {
                    ((Object[]) this.f5784e)[i15] = null;
                }
                this.f5783c = i14;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void c() {
        int i7 = this.d;
        View view = (View) this.f5784e;
        int top = i7 - (view.getTop() - this.f5782b);
        Field field = K.O.f1447a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f5783c));
    }

    public void c0(int i7) {
        if (i7 <= 0) {
            return;
        }
        if (i7 <= h0()) {
            int length = ((Object[]) this.f5784e).length;
            int i8 = this.f5782b;
            if (i7 < length - i8) {
                length = i8 + i7;
            }
            while (i8 < length) {
                ((Object[]) this.f5784e)[i8] = null;
                i8++;
            }
            int i9 = this.f5782b;
            int i10 = length - i9;
            int i11 = i7 - i10;
            this.f5782b = this.d & (i9 + i10);
            if (i11 > 0) {
                for (int i12 = 0; i12 < i11; i12++) {
                    ((Object[]) this.f5784e)[i12] = null;
                }
                this.f5782b = i11;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void d(RecyclerView recyclerView, boolean z7) {
        this.d = 0;
        int[] iArr = (int[]) this.f5784e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        w0.U u7 = recyclerView.f6895D;
        if (recyclerView.f6893C != null && u7 != null && u7.f15484i) {
            if (z7) {
                if (!recyclerView.f6952u.k()) {
                    u7.k(recyclerView.f6893C.a(), this);
                }
            } else if (!recyclerView.P()) {
                u7.j(this.f5782b, this.f5783c, recyclerView.f6959x0, this);
            }
            int i7 = this.d;
            if (i7 > u7.f15485j) {
                u7.f15485j = i7;
                u7.f15486k = z7;
                recyclerView.f6948s.n();
            }
        }
    }

    public void d0(int i7) {
        if (((B5.e) this.f5784e).i() == i7) {
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.g();
    }

    public void e() {
        Object[] objArr = (Object[]) this.f5784e;
        int length = objArr.length;
        int i7 = this.f5782b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 >= 0) {
            Object[] objArr2 = new Object[i9];
            A5.j.Q(0, i7, length, objArr, objArr2);
            A5.j.Q(i8, 0, this.f5782b, (Object[]) this.f5784e, objArr2);
            this.f5784e = objArr2;
            this.f5782b = 0;
            this.f5783c = length;
            this.d = i9 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void e0(int i7) {
        if (((C0229h) this.f5784e).b() == i7) {
            return;
        }
        throw B.f();
    }

    public int f() {
        switch (this.f5781a) {
            case 0:
                int i7 = this.d;
                if (i7 != 0) {
                    this.f5782b = i7;
                    this.d = 0;
                } else {
                    this.f5782b = ((C0229h) this.f5784e).C();
                }
                int i8 = this.f5782b;
                if (i8 == 0 || i8 == this.f5783c) {
                    return Integer.MAX_VALUE;
                }
                return i8 >>> 3;
            default:
                int i9 = this.d;
                if (i9 != 0) {
                    this.f5782b = i9;
                    this.d = 0;
                } else {
                    this.f5782b = ((B5.e) this.f5784e).D();
                }
                int i10 = this.f5782b;
                if (i10 == 0 || i10 == this.f5783c) {
                    return Integer.MAX_VALUE;
                }
                return i10 >>> 3;
        }
    }

    public void f0(int i7) {
        if ((this.f5782b & 7) == i7) {
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.c();
    }

    public int g() {
        return this.f5782b;
    }

    public void g0(int i7) {
        if ((this.f5782b & 7) == i7) {
            return;
        }
        throw B.b();
    }

    public void h(Object obj, com.google.crypto.tink.shaded.protobuf.b0 b0Var, C0536n c0536n) {
        int i7 = this.f5783c;
        this.f5783c = ((this.f5782b >>> 3) << 3) | 4;
        try {
            b0Var.j(obj, this, c0536n);
            if (this.f5782b == this.f5783c) {
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.f();
        } finally {
            this.f5783c = i7;
        }
    }

    public int h0() {
        return (this.f5783c - this.f5782b) & this.d;
    }

    public void i(Object obj, com.google.crypto.tink.shaded.protobuf.b0 b0Var, C0536n c0536n) {
        B5.e eVar = (B5.e) this.f5784e;
        int E4 = eVar.E();
        if (eVar.f292q < eVar.f293r) {
            int n = eVar.n(E4);
            eVar.f292q++;
            b0Var.j(obj, this, c0536n);
            eVar.c(0);
            eVar.f292q--;
            eVar.m(n);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public boolean i0() {
        int i7;
        C0229h c0229h = (C0229h) this.f5784e;
        if (c0229h.c() || (i7 = this.f5782b) == this.f5783c) {
            return false;
        }
        return c0229h.H(i7);
    }

    public boolean j() {
        g0(0);
        return ((C0229h) this.f5784e).f();
    }

    public void k(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0225d;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.f();
                        throw null;
                    }
                    c0229h.f();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Boolean.valueOf(c0229h.f()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Boolean.valueOf(c0229h.f()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof AbstractC0526d;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0526d abstractC0526d = (AbstractC0526d) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 0) {
                        if (i10 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                abstractC0526d.f(eVar.o());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            abstractC0526d.f(eVar.o());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Boolean.valueOf(eVar.o()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Boolean.valueOf(eVar.o()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public C0228g l() {
        g0(2);
        return ((C0229h) this.f5784e).g();
    }

    public AbstractC0530h m() {
        f0(2);
        return ((B5.e) this.f5784e).p();
    }

    public void n(List list) {
        int C3;
        int D6;
        switch (this.f5781a) {
            case 0:
                if ((this.f5782b & 7) == 2) {
                    do {
                        list.add(l());
                        C0229h c0229h = (C0229h) this.f5784e;
                        if (!c0229h.c()) {
                            C3 = c0229h.C();
                        } else {
                            return;
                        }
                    } while (C3 == this.f5782b);
                    this.d = C3;
                    return;
                }
                throw B.b();
            default:
                if ((this.f5782b & 7) == 2) {
                    do {
                        list.add(m());
                        B5.e eVar = (B5.e) this.f5784e;
                        if (!eVar.k()) {
                            D6 = eVar.D();
                        } else {
                            return;
                        }
                    } while (D6 == this.f5782b);
                    this.d = D6;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
    }

    public double o() {
        g0(1);
        return ((C0229h) this.f5784e).h();
    }

    public void p(List list) {
        int C3;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0233l;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i7 = this.f5782b & 7;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw B.b();
                        }
                        m0(c0229h.D());
                        c0229h.h();
                        throw null;
                    }
                    c0229h.h();
                    throw null;
                }
                int i8 = this.f5782b & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int D8 = c0229h.D();
                        m0(D8);
                        int b7 = c0229h.b() + D8;
                        do {
                            list.add(Double.valueOf(c0229h.h()));
                        } while (c0229h.b() < b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Double.valueOf(c0229h.h()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof AbstractC0534l;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0534l abstractC0534l = (AbstractC0534l) list;
                    int i9 = this.f5782b & 7;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            int E4 = eVar.E();
                            l0(E4);
                            int i10 = eVar.i() + E4;
                            do {
                                abstractC0534l.f(eVar.q());
                            } while (eVar.i() < i10);
                            return;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.c();
                    }
                    do {
                        abstractC0534l.f(eVar.q());
                        if (!eVar.k()) {
                            D7 = eVar.D();
                        } else {
                            return;
                        }
                    } while (D7 == this.f5782b);
                    this.d = D7;
                    return;
                }
                int i11 = this.f5782b & 7;
                if (i11 != 1) {
                    if (i11 == 2) {
                        int E6 = eVar.E();
                        l0(E6);
                        int i12 = eVar.i() + E6;
                        do {
                            list.add(Double.valueOf(eVar.q()));
                        } while (eVar.i() < i12);
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                do {
                    list.add(Double.valueOf(eVar.q()));
                    if (!eVar.k()) {
                        D6 = eVar.D();
                    } else {
                        return;
                    }
                } while (D6 == this.f5782b);
                this.d = D6;
                return;
        }
    }

    public int q() {
        g0(0);
        return ((C0229h) this.f5784e).i();
    }

    public void r(List list) {
        int C3;
        int D6;
        int i7;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0244x;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i8 = this.f5782b & 7;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            throw B.b();
                        }
                        c0229h.D();
                        c0229h.i();
                        throw null;
                    }
                    c0229h.i();
                    throw null;
                }
                int i9 = this.f5782b & 7;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int b7 = c0229h.b() + c0229h.D();
                        do {
                            list.add(Integer.valueOf(c0229h.i()));
                        } while (c0229h.b() < b7);
                        e0(b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Integer.valueOf(c0229h.i()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof AbstractC0544w;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0544w abstractC0544w = (AbstractC0544w) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 0) {
                        if (i10 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                abstractC0544w.f(eVar.r());
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            abstractC0544w.f(eVar.r());
                            if (!eVar.k()) {
                                D7 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D7 == this.f5782b);
                        this.d = D7;
                        return;
                    }
                } else {
                    int i11 = this.f5782b & 7;
                    if (i11 != 0) {
                        if (i11 == 2) {
                            i7 = eVar.i() + eVar.E();
                            do {
                                list.add(Integer.valueOf(eVar.r()));
                            } while (eVar.i() < i7);
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.B.c();
                        }
                    } else {
                        do {
                            list.add(Integer.valueOf(eVar.r()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                }
                d0(i7);
                return;
        }
    }

    public Object s(A0 a02, Class cls, C0235n c0235n) {
        switch (a02.ordinal()) {
            case 0:
                return Double.valueOf(o());
            case 1:
                return Float.valueOf(x());
            case 2:
                return Long.valueOf(E());
            case 3:
                return Long.valueOf(Z());
            case 4:
                return Integer.valueOf(C());
            case 5:
                return Long.valueOf(v());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(t());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(j());
            case 8:
                return W();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                g0(2);
                return H(Y.f5733c.a(cls), c0235n);
            case 11:
                return l();
            case 12:
                return Integer.valueOf(X());
            case 13:
                return Integer.valueOf(q());
            case 14:
                return Integer.valueOf(K());
            case 15:
                return Long.valueOf(M());
            case 16:
                return Integer.valueOf(O());
            case 17:
                return Long.valueOf(Q());
        }
    }

    public int t() {
        g0(5);
        return ((C0229h) this.f5784e).j();
    }

    public void u(List list) {
        int C3;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0244x;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i7 = this.f5782b & 7;
                    if (i7 != 2) {
                        if (i7 != 5) {
                            throw B.b();
                        }
                        c0229h.j();
                        throw null;
                    }
                    k0(c0229h.D());
                    c0229h.j();
                    throw null;
                }
                int i8 = this.f5782b & 7;
                if (i8 != 2) {
                    if (i8 == 5) {
                        do {
                            list.add(Integer.valueOf(c0229h.j()));
                            if (!c0229h.c()) {
                                C3 = c0229h.C();
                            } else {
                                return;
                            }
                        } while (C3 == this.f5782b);
                        this.d = C3;
                        return;
                    }
                    throw B.b();
                }
                int D8 = c0229h.D();
                k0(D8);
                int b7 = c0229h.b() + D8;
                do {
                    list.add(Integer.valueOf(c0229h.j()));
                } while (c0229h.b() < b7);
                return;
            default:
                boolean z8 = list instanceof AbstractC0544w;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    AbstractC0544w abstractC0544w = (AbstractC0544w) list;
                    int i9 = this.f5782b & 7;
                    if (i9 != 2) {
                        if (i9 == 5) {
                            do {
                                abstractC0544w.f(eVar.s());
                                if (!eVar.k()) {
                                    D7 = eVar.D();
                                } else {
                                    return;
                                }
                            } while (D7 == this.f5782b);
                            this.d = D7;
                            return;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.c();
                    }
                    int E4 = eVar.E();
                    j0(E4);
                    int i10 = eVar.i() + E4;
                    do {
                        abstractC0544w.f(eVar.s());
                    } while (eVar.i() < i10);
                    return;
                }
                int i11 = this.f5782b & 7;
                if (i11 != 2) {
                    if (i11 == 5) {
                        do {
                            list.add(Integer.valueOf(eVar.s()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                int E6 = eVar.E();
                j0(E6);
                int i12 = eVar.i() + E6;
                do {
                    list.add(Integer.valueOf(eVar.s()));
                } while (eVar.i() < i12);
                return;
        }
    }

    public long v() {
        g0(1);
        return ((C0229h) this.f5784e).k();
    }

    public void w(List list) {
        int C3;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof I;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i7 = this.f5782b & 7;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw B.b();
                        }
                        m0(c0229h.D());
                        c0229h.k();
                        throw null;
                    }
                    c0229h.k();
                    throw null;
                }
                int i8 = this.f5782b & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int D8 = c0229h.D();
                        m0(D8);
                        int b7 = c0229h.b() + D8;
                        do {
                            list.add(Long.valueOf(c0229h.k()));
                        } while (c0229h.b() < b7);
                        return;
                    }
                    throw B.b();
                }
                do {
                    list.add(Long.valueOf(c0229h.k()));
                    if (!c0229h.c()) {
                        C3 = c0229h.C();
                    } else {
                        return;
                    }
                } while (C3 == this.f5782b);
                this.d = C3;
                return;
            default:
                boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
                    int i10 = this.f5782b & 7;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int E4 = eVar.E();
                            l0(E4);
                            int i11 = eVar.i() + E4;
                            do {
                                i9.f(eVar.t());
                            } while (eVar.i() < i11);
                            return;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.c();
                    }
                    do {
                        i9.f(eVar.t());
                        if (!eVar.k()) {
                            D7 = eVar.D();
                        } else {
                            return;
                        }
                    } while (D7 == this.f5782b);
                    this.d = D7;
                    return;
                }
                int i12 = this.f5782b & 7;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int E6 = eVar.E();
                        l0(E6);
                        int i13 = eVar.i() + E6;
                        do {
                            list.add(Long.valueOf(eVar.t()));
                        } while (eVar.i() < i13);
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                do {
                    list.add(Long.valueOf(eVar.t()));
                    if (!eVar.k()) {
                        D6 = eVar.D();
                    } else {
                        return;
                    }
                } while (D6 == this.f5782b);
                this.d = D6;
                return;
        }
    }

    public float x() {
        g0(5);
        return ((C0229h) this.f5784e).l();
    }

    public void y(List list) {
        int C3;
        int D6;
        int D7;
        switch (this.f5781a) {
            case 0:
                boolean z7 = list instanceof AbstractC0239s;
                C0229h c0229h = (C0229h) this.f5784e;
                if (z7) {
                    AbstractC0515y1.v(list);
                    int i7 = this.f5782b & 7;
                    if (i7 != 2) {
                        if (i7 != 5) {
                            throw B.b();
                        }
                        c0229h.l();
                        throw null;
                    }
                    k0(c0229h.D());
                    c0229h.l();
                    throw null;
                }
                int i8 = this.f5782b & 7;
                if (i8 != 2) {
                    if (i8 == 5) {
                        do {
                            list.add(Float.valueOf(c0229h.l()));
                            if (!c0229h.c()) {
                                C3 = c0229h.C();
                            } else {
                                return;
                            }
                        } while (C3 == this.f5782b);
                        this.d = C3;
                        return;
                    }
                    throw B.b();
                }
                int D8 = c0229h.D();
                k0(D8);
                int b7 = c0229h.b() + D8;
                do {
                    list.add(Float.valueOf(c0229h.l()));
                } while (c0229h.b() < b7);
                return;
            default:
                boolean z8 = list instanceof com.google.crypto.tink.shaded.protobuf.r;
                B5.e eVar = (B5.e) this.f5784e;
                if (z8) {
                    com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) list;
                    int i9 = this.f5782b & 7;
                    if (i9 != 2) {
                        if (i9 == 5) {
                            do {
                                rVar.f(eVar.u());
                                if (!eVar.k()) {
                                    D7 = eVar.D();
                                } else {
                                    return;
                                }
                            } while (D7 == this.f5782b);
                            this.d = D7;
                            return;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.c();
                    }
                    int E4 = eVar.E();
                    j0(E4);
                    int i10 = eVar.i() + E4;
                    do {
                        rVar.f(eVar.u());
                    } while (eVar.i() < i10);
                    return;
                }
                int i11 = this.f5782b & 7;
                if (i11 != 2) {
                    if (i11 == 5) {
                        do {
                            list.add(Float.valueOf(eVar.u()));
                            if (!eVar.k()) {
                                D6 = eVar.D();
                            } else {
                                return;
                            }
                        } while (D6 == this.f5782b);
                        this.d = D6;
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                int E6 = eVar.E();
                j0(E6);
                int i12 = eVar.i() + E6;
                do {
                    list.add(Float.valueOf(eVar.u()));
                } while (eVar.i() < i12);
                return;
        }
    }

    public Object z(InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        int i7 = this.f5783c;
        this.f5783c = ((this.f5782b >>> 3) << 3) | 4;
        try {
            Object e3 = interfaceC0223b0.e();
            interfaceC0223b0.h(e3, this, c0235n);
            interfaceC0223b0.f(e3);
            if (this.f5782b == this.f5783c) {
                return e3;
            }
            throw B.e();
        } finally {
            this.f5783c = i7;
        }
    }

    public C0230i(B5.e eVar) {
        this.f5781a = 1;
        this.d = 0;
        AbstractC0547z.a(eVar, "input");
        this.f5784e = eVar;
        eVar.f295t = this;
    }

    public C0230i(View view) {
        this.f5781a = 5;
        this.f5784e = view;
    }

    public C0230i(C0229h c0229h) {
        this.f5781a = 0;
        this.d = 0;
        Charset charset = AbstractC0246z.f5827a;
        this.f5784e = c0229h;
        c0229h.d = this;
    }
}
