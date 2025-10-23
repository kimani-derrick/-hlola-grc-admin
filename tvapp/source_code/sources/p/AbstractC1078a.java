package p;

import M5.g;
/* renamed from: p.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1078a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f13098a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f13099b = new Object[0];

    public static final int a(int i7, int i8, int[] iArr) {
        g.f(iArr, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 > i8) {
                i9 = i11 - 1;
            } else {
                return i11;
            }
        }
        return ~i10;
    }

    public static final int b(long[] jArr, int i7, long j7) {
        g.f(jArr, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = (jArr[i10] > j7 ? 1 : (jArr[i10] == j7 ? 0 : -1));
            if (i11 < 0) {
                i9 = i10 + 1;
            } else if (i11 > 0) {
                i8 = i10 - 1;
            } else {
                return i10;
            }
        }
        return ~i9;
    }
}
