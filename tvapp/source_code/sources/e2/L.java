package e2;

import a4.C0214f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class L extends A0 {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9695u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9696v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0214f f9697w;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9698s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9699t;

    static {
        int i7 = Z2.H.f4603a;
        f9695u = Integer.toString(1, 36);
        f9696v = Integer.toString(2, 36);
        f9697w = new C0214f(7);
    }

    public L() {
        this.f9698s = false;
        this.f9699t = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l7 = (L) obj;
        if (this.f9699t != l7.f9699t || this.f9698s != l7.f9698s) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9698s), Boolean.valueOf(this.f9699t)});
    }

    public L(boolean z7) {
        this.f9698s = true;
        this.f9699t = z7;
    }
}
