package e2;

import Z2.AbstractC0156a;
import Z2.C0162g;
import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class r0 implements InterfaceC0604f {

    /* renamed from: q  reason: collision with root package name */
    public final C0162g f10068q;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC0156a.k(!false);
        new C0162g(sparseBooleanArray);
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
    }

    public r0(C0162g c0162g) {
        this.f10068q = c0162g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        return this.f10068q.equals(((r0) obj).f10068q);
    }

    public final int hashCode() {
        return this.f10068q.hashCode();
    }
}
