package com.google.firebase.datatransport;

import Q1.e;
import R1.a;
import T1.u;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import java.util.Arrays;
import java.util.List;
import o4.C1069a;
import o4.InterfaceC1070b;
import o4.g;
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ e lambda$getComponents$0(InterfaceC1070b interfaceC1070b) {
        u.b((Context) interfaceC1070b.c(Context.class));
        return u.a().c(a.f2881e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        X a7 = C1069a.a(e.class);
        a7.f9776a = LIBRARY_NAME;
        a7.b(g.a(Context.class));
        a7.f = new A4.a(2);
        return Arrays.asList(a7.c(), m3.g.h(LIBRARY_NAME, "18.1.8"));
    }
}
