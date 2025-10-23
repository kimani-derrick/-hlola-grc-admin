package e2;

import Z2.AbstractC0156a;
import java.util.Locale;
/* loaded from: classes.dex */
public final class q0 implements InterfaceC0604f {

    /* renamed from: t  reason: collision with root package name */
    public static final q0 f10062t = new q0(1.0f, 1.0f);

    /* renamed from: q  reason: collision with root package name */
    public final float f10063q;

    /* renamed from: r  reason: collision with root package name */
    public final float f10064r;

    /* renamed from: s  reason: collision with root package name */
    public final int f10065s;

    static {
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public q0(float f, float f7) {
        boolean z7;
        if (f > 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        AbstractC0156a.f(f7 > 0.0f);
        this.f10063q = f;
        this.f10064r = f7;
        this.f10065s = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f10063q == q0Var.f10063q && this.f10064r == q0Var.f10064r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10064r) + ((Float.floatToRawIntBits(this.f10063q) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10063q), Float.valueOf(this.f10064r)};
        int i7 = Z2.H.f4603a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
