package androidx.leanback.widget;
/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: c  reason: collision with root package name */
    public int f6469c;
    public int d;

    /* renamed from: i  reason: collision with root package name */
    public int f6473i;

    /* renamed from: j  reason: collision with root package name */
    public int f6474j;

    /* renamed from: k  reason: collision with root package name */
    public int f6475k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6476l;

    /* renamed from: e  reason: collision with root package name */
    public int f6470e = 2;
    public int f = 3;

    /* renamed from: g  reason: collision with root package name */
    public int f6471g = 0;

    /* renamed from: h  reason: collision with root package name */
    public float f6472h = 50.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f6468b = Integer.MIN_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public int f6467a = Integer.MAX_VALUE;

    public final int a() {
        if (this.f6476l) {
            int i7 = this.f6471g;
            int i8 = i7 >= 0 ? this.f6473i - i7 : -i7;
            float f = this.f6472h;
            return f != -1.0f ? i8 - ((int) ((this.f6473i * f) / 100.0f)) : i8;
        }
        int i9 = this.f6471g;
        if (i9 < 0) {
            i9 += this.f6473i;
        }
        float f7 = this.f6472h;
        return f7 != -1.0f ? i9 + ((int) ((this.f6473i * f7) / 100.0f)) : i9;
    }

    public final int b(int i7) {
        boolean z7;
        int i8;
        int i9;
        int i10 = this.f6473i;
        int a7 = a();
        int i11 = this.f6468b;
        boolean z8 = false;
        if (i11 == Integer.MIN_VALUE) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i12 = this.f6467a;
        if (i12 == Integer.MAX_VALUE) {
            z8 = true;
        }
        if (!z7) {
            int i13 = this.f6474j;
            int i14 = a7 - i13;
            if (this.f6476l ? (this.f & 2) != 0 : (this.f & 1) != 0) {
                if (i7 - i11 <= i14) {
                    int i15 = i11 - i13;
                    if (!z8 && i15 > (i9 = this.f6469c)) {
                        return i9;
                    }
                    return i15;
                }
            }
        }
        if (!z8) {
            int i16 = this.f6475k;
            int i17 = (i10 - a7) - i16;
            if (this.f6476l ? (1 & this.f) != 0 : (this.f & 2) != 0) {
                if (i12 - i7 <= i17) {
                    int i18 = i12 - (i10 - i16);
                    if (!z7 && i18 < (i8 = this.d)) {
                        return i8;
                    }
                    return i18;
                }
            }
        }
        return i7 - a7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        r0 = r0 - r6.f6474j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        r6.f6469c = (r4 - r6.f6474j) - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.R0.c(int, int, int, int):void");
    }

    public final String toString() {
        return " min:" + this.f6468b + " " + this.d + " max:" + this.f6467a + " " + this.f6469c;
    }
}
