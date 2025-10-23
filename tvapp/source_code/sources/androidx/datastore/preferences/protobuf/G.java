package androidx.datastore.preferences.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public final class G extends H {
    @Override // androidx.datastore.preferences.protobuf.H
    public final void a(long j7, Object obj) {
        ((AbstractC0222b) ((InterfaceC0245y) s0.d.i(j7, obj))).f5742q = false;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final void b(long j7, Object obj, Object obj2) {
        r0 r0Var = s0.d;
        InterfaceC0245y interfaceC0245y = (InterfaceC0245y) r0Var.i(j7, obj);
        InterfaceC0245y interfaceC0245y2 = (InterfaceC0245y) r0Var.i(j7, obj2);
        int size = interfaceC0245y.size();
        int size2 = interfaceC0245y2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0222b) interfaceC0245y).f5742q) {
                interfaceC0245y = interfaceC0245y.j(size2 + size);
            }
            interfaceC0245y.addAll(interfaceC0245y2);
        }
        if (size > 0) {
            interfaceC0245y2 = interfaceC0245y;
        }
        s0.r(j7, obj, interfaceC0245y2);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final List c(long j7, Object obj) {
        int i7;
        InterfaceC0245y interfaceC0245y = (InterfaceC0245y) s0.d.i(j7, obj);
        if (!((AbstractC0222b) interfaceC0245y).f5742q) {
            int size = interfaceC0245y.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            InterfaceC0245y j8 = interfaceC0245y.j(i7);
            s0.r(j7, obj, j8);
            return j8;
        }
        return interfaceC0245y;
    }
}
