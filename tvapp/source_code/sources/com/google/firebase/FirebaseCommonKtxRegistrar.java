package com.google.firebase;

import A5.l;
import W5.AbstractC0113u;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import java.util.List;
import java.util.concurrent.Executor;
import n4.InterfaceC1036a;
import n4.InterfaceC1037b;
import n4.InterfaceC1038c;
import n4.InterfaceC1039d;
import o4.C1069a;
import o4.g;
import o4.o;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        X b7 = C1069a.b(new o(InterfaceC1036a.class, AbstractC0113u.class));
        b7.b(new g(new o(InterfaceC1036a.class, Executor.class), 1, 0));
        b7.f = h4.g.f10995r;
        C1069a c5 = b7.c();
        X b8 = C1069a.b(new o(InterfaceC1038c.class, AbstractC0113u.class));
        b8.b(new g(new o(InterfaceC1038c.class, Executor.class), 1, 0));
        b8.f = h4.g.f10996s;
        C1069a c6 = b8.c();
        X b9 = C1069a.b(new o(InterfaceC1037b.class, AbstractC0113u.class));
        b9.b(new g(new o(InterfaceC1037b.class, Executor.class), 1, 0));
        b9.f = h4.g.f10997t;
        C1069a c7 = b9.c();
        X b10 = C1069a.b(new o(InterfaceC1039d.class, AbstractC0113u.class));
        b10.b(new g(new o(InterfaceC1039d.class, Executor.class), 1, 0));
        b10.f = h4.g.f10998u;
        return l.L(c5, c6, c7, b10.c());
    }
}
