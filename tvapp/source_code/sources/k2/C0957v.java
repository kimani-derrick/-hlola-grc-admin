package k2;

import java.util.Arrays;
/* renamed from: k2.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957v {

    /* renamed from: a  reason: collision with root package name */
    public final int f12199a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12200b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12201c;
    public final int d;

    public C0957v(int i7, int i8, int i9, byte[] bArr) {
        this.f12199a = i7;
        this.f12200b = bArr;
        this.f12201c = i8;
        this.d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0957v.class != obj.getClass()) {
            return false;
        }
        C0957v c0957v = (C0957v) obj;
        if (this.f12199a == c0957v.f12199a && this.f12201c == c0957v.f12201c && this.d == c0957v.d && Arrays.equals(this.f12200b, c0957v.f12200b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f12200b) + (this.f12199a * 31)) * 31) + this.f12201c) * 31) + this.d;
    }
}
