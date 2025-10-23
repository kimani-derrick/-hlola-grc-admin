package n0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0332j;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.LinkedHashMap;
import java.util.Set;
import l0.C0967c;
import z5.C1527i;
/* renamed from: n0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019j implements InterfaceC0342u, c0, InterfaceC0332j, A0.g {

    /* renamed from: q  reason: collision with root package name */
    public final Context f12542q;

    /* renamed from: r  reason: collision with root package name */
    public v f12543r;

    /* renamed from: s  reason: collision with root package name */
    public final Bundle f12544s;

    /* renamed from: t  reason: collision with root package name */
    public EnumC0337o f12545t;

    /* renamed from: u  reason: collision with root package name */
    public final q f12546u;

    /* renamed from: v  reason: collision with root package name */
    public final String f12547v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f12548w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f12551z;

    /* renamed from: x  reason: collision with root package name */
    public final C0344w f12549x = new C0344w(this);

    /* renamed from: y  reason: collision with root package name */
    public final A0.f f12550y = new A0.f(this);

    /* renamed from: A  reason: collision with root package name */
    public final C1527i f12540A = new C1527i(new D0.h(11, this));

    /* renamed from: B  reason: collision with root package name */
    public EnumC0337o f12541B = EnumC0337o.f6818r;

    public C1019j(Context context, v vVar, Bundle bundle, EnumC0337o enumC0337o, q qVar, String str, Bundle bundle2) {
        this.f12542q = context;
        this.f12543r = vVar;
        this.f12544s = bundle;
        this.f12545t = enumC0337o;
        this.f12546u = qVar;
        this.f12547v = str;
        this.f12548w = bundle2;
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public final C0967c a() {
        Context context;
        C0967c c0967c = new C0967c(0);
        Application application = null;
        Context context2 = this.f12542q;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = context;
        }
        LinkedHashMap linkedHashMap = c0967c.f12233a;
        if (application != null) {
            linkedHashMap.put(W.f6801a, application);
        }
        linkedHashMap.put(androidx.lifecycle.P.f6773a, this);
        linkedHashMap.put(androidx.lifecycle.P.f6774b, this);
        Bundle bundle = this.f12544s;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.P.f6775c, bundle);
        }
        return c0967c;
    }

    public final void b(EnumC0337o enumC0337o) {
        M5.g.f(enumC0337o, "maxState");
        this.f12541B = enumC0337o;
        c();
    }

    public final void c() {
        EnumC0337o enumC0337o;
        if (!this.f12551z) {
            A0.f fVar = this.f12550y;
            fVar.f();
            this.f12551z = true;
            if (this.f12546u != null) {
                androidx.lifecycle.P.f(this);
            }
            fVar.g(this.f12548w);
        }
        int ordinal = this.f12545t.ordinal();
        int ordinal2 = this.f12541B.ordinal();
        C0344w c0344w = this.f12549x;
        if (ordinal < ordinal2) {
            enumC0337o = this.f12545t;
        } else {
            enumC0337o = this.f12541B;
        }
        c0344w.I(enumC0337o);
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj == null || !(obj instanceof C1019j)) {
            return false;
        }
        C1019j c1019j = (C1019j) obj;
        if (!M5.g.a(this.f12547v, c1019j.f12547v) || !M5.g.a(this.f12543r, c1019j.f12543r) || !M5.g.a(this.f12549x, c1019j.f12549x) || !M5.g.a((A0.e) this.f12550y.f13c, (A0.e) c1019j.f12550y.f13c)) {
            return false;
        }
        Bundle bundle = this.f12544s;
        Bundle bundle2 = c1019j.f12544s;
        if (!M5.g.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!keySet.isEmpty()) {
                for (String str : keySet) {
                    Object obj3 = bundle.get(str);
                    if (bundle2 != null) {
                        obj2 = bundle2.get(str);
                    } else {
                        obj2 = null;
                    }
                    if (!M5.g.a(obj3, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // A0.g
    public final A0.e f() {
        return (A0.e) this.f12550y.f13c;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i7;
        int hashCode = this.f12543r.hashCode() + (this.f12547v.hashCode() * 31);
        Bundle bundle = this.f12544s;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i8 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                hashCode = i8 + i7;
            }
        }
        return ((A0.e) this.f12550y.f13c).hashCode() + ((this.f12549x.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // androidx.lifecycle.c0
    public final b0 p() {
        if (this.f12551z) {
            if (this.f12549x.f6830t != EnumC0337o.f6817q) {
                q qVar = this.f12546u;
                if (qVar != null) {
                    String str = this.f12547v;
                    M5.g.f(str, "backStackEntryId");
                    LinkedHashMap linkedHashMap = qVar.d;
                    b0 b0Var = (b0) linkedHashMap.get(str);
                    if (b0Var == null) {
                        b0 b0Var2 = new b0();
                        linkedHashMap.put(str, b0Var2);
                        return b0Var2;
                    }
                    return b0Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        return this.f12549x;
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return (T) this.f12540A.getValue();
    }
}
