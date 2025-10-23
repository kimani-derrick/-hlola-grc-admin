package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0332j;
import androidx.lifecycle.InterfaceC0342u;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l0.C0967c;
import r0.AbstractC1111a;
/* renamed from: androidx.fragment.app.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacksC0269x implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0342u, androidx.lifecycle.c0, InterfaceC0332j, A0.g {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f6097m0 = new Object();

    /* renamed from: A  reason: collision with root package name */
    public boolean f6098A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f6099B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f6100C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f6101D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f6102E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f6103G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f6104H;

    /* renamed from: I  reason: collision with root package name */
    public int f6105I;

    /* renamed from: J  reason: collision with root package name */
    public S f6106J;

    /* renamed from: K  reason: collision with root package name */
    public C0271z f6107K;

    /* renamed from: M  reason: collision with root package name */
    public ComponentCallbacksC0269x f6109M;

    /* renamed from: N  reason: collision with root package name */
    public int f6110N;

    /* renamed from: O  reason: collision with root package name */
    public int f6111O;

    /* renamed from: P  reason: collision with root package name */
    public String f6112P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f6113Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f6114R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f6115S;

    /* renamed from: U  reason: collision with root package name */
    public boolean f6117U;

    /* renamed from: V  reason: collision with root package name */
    public ViewGroup f6118V;
    public View W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f6119X;

    /* renamed from: Z  reason: collision with root package name */
    public C0267v f6121Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6122a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6123b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f6124c0;

    /* renamed from: d0  reason: collision with root package name */
    public EnumC0337o f6125d0;

    /* renamed from: e0  reason: collision with root package name */
    public C0344w f6126e0;

    /* renamed from: f0  reason: collision with root package name */
    public b0 f6127f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.A f6128g0;

    /* renamed from: h0  reason: collision with root package name */
    public androidx.lifecycle.T f6129h0;

    /* renamed from: i0  reason: collision with root package name */
    public A0.f f6130i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AtomicInteger f6131j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f6132k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C0264s f6133l0;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f6135r;

    /* renamed from: s  reason: collision with root package name */
    public SparseArray f6136s;

    /* renamed from: t  reason: collision with root package name */
    public Bundle f6137t;

    /* renamed from: v  reason: collision with root package name */
    public Bundle f6139v;

    /* renamed from: w  reason: collision with root package name */
    public ComponentCallbacksC0269x f6140w;

    /* renamed from: y  reason: collision with root package name */
    public int f6142y;

    /* renamed from: q  reason: collision with root package name */
    public int f6134q = -1;

    /* renamed from: u  reason: collision with root package name */
    public String f6138u = UUID.randomUUID().toString();

    /* renamed from: x  reason: collision with root package name */
    public String f6141x = null;

    /* renamed from: z  reason: collision with root package name */
    public Boolean f6143z = null;

    /* renamed from: L  reason: collision with root package name */
    public S f6108L = new S();

    /* renamed from: T  reason: collision with root package name */
    public final boolean f6116T = true;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f6120Y = true;

    public ComponentCallbacksC0269x() {
        new P.b(7, this);
        this.f6125d0 = EnumC0337o.f6821u;
        this.f6128g0 = new androidx.lifecycle.A();
        this.f6131j0 = new AtomicInteger();
        this.f6132k0 = new ArrayList();
        this.f6133l0 = new C0264s(this);
        x();
    }

    public final boolean A() {
        if (!this.f6113Q) {
            S s6 = this.f6106J;
            if (s6 != null) {
                ComponentCallbacksC0269x componentCallbacksC0269x = this.f6109M;
                s6.getClass();
                if (componentCallbacksC0269x != null && componentCallbacksC0269x.A()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean B() {
        return this.f6105I > 0;
    }

    public void C() {
        this.f6117U = true;
    }

    public final void D(int i7, int i8, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    public void E(Activity activity) {
        this.f6117U = true;
    }

    public void F(Context context) {
        Activity activity;
        this.f6117U = true;
        C0271z c0271z = this.f6107K;
        if (c0271z == null) {
            activity = null;
        } else {
            activity = c0271z.f6146r;
        }
        if (activity != null) {
            this.f6117U = false;
            E(activity);
        }
    }

    public void G(Bundle bundle) {
        Bundle bundle2;
        this.f6117U = true;
        Bundle bundle3 = this.f6135r;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f6108L.Z(bundle2);
            S s6 = this.f6108L;
            s6.f5914G = false;
            s6.f5915H = false;
            s6.f5921N.f5959i = false;
            s6.u(1);
        }
        S s7 = this.f6108L;
        if (s7.f5940u < 1) {
            s7.f5914G = false;
            s7.f5915H = false;
            s7.f5921N.f5959i = false;
            s7.u(1);
        }
    }

    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void I() {
        this.f6117U = true;
    }

    public void J() {
        this.f6117U = true;
    }

    public void K() {
        this.f6117U = true;
    }

    public LayoutInflater L(Bundle bundle) {
        C0271z c0271z = this.f6107K;
        if (c0271z != null) {
            q1.g gVar = c0271z.f6150v;
            LayoutInflater cloneInContext = gVar.getLayoutInflater().cloneInContext(gVar);
            cloneInContext.setFactory2(this.f6108L.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void M(boolean z7) {
    }

    public void N(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.f6117U = true;
        C0271z c0271z = this.f6107K;
        if (c0271z == null) {
            activity = null;
        } else {
            activity = c0271z.f6146r;
        }
        if (activity != null) {
            this.f6117U = true;
        }
    }

    public void O() {
        this.f6117U = true;
    }

    public void P(boolean z7) {
    }

    public void Q() {
        this.f6117U = true;
    }

    public void R(Bundle bundle) {
    }

    public void S() {
        this.f6117U = true;
    }

    public void T() {
        this.f6117U = true;
    }

    public void U(View view, Bundle bundle) {
    }

    public void V(Bundle bundle) {
        this.f6117U = true;
    }

    public final boolean W() {
        if (!this.f6113Q) {
            return this.f6108L.j();
        }
        return false;
    }

    public void X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6108L.T();
        this.f6104H = true;
        this.f6127f0 = new b0(this, p(), new E1.b(10, this));
        View H6 = H(layoutInflater, viewGroup, bundle);
        this.W = H6;
        if (H6 != null) {
            this.f6127f0.c();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.W + " for Fragment " + this);
            }
            View view = this.W;
            b0 b0Var = this.f6127f0;
            M5.g.f(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, b0Var);
            View view2 = this.W;
            b0 b0Var2 = this.f6127f0;
            M5.g.f(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, b0Var2);
            View view3 = this.W;
            b0 b0Var3 = this.f6127f0;
            M5.g.f(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, b0Var3);
            this.f6128g0.e(this.f6127f0);
        } else if (this.f6127f0.f6022u == null) {
            this.f6127f0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final r Y(androidx.activity.result.b bVar, p6.l lVar) {
        TVUpdateFragment tVUpdateFragment = (TVUpdateFragment) this;
        Z5.n nVar = new Z5.n(tVUpdateFragment);
        if (this.f6134q <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            C0266u c0266u = new C0266u(tVUpdateFragment, nVar, atomicReference, lVar, bVar);
            if (this.f6134q >= 0) {
                c0266u.a();
            } else {
                this.f6132k0.add(c0266u);
            }
            return new r(atomicReference);
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final q1.g Z() {
        q1.g m7 = m();
        if (m7 != null) {
            return m7;
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " not attached to an activity."));
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public final C0967c a() {
        Application application;
        Context applicationContext = a0().getApplicationContext();
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
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + a0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0967c c0967c = new C0967c(0);
        LinkedHashMap linkedHashMap = c0967c.f12233a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.W.f6801a, application);
        }
        linkedHashMap.put(androidx.lifecycle.P.f6773a, this);
        linkedHashMap.put(androidx.lifecycle.P.f6774b, this);
        Bundle bundle = this.f6139v;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.P.f6775c, bundle);
        }
        return c0967c;
    }

    public final Context a0() {
        Context o7 = o();
        if (o7 != null) {
            return o7;
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " not attached to a context."));
    }

    public final View b0() {
        View view = this.W;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void c0(int i7, int i8, int i9, int i10) {
        if (this.f6121Z == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        l().f6089b = i7;
        l().f6090c = i8;
        l().d = i9;
        l().f6091e = i10;
    }

    public final void d0(Bundle bundle) {
        S s6 = this.f6106J;
        if (s6 != null && s6 != null && s6.R()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f6139v = bundle;
    }

    public final void e0(Intent intent) {
        C0271z c0271z = this.f6107K;
        if (c0271z != null) {
            c0271z.f6147s.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " not attached to Activity"));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // A0.g
    public final A0.e f() {
        return (A0.e) this.f6130i0.f13c;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i() {
        A();
    }

    public p6.l j() {
        return new C0265t(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.fragment.app.v] */
    public final C0267v l() {
        if (this.f6121Z == null) {
            ?? obj = new Object();
            Object obj2 = f6097m0;
            obj.f6092g = obj2;
            obj.f6093h = obj2;
            obj.f6094i = obj2;
            obj.f6095j = 1.0f;
            obj.f6096k = null;
            this.f6121Z = obj;
        }
        return this.f6121Z;
    }

    public final q1.g m() {
        C0271z c0271z = this.f6107K;
        if (c0271z == null) {
            return null;
        }
        return (q1.g) c0271z.f6146r;
    }

    public final S n() {
        if (this.f6107K != null) {
            return this.f6108L;
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " has not been attached yet."));
    }

    public Context o() {
        C0271z c0271z = this.f6107K;
        if (c0271z == null) {
            return null;
        }
        return c0271z.f6147s;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6117U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Z().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6117U = true;
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 p() {
        if (this.f6106J != null) {
            if (s() != 1) {
                HashMap hashMap = this.f6106J.f5921N.f;
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) hashMap.get(this.f6138u);
                if (b0Var == null) {
                    androidx.lifecycle.b0 b0Var2 = new androidx.lifecycle.b0();
                    hashMap.put(this.f6138u, b0Var2);
                    return b0Var2;
                }
                return b0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        return this.f6126e0;
    }

    public androidx.lifecycle.Y r() {
        Application application;
        if (this.f6106J != null) {
            if (this.f6129h0 == null) {
                Context applicationContext = a0().getApplicationContext();
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
                if (application == null && Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + a0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f6129h0 = new androidx.lifecycle.T(application, this, this.f6139v);
            }
            return this.f6129h0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final int s() {
        EnumC0337o enumC0337o = this.f6125d0;
        return (enumC0337o == EnumC0337o.f6818r || this.f6109M == null) ? enumC0337o.ordinal() : Math.min(enumC0337o.ordinal(), this.f6109M.s());
    }

    public final S t() {
        S s6 = this.f6106J;
        if (s6 != null) {
            return s6;
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", this, " not associated with a fragment manager."));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6138u);
        if (this.f6110N != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f6110N));
        }
        if (this.f6112P != null) {
            sb.append(" tag=");
            sb.append(this.f6112P);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Resources u() {
        return a0().getResources();
    }

    public final String v(int i7) {
        return u().getString(i7);
    }

    public final b0 w() {
        b0 b0Var = this.f6127f0;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException(AbstractC1111a.q("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void x() {
        this.f6126e0 = new C0344w(this);
        this.f6130i0 = new A0.f(this);
        this.f6129h0 = null;
        ArrayList arrayList = this.f6132k0;
        C0264s c0264s = this.f6133l0;
        if (!arrayList.contains(c0264s)) {
            if (this.f6134q >= 0) {
                c0264s.a();
            } else {
                arrayList.add(c0264s);
            }
        }
    }

    public final void y() {
        x();
        this.f6124c0 = this.f6138u;
        this.f6138u = UUID.randomUUID().toString();
        this.f6098A = false;
        this.f6099B = false;
        this.f6102E = false;
        this.F = false;
        this.f6103G = false;
        this.f6105I = 0;
        this.f6106J = null;
        this.f6108L = new S();
        this.f6107K = null;
        this.f6110N = 0;
        this.f6111O = 0;
        this.f6112P = null;
        this.f6113Q = false;
        this.f6114R = false;
    }

    public final boolean z() {
        return this.f6107K != null && this.f6098A;
    }
}
