package com.google.firebase.installations;

import A4.a;
import L4.g;
import N4.d;
import N4.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import f2.c;
import h4.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n4.InterfaceC1036a;
import n4.InterfaceC1037b;
import o4.C1069a;
import o4.InterfaceC1070b;
import o4.o;
import p4.j;
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(InterfaceC1070b interfaceC1070b) {
        return new d((f) interfaceC1070b.c(f.class), interfaceC1070b.d(g.class), (ExecutorService) interfaceC1070b.g(new o(InterfaceC1036a.class, ExecutorService.class)), new j((Executor) interfaceC1070b.g(new o(InterfaceC1037b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        X a7 = C1069a.a(e.class);
        a7.f9776a = LIBRARY_NAME;
        a7.b(o4.g.a(f.class));
        a7.b(new o4.g(0, 1, g.class));
        a7.b(new o4.g(new o(InterfaceC1036a.class, ExecutorService.class), 1, 0));
        a7.b(new o4.g(new o(InterfaceC1037b.class, Executor.class), 1, 0));
        a7.f = new a(10);
        C1069a c5 = a7.c();
        L4.f fVar = new L4.f(0);
        X a8 = C1069a.a(L4.f.class);
        a8.f9778c = 1;
        a8.f = new c(fVar);
        return Arrays.asList(c5, a8.c(), m3.g.h(LIBRARY_NAME, "17.2.0"));
    }
}
