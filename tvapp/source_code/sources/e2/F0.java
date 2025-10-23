package e2;

import a4.C0214f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class F0 extends A0 {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9500u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9501v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0214f f9502w;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9503s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9504t;

    static {
        int i7 = Z2.H.f4603a;
        f9500u = Integer.toString(1, 36);
        f9501v = Integer.toString(2, 36);
        f9502w = new C0214f(21);
    }

    public F0() {
        this.f9503s = false;
        this.f9504t = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (this.f9504t != f02.f9504t || this.f9503s != f02.f9503s) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9503s), Boolean.valueOf(this.f9504t)});
    }

    public F0(boolean z7) {
        this.f9503s = true;
        this.f9504t = z7;
    }
}
