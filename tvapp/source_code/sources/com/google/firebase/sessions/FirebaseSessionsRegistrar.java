package com.google.firebase.sessions;

import A4.a;
import A5.l;
import D5.i;
import M4.b;
import M5.g;
import N4.e;
import T4.c;
import W5.AbstractC0113u;
import Z4.C0176m;
import Z4.C0178o;
import Z4.E;
import Z4.I;
import Z4.InterfaceC0183u;
import Z4.L;
import Z4.N;
import Z4.W;
import Z4.X;
import android.content.Context;
import androidx.annotation.Keep;
import b5.j;
import com.google.firebase.components.ComponentRegistrar;
import h4.f;
import java.util.List;
import n4.InterfaceC1036a;
import n4.InterfaceC1037b;
import o4.C1069a;
import o4.InterfaceC1070b;
import o4.o;
@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C0178o Companion = new Object();
    private static final o firebaseApp = o.a(f.class);
    private static final o firebaseInstallationsApi = o.a(e.class);
    private static final o backgroundDispatcher = new o(InterfaceC1036a.class, AbstractC0113u.class);
    private static final o blockingDispatcher = new o(InterfaceC1037b.class, AbstractC0113u.class);
    private static final o transportFactory = o.a(Q1.e.class);
    private static final o sessionsSettings = o.a(j.class);
    private static final o sessionLifecycleServiceBinder = o.a(W.class);

    public static final C0176m getComponents$lambda$0(InterfaceC1070b interfaceC1070b) {
        Object g7 = interfaceC1070b.g(firebaseApp);
        g.e(g7, "container[firebaseApp]");
        Object g8 = interfaceC1070b.g(sessionsSettings);
        g.e(g8, "container[sessionsSettings]");
        Object g9 = interfaceC1070b.g(backgroundDispatcher);
        g.e(g9, "container[backgroundDispatcher]");
        Object g10 = interfaceC1070b.g(sessionLifecycleServiceBinder);
        g.e(g10, "container[sessionLifecycleServiceBinder]");
        return new C0176m((f) g7, (j) g8, (i) g9, (W) g10);
    }

    public static final N getComponents$lambda$1(InterfaceC1070b interfaceC1070b) {
        return new N();
    }

    public static final I getComponents$lambda$2(InterfaceC1070b interfaceC1070b) {
        Object g7 = interfaceC1070b.g(firebaseApp);
        g.e(g7, "container[firebaseApp]");
        f fVar = (f) g7;
        Object g8 = interfaceC1070b.g(firebaseInstallationsApi);
        g.e(g8, "container[firebaseInstallationsApi]");
        e eVar = (e) g8;
        Object g9 = interfaceC1070b.g(sessionsSettings);
        g.e(g9, "container[sessionsSettings]");
        j jVar = (j) g9;
        b f = interfaceC1070b.f(transportFactory);
        g.e(f, "container.getProvider(transportFactory)");
        c cVar = new c(27, f);
        Object g10 = interfaceC1070b.g(backgroundDispatcher);
        g.e(g10, "container[backgroundDispatcher]");
        return new L(fVar, eVar, jVar, cVar, (i) g10);
    }

    public static final j getComponents$lambda$3(InterfaceC1070b interfaceC1070b) {
        Object g7 = interfaceC1070b.g(firebaseApp);
        g.e(g7, "container[firebaseApp]");
        Object g8 = interfaceC1070b.g(blockingDispatcher);
        g.e(g8, "container[blockingDispatcher]");
        Object g9 = interfaceC1070b.g(backgroundDispatcher);
        g.e(g9, "container[backgroundDispatcher]");
        Object g10 = interfaceC1070b.g(firebaseInstallationsApi);
        g.e(g10, "container[firebaseInstallationsApi]");
        return new j((f) g7, (i) g8, (i) g9, (e) g10);
    }

    public static final InterfaceC0183u getComponents$lambda$4(InterfaceC1070b interfaceC1070b) {
        f fVar = (f) interfaceC1070b.g(firebaseApp);
        fVar.a();
        Context context = fVar.f10987a;
        g.e(context, "container[firebaseApp].applicationContext");
        Object g7 = interfaceC1070b.g(backgroundDispatcher);
        g.e(g7, "container[backgroundDispatcher]");
        return new E(context, (i) g7);
    }

    public static final W getComponents$lambda$5(InterfaceC1070b interfaceC1070b) {
        Object g7 = interfaceC1070b.g(firebaseApp);
        g.e(g7, "container[firebaseApp]");
        return new X((f) g7);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        e2.X a7 = C1069a.a(C0176m.class);
        a7.f9776a = LIBRARY_NAME;
        o oVar = firebaseApp;
        a7.b(o4.g.b(oVar));
        o oVar2 = sessionsSettings;
        a7.b(o4.g.b(oVar2));
        o oVar3 = backgroundDispatcher;
        a7.b(o4.g.b(oVar3));
        a7.b(o4.g.b(sessionLifecycleServiceBinder));
        a7.f = new a(20);
        a7.d();
        C1069a c5 = a7.c();
        e2.X a8 = C1069a.a(N.class);
        a8.f9776a = "session-generator";
        a8.f = new a(21);
        C1069a c6 = a8.c();
        e2.X a9 = C1069a.a(I.class);
        a9.f9776a = "session-publisher";
        a9.b(new o4.g(oVar, 1, 0));
        o oVar4 = firebaseInstallationsApi;
        a9.b(o4.g.b(oVar4));
        a9.b(new o4.g(oVar2, 1, 0));
        a9.b(new o4.g(transportFactory, 1, 1));
        a9.b(new o4.g(oVar3, 1, 0));
        a9.f = new a(22);
        C1069a c7 = a9.c();
        e2.X a10 = C1069a.a(j.class);
        a10.f9776a = "sessions-settings";
        a10.b(new o4.g(oVar, 1, 0));
        a10.b(o4.g.b(blockingDispatcher));
        a10.b(new o4.g(oVar3, 1, 0));
        a10.b(new o4.g(oVar4, 1, 0));
        a10.f = new a(23);
        C1069a c8 = a10.c();
        e2.X a11 = C1069a.a(InterfaceC0183u.class);
        a11.f9776a = "sessions-datastore";
        a11.b(new o4.g(oVar, 1, 0));
        a11.b(new o4.g(oVar3, 1, 0));
        a11.f = new a(24);
        C1069a c9 = a11.c();
        e2.X a12 = C1069a.a(W.class);
        a12.f9776a = "sessions-service-binder";
        a12.b(new o4.g(oVar, 1, 0));
        a12.f = new a(25);
        return l.L(c5, c6, c7, c8, c9, a12.c(), m3.g.h(LIBRARY_NAME, "2.0.1"));
    }
}
