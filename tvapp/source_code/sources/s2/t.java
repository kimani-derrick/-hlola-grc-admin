package s2;

import Z2.AbstractC0156a;
import Z2.H;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final q f13700a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13701b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f13702c;
    public final int[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13703e;
    public final long[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f13704g;

    /* renamed from: h  reason: collision with root package name */
    public final long f13705h;

    public t(q qVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
        boolean z7;
        boolean z8;
        if (iArr.length == jArr2.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        if (jArr.length == jArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        AbstractC0156a.f(iArr2.length == jArr2.length);
        this.f13700a = qVar;
        this.f13702c = jArr;
        this.d = iArr;
        this.f13703e = i7;
        this.f = jArr2;
        this.f13704g = iArr2;
        this.f13705h = j7;
        this.f13701b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j7) {
        long[] jArr = this.f;
        for (int b7 = H.b(jArr, j7, true); b7 < jArr.length; b7++) {
            if ((this.f13704g[b7] & 1) != 0) {
                return b7;
            }
        }
        return -1;
    }
}
