package a3;

import Z2.H;
import e2.InterfaceC0604f;
/* loaded from: classes.dex */
public final class z implements InterfaceC0604f {

    /* renamed from: u  reason: collision with root package name */
    public static final z f5137u = new z(1.0f, 0, 0, 0);

    /* renamed from: q  reason: collision with root package name */
    public final int f5138q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5139r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5140s;

    /* renamed from: t  reason: collision with root package name */
    public final float f5141t;

    static {
        int i7 = H.f4603a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public z(float f, int i7, int i8, int i9) {
        this.f5138q = i7;
        this.f5139r = i8;
        this.f5140s = i9;
        this.f5141t = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f5138q == zVar.f5138q && this.f5139r == zVar.f5139r && this.f5140s == zVar.f5140s && this.f5141t == zVar.f5141t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f5141t) + ((((((217 + this.f5138q) * 31) + this.f5139r) * 31) + this.f5140s) * 31);
    }
}
