package g2;

import java.util.Arrays;
/* renamed from: g2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722m {

    /* renamed from: e  reason: collision with root package name */
    public static final C0722m f10702e = new C0722m(-1, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f10703a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10704b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10705c;
    public final int d;

    public C0722m(int i7, int i8, int i9) {
        int i10;
        this.f10703a = i7;
        this.f10704b = i8;
        this.f10705c = i9;
        if (Z2.H.G(i9)) {
            i10 = Z2.H.x(i9, i8);
        } else {
            i10 = -1;
        }
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0722m)) {
            return false;
        }
        C0722m c0722m = (C0722m) obj;
        if (this.f10703a == c0722m.f10703a && this.f10704b == c0722m.f10704b && this.f10705c == c0722m.f10705c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10703a), Integer.valueOf(this.f10704b), Integer.valueOf(this.f10705c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f10703a + ", channelCount=" + this.f10704b + ", encoding=" + this.f10705c + ']';
    }
}
