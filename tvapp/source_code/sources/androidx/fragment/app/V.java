package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class V extends androidx.lifecycle.V {

    /* renamed from: j  reason: collision with root package name */
    public static final U f5955j = new U(0);

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5957g;
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f5956e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public boolean f5958h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5959i = false;

    public V(boolean z7) {
        this.f5957g = z7;
    }

    @Override // androidx.lifecycle.V
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5958h = true;
    }

    public final void d(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC0269x);
        }
        f(componentCallbacksC0269x.f6138u, z7);
    }

    public final void e(String str, boolean z7) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        V v5 = (V) obj;
        return this.d.equals(v5.d) && this.f5956e.equals(v5.f5956e) && this.f.equals(v5.f);
    }

    public final void f(String str, boolean z7) {
        HashMap hashMap = this.f5956e;
        V v5 = (V) hashMap.get(str);
        if (v5 != null) {
            if (z7) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(v5.f5956e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v5.e((String) it.next(), true);
                }
            }
            v5.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f;
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) hashMap2.get(str);
        if (b0Var != null) {
            b0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void g(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (this.f5959i) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.d.remove(componentCallbacksC0269x.f6138u) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC0269x);
        }
    }

    public final int hashCode() {
        int hashCode = this.f5956e.hashCode();
        return this.f.hashCode() + ((hashCode + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f5956e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
