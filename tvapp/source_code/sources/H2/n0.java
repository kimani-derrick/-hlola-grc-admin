package H2;

import Z2.AbstractC0156a;
import e2.InterfaceC0604f;
/* loaded from: classes.dex */
public final class n0 implements InterfaceC0604f {

    /* renamed from: t  reason: collision with root package name */
    public static final n0 f1144t = new n0(new m0[0]);

    /* renamed from: u  reason: collision with root package name */
    public static final String f1145u;

    /* renamed from: q  reason: collision with root package name */
    public final int f1146q;

    /* renamed from: r  reason: collision with root package name */
    public final O3.U f1147r;

    /* renamed from: s  reason: collision with root package name */
    public int f1148s;

    static {
        int i7 = Z2.H.f4603a;
        f1145u = Integer.toString(0, 36);
    }

    public n0(m0... m0VarArr) {
        this.f1147r = O3.E.t(m0VarArr);
        this.f1146q = m0VarArr.length;
        int i7 = 0;
        while (true) {
            O3.U u7 = this.f1147r;
            if (i7 < u7.size()) {
                int i8 = i7 + 1;
                for (int i9 = i8; i9 < u7.size(); i9++) {
                    if (((m0) u7.get(i7)).equals(u7.get(i9))) {
                        AbstractC0156a.r("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i7 = i8;
            } else {
                return;
            }
        }
    }

    public final m0 a(int i7) {
        return (m0) this.f1147r.get(i7);
    }

    public final int b(m0 m0Var) {
        int indexOf = this.f1147r.indexOf(m0Var);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f1146q == n0Var.f1146q && this.f1147r.equals(n0Var.f1147r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1148s == 0) {
            this.f1148s = this.f1147r.hashCode();
        }
        return this.f1148s;
    }
}
