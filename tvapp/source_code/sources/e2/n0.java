package e2;

import Z2.AbstractC0156a;
import a4.C0214f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n0 extends A0 {

    /* renamed from: t  reason: collision with root package name */
    public static final String f10020t;

    /* renamed from: u  reason: collision with root package name */
    public static final C0214f f10021u;

    /* renamed from: s  reason: collision with root package name */
    public final float f10022s;

    static {
        int i7 = Z2.H.f4603a;
        f10020t = Integer.toString(1, 36);
        f10021u = new C0214f(18);
    }

    public n0() {
        this.f10022s = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        if (this.f10022s != ((n0) obj).f10022s) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10022s)});
    }

    public n0(float f) {
        AbstractC0156a.e("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.f10022s = f;
    }
}
