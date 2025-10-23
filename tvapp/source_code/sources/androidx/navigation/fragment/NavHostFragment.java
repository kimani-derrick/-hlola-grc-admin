package androidx.navigation.fragment;

import A0.b;
import A5.f;
import A5.i;
import A5.l;
import H2.C0002c;
import M5.g;
import P1.c;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.w;
import androidx.activity.x;
import androidx.fragment.app.C0247a;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.fragment.app.S;
import androidx.fragment.app.U;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.b0;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import k3.AbstractC0958a;
import n0.C0999A;
import n0.C1000B;
import n0.C1019j;
import n0.C1020k;
import n0.N;
import n0.O;
import n0.P;
import n0.q;
import p0.e;
/* loaded from: classes.dex */
public class NavHostFragment extends ComponentCallbacksC0269x {

    /* renamed from: n0  reason: collision with root package name */
    public C0999A f6849n0;

    /* renamed from: o0  reason: collision with root package name */
    public Boolean f6850o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f6851p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f6852q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6853r0;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        g.f(context, "context");
        super.F(context);
        if (this.f6853r0) {
            C0247a c0247a = new C0247a(t());
            c0247a.i(this);
            c0247a.e(false);
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [A5.i, A5.f, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        boolean z7;
        Bundle bundle2;
        int i7;
        Object[] objArr;
        boolean z8;
        c q5;
        Context a02 = a0();
        C0999A c0999a = new C0999A(a02);
        this.f6849n0 = c0999a;
        if (!g.a(this, c0999a.f12467m)) {
            InterfaceC0342u interfaceC0342u = c0999a.f12467m;
            b bVar = c0999a.f12471r;
            if (interfaceC0342u != null && (q5 = interfaceC0342u.q()) != null) {
                q5.v(bVar);
            }
            c0999a.f12467m = this;
            this.f6126e0.g(bVar);
        }
        while (true) {
            if (!(a02 instanceof ContextWrapper)) {
                break;
            } else if (a02 instanceof x) {
                C0999A c0999a2 = this.f6849n0;
                g.c(c0999a2);
                w e3 = ((x) a02).e();
                g.e(e3, "context as OnBackPressed…).onBackPressedDispatcher");
                if (!g.a(e3, c0999a2.n)) {
                    InterfaceC0342u interfaceC0342u2 = c0999a2.f12467m;
                    if (interfaceC0342u2 != null) {
                        G g7 = c0999a2.f12472s;
                        Iterator it = g7.f5343b.iterator();
                        while (it.hasNext()) {
                            ((androidx.activity.c) it.next()).cancel();
                        }
                        c0999a2.n = e3;
                        e3.a(interfaceC0342u2, g7);
                        c q7 = interfaceC0342u2.q();
                        b bVar2 = c0999a2.f12471r;
                        q7.v(bVar2);
                        q7.g(bVar2);
                    } else {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                    }
                }
            } else {
                a02 = ((ContextWrapper) a02).getBaseContext();
                g.e(a02, "context.baseContext");
            }
        }
        C0999A c0999a3 = this.f6849n0;
        g.c(c0999a3);
        Boolean bool = this.f6850o0;
        if (bool != null && bool.booleanValue()) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0999a3.f12473t = z7;
        c0999a3.u();
        Bundle bundle3 = null;
        this.f6850o0 = null;
        C0999A c0999a4 = this.f6849n0;
        g.c(c0999a4);
        b0 p3 = p();
        q qVar = c0999a4.f12468o;
        U u7 = q.f12578e;
        if (!g.a(qVar, (q) new C0002c(p3, u7, 0).x(q.class))) {
            if (c0999a4.f12461g.isEmpty()) {
                c0999a4.f12468o = (q) new C0002c(p3, u7, 0).x(q.class);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
        }
        C0999A c0999a5 = this.f6849n0;
        g.c(c0999a5);
        Context a03 = a0();
        S n = n();
        g.e(n, "childFragmentManager");
        p0.c cVar = new p0.c(a03, n);
        O o7 = c0999a5.f12474u;
        o7.a(cVar);
        o7.a(f0());
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f6853r0 = true;
                C0247a c0247a = new C0247a(t());
                c0247a.i(this);
                c0247a.e(false);
            }
            this.f6852q0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            C0999A c0999a6 = this.f6849n0;
            g.c(c0999a6);
            bundle2.setClassLoader(c0999a6.f12457a.getClassLoader());
            c0999a6.d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            c0999a6.f12460e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = c0999a6.f12466l;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    c0999a6.f12465k.put(Integer.valueOf(intArray[i8]), stringArrayList.get(i9));
                    i8++;
                    i9++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        g.e(str, "id");
                        int length2 = parcelableArray.length;
                        ?? fVar = new f();
                        if (length2 == 0) {
                            objArr = i.f128t;
                        } else if (length2 > 0) {
                            objArr = new Object[length2];
                        } else {
                            throw new IllegalArgumentException(AbstractC0515y1.l("Illegal Capacity: ", length2));
                        }
                        fVar.f130r = objArr;
                        int i10 = 0;
                        while (true) {
                            if (i10 < parcelableArray.length) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                int i11 = i10 + 1;
                                try {
                                    Parcelable parcelable = parcelableArray[i10];
                                    if (parcelable != null) {
                                        fVar.g((C1020k) parcelable);
                                        i10 = i11;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    }
                                } catch (ArrayIndexOutOfBoundsException e7) {
                                    throw new NoSuchElementException(e7.getMessage());
                                }
                            } else {
                                linkedHashMap.put(str, fVar);
                                break;
                            }
                        }
                    }
                }
            }
            c0999a6.f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f6852q0 != 0) {
            C0999A c0999a7 = this.f6849n0;
            g.c(c0999a7);
            c0999a7.r(((C1000B) c0999a7.f12455B.getValue()).b(this.f6852q0), null);
        } else {
            Bundle bundle4 = this.f6139v;
            if (bundle4 != null) {
                i7 = bundle4.getInt("android-support-nav:fragment:graphId");
            } else {
                i7 = 0;
            }
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i7 != 0) {
                C0999A c0999a8 = this.f6849n0;
                g.c(c0999a8);
                c0999a8.r(((C1000B) c0999a8.f12455B.getValue()).b(i7), bundle3);
            }
        }
        super.G(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        g.e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i7 = this.f6110N;
        if (i7 == 0 || i7 == -1) {
            i7 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i7);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void J() {
        this.f6117U = true;
        View view = this.f6851p0;
        if (view != null && AbstractC0958a.q(view) == this.f6849n0) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f6851p0 = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void N(Context context, AttributeSet attributeSet, Bundle bundle) {
        g.f(context, "context");
        g.f(attributeSet, "attrs");
        super.N(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P.f12516b);
        g.e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f6852q0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p0.f.f13109c);
        g.e(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f6853r0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void P(boolean z7) {
        C0999A c0999a = this.f6849n0;
        if (c0999a != null) {
            c0999a.f12473t = z7;
            c0999a.u();
            return;
        }
        this.f6850o0 = Boolean.valueOf(z7);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void R(Bundle bundle) {
        Bundle bundle2;
        C0999A c0999a = this.f6849n0;
        g.c(c0999a);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : A5.w.N(c0999a.f12474u.f12514a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h7 = ((N) entry.getValue()).h();
            if (h7 != null) {
                arrayList.add(str);
                bundle3.putBundle(str, h7);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        i iVar = c0999a.f12461g;
        if (!iVar.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[iVar.f131s];
            Iterator<E> it = iVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                parcelableArr[i7] = new C1020k((C1019j) it.next());
                i7++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c0999a.f12465k;
        if (!linkedHashMap.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i8 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                iArr[i8] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i8++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = c0999a.f12466l;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                i iVar2 = (i) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[iVar2.f131s];
                Iterator it2 = iVar2.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        parcelableArr2[i9] = (C1020k) next;
                        i9 = i10;
                    } else {
                        l.O();
                        throw null;
                    }
                }
                bundle2.putParcelableArray(AbstractC0515y1.x("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c0999a.f) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", c0999a.f);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f6853r0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i11 = this.f6852q0;
        if (i11 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i11);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void U(View view, Bundle bundle) {
        g.f(view, "view");
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f6849n0);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f6851p0 = view2;
                    if (view2.getId() == this.f6110N) {
                        View view3 = this.f6851p0;
                        g.c(view3);
                        view3.setTag(R.id.nav_controller_view_tag, this.f6849n0);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public N f0() {
        Context a02 = a0();
        S n = n();
        g.e(n, "childFragmentManager");
        int i7 = this.f6110N;
        if (i7 == 0 || i7 == -1) {
            i7 = R.id.nav_host_fragment_container;
        }
        return new e(a02, n, i7);
    }
}
