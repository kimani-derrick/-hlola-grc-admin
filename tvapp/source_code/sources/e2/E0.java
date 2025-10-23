package e2;

import Z2.AbstractC0156a;
import a4.C0214f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class E0 extends A0 {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9491u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9492v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0214f f9493w;

    /* renamed from: s  reason: collision with root package name */
    public final int f9494s;

    /* renamed from: t  reason: collision with root package name */
    public final float f9495t;

    static {
        int i7 = Z2.H.f4603a;
        f9491u = Integer.toString(1, 36);
        f9492v = Integer.toString(2, 36);
        f9493w = new C0214f(20);
    }

    public E0(int i7) {
        AbstractC0156a.e("maxStars must be a positive integer", i7 > 0);
        this.f9494s = i7;
        this.f9495t = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f9494s != e02.f9494s || this.f9495t != e02.f9495t) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9494s), Float.valueOf(this.f9495t)});
    }

    public E0(int i7, float f) {
        boolean z7 = false;
        AbstractC0156a.e("maxStars must be a positive integer", i7 > 0);
        if (f >= 0.0f && f <= i7) {
            z7 = true;
        }
        AbstractC0156a.e("starRating is out of range [0, maxStars]", z7);
        this.f9494s = i7;
        this.f9495t = f;
    }
}
