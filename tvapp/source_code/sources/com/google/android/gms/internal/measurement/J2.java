package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class J2 {

    /* renamed from: a  reason: collision with root package name */
    public final V1 f8362a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8363b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f8364c;
    public final int d;

    public J2(AbstractC0457m2 abstractC0457m2, String str, Object[] objArr) {
        this.f8362a = abstractC0457m2;
        this.f8363b = str;
        this.f8364c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 >= 55296) {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            } else {
                this.d = i7 | (charAt2 << i9);
                return;
            }
        }
    }

    public final V1 a() {
        return this.f8362a;
    }

    public final int b() {
        int i7 = this.d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        if ((i7 & 4) == 4) {
            return 3;
        }
        return 2;
    }

    public final String c() {
        return this.f8363b;
    }

    public final Object[] d() {
        return this.f8364c;
    }
}
