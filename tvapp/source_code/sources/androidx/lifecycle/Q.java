package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import z5.C1527i;
/* loaded from: classes.dex */
public final class Q implements A0.d {

    /* renamed from: a  reason: collision with root package name */
    public final A0.e f6776a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6777b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f6778c;
    public final C1527i d;

    public Q(A0.e eVar, c0 c0Var) {
        M5.g.f(eVar, "savedStateRegistry");
        M5.g.f(c0Var, "viewModelStoreOwner");
        this.f6776a = eVar;
        this.d = new C1527i(new D0.h(5, c0Var));
    }

    @Override // A0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6778c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((S) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a7 = ((N) entry.getValue()).f6771e.a();
            if (!M5.g.a(a7, Bundle.EMPTY)) {
                bundle.putBundle(str, a7);
            }
        }
        this.f6777b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f6777b) {
            Bundle b7 = this.f6776a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f6778c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b7 != null) {
                bundle.putAll(b7);
            }
            this.f6778c = bundle;
            this.f6777b = true;
            S s6 = (S) this.d.getValue();
        }
    }
}
