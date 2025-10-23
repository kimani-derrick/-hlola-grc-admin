package A0;

import android.content.Context;
import android.os.Bundle;
import androidx.leanback.app.F;
import androidx.lifecycle.EnumC0337o;
import androidx.savedstate.Recreator;
import e2.RunnableC0594a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import t3.C1251o;
import t3.InterfaceC1250n;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12b;

    /* renamed from: c  reason: collision with root package name */
    public Object f13c;

    public f(g gVar) {
        this.f12b = gVar;
        this.f13c = new e();
    }

    public void a() {
        synchronized (this.f12b) {
            try {
                this.f11a = true;
                Iterator it = ((ArrayList) this.f13c).iterator();
                while (it.hasNext()) {
                    ((L5.a) it.next()).b();
                }
                ((ArrayList) this.f13c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        return false;
    }

    public void f() {
        g gVar = (g) this.f12b;
        P1.c q5 = gVar.q();
        if (q5.l() == EnumC0337o.f6818r) {
            q5.g(new Recreator(gVar));
            e eVar = (e) this.f13c;
            eVar.getClass();
            if (!eVar.f7a) {
                q5.g(new b(0, eVar));
                eVar.f7a = true;
                this.f11a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public void g(Bundle bundle) {
        P1.c q5;
        boolean z7;
        Bundle bundle2;
        if (!this.f11a) {
            f();
        }
        if (((g) this.f12b).q().l().compareTo(EnumC0337o.f6820t) >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            e eVar = (e) this.f13c;
            if (eVar.f7a) {
                if (!eVar.f8b) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    eVar.f10e = bundle2;
                    eVar.f8b = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + q5.l()).toString());
    }

    public void h(Bundle bundle) {
        M5.g.f(bundle, "outBundle");
        e eVar = (e) this.f13c;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.f10e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.f fVar = (m.f) eVar.d;
        fVar.getClass();
        m.d dVar = new m.d(fVar);
        fVar.f12378s.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void j() {
        if (this.f11a) {
            ((Context) this.f12b).unregisterReceiver((RunnableC0594a) this.f13c);
            this.f11a = false;
        }
    }

    public void m(InterfaceC1250n interfaceC1250n) {
        synchronized (this.f12b) {
            try {
                if (((ArrayDeque) this.f13c) == null) {
                    this.f13c = new ArrayDeque();
                }
                ((ArrayDeque) this.f13c).add(interfaceC1250n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(C1251o c1251o) {
        InterfaceC1250n interfaceC1250n;
        synchronized (this.f12b) {
            if (((ArrayDeque) this.f13c) != null && !this.f11a) {
                this.f11a = true;
                while (true) {
                    synchronized (this.f12b) {
                        try {
                            interfaceC1250n = (InterfaceC1250n) ((ArrayDeque) this.f13c).poll();
                            if (interfaceC1250n == null) {
                                this.f11a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC1250n.a(c1251o);
                }
            }
        }
    }

    public f(F f) {
        this.f12b = f;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void i(int i7) {
    }

    public void k(boolean z7) {
    }

    public void l(boolean z7) {
    }
}
