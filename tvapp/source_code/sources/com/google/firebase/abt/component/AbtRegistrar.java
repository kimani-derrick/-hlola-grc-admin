package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import f2.d;
import j4.C0840a;
import java.util.Arrays;
import java.util.List;
import l4.InterfaceC0974b;
import o4.C1069a;
import o4.InterfaceC1070b;
import o4.g;
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C0840a lambda$getComponents$0(InterfaceC1070b interfaceC1070b) {
        return new C0840a((Context) interfaceC1070b.c(Context.class), interfaceC1070b.d(InterfaceC0974b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        X a7 = C1069a.a(C0840a.class);
        a7.f9776a = LIBRARY_NAME;
        a7.b(g.a(Context.class));
        a7.b(new g(0, 1, InterfaceC0974b.class));
        a7.f = new d(21);
        return Arrays.asList(a7.c(), m3.g.h(LIBRARY_NAME, "21.1.1"));
    }
}
