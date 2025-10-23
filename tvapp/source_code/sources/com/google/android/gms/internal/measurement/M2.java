package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class M2 {
    public static final M2 f = new M2(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f8376a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f8377b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f8378c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8379e;

    public M2(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f8376a = i7;
        this.f8377b = iArr;
        this.f8378c = objArr;
        this.f8379e = z7;
    }

    public static M2 e() {
        return new M2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int A6;
        int i7 = this.d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f8376a; i9++) {
            int i10 = this.f8377b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f8378c[i9]).getClass();
                                A6 = C0412d2.p(i11);
                            } else {
                                int i13 = C0496u2.f8683q;
                                throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            i8 = ((M2) this.f8378c[i9]).a() + (C0412d2.B(i11) << 1) + i8;
                        }
                    } else {
                        A6 = C0412d2.h(i11, (C0407c2) this.f8378c[i9]);
                    }
                } else {
                    ((Long) this.f8378c[i9]).getClass();
                    A6 = C0412d2.n(i11);
                }
            } else {
                A6 = C0412d2.A(((Long) this.f8378c[i9]).longValue(), i11);
            }
            i8 = A6 + i8;
        }
        this.d = i8;
        return i8;
    }

    public final void b(int i7) {
        int[] iArr = this.f8377b;
        if (i7 > iArr.length) {
            int i8 = this.f8376a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f8377b = Arrays.copyOf(iArr, i7);
            this.f8378c = Arrays.copyOf(this.f8378c, i7);
        }
    }

    public final void c(int i7, Object obj) {
        if (this.f8379e) {
            b(this.f8376a + 1);
            int[] iArr = this.f8377b;
            int i8 = this.f8376a;
            iArr[i8] = i7;
            this.f8378c[i8] = obj;
            this.f8376a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(C0516y2 c0516y2) {
        if (this.f8376a == 0) {
            return;
        }
        c0516y2.getClass();
        for (int i7 = 0; i7 < this.f8376a; i7++) {
            int i8 = this.f8377b[i7];
            Object obj = this.f8378c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                c0516y2.m(i9, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(C0496u2.a());
                            }
                        } else {
                            c0516y2.l(i9);
                            ((M2) obj).d(c0516y2);
                            c0516y2.d(i9);
                        }
                    } else {
                        c0516y2.h(i9, (C0407c2) obj);
                    }
                } else {
                    c0516y2.k(((Long) obj).longValue(), i9);
                }
            } else {
                c0516y2.o(((Long) obj).longValue(), i9);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof M2)) {
            M2 m22 = (M2) obj;
            int i7 = this.f8376a;
            if (i7 == m22.f8376a) {
                int[] iArr = this.f8377b;
                int[] iArr2 = m22.f8377b;
                int i8 = 0;
                while (true) {
                    if (i8 >= i7) {
                        Object[] objArr = this.f8378c;
                        Object[] objArr2 = m22.f8378c;
                        int i9 = this.f8376a;
                        for (int i10 = 0; i10 < i9; i10++) {
                            if (objArr[i10].equals(objArr2[i10])) {
                            }
                        }
                        return true;
                    } else if (iArr[i8] != iArr2[i8]) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f8376a;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.f8377b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f8378c;
        int i13 = this.f8376a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
