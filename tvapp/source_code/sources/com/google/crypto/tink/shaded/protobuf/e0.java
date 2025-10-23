package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class e0 {
    public static final e0 f = new e0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f9110a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f9111b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f9112c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9113e;

    public e0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f9110a = i7;
        this.f9111b = iArr;
        this.f9112c = objArr;
        this.f9113e = z7;
    }

    public static e0 c() {
        return new e0(0, new int[8], new Object[8], true);
    }

    public final void a(int i7) {
        int[] iArr = this.f9111b;
        if (i7 > iArr.length) {
            int i8 = this.f9110a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f9111b = Arrays.copyOf(iArr, i7);
            this.f9112c = Arrays.copyOf(this.f9112c, i7);
        }
    }

    public final int b() {
        int e02;
        int i7 = this.d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9110a; i9++) {
            int i10 = this.f9111b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f9112c[i9]).getClass();
                                e02 = C0533k.O(i11);
                            } else {
                                throw new IllegalStateException(B.c());
                            }
                        } else {
                            i8 = ((e0) this.f9112c[i9]).b() + (C0533k.b0(i11) * 2) + i8;
                        }
                    } else {
                        e02 = C0533k.K(i11, (AbstractC0530h) this.f9112c[i9]);
                    }
                } else {
                    ((Long) this.f9112c[i9]).getClass();
                    e02 = C0533k.P(i11);
                }
            } else {
                e02 = C0533k.e0(((Long) this.f9112c[i9]).longValue(), i11);
            }
            i8 = e02 + i8;
        }
        this.d = i8;
        return i8;
    }

    public final void d(int i7, Object obj) {
        if (this.f9113e) {
            a(this.f9110a + 1);
            int[] iArr = this.f9111b;
            int i8 = this.f9110a;
            iArr[i8] = i7;
            this.f9112c[i8] = obj;
            this.f9110a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(K k5) {
        if (this.f9110a == 0) {
            return;
        }
        k5.getClass();
        for (int i7 = 0; i7 < this.f9110a; i7++) {
            int i8 = this.f9111b[i7];
            Object obj = this.f9112c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                k5.e(i9, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(B.c());
                            }
                        } else {
                            C0533k c0533k = (C0533k) k5.f9070a;
                            c0533k.p0(i9, 3);
                            ((e0) obj).e(k5);
                            c0533k.p0(i9, 4);
                        }
                    } else {
                        k5.b(i9, (AbstractC0530h) obj);
                    }
                } else {
                    k5.f(((Long) obj).longValue(), i9);
                }
            } else {
                k5.j(((Long) obj).longValue(), i9);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        int i7 = this.f9110a;
        if (i7 == e0Var.f9110a) {
            int[] iArr = this.f9111b;
            int[] iArr2 = e0Var.f9111b;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.f9112c;
                    Object[] objArr2 = e0Var.f9112c;
                    int i9 = this.f9110a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9110a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f9111b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f9112c;
        int i13 = this.f9110a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
