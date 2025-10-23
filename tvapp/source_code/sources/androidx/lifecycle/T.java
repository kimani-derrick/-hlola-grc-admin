package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.List;
import l0.C0967c;
/* loaded from: classes.dex */
public final class T extends a0 implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final Application f6792a;

    /* renamed from: b  reason: collision with root package name */
    public final X f6793b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f6794c;
    public final P1.c d;

    /* renamed from: e  reason: collision with root package name */
    public final A0.e f6795e;

    public T(Application application, A0.g gVar, Bundle bundle) {
        X x7;
        M5.g.f(gVar, "owner");
        this.f6795e = gVar.f();
        this.d = gVar.q();
        this.f6794c = bundle;
        this.f6792a = application;
        if (application != null) {
            if (X.f6803c == null) {
                X.f6803c = new X(application);
            }
            x7 = X.f6803c;
            M5.g.c(x7);
        } else {
            x7 = new X(null);
        }
        this.f6793b = x7;
    }

    @Override // androidx.lifecycle.Y
    public final V a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Y
    public final V b(Class cls, C0967c c0967c) {
        List list;
        W w7 = W.f6802b;
        LinkedHashMap linkedHashMap = c0967c.f12233a;
        String str = (String) linkedHashMap.get(w7);
        if (str != null) {
            if (linkedHashMap.get(P.f6773a) != null && linkedHashMap.get(P.f6774b) != null) {
                Application application = (Application) linkedHashMap.get(W.f6801a);
                boolean isAssignableFrom = AbstractC0323a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    list = U.f6796a;
                } else {
                    list = U.f6797b;
                }
                Constructor a7 = U.a(cls, list);
                if (a7 == null) {
                    return this.f6793b.b(cls, c0967c);
                }
                if (isAssignableFrom && application != null) {
                    return U.b(cls, a7, application, P.d(c0967c));
                }
                return U.b(cls, a7, P.d(c0967c));
            } else if (this.d != null) {
                return d(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.a0
    public final void c(V v5) {
        P1.c cVar = this.d;
        if (cVar != null) {
            A0.e eVar = this.f6795e;
            M5.g.c(eVar);
            P.a(v5, eVar, cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, androidx.lifecycle.Z] */
    public final V d(Class cls, String str) {
        List list;
        V b7;
        P1.c cVar = this.d;
        if (cVar != null) {
            boolean isAssignableFrom = AbstractC0323a.class.isAssignableFrom(cls);
            Application application = this.f6792a;
            if (isAssignableFrom && application != null) {
                list = U.f6796a;
            } else {
                list = U.f6797b;
            }
            Constructor a7 = U.a(cls, list);
            if (a7 == null) {
                if (application != null) {
                    return this.f6793b.a(cls);
                }
                if (Z.f6805a == null) {
                    Z.f6805a = new Object();
                }
                Z z7 = Z.f6805a;
                M5.g.c(z7);
                return z7.a(cls);
            }
            A0.e eVar = this.f6795e;
            M5.g.c(eVar);
            SavedStateHandleController b8 = P.b(eVar, cVar, str, this.f6794c);
            N n = b8.f6790r;
            if (isAssignableFrom && application != null) {
                b7 = U.b(cls, a7, application, n);
            } else {
                b7 = U.b(cls, a7, n);
            }
            b7.c(b8, "androidx.lifecycle.savedstate.vm.tag");
            return b7;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
