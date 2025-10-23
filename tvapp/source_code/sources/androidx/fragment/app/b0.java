package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0332j;
import java.util.LinkedHashMap;
import l0.C0967c;
/* loaded from: classes.dex */
public final class b0 implements InterfaceC0332j, A0.g, androidx.lifecycle.c0 {

    /* renamed from: q  reason: collision with root package name */
    public final ComponentCallbacksC0269x f6018q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.lifecycle.b0 f6019r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f6020s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.lifecycle.Y f6021t;

    /* renamed from: u  reason: collision with root package name */
    public C0344w f6022u = null;

    /* renamed from: v  reason: collision with root package name */
    public A0.f f6023v = null;

    public b0(ComponentCallbacksC0269x componentCallbacksC0269x, androidx.lifecycle.b0 b0Var, E1.b bVar) {
        this.f6018q = componentCallbacksC0269x;
        this.f6019r = b0Var;
        this.f6020s = bVar;
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public final C0967c a() {
        Application application;
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6018q;
        Context applicationContext = componentCallbacksC0269x.a0().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C0967c c0967c = new C0967c(0);
        LinkedHashMap linkedHashMap = c0967c.f12233a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.W.f6801a, application);
        }
        linkedHashMap.put(androidx.lifecycle.P.f6773a, componentCallbacksC0269x);
        linkedHashMap.put(androidx.lifecycle.P.f6774b, this);
        Bundle bundle = componentCallbacksC0269x.f6139v;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.P.f6775c, bundle);
        }
        return c0967c;
    }

    public final void b(EnumC0336n enumC0336n) {
        this.f6022u.G(enumC0336n);
    }

    public final void c() {
        if (this.f6022u == null) {
            this.f6022u = new C0344w(this);
            A0.f fVar = new A0.f(this);
            this.f6023v = fVar;
            fVar.f();
            this.f6020s.run();
        }
    }

    @Override // A0.g
    public final A0.e f() {
        c();
        return (A0.e) this.f6023v.f13c;
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 p() {
        c();
        return this.f6019r;
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        c();
        return this.f6022u;
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public final androidx.lifecycle.Y r() {
        Application application;
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6018q;
        androidx.lifecycle.Y r3 = componentCallbacksC0269x.r();
        if (!r3.equals(componentCallbacksC0269x.f6129h0)) {
            this.f6021t = r3;
            return r3;
        }
        if (this.f6021t == null) {
            Context applicationContext = componentCallbacksC0269x.a0().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f6021t = new androidx.lifecycle.T(application, componentCallbacksC0269x, componentCallbacksC0269x.f6139v);
        }
        return this.f6021t;
    }
}
