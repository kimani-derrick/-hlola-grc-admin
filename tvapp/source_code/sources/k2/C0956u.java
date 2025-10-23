package k2;

import r0.AbstractC1111a;
/* renamed from: k2.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956u {

    /* renamed from: c  reason: collision with root package name */
    public static final C0956u f12196c = new C0956u(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f12197a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12198b;

    public C0956u(long j7, long j8) {
        this.f12197a = j7;
        this.f12198b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0956u.class != obj.getClass()) {
            return false;
        }
        C0956u c0956u = (C0956u) obj;
        if (this.f12197a == c0956u.f12197a && this.f12198b == c0956u.f12198b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12197a) * 31) + ((int) this.f12198b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f12197a);
        sb.append(", position=");
        return AbstractC1111a.s(sb, this.f12198b, "]");
    }
}
