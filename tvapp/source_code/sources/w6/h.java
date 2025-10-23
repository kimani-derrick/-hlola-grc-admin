package w6;

import A5.k;
import L5.p;
import U5.n;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import n5.r;
import u0.j;
import v6.C;
import v6.C1341f;
import v6.w;
import v6.z;
import w4.l0;
import z5.C1524f;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f16123a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' <= c5 && c5 < 'G') {
            return c5 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c5);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = w.f15416r;
        w j7 = j.j("/", false);
        LinkedHashMap K6 = A5.w.K(new C1524f(j7, new d(j7)));
        for (d dVar : k.h0(arrayList, new r(5))) {
            if (((d) K6.put(dVar.f16106a, dVar)) == null) {
                while (true) {
                    w wVar = dVar.f16106a;
                    w b7 = wVar.b();
                    if (b7 != null) {
                        d dVar2 = (d) K6.get(b7);
                        if (dVar2 != null) {
                            dVar2.f16111h.add(wVar);
                            break;
                        }
                        d dVar3 = new d(b7);
                        K6.put(b7, dVar3);
                        dVar3.f16111h.add(wVar);
                        dVar = dVar3;
                    }
                }
            }
        }
        return K6;
    }

    public static final String c(int i7) {
        l0.c(16);
        String num = Integer.toString(i7, 16);
        M5.g.e(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, M5.n] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, M5.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [M5.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, M5.n] */
    public static final d d(z zVar) {
        int H6;
        Long valueOf;
        int i7;
        long j7;
        if (zVar.H() == 33639248) {
            zVar.p(4L);
            short b7 = zVar.b();
            int i8 = b7 & 65535;
            if ((b7 & 1) == 0) {
                int b8 = zVar.b() & 65535;
                short b9 = zVar.b();
                int i9 = b9 & 65535;
                short b10 = zVar.b();
                int i10 = b10 & 65535;
                if (i9 == -1) {
                    valueOf = null;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, b10 & 31, (i9 >> 11) & 31, (i9 >> 5) & 63, (b9 & 31) << 1);
                    valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
                Long l7 = valueOf;
                zVar.H();
                ?? obj = new Object();
                obj.f2314q = zVar.H() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f2314q = zVar.H() & 4294967295L;
                int b11 = zVar.b() & 65535;
                int b12 = zVar.b() & 65535;
                zVar.p(8L);
                ?? obj3 = new Object();
                obj3.f2314q = zVar.H() & 4294967295L;
                String f = zVar.f(zVar.b() & 65535);
                if (!U5.f.c0(f, (char) 0)) {
                    if (obj2.f2314q == 4294967295L) {
                        j7 = 8;
                        i7 = b8;
                    } else {
                        i7 = b8;
                        j7 = 0;
                    }
                    if (obj.f2314q == 4294967295L) {
                        j7 += 8;
                    }
                    if (obj3.f2314q == 4294967295L) {
                        j7 += 8;
                    }
                    long j8 = j7;
                    ?? obj4 = new Object();
                    e(zVar, b11, new e(obj4, j8, obj2, zVar, obj, obj3));
                    if (j8 > 0 && !obj4.f2312q) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String f7 = zVar.f(b12);
                    String str = w.f15416r;
                    return new d(j.j("/", false).c(f), n.V(f, "/", false), f7, obj.f2314q, obj2.f2314q, i7, l7, obj3.f2314q);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(H6));
    }

    public static final void e(z zVar, int i7, p pVar) {
        long j7 = i7;
        while (j7 != 0) {
            if (j7 >= 4) {
                int b7 = zVar.b() & 65535;
                long b8 = zVar.b() & 65535;
                long j8 = j7 - 4;
                if (j8 >= b8) {
                    zVar.F(b8);
                    C1341f c1341f = zVar.f15428r;
                    long j9 = c1341f.f15388r;
                    pVar.j(Integer.valueOf(b7), Long.valueOf(b8));
                    long j10 = (c1341f.f15388r + b8) - j9;
                    int i8 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i8 >= 0) {
                        if (i8 > 0) {
                            c1341f.p(j10);
                        }
                        j7 = j8 - b8;
                    } else {
                        throw new IOException(AbstractC0515y1.l("unsupported zip: too many bytes processed for ", b7));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, M5.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, M5.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, M5.o] */
    public static final u.e f(z zVar, u.e eVar) {
        Long l7;
        int H6;
        ?? obj = new Object();
        if (eVar != null) {
            l7 = (Long) eVar.f14616g;
        } else {
            l7 = null;
        }
        obj.f2315q = l7;
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        if (zVar.H() == 67324752) {
            zVar.p(2L);
            short b7 = zVar.b();
            int i7 = b7 & 65535;
            if ((b7 & 1) == 0) {
                zVar.p(18L);
                int b8 = zVar.b() & 65535;
                zVar.p(zVar.b() & 65535);
                if (eVar == null) {
                    zVar.p(b8);
                    return null;
                }
                e(zVar, b8, new f(zVar, obj, obj2, obj3));
                Long l8 = (Long) obj.f2315q;
                Long l9 = (Long) obj2.f2315q;
                return new u.e(eVar.f14613b, eVar.f14614c, null, (Long) eVar.f14615e, (Long) obj3.f2315q, l8, l9);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(H6));
    }

    public static final int g(C c5, int i7) {
        int i8;
        M5.g.f(c5, "<this>");
        int i9 = i7 + 1;
        int length = c5.f15362u.length;
        int[] iArr = c5.f15363v;
        M5.g.f(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 < i9) {
                    i11 = i8 + 1;
                } else if (i12 <= i9) {
                    break;
                } else {
                    i10 = i8 - 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        if (i8 < 0) {
            return ~i8;
        }
        return i8;
    }
}
