package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j0 {
    public static final j0 f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f5787a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5788b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f5789c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5790e;

    public j0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f5787a = i7;
        this.f5788b = iArr;
        this.f5789c = objArr;
        this.f5790e = z7;
    }

    public static j0 b() {
        return new j0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int N6;
        int i7 = this.d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f5787a; i9++) {
            int i10 = this.f5788b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f5789c[i9]).getClass();
                                N6 = C0232k.x(i11);
                            } else {
                                throw new IllegalStateException(B.b());
                            }
                        } else {
                            i8 = ((j0) this.f5789c[i9]).a() + (C0232k.K(i11) * 2) + i8;
                        }
                    } else {
                        N6 = C0232k.t(i11, (C0228g) this.f5789c[i9]);
                    }
                } else {
                    ((Long) this.f5789c[i9]).getClass();
                    N6 = C0232k.y(i11);
                }
            } else {
                N6 = C0232k.N(((Long) this.f5789c[i9]).longValue(), i11);
            }
            i8 = N6 + i8;
        }
        this.d = i8;
        return i8;
    }

    public final void c(int i7, Object obj) {
        int i8;
        if (this.f5790e) {
            int i9 = this.f5787a;
            int[] iArr = this.f5788b;
            if (i9 == iArr.length) {
                if (i9 < 4) {
                    i8 = 8;
                } else {
                    i8 = i9 >> 1;
                }
                int i10 = i9 + i8;
                this.f5788b = Arrays.copyOf(iArr, i10);
                this.f5789c = Arrays.copyOf(this.f5789c, i10);
            }
            int[] iArr2 = this.f5788b;
            int i11 = this.f5787a;
            iArr2[i11] = i7;
            this.f5789c[i11] = obj;
            this.f5787a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(K k5) {
        if (this.f5787a == 0) {
            return;
        }
        k5.getClass();
        for (int i7 = 0; i7 < this.f5787a; i7++) {
            int i8 = this.f5788b[i7];
            Object obj = this.f5789c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                k5.e(i9, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(B.b());
                            }
                        } else {
                            C0232k c0232k = (C0232k) k5.f5705a;
                            c0232k.i0(i9, 3);
                            ((j0) obj).d(k5);
                            c0232k.i0(i9, 4);
                        }
                    } else {
                        k5.b(i9, (C0228g) obj);
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
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i7 = this.f5787a;
        if (i7 == j0Var.f5787a) {
            int[] iArr = this.f5788b;
            int[] iArr2 = j0Var.f5788b;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.f5789c;
                    Object[] objArr2 = j0Var.f5789c;
                    int i9 = this.f5787a;
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
        int i7 = this.f5787a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f5788b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f5789c;
        int i13 = this.f5787a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
