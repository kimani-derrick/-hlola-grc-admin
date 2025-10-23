package androidx.fragment.app;

import H2.C0002c;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import d0.AbstractC0551d;
import d0.C0548a;
import d0.C0550c;
import d0.EnumC0549b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m0.C0985a;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final D f5976a;

    /* renamed from: b  reason: collision with root package name */
    public final C4.b f5977b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentCallbacksC0269x f5978c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f5979e = -1;

    public Z(D d, C4.b bVar, ComponentCallbacksC0269x componentCallbacksC0269x) {
        this.f5976a = d;
        this.f5977b = bVar;
        this.f5978c = componentCallbacksC0269x;
    }

    public final void a() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + componentCallbacksC0269x);
        }
        Bundle bundle2 = componentCallbacksC0269x.f6135r;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        componentCallbacksC0269x.f6108L.T();
        componentCallbacksC0269x.f6134q = 3;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.C();
        if (componentCallbacksC0269x.f6117U) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + componentCallbacksC0269x);
            }
            if (componentCallbacksC0269x.W != null) {
                Bundle bundle3 = componentCallbacksC0269x.f6135r;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = componentCallbacksC0269x.f6136s;
                if (sparseArray != null) {
                    componentCallbacksC0269x.W.restoreHierarchyState(sparseArray);
                    componentCallbacksC0269x.f6136s = null;
                }
                componentCallbacksC0269x.f6117U = false;
                componentCallbacksC0269x.V(bundle);
                if (componentCallbacksC0269x.f6117U) {
                    if (componentCallbacksC0269x.W != null) {
                        componentCallbacksC0269x.f6127f0.b(EnumC0336n.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onViewStateRestored()"));
                }
            }
            componentCallbacksC0269x.f6135r = null;
            S s6 = componentCallbacksC0269x.f6108L;
            s6.f5914G = false;
            s6.f5915H = false;
            s6.f5921N.f5959i = false;
            s6.u(4);
            this.f5976a.h(componentCallbacksC0269x, false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        View view;
        View view2;
        ComponentCallbacksC0269x componentCallbacksC0269x2;
        int i7 = -1;
        ComponentCallbacksC0269x componentCallbacksC0269x3 = this.f5978c;
        View view3 = componentCallbacksC0269x3.f6118V;
        while (true) {
            componentCallbacksC0269x = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof ComponentCallbacksC0269x) {
                componentCallbacksC0269x2 = (ComponentCallbacksC0269x) tag;
            } else {
                componentCallbacksC0269x2 = null;
            }
            if (componentCallbacksC0269x2 != null) {
                componentCallbacksC0269x = componentCallbacksC0269x2;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        ComponentCallbacksC0269x componentCallbacksC0269x4 = componentCallbacksC0269x3.f6109M;
        if (componentCallbacksC0269x != null && !componentCallbacksC0269x.equals(componentCallbacksC0269x4)) {
            int i8 = componentCallbacksC0269x3.f6111O;
            C0550c c0550c = AbstractC0551d.f9213a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(componentCallbacksC0269x3);
            sb.append(" within the view of parent fragment ");
            sb.append(componentCallbacksC0269x);
            sb.append(" via container with ID ");
            AbstractC0551d.b(new C0548a(componentCallbacksC0269x3, AbstractC0515y1.n(sb, i8, " without using parent's childFragmentManager")));
            AbstractC0551d.a(componentCallbacksC0269x3).getClass();
            EnumC0549b enumC0549b = EnumC0549b.f9209s;
            if (enumC0549b instanceof Void) {
                Void r22 = (Void) enumC0549b;
            }
        }
        C4.b bVar = this.f5977b;
        bVar.getClass();
        ViewGroup viewGroup = componentCallbacksC0269x3.f6118V;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) bVar.f421r;
            int indexOf = arrayList.indexOf(componentCallbacksC0269x3);
            int i9 = indexOf - 1;
            while (true) {
                if (i9 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        ComponentCallbacksC0269x componentCallbacksC0269x5 = (ComponentCallbacksC0269x) arrayList.get(indexOf);
                        if (componentCallbacksC0269x5.f6118V == viewGroup && (view = componentCallbacksC0269x5.W) != null) {
                            i7 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ComponentCallbacksC0269x componentCallbacksC0269x6 = (ComponentCallbacksC0269x) arrayList.get(i9);
                    if (componentCallbacksC0269x6.f6118V == viewGroup && (view2 = componentCallbacksC0269x6.W) != null) {
                        i7 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i9--;
                }
            }
        }
        componentCallbacksC0269x3.f6118V.addView(componentCallbacksC0269x3.W, i7);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + componentCallbacksC0269x);
        }
        ComponentCallbacksC0269x componentCallbacksC0269x2 = componentCallbacksC0269x.f6140w;
        Z z7 = null;
        C4.b bVar = this.f5977b;
        if (componentCallbacksC0269x2 != null) {
            Z z8 = (Z) ((HashMap) bVar.f422s).get(componentCallbacksC0269x2.f6138u);
            if (z8 != null) {
                componentCallbacksC0269x.f6141x = componentCallbacksC0269x.f6140w.f6138u;
                componentCallbacksC0269x.f6140w = null;
                z7 = z8;
            } else {
                throw new IllegalStateException("Fragment " + componentCallbacksC0269x + " declared target fragment " + componentCallbacksC0269x.f6140w + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = componentCallbacksC0269x.f6141x;
            if (str != null && (z7 = (Z) ((HashMap) bVar.f422s).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC0269x);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC1111a.t(sb, componentCallbacksC0269x.f6141x, " that does not belong to this FragmentManager!"));
            }
        }
        if (z7 != null) {
            z7.k();
        }
        S s6 = componentCallbacksC0269x.f6106J;
        componentCallbacksC0269x.f6107K = s6.f5941v;
        componentCallbacksC0269x.f6109M = s6.f5943x;
        D d = this.f5976a;
        d.o(componentCallbacksC0269x, false);
        ArrayList arrayList = componentCallbacksC0269x.f6132k0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0268w) it.next()).a();
        }
        arrayList.clear();
        componentCallbacksC0269x.f6108L.b(componentCallbacksC0269x.f6107K, componentCallbacksC0269x.j(), componentCallbacksC0269x);
        componentCallbacksC0269x.f6134q = 0;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.F(componentCallbacksC0269x.f6107K.f6147s);
        if (componentCallbacksC0269x.f6117U) {
            S s7 = componentCallbacksC0269x.f6106J;
            Iterator it2 = s7.f5934o.iterator();
            while (it2.hasNext()) {
                ((W) it2.next()).a(s7, componentCallbacksC0269x);
            }
            S s8 = componentCallbacksC0269x.f6108L;
            s8.f5914G = false;
            s8.f5915H = false;
            s8.f5921N.f5959i = false;
            s8.u(0);
            d.i(componentCallbacksC0269x, false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onAttach()"));
    }

    public final int d() {
        int i7;
        int i8;
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (componentCallbacksC0269x.f6106J == null) {
            return componentCallbacksC0269x.f6134q;
        }
        int i9 = this.f5979e;
        int ordinal = componentCallbacksC0269x.f6125d0.ordinal();
        int i10 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i9 = Math.min(i9, -1);
                    }
                } else {
                    i9 = Math.min(i9, 5);
                }
            } else {
                i9 = Math.min(i9, 1);
            }
        } else {
            i9 = Math.min(i9, 0);
        }
        if (componentCallbacksC0269x.f6102E) {
            if (componentCallbacksC0269x.F) {
                i9 = Math.max(this.f5979e, 2);
                View view = componentCallbacksC0269x.W;
                if (view != null && view.getParent() == null) {
                    i9 = Math.min(i9, 2);
                }
            } else {
                i9 = this.f5979e < 4 ? Math.min(i9, componentCallbacksC0269x.f6134q) : Math.min(i9, 1);
            }
        }
        if (!componentCallbacksC0269x.f6098A) {
            i9 = Math.min(i9, 1);
        }
        ViewGroup viewGroup = componentCallbacksC0269x.f6118V;
        if (viewGroup != null) {
            C0259m m7 = C0259m.m(viewGroup, componentCallbacksC0269x.t());
            m7.getClass();
            e0 j7 = m7.j(componentCallbacksC0269x);
            if (j7 != null) {
                i7 = j7.f6037b;
            } else {
                i7 = 0;
            }
            e0 k5 = m7.k(componentCallbacksC0269x);
            if (k5 != null) {
                i10 = k5.f6037b;
            }
            if (i7 == 0) {
                i8 = -1;
            } else {
                i8 = f0.f6047a[s.h.b(i7)];
            }
            if (i8 != -1 && i8 != 1) {
                i10 = i7;
            }
        }
        if (i10 == 2) {
            i9 = Math.min(i9, 6);
        } else if (i10 == 3) {
            i9 = Math.max(i9, 3);
        } else if (componentCallbacksC0269x.f6099B) {
            if (componentCallbacksC0269x.B()) {
                i9 = Math.min(i9, 1);
            } else {
                i9 = Math.min(i9, -1);
            }
        }
        if (componentCallbacksC0269x.f6119X && componentCallbacksC0269x.f6134q < 5) {
            i9 = Math.min(i9, 4);
        }
        if (componentCallbacksC0269x.f6100C && componentCallbacksC0269x.f6118V != null) {
            i9 = Math.max(i9, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i9 + " for " + componentCallbacksC0269x);
        }
        return i9;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        final ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + componentCallbacksC0269x);
        }
        Bundle bundle3 = componentCallbacksC0269x.f6135r;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!componentCallbacksC0269x.f6123b0) {
            D d = this.f5976a;
            d.s(componentCallbacksC0269x, false);
            componentCallbacksC0269x.f6108L.T();
            componentCallbacksC0269x.f6134q = 1;
            componentCallbacksC0269x.f6117U = false;
            componentCallbacksC0269x.f6126e0.g(new InterfaceC0340s() { // from class: androidx.fragment.app.Fragment$6
                @Override // androidx.lifecycle.InterfaceC0340s
                public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                    View view;
                    if (enumC0336n != EnumC0336n.ON_STOP || (view = ComponentCallbacksC0269x.this.W) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            componentCallbacksC0269x.G(bundle);
            componentCallbacksC0269x.f6123b0 = true;
            if (componentCallbacksC0269x.f6117U) {
                componentCallbacksC0269x.f6126e0.G(EnumC0336n.ON_CREATE);
                d.j(componentCallbacksC0269x, false);
                return;
            }
            throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onCreate()"));
        }
        componentCallbacksC0269x.f6134q = 1;
        Bundle bundle4 = componentCallbacksC0269x.f6135r;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            componentCallbacksC0269x.f6108L.Z(bundle2);
            S s6 = componentCallbacksC0269x.f6108L;
            s6.f5914G = false;
            s6.f5915H = false;
            s6.f5921N.f5959i = false;
            s6.u(1);
        }
    }

    public final void f() {
        Bundle bundle;
        String str;
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (componentCallbacksC0269x.f6102E) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC0269x);
        }
        Bundle bundle2 = componentCallbacksC0269x.f6135r;
        Bundle bundle3 = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater L6 = componentCallbacksC0269x.L(bundle);
        ViewGroup viewGroup = componentCallbacksC0269x.f6118V;
        if (viewGroup == null) {
            int i7 = componentCallbacksC0269x.f6111O;
            if (i7 != 0) {
                if (i7 != -1) {
                    viewGroup = (ViewGroup) componentCallbacksC0269x.f6106J.f5942w.A(i7);
                    if (viewGroup == null) {
                        if (!componentCallbacksC0269x.f6103G) {
                            try {
                                str = componentCallbacksC0269x.u().getResourceName(componentCallbacksC0269x.f6111O);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC0269x.f6111O) + " (" + str + ") for fragment " + componentCallbacksC0269x);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C0550c c0550c = AbstractC0551d.f9213a;
                        AbstractC0551d.b(new C0548a(componentCallbacksC0269x, "Attempting to add fragment " + componentCallbacksC0269x + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        AbstractC0551d.a(componentCallbacksC0269x).getClass();
                        EnumC0549b enumC0549b = EnumC0549b.f9210t;
                        if (enumC0549b instanceof Void) {
                            Void r9 = (Void) enumC0549b;
                        }
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC1111a.q("Cannot create fragment ", componentCallbacksC0269x, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        componentCallbacksC0269x.f6118V = viewGroup;
        componentCallbacksC0269x.X(L6, viewGroup, bundle);
        if (componentCallbacksC0269x.W != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + componentCallbacksC0269x);
            }
            componentCallbacksC0269x.W.setSaveFromParentEnabled(false);
            componentCallbacksC0269x.W.setTag(R.id.fragment_container_view_tag, componentCallbacksC0269x);
            if (viewGroup != null) {
                b();
            }
            if (componentCallbacksC0269x.f6113Q) {
                componentCallbacksC0269x.W.setVisibility(8);
            }
            if (componentCallbacksC0269x.W.isAttachedToWindow()) {
                View view = componentCallbacksC0269x.W;
                Field field = K.O.f1447a;
                K.B.c(view);
            } else {
                View view2 = componentCallbacksC0269x.W;
                view2.addOnAttachStateChangeListener(new Y(0, view2));
            }
            Bundle bundle4 = componentCallbacksC0269x.f6135r;
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("savedInstanceState");
            }
            componentCallbacksC0269x.U(componentCallbacksC0269x.W, bundle3);
            componentCallbacksC0269x.f6108L.u(2);
            this.f5976a.y(componentCallbacksC0269x, componentCallbacksC0269x.W, false);
            int visibility = componentCallbacksC0269x.W.getVisibility();
            componentCallbacksC0269x.l().f6095j = componentCallbacksC0269x.W.getAlpha();
            if (componentCallbacksC0269x.f6118V != null && visibility == 0) {
                View findFocus = componentCallbacksC0269x.W.findFocus();
                if (findFocus != null) {
                    componentCallbacksC0269x.l().f6096k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + componentCallbacksC0269x);
                    }
                }
                componentCallbacksC0269x.W.setAlpha(0.0f);
            }
        }
        componentCallbacksC0269x.f6134q = 2;
    }

    public final void g() {
        boolean z7;
        ComponentCallbacksC0269x u7;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + componentCallbacksC0269x);
        }
        boolean z8 = true;
        if (componentCallbacksC0269x.f6099B && !componentCallbacksC0269x.B()) {
            z7 = true;
        } else {
            z7 = false;
        }
        C4.b bVar = this.f5977b;
        if (z7 && !componentCallbacksC0269x.f6101D) {
            bVar.W(componentCallbacksC0269x.f6138u, null);
        }
        if (!z7) {
            V v5 = (V) bVar.f424u;
            if (v5.d.containsKey(componentCallbacksC0269x.f6138u) && v5.f5957g && !v5.f5958h) {
                String str = componentCallbacksC0269x.f6141x;
                if (str != null && (u7 = bVar.u(str)) != null && u7.f6115S) {
                    componentCallbacksC0269x.f6140w = u7;
                }
                componentCallbacksC0269x.f6134q = 0;
                return;
            }
        }
        C0271z c0271z = componentCallbacksC0269x.f6107K;
        if (c0271z instanceof androidx.lifecycle.c0) {
            z8 = ((V) bVar.f424u).f5958h;
        } else {
            Context context = c0271z.f6147s;
            if (context instanceof Activity) {
                z8 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z7 && !componentCallbacksC0269x.f6101D) || z8) {
            ((V) bVar.f424u).d(componentCallbacksC0269x, false);
        }
        componentCallbacksC0269x.f6108L.l();
        componentCallbacksC0269x.f6126e0.G(EnumC0336n.ON_DESTROY);
        componentCallbacksC0269x.f6134q = 0;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.f6123b0 = false;
        componentCallbacksC0269x.I();
        if (componentCallbacksC0269x.f6117U) {
            this.f5976a.l(componentCallbacksC0269x, false);
            Iterator it = bVar.y().iterator();
            while (it.hasNext()) {
                Z z9 = (Z) it.next();
                if (z9 != null) {
                    String str2 = componentCallbacksC0269x.f6138u;
                    ComponentCallbacksC0269x componentCallbacksC0269x2 = z9.f5978c;
                    if (str2.equals(componentCallbacksC0269x2.f6141x)) {
                        componentCallbacksC0269x2.f6140w = componentCallbacksC0269x;
                        componentCallbacksC0269x2.f6141x = null;
                    }
                }
            }
            String str3 = componentCallbacksC0269x.f6141x;
            if (str3 != null) {
                componentCallbacksC0269x.f6140w = bVar.u(str3);
            }
            bVar.K(this);
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + componentCallbacksC0269x);
        }
        ViewGroup viewGroup = componentCallbacksC0269x.f6118V;
        if (viewGroup != null && (view = componentCallbacksC0269x.W) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC0269x.f6108L.u(1);
        if (componentCallbacksC0269x.W != null) {
            b0 b0Var = componentCallbacksC0269x.f6127f0;
            b0Var.c();
            if (b0Var.f6022u.f6830t.compareTo(EnumC0337o.f6819s) >= 0) {
                componentCallbacksC0269x.f6127f0.b(EnumC0336n.ON_DESTROY);
            }
        }
        componentCallbacksC0269x.f6134q = 1;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.J();
        if (componentCallbacksC0269x.f6117U) {
            o.k kVar = ((C0985a) new C0002c(componentCallbacksC0269x.p(), C0985a.f12380e).x(C0985a.class)).d;
            if (kVar.k() <= 0) {
                componentCallbacksC0269x.f6104H = false;
                this.f5976a.z(componentCallbacksC0269x, false);
                componentCallbacksC0269x.f6118V = null;
                componentCallbacksC0269x.W = null;
                componentCallbacksC0269x.f6127f0 = null;
                componentCallbacksC0269x.f6128g0.e(null);
                componentCallbacksC0269x.F = false;
                return;
            }
            AbstractC0515y1.v(kVar.l(0));
            throw null;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + componentCallbacksC0269x);
        }
        componentCallbacksC0269x.f6134q = -1;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.K();
        if (componentCallbacksC0269x.f6117U) {
            S s6 = componentCallbacksC0269x.f6108L;
            if (!s6.f5916I) {
                s6.l();
                componentCallbacksC0269x.f6108L = new S();
            }
            this.f5976a.m(componentCallbacksC0269x, false);
            componentCallbacksC0269x.f6134q = -1;
            componentCallbacksC0269x.f6107K = null;
            componentCallbacksC0269x.f6109M = null;
            componentCallbacksC0269x.f6106J = null;
            if (!componentCallbacksC0269x.f6099B || componentCallbacksC0269x.B()) {
                V v5 = (V) this.f5977b.f424u;
                if (v5.d.containsKey(componentCallbacksC0269x.f6138u) && v5.f5957g && !v5.f5958h) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC0269x);
            }
            componentCallbacksC0269x.y();
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Bundle bundle;
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (componentCallbacksC0269x.f6102E && componentCallbacksC0269x.F && !componentCallbacksC0269x.f6104H) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC0269x);
            }
            Bundle bundle2 = componentCallbacksC0269x.f6135r;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            componentCallbacksC0269x.X(componentCallbacksC0269x.L(bundle), null, bundle);
            View view = componentCallbacksC0269x.W;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC0269x.W.setTag(R.id.fragment_container_view_tag, componentCallbacksC0269x);
                if (componentCallbacksC0269x.f6113Q) {
                    componentCallbacksC0269x.W.setVisibility(8);
                }
                Bundle bundle4 = componentCallbacksC0269x.f6135r;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                componentCallbacksC0269x.U(componentCallbacksC0269x.W, bundle3);
                componentCallbacksC0269x.f6108L.u(2);
                this.f5976a.y(componentCallbacksC0269x, componentCallbacksC0269x.W, false);
                componentCallbacksC0269x.f6134q = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x012d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Z.k():void");
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + componentCallbacksC0269x);
        }
        componentCallbacksC0269x.f6108L.u(5);
        if (componentCallbacksC0269x.W != null) {
            componentCallbacksC0269x.f6127f0.b(EnumC0336n.ON_PAUSE);
        }
        componentCallbacksC0269x.f6126e0.G(EnumC0336n.ON_PAUSE);
        componentCallbacksC0269x.f6134q = 6;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.O();
        if (componentCallbacksC0269x.f6117U) {
            this.f5976a.n(componentCallbacksC0269x, false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        Bundle bundle = componentCallbacksC0269x.f6135r;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (componentCallbacksC0269x.f6135r.getBundle("savedInstanceState") == null) {
            componentCallbacksC0269x.f6135r.putBundle("savedInstanceState", new Bundle());
        }
        try {
            componentCallbacksC0269x.f6136s = componentCallbacksC0269x.f6135r.getSparseParcelableArray("viewState");
            componentCallbacksC0269x.f6137t = componentCallbacksC0269x.f6135r.getBundle("viewRegistryState");
            X x7 = (X) componentCallbacksC0269x.f6135r.getParcelable("state");
            if (x7 != null) {
                componentCallbacksC0269x.f6141x = x7.f5961B;
                componentCallbacksC0269x.f6142y = x7.f5962C;
                componentCallbacksC0269x.f6120Y = x7.f5963D;
            }
            if (componentCallbacksC0269x.f6120Y) {
                return;
            }
            componentCallbacksC0269x.f6119X = true;
        } catch (BadParcelableException e3) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + componentCallbacksC0269x, e3);
        }
    }

    public final void n() {
        View view;
        String str;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + componentCallbacksC0269x);
        }
        C0267v c0267v = componentCallbacksC0269x.f6121Z;
        if (c0267v == null) {
            view = null;
        } else {
            view = c0267v.f6096k;
        }
        if (view != null) {
            if (view != componentCallbacksC0269x.W) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != componentCallbacksC0269x.W) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(componentCallbacksC0269x);
                sb.append(" resulting in focused view ");
                sb.append(componentCallbacksC0269x.W.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        componentCallbacksC0269x.l().f6096k = null;
        componentCallbacksC0269x.f6108L.T();
        componentCallbacksC0269x.f6108L.A(true);
        componentCallbacksC0269x.f6134q = 7;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.Q();
        if (componentCallbacksC0269x.f6117U) {
            C0344w c0344w = componentCallbacksC0269x.f6126e0;
            EnumC0336n enumC0336n = EnumC0336n.ON_RESUME;
            c0344w.G(enumC0336n);
            if (componentCallbacksC0269x.W != null) {
                componentCallbacksC0269x.f6127f0.f6022u.G(enumC0336n);
            }
            S s6 = componentCallbacksC0269x.f6108L;
            s6.f5914G = false;
            s6.f5915H = false;
            s6.f5921N.f5959i = false;
            s6.u(7);
            this.f5976a.u(componentCallbacksC0269x, false);
            this.f5977b.W(componentCallbacksC0269x.f6138u, null);
            componentCallbacksC0269x.f6135r = null;
            componentCallbacksC0269x.f6136s = null;
            componentCallbacksC0269x.f6137t = null;
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (componentCallbacksC0269x.f6134q == -1 && (bundle = componentCallbacksC0269x.f6135r) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new X(componentCallbacksC0269x));
        if (componentCallbacksC0269x.f6134q > -1) {
            Bundle bundle3 = new Bundle();
            componentCallbacksC0269x.R(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f5976a.v(componentCallbacksC0269x, bundle3, false);
            Bundle bundle4 = new Bundle();
            componentCallbacksC0269x.f6130i0.h(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle a02 = componentCallbacksC0269x.f6108L.a0();
            if (!a02.isEmpty()) {
                bundle2.putBundle("childFragmentManager", a02);
            }
            if (componentCallbacksC0269x.W != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = componentCallbacksC0269x.f6136s;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = componentCallbacksC0269x.f6137t;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = componentCallbacksC0269x.f6139v;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (componentCallbacksC0269x.W == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + componentCallbacksC0269x + " with view " + componentCallbacksC0269x.W);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC0269x.W.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC0269x.f6136s = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC0269x.f6127f0.f6023v.h(bundle);
        if (!bundle.isEmpty()) {
            componentCallbacksC0269x.f6137t = bundle;
        }
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + componentCallbacksC0269x);
        }
        componentCallbacksC0269x.f6108L.T();
        componentCallbacksC0269x.f6108L.A(true);
        componentCallbacksC0269x.f6134q = 5;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.S();
        if (componentCallbacksC0269x.f6117U) {
            C0344w c0344w = componentCallbacksC0269x.f6126e0;
            EnumC0336n enumC0336n = EnumC0336n.ON_START;
            c0344w.G(enumC0336n);
            if (componentCallbacksC0269x.W != null) {
                componentCallbacksC0269x.f6127f0.f6022u.G(enumC0336n);
            }
            S s6 = componentCallbacksC0269x.f6108L;
            s6.f5914G = false;
            s6.f5915H = false;
            s6.f5921N.f5959i = false;
            s6.u(5);
            this.f5976a.w(componentCallbacksC0269x, false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5978c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + componentCallbacksC0269x);
        }
        S s6 = componentCallbacksC0269x.f6108L;
        s6.f5915H = true;
        s6.f5921N.f5959i = true;
        s6.u(4);
        if (componentCallbacksC0269x.W != null) {
            componentCallbacksC0269x.f6127f0.b(EnumC0336n.ON_STOP);
        }
        componentCallbacksC0269x.f6126e0.G(EnumC0336n.ON_STOP);
        componentCallbacksC0269x.f6134q = 4;
        componentCallbacksC0269x.f6117U = false;
        componentCallbacksC0269x.T();
        if (componentCallbacksC0269x.f6117U) {
            this.f5976a.x(componentCallbacksC0269x, false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " did not call through to super.onStop()"));
    }

    public Z(D d, C4.b bVar, ComponentCallbacksC0269x componentCallbacksC0269x, Bundle bundle) {
        this.f5976a = d;
        this.f5977b = bVar;
        this.f5978c = componentCallbacksC0269x;
        componentCallbacksC0269x.f6136s = null;
        componentCallbacksC0269x.f6137t = null;
        componentCallbacksC0269x.f6105I = 0;
        componentCallbacksC0269x.F = false;
        componentCallbacksC0269x.f6098A = false;
        ComponentCallbacksC0269x componentCallbacksC0269x2 = componentCallbacksC0269x.f6140w;
        componentCallbacksC0269x.f6141x = componentCallbacksC0269x2 != null ? componentCallbacksC0269x2.f6138u : null;
        componentCallbacksC0269x.f6140w = null;
        componentCallbacksC0269x.f6135r = bundle;
        componentCallbacksC0269x.f6139v = bundle.getBundle("arguments");
    }

    public Z(D d, C4.b bVar, ClassLoader classLoader, I i7, Bundle bundle) {
        this.f5976a = d;
        this.f5977b = bVar;
        ComponentCallbacksC0269x a7 = ((X) bundle.getParcelable("state")).a(i7);
        this.f5978c = a7;
        a7.f6135r = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a7.d0(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a7);
        }
    }
}
