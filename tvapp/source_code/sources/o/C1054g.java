package o;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Arrays;
import p.AbstractC1078a;
/* renamed from: o.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054g implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ boolean f12796q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ long[] f12797r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object[] f12798s;

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ int f12799t;

    public C1054g() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 80;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (80 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 8;
        this.f12797r = new long[i10];
        this.f12798s = new Object[i10];
    }

    public final void b(long j7, Long l7) {
        int i7 = this.f12799t;
        if (i7 != 0 && j7 <= this.f12797r[i7 - 1]) {
            k(j7, l7);
            return;
        }
        if (this.f12796q) {
            long[] jArr = this.f12797r;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f12798s;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj = objArr[i9];
                    if (obj != h.f12800a) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f12796q = false;
                this.f12799t = i8;
            }
        }
        int i10 = this.f12799t;
        if (i10 >= this.f12797r.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] copyOf = Arrays.copyOf(this.f12797r, i14);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            this.f12797r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12798s, i14);
            M5.g.e(copyOf2, "copyOf(this, newSize)");
            this.f12798s = copyOf2;
        }
        this.f12797r[i10] = j7;
        this.f12798s[i10] = l7;
        this.f12799t = i10 + 1;
    }

    public final void c() {
        int i7 = this.f12799t;
        Object[] objArr = this.f12798s;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f12799t = 0;
        this.f12796q = false;
    }

    /* renamed from: d */
    public final C1054g clone() {
        Object clone = super.clone();
        M5.g.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1054g c1054g = (C1054g) clone;
        c1054g.f12797r = (long[]) this.f12797r.clone();
        c1054g.f12798s = (Object[]) this.f12798s.clone();
        return c1054g;
    }

    public final Object e(long j7) {
        Object obj;
        int b7 = AbstractC1078a.b(this.f12797r, this.f12799t, j7);
        if (b7 < 0 || (obj = this.f12798s[b7]) == h.f12800a) {
            return null;
        }
        return obj;
    }

    public final Object g(long j7) {
        Object obj;
        int b7 = AbstractC1078a.b(this.f12797r, this.f12799t, j7);
        if (b7 < 0 || (obj = this.f12798s[b7]) == h.f12800a) {
            return -1L;
        }
        return obj;
    }

    public final long i(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12799t)) {
            if (this.f12796q) {
                long[] jArr = this.f12797r;
                Object[] objArr = this.f12798s;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != h.f12800a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12796q = false;
                this.f12799t = i9;
            }
            return this.f12797r[i7];
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected index to be within 0..size()-1, but was ", i7).toString());
    }

    public final void k(long j7, Object obj) {
        int b7 = AbstractC1078a.b(this.f12797r, this.f12799t, j7);
        if (b7 >= 0) {
            this.f12798s[b7] = obj;
            return;
        }
        int i7 = ~b7;
        int i8 = this.f12799t;
        Object obj2 = h.f12800a;
        if (i7 < i8) {
            Object[] objArr = this.f12798s;
            if (objArr[i7] == obj2) {
                this.f12797r[i7] = j7;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f12796q) {
            long[] jArr = this.f12797r;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f12798s;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12796q = false;
                this.f12799t = i9;
                i7 = ~AbstractC1078a.b(this.f12797r, i9, j7);
            }
        }
        int i11 = this.f12799t;
        if (i11 >= this.f12797r.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f12797r, i15);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            this.f12797r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12798s, i15);
            M5.g.e(copyOf2, "copyOf(this, newSize)");
            this.f12798s = copyOf2;
        }
        int i16 = this.f12799t - i7;
        if (i16 != 0) {
            long[] jArr2 = this.f12797r;
            int i17 = i7 + 1;
            M5.g.f(jArr2, "<this>");
            System.arraycopy(jArr2, i7, jArr2, i17, i16);
            Object[] objArr3 = this.f12798s;
            A5.j.Q(i17, i7, this.f12799t, objArr3, objArr3);
        }
        this.f12797r[i7] = j7;
        this.f12798s[i7] = obj;
        this.f12799t++;
    }

    public final int l() {
        if (this.f12796q) {
            int i7 = this.f12799t;
            long[] jArr = this.f12797r;
            Object[] objArr = this.f12798s;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != h.f12800a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f12796q = false;
            this.f12799t = i8;
        }
        return this.f12799t;
    }

    public final Object m(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12799t)) {
            if (this.f12796q) {
                long[] jArr = this.f12797r;
                Object[] objArr = this.f12798s;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != h.f12800a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12796q = false;
                this.f12799t = i9;
            }
            return this.f12798s[i7];
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected index to be within 0..size()-1, but was ", i7).toString());
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12799t * 28);
        sb.append('{');
        int i7 = this.f12799t;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(i(i8));
            sb.append('=');
            Object m7 = m(i8);
            if (m7 != sb) {
                sb.append(m7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        M5.g.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
