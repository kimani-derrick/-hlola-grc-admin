package W2;

import H2.m0;
import O3.E;
import Z2.H;
import e2.InterfaceC0604f;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class u implements InterfaceC0604f {

    /* renamed from: s  reason: collision with root package name */
    public static final String f3880s;

    /* renamed from: t  reason: collision with root package name */
    public static final String f3881t;

    /* renamed from: q  reason: collision with root package name */
    public final m0 f3882q;

    /* renamed from: r  reason: collision with root package name */
    public final E f3883r;

    static {
        int i7 = H.f4603a;
        f3880s = Integer.toString(0, 36);
        f3881t = Integer.toString(1, 36);
    }

    public u(m0 m0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m0Var.f1133q)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3882q = m0Var;
        this.f3883r = E.s(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3882q.equals(uVar.f3882q) && this.f3883r.equals(uVar.f3883r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3883r.hashCode() * 31) + this.f3882q.hashCode();
    }
}
