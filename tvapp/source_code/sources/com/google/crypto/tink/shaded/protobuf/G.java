package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public final class G extends H {
    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void a(long j7, Object obj) {
        ((AbstractC0524b) ((InterfaceC0546y) n0.f9149c.i(j7, obj))).f9103q = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void b(long j7, Object obj, Object obj2) {
        m0 m0Var = n0.f9149c;
        InterfaceC0546y interfaceC0546y = (InterfaceC0546y) m0Var.i(j7, obj);
        InterfaceC0546y interfaceC0546y2 = (InterfaceC0546y) m0Var.i(j7, obj2);
        int size = interfaceC0546y.size();
        int size2 = interfaceC0546y2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0524b) interfaceC0546y).f9103q) {
                interfaceC0546y = interfaceC0546y.j(size2 + size);
            }
            interfaceC0546y.addAll(interfaceC0546y2);
        }
        if (size > 0) {
            interfaceC0546y2 = interfaceC0546y;
        }
        n0.v(j7, obj, interfaceC0546y2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final List c(long j7, Object obj) {
        int i7;
        InterfaceC0546y interfaceC0546y = (InterfaceC0546y) n0.f9149c.i(j7, obj);
        if (!((AbstractC0524b) interfaceC0546y).f9103q) {
            int size = interfaceC0546y.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            InterfaceC0546y j8 = interfaceC0546y.j(i7);
            n0.v(j7, obj, j8);
            return j8;
        }
        return interfaceC0546y;
    }
}
