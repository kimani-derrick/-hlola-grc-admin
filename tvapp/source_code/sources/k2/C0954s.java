package k2;

import r0.AbstractC1111a;
/* renamed from: k2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954s {

    /* renamed from: a  reason: collision with root package name */
    public final C0956u f12194a;

    /* renamed from: b  reason: collision with root package name */
    public final C0956u f12195b;

    public C0954s(C0956u c0956u, C0956u c0956u2) {
        this.f12194a = c0956u;
        this.f12195b = c0956u2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0954s.class != obj.getClass()) {
            return false;
        }
        C0954s c0954s = (C0954s) obj;
        if (this.f12194a.equals(c0954s.f12194a) && this.f12195b.equals(c0954s.f12195b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12195b.hashCode() + (this.f12194a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C0956u c0956u = this.f12194a;
        sb.append(c0956u);
        C0956u c0956u2 = this.f12195b;
        if (c0956u.equals(c0956u2)) {
            str = "";
        } else {
            str = ", " + c0956u2;
        }
        return AbstractC1111a.t(sb, str, "]");
    }
}
