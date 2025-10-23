package e2;

import Z2.C0162g;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0162g f10070a;

    public s0(C0162g c0162g) {
        this.f10070a = c0162g;
    }

    public final boolean a(int... iArr) {
        C0162g c0162g = this.f10070a;
        c0162g.getClass();
        for (int i7 : iArr) {
            if (c0162g.f4633a.get(i7)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        return this.f10070a.equals(((s0) obj).f10070a);
    }

    public final int hashCode() {
        return this.f10070a.hashCode();
    }
}
