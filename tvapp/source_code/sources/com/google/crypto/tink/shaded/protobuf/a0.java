package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0523a f9100a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9101b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f9102c;
    public final int d;

    public a0(AbstractC0543v abstractC0543v, String str, Object[] objArr) {
        char charAt;
        this.f9100a = abstractC0543v;
        this.f9101b = str;
        this.f9102c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i7 = charAt2 & 8191;
            int i8 = 1;
            int i9 = 13;
            while (true) {
                int i10 = i8 + 1;
                charAt = str.charAt(i8);
                if (charAt < 55296) {
                    break;
                }
                i7 |= (charAt & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
            charAt2 = i7 | (charAt << i9);
        }
        this.d = charAt2;
    }

    public final AbstractC0523a a() {
        return this.f9100a;
    }

    public final Object[] b() {
        return this.f9102c;
    }

    public final String c() {
        return this.f9101b;
    }

    public final int d() {
        if ((this.d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
