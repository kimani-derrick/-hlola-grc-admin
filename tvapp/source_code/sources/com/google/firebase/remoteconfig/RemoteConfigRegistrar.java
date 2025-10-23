package com.google.firebase.remoteconfig;

import L4.b;
import N4.e;
import U4.p;
import X4.a;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import h4.f;
import i4.C0774c;
import j4.C0840a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import l4.InterfaceC0974b;
import n4.InterfaceC1037b;
import o4.C1069a;
import o4.InterfaceC1070b;
import o4.g;
import o4.o;
@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static p lambda$getComponents$0(o oVar, InterfaceC1070b interfaceC1070b) {
        C0774c c0774c;
        Context context = (Context) interfaceC1070b.c(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC1070b.g(oVar);
        f fVar = (f) interfaceC1070b.c(f.class);
        e eVar = (e) interfaceC1070b.c(e.class);
        C0840a c0840a = (C0840a) interfaceC1070b.c(C0840a.class);
        synchronized (c0840a) {
            try {
                if (!c0840a.f11854a.containsKey("frc")) {
                    c0840a.f11854a.put("frc", new C0774c(c0840a.f11855b));
                }
                c0774c = (C0774c) c0840a.f11854a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new p(context, scheduledExecutorService, fVar, eVar, c0774c, interfaceC1070b.d(InterfaceC0974b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        o oVar = new o(InterfaceC1037b.class, ScheduledExecutorService.class);
        X x7 = new X(p.class, new Class[]{a.class});
        x7.f9776a = LIBRARY_NAME;
        x7.b(g.a(Context.class));
        x7.b(new g(oVar, 1, 0));
        x7.b(g.a(f.class));
        x7.b(g.a(e.class));
        x7.b(g.a(C0840a.class));
        x7.b(new g(0, 1, InterfaceC0974b.class));
        x7.f = new b(oVar, 1);
        x7.d();
        return Arrays.asList(x7.c(), m3.g.h(LIBRARY_NAME, "22.0.0"));
    }
}
