package androidx.fragment.app;

import H2.C0002c;
import K.InterfaceC0035k;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0337o;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import d0.AbstractC0551d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C0985a;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: A  reason: collision with root package name */
    public final J3.e f5909A;

    /* renamed from: B  reason: collision with root package name */
    public androidx.activity.result.d f5910B;

    /* renamed from: C  reason: collision with root package name */
    public androidx.activity.result.d f5911C;

    /* renamed from: D  reason: collision with root package name */
    public androidx.activity.result.d f5912D;

    /* renamed from: E  reason: collision with root package name */
    public ArrayDeque f5913E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5914G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5915H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f5916I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f5917J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f5918K;

    /* renamed from: L  reason: collision with root package name */
    public ArrayList f5919L;

    /* renamed from: M  reason: collision with root package name */
    public ArrayList f5920M;

    /* renamed from: N  reason: collision with root package name */
    public V f5921N;

    /* renamed from: O  reason: collision with root package name */
    public final P.b f5922O;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5924b;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f5926e;

    /* renamed from: g  reason: collision with root package name */
    public androidx.activity.w f5927g;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f5933m;
    public final D n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f5934o;

    /* renamed from: p  reason: collision with root package name */
    public final E f5935p;

    /* renamed from: q  reason: collision with root package name */
    public final E f5936q;

    /* renamed from: r  reason: collision with root package name */
    public final E f5937r;

    /* renamed from: s  reason: collision with root package name */
    public final E f5938s;

    /* renamed from: t  reason: collision with root package name */
    public final H f5939t;

    /* renamed from: u  reason: collision with root package name */
    public int f5940u;

    /* renamed from: v  reason: collision with root package name */
    public C0271z f5941v;

    /* renamed from: w  reason: collision with root package name */
    public p6.l f5942w;

    /* renamed from: x  reason: collision with root package name */
    public ComponentCallbacksC0269x f5943x;

    /* renamed from: y  reason: collision with root package name */
    public ComponentCallbacksC0269x f5944y;

    /* renamed from: z  reason: collision with root package name */
    public final I f5945z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5923a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final C4.b f5925c = new C4.b(12);
    public ArrayList d = new ArrayList();
    public final C f = new C(this);

    /* renamed from: h  reason: collision with root package name */
    public C0247a f5928h = null;

    /* renamed from: i  reason: collision with root package name */
    public final G f5929i = new G(0, this);

    /* renamed from: j  reason: collision with root package name */
    public final AtomicInteger f5930j = new AtomicInteger();

    /* renamed from: k  reason: collision with root package name */
    public final Map f5931k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map f5932l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.E] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.E] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.E] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.E] */
    public S() {
        Collections.synchronizedMap(new HashMap());
        this.f5933m = new ArrayList();
        this.n = new D(this);
        this.f5934o = new CopyOnWriteArrayList();
        this.f5935p = new J.a(this) { // from class: androidx.fragment.app.E

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ S f5886b;

            {
                this.f5886b = this;
            }

            @Override // J.a
            public final void b(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        S s6 = this.f5886b;
                        if (s6.O()) {
                            s6.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s7 = this.f5886b;
                        if (s7.O() && num.intValue() == 80) {
                            s7.m(false);
                            return;
                        }
                        return;
                    case 2:
                        z.f fVar = (z.f) obj;
                        S s8 = this.f5886b;
                        if (s8.O()) {
                            s8.n(fVar.f16378a, false);
                            return;
                        }
                        return;
                    default:
                        z.k kVar = (z.k) obj;
                        S s9 = this.f5886b;
                        if (s9.O()) {
                            s9.s(kVar.f16380a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f5936q = new J.a(this) { // from class: androidx.fragment.app.E

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ S f5886b;

            {
                this.f5886b = this;
            }

            @Override // J.a
            public final void b(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        S s6 = this.f5886b;
                        if (s6.O()) {
                            s6.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s7 = this.f5886b;
                        if (s7.O() && num.intValue() == 80) {
                            s7.m(false);
                            return;
                        }
                        return;
                    case 2:
                        z.f fVar = (z.f) obj;
                        S s8 = this.f5886b;
                        if (s8.O()) {
                            s8.n(fVar.f16378a, false);
                            return;
                        }
                        return;
                    default:
                        z.k kVar = (z.k) obj;
                        S s9 = this.f5886b;
                        if (s9.O()) {
                            s9.s(kVar.f16380a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f5937r = new J.a(this) { // from class: androidx.fragment.app.E

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ S f5886b;

            {
                this.f5886b = this;
            }

            @Override // J.a
            public final void b(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        S s6 = this.f5886b;
                        if (s6.O()) {
                            s6.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s7 = this.f5886b;
                        if (s7.O() && num.intValue() == 80) {
                            s7.m(false);
                            return;
                        }
                        return;
                    case 2:
                        z.f fVar = (z.f) obj;
                        S s8 = this.f5886b;
                        if (s8.O()) {
                            s8.n(fVar.f16378a, false);
                            return;
                        }
                        return;
                    default:
                        z.k kVar = (z.k) obj;
                        S s9 = this.f5886b;
                        if (s9.O()) {
                            s9.s(kVar.f16380a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f5938s = new J.a(this) { // from class: androidx.fragment.app.E

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ S f5886b;

            {
                this.f5886b = this;
            }

            @Override // J.a
            public final void b(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        S s6 = this.f5886b;
                        if (s6.O()) {
                            s6.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s7 = this.f5886b;
                        if (s7.O() && num.intValue() == 80) {
                            s7.m(false);
                            return;
                        }
                        return;
                    case 2:
                        z.f fVar = (z.f) obj;
                        S s8 = this.f5886b;
                        if (s8.O()) {
                            s8.n(fVar.f16378a, false);
                            return;
                        }
                        return;
                    default:
                        z.k kVar = (z.k) obj;
                        S s9 = this.f5886b;
                        if (s9.O()) {
                            s9.s(kVar.f16380a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f5939t = new H(this);
        this.f5940u = -1;
        this.f5945z = new I(this);
        this.f5909A = new J3.e(18);
        this.f5913E = new ArrayDeque();
        this.f5922O = new P.b(8, this);
    }

    public static HashSet H(C0247a c0247a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c0247a.f5980a.size(); i7++) {
            ComponentCallbacksC0269x componentCallbacksC0269x = ((a0) c0247a.f5980a.get(i7)).f5998b;
            if (componentCallbacksC0269x != null && c0247a.f5984g) {
                hashSet.add(componentCallbacksC0269x);
            }
        }
        return hashSet;
    }

    public static boolean N(ComponentCallbacksC0269x componentCallbacksC0269x) {
        Iterator it = componentCallbacksC0269x.f6108L.f5925c.z().iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            ComponentCallbacksC0269x componentCallbacksC0269x2 = (ComponentCallbacksC0269x) it.next();
            if (componentCallbacksC0269x2 != null) {
                z7 = N(componentCallbacksC0269x2);
                continue;
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (componentCallbacksC0269x == null) {
            return true;
        }
        if (componentCallbacksC0269x.f6116T && (componentCallbacksC0269x.f6106J == null || P(componentCallbacksC0269x.f6109M))) {
            return true;
        }
        return false;
    }

    public static boolean Q(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (componentCallbacksC0269x == null) {
            return true;
        }
        S s6 = componentCallbacksC0269x.f6106J;
        if (componentCallbacksC0269x.equals(s6.f5944y) && Q(s6.f5943x)) {
            return true;
        }
        return false;
    }

    public static void g0(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0269x);
        }
        if (componentCallbacksC0269x.f6113Q) {
            componentCallbacksC0269x.f6113Q = false;
            componentCallbacksC0269x.f6122a0 = !componentCallbacksC0269x.f6122a0;
        }
    }

    public final boolean A(boolean z7) {
        z(z7);
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f5918K;
            ArrayList arrayList2 = this.f5919L;
            synchronized (this.f5923a) {
                if (this.f5923a.isEmpty()) {
                    break;
                }
                int size = this.f5923a.size();
                boolean z9 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    z9 |= ((N) this.f5923a.get(i7)).a(arrayList, arrayList2);
                }
                this.f5923a.clear();
                this.f5941v.f6148t.removeCallbacks(this.f5922O);
                if (!z9) {
                    break;
                }
                z8 = true;
                this.f5924b = true;
                try {
                    Y(this.f5918K, this.f5919L);
                } finally {
                    d();
                }
            }
        }
        j0();
        v();
        ((HashMap) this.f5925c.f422s).values().removeAll(Collections.singleton(null));
        return z8;
    }

    public final void B(N n, boolean z7) {
        if (z7 && (this.f5941v == null || this.f5916I)) {
            return;
        }
        z(z7);
        if (n.a(this.f5918K, this.f5919L)) {
            this.f5924b = true;
            try {
                Y(this.f5918K, this.f5919L);
            } finally {
                d();
            }
        }
        j0();
        v();
        ((HashMap) this.f5925c.f422s).values().removeAll(Collections.singleton(null));
    }

    public final void C(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        ArrayList arrayList3;
        C4.b bVar;
        C4.b bVar2;
        C4.b bVar3;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        boolean z7 = ((C0247a) arrayList4.get(i7)).f5992p;
        ArrayList arrayList6 = this.f5920M;
        if (arrayList6 == null) {
            this.f5920M = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.f5920M;
        C4.b bVar4 = this.f5925c;
        arrayList7.addAll(bVar4.A());
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5944y;
        int i12 = i7;
        boolean z8 = false;
        while (true) {
            int i13 = 1;
            if (i12 < i8) {
                C0247a c0247a = (C0247a) arrayList4.get(i12);
                if (!((Boolean) arrayList5.get(i12)).booleanValue()) {
                    ArrayList arrayList8 = this.f5920M;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList9 = c0247a.f5980a;
                        if (i14 < arrayList9.size()) {
                            a0 a0Var = (a0) arrayList9.get(i14);
                            int i15 = a0Var.f5997a;
                            if (i15 != i13) {
                                if (i15 != 2) {
                                    if (i15 != 3 && i15 != 6) {
                                        if (i15 != 7) {
                                            if (i15 == 8) {
                                                arrayList9.add(i14, new a0(9, componentCallbacksC0269x, 0));
                                                a0Var.f5999c = true;
                                                i14++;
                                                componentCallbacksC0269x = a0Var.f5998b;
                                            }
                                        } else {
                                            bVar3 = bVar4;
                                            i9 = 1;
                                        }
                                    } else {
                                        arrayList8.remove(a0Var.f5998b);
                                        ComponentCallbacksC0269x componentCallbacksC0269x2 = a0Var.f5998b;
                                        if (componentCallbacksC0269x2 == componentCallbacksC0269x) {
                                            arrayList9.add(i14, new a0(9, componentCallbacksC0269x2));
                                            i14++;
                                            bVar3 = bVar4;
                                            i9 = 1;
                                            componentCallbacksC0269x = null;
                                        }
                                    }
                                    bVar3 = bVar4;
                                    i9 = 1;
                                } else {
                                    ComponentCallbacksC0269x componentCallbacksC0269x3 = a0Var.f5998b;
                                    int i16 = componentCallbacksC0269x3.f6111O;
                                    int size = arrayList8.size() - 1;
                                    boolean z9 = false;
                                    while (size >= 0) {
                                        C4.b bVar5 = bVar4;
                                        ComponentCallbacksC0269x componentCallbacksC0269x4 = (ComponentCallbacksC0269x) arrayList8.get(size);
                                        if (componentCallbacksC0269x4.f6111O == i16) {
                                            if (componentCallbacksC0269x4 == componentCallbacksC0269x3) {
                                                i10 = i16;
                                                z9 = true;
                                            } else {
                                                if (componentCallbacksC0269x4 == componentCallbacksC0269x) {
                                                    i10 = i16;
                                                    arrayList9.add(i14, new a0(9, componentCallbacksC0269x4, 0));
                                                    i14++;
                                                    i11 = 0;
                                                    componentCallbacksC0269x = null;
                                                } else {
                                                    i10 = i16;
                                                    i11 = 0;
                                                }
                                                a0 a0Var2 = new a0(3, componentCallbacksC0269x4, i11);
                                                a0Var2.d = a0Var.d;
                                                a0Var2.f = a0Var.f;
                                                a0Var2.f6000e = a0Var.f6000e;
                                                a0Var2.f6001g = a0Var.f6001g;
                                                arrayList9.add(i14, a0Var2);
                                                arrayList8.remove(componentCallbacksC0269x4);
                                                i14++;
                                                componentCallbacksC0269x = componentCallbacksC0269x;
                                            }
                                        } else {
                                            i10 = i16;
                                        }
                                        size--;
                                        i16 = i10;
                                        bVar4 = bVar5;
                                    }
                                    bVar3 = bVar4;
                                    i9 = 1;
                                    if (z9) {
                                        arrayList9.remove(i14);
                                        i14--;
                                    } else {
                                        a0Var.f5997a = 1;
                                        a0Var.f5999c = true;
                                        arrayList8.add(componentCallbacksC0269x3);
                                    }
                                }
                                i14 += i9;
                                i13 = i9;
                                bVar4 = bVar3;
                            } else {
                                bVar3 = bVar4;
                                i9 = i13;
                            }
                            arrayList8.add(a0Var.f5998b);
                            i14 += i9;
                            i13 = i9;
                            bVar4 = bVar3;
                        } else {
                            bVar2 = bVar4;
                        }
                    }
                } else {
                    bVar2 = bVar4;
                    int i17 = 1;
                    ArrayList arrayList10 = this.f5920M;
                    ArrayList arrayList11 = c0247a.f5980a;
                    int size2 = arrayList11.size() - 1;
                    while (size2 >= 0) {
                        a0 a0Var3 = (a0) arrayList11.get(size2);
                        int i18 = a0Var3.f5997a;
                        if (i18 != i17) {
                            if (i18 != 3) {
                                switch (i18) {
                                    case 8:
                                        componentCallbacksC0269x = null;
                                        break;
                                    case 9:
                                        componentCallbacksC0269x = a0Var3.f5998b;
                                        break;
                                    case 10:
                                        a0Var3.f6003i = a0Var3.f6002h;
                                        break;
                                }
                                size2--;
                                i17 = 1;
                            }
                            arrayList10.add(a0Var3.f5998b);
                            size2--;
                            i17 = 1;
                        }
                        arrayList10.remove(a0Var3.f5998b);
                        size2--;
                        i17 = 1;
                    }
                }
                if (!z8 && !c0247a.f5984g) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                i12++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                bVar4 = bVar2;
            } else {
                C4.b bVar6 = bVar4;
                this.f5920M.clear();
                if (!z7 && this.f5940u >= 1) {
                    for (int i19 = i7; i19 < i8; i19++) {
                        Iterator it = ((C0247a) arrayList.get(i19)).f5980a.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC0269x componentCallbacksC0269x5 = ((a0) it.next()).f5998b;
                            if (componentCallbacksC0269x5 != null && componentCallbacksC0269x5.f6106J != null) {
                                bVar = bVar6;
                                bVar.I(g(componentCallbacksC0269x5));
                            } else {
                                bVar = bVar6;
                            }
                            bVar6 = bVar;
                        }
                    }
                }
                for (int i20 = i7; i20 < i8; i20++) {
                    C0247a c0247a2 = (C0247a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        c0247a2.d(-1);
                        ArrayList arrayList12 = c0247a2.f5980a;
                        for (int size3 = arrayList12.size() - 1; size3 >= 0; size3--) {
                            a0 a0Var4 = (a0) arrayList12.get(size3);
                            ComponentCallbacksC0269x componentCallbacksC0269x6 = a0Var4.f5998b;
                            if (componentCallbacksC0269x6 != null) {
                                componentCallbacksC0269x6.f6101D = c0247a2.f5996t;
                                if (componentCallbacksC0269x6.f6121Z != null) {
                                    componentCallbacksC0269x6.l().f6088a = true;
                                }
                                int i21 = c0247a2.f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        i23 = 8197;
                                        if (i21 != 8197) {
                                            if (i21 != 4099) {
                                                if (i21 != 4100) {
                                                    i22 = 0;
                                                }
                                            } else {
                                                i22 = 4099;
                                            }
                                        }
                                    }
                                    i22 = i23;
                                }
                                if (componentCallbacksC0269x6.f6121Z != null || i22 != 0) {
                                    componentCallbacksC0269x6.l();
                                    componentCallbacksC0269x6.f6121Z.f = i22;
                                }
                                componentCallbacksC0269x6.l();
                                componentCallbacksC0269x6.f6121Z.getClass();
                            }
                            int i24 = a0Var4.f5997a;
                            S s6 = c0247a2.f5993q;
                            switch (i24) {
                                case 1:
                                    componentCallbacksC0269x6.c0(a0Var4.d, a0Var4.f6000e, a0Var4.f, a0Var4.f6001g);
                                    s6.c0(componentCallbacksC0269x6, true);
                                    s6.X(componentCallbacksC0269x6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + a0Var4.f5997a);
                                case 3:
                                    componentCallbacksC0269x6.c0(a0Var4.d, a0Var4.f6000e, a0Var4.f, a0Var4.f6001g);
                                    s6.a(componentCallbacksC0269x6);
                                    break;
                                case 4:
                                    componentCallbacksC0269x6.c0(a0Var4.d, a0Var4.f6000e, a0Var4.f, a0Var4.f6001g);
                                    s6.getClass();
                                    g0(componentCallbacksC0269x6);
                                    break;
                                case 5:
                                    componentCallbacksC0269x6.c0(a0Var4.d, a0Var4.f6000e, a0Var4.f, a0Var4.f6001g);
                                    s6.c0(componentCallbacksC0269x6, true);
                                    s6.M(componentCallbacksC0269x6);
                                    break;
                                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    componentCallbacksC0269x6.c0(a0Var4.d, a0Var4.f6000e, a0Var4.f, a0Var4.f6001g);
                                    s6.c(componentCallbacksC0269x6);
                                    break;
                                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                    componentCallbacksC0269x6.c0(a0Var4.d, a0Var4.f6000e, a0Var4.f, a0Var4.f6001g);
                                    s6.c0(componentCallbacksC0269x6, true);
                                    s6.h(componentCallbacksC0269x6);
                                    break;
                                case 8:
                                    s6.e0(null);
                                    break;
                                case 9:
                                    s6.e0(componentCallbacksC0269x6);
                                    break;
                                case 10:
                                    s6.d0(componentCallbacksC0269x6, a0Var4.f6002h);
                                    break;
                            }
                        }
                    } else {
                        c0247a2.d(1);
                        ArrayList arrayList13 = c0247a2.f5980a;
                        int size4 = arrayList13.size();
                        int i25 = 0;
                        while (i25 < size4) {
                            a0 a0Var5 = (a0) arrayList13.get(i25);
                            ComponentCallbacksC0269x componentCallbacksC0269x7 = a0Var5.f5998b;
                            if (componentCallbacksC0269x7 != null) {
                                componentCallbacksC0269x7.f6101D = c0247a2.f5996t;
                                if (componentCallbacksC0269x7.f6121Z != null) {
                                    componentCallbacksC0269x7.l().f6088a = false;
                                }
                                int i26 = c0247a2.f;
                                if (componentCallbacksC0269x7.f6121Z != null || i26 != 0) {
                                    componentCallbacksC0269x7.l();
                                    componentCallbacksC0269x7.f6121Z.f = i26;
                                }
                                componentCallbacksC0269x7.l();
                                componentCallbacksC0269x7.f6121Z.getClass();
                            }
                            int i27 = a0Var5.f5997a;
                            S s7 = c0247a2.f5993q;
                            switch (i27) {
                                case 1:
                                    arrayList3 = arrayList13;
                                    componentCallbacksC0269x7.c0(a0Var5.d, a0Var5.f6000e, a0Var5.f, a0Var5.f6001g);
                                    s7.c0(componentCallbacksC0269x7, false);
                                    s7.a(componentCallbacksC0269x7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + a0Var5.f5997a);
                                case 3:
                                    arrayList3 = arrayList13;
                                    componentCallbacksC0269x7.c0(a0Var5.d, a0Var5.f6000e, a0Var5.f, a0Var5.f6001g);
                                    s7.X(componentCallbacksC0269x7);
                                    break;
                                case 4:
                                    arrayList3 = arrayList13;
                                    componentCallbacksC0269x7.c0(a0Var5.d, a0Var5.f6000e, a0Var5.f, a0Var5.f6001g);
                                    s7.M(componentCallbacksC0269x7);
                                    break;
                                case 5:
                                    arrayList3 = arrayList13;
                                    componentCallbacksC0269x7.c0(a0Var5.d, a0Var5.f6000e, a0Var5.f, a0Var5.f6001g);
                                    s7.c0(componentCallbacksC0269x7, false);
                                    g0(componentCallbacksC0269x7);
                                    break;
                                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    arrayList3 = arrayList13;
                                    componentCallbacksC0269x7.c0(a0Var5.d, a0Var5.f6000e, a0Var5.f, a0Var5.f6001g);
                                    s7.h(componentCallbacksC0269x7);
                                    break;
                                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                    arrayList3 = arrayList13;
                                    componentCallbacksC0269x7.c0(a0Var5.d, a0Var5.f6000e, a0Var5.f, a0Var5.f6001g);
                                    s7.c0(componentCallbacksC0269x7, false);
                                    s7.c(componentCallbacksC0269x7);
                                    break;
                                case 8:
                                    s7.e0(componentCallbacksC0269x7);
                                    arrayList3 = arrayList13;
                                    break;
                                case 9:
                                    s7.e0(null);
                                    arrayList3 = arrayList13;
                                    break;
                                case 10:
                                    s7.d0(componentCallbacksC0269x7, a0Var5.f6003i);
                                    arrayList3 = arrayList13;
                                    break;
                            }
                            i25++;
                            arrayList13 = arrayList3;
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
                ArrayList arrayList14 = this.f5933m;
                if (z8 && !arrayList14.isEmpty()) {
                    LinkedHashSet<ComponentCallbacksC0269x> linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(H((C0247a) it2.next()));
                    }
                    if (this.f5928h == null) {
                        Iterator it3 = arrayList14.iterator();
                        while (it3.hasNext()) {
                            M m7 = (M) it3.next();
                            for (ComponentCallbacksC0269x componentCallbacksC0269x8 : linkedHashSet) {
                                m7.getClass();
                            }
                        }
                        Iterator it4 = arrayList14.iterator();
                        while (it4.hasNext()) {
                            M m8 = (M) it4.next();
                            for (ComponentCallbacksC0269x componentCallbacksC0269x9 : linkedHashSet) {
                                m8.getClass();
                            }
                        }
                    }
                }
                for (int i28 = i7; i28 < i8; i28++) {
                    C0247a c0247a3 = (C0247a) arrayList.get(i28);
                    if (booleanValue) {
                        for (int size5 = c0247a3.f5980a.size() - 1; size5 >= 0; size5--) {
                            ComponentCallbacksC0269x componentCallbacksC0269x10 = ((a0) c0247a3.f5980a.get(size5)).f5998b;
                            if (componentCallbacksC0269x10 != null) {
                                g(componentCallbacksC0269x10).k();
                            }
                        }
                    } else {
                        Iterator it5 = c0247a3.f5980a.iterator();
                        while (it5.hasNext()) {
                            ComponentCallbacksC0269x componentCallbacksC0269x11 = ((a0) it5.next()).f5998b;
                            if (componentCallbacksC0269x11 != null) {
                                g(componentCallbacksC0269x11).k();
                            }
                        }
                    }
                }
                S(this.f5940u, true);
                int i29 = i7;
                Iterator it6 = f(arrayList, i29, i8).iterator();
                while (it6.hasNext()) {
                    C0259m c0259m = (C0259m) it6.next();
                    c0259m.d = booleanValue;
                    c0259m.n();
                    c0259m.i();
                }
                while (i29 < i8) {
                    C0247a c0247a4 = (C0247a) arrayList.get(i29);
                    if (((Boolean) arrayList2.get(i29)).booleanValue() && c0247a4.f5995s >= 0) {
                        c0247a4.f5995s = -1;
                    }
                    c0247a4.getClass();
                    i29++;
                }
                if (z8) {
                    for (int i30 = 0; i30 < arrayList14.size(); i30++) {
                        ((M) arrayList14.get(i30)).a();
                    }
                    return;
                }
                return;
            }
        }
    }

    public final int D(int i7, String str, boolean z7) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z7) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            C0247a c0247a = (C0247a) this.d.get(size);
            if ((str != null && str.equals(c0247a.f5986i)) || (i7 >= 0 && i7 == c0247a.f5995s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z7) {
            while (size > 0) {
                C0247a c0247a2 = (C0247a) this.d.get(size - 1);
                if ((str != null && str.equals(c0247a2.f5986i)) || (i7 >= 0 && i7 == c0247a2.f5995s)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    public final ComponentCallbacksC0269x E(int i7) {
        C4.b bVar = this.f5925c;
        ArrayList arrayList = (ArrayList) bVar.f421r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) arrayList.get(size);
            if (componentCallbacksC0269x != null && componentCallbacksC0269x.f6110N == i7) {
                return componentCallbacksC0269x;
            }
        }
        for (Z z7 : ((HashMap) bVar.f422s).values()) {
            if (z7 != null) {
                ComponentCallbacksC0269x componentCallbacksC0269x2 = z7.f5978c;
                if (componentCallbacksC0269x2.f6110N == i7) {
                    return componentCallbacksC0269x2;
                }
            }
        }
        return null;
    }

    public final ComponentCallbacksC0269x F(String str) {
        C4.b bVar = this.f5925c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) bVar.f421r;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) arrayList.get(size);
                if (componentCallbacksC0269x != null && str.equals(componentCallbacksC0269x.f6112P)) {
                    return componentCallbacksC0269x;
                }
            }
        }
        if (str != null) {
            for (Z z7 : ((HashMap) bVar.f422s).values()) {
                if (z7 != null) {
                    ComponentCallbacksC0269x componentCallbacksC0269x2 = z7.f5978c;
                    if (str.equals(componentCallbacksC0269x2.f6112P)) {
                        return componentCallbacksC0269x2;
                    }
                }
            }
        } else {
            bVar.getClass();
        }
        return null;
    }

    public final void G() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0259m c0259m = (C0259m) it.next();
            if (c0259m.f6061e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0259m.f6061e = false;
                c0259m.i();
            }
        }
    }

    public final int I() {
        int i7;
        int size = this.d.size();
        if (this.f5928h != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return size + i7;
    }

    public final ViewGroup J(ComponentCallbacksC0269x componentCallbacksC0269x) {
        ViewGroup viewGroup = componentCallbacksC0269x.f6118V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC0269x.f6111O > 0 && this.f5942w.B()) {
            View A6 = this.f5942w.A(componentCallbacksC0269x.f6111O);
            if (A6 instanceof ViewGroup) {
                return (ViewGroup) A6;
            }
        }
        return null;
    }

    public final I K() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5943x;
        if (componentCallbacksC0269x != null) {
            return componentCallbacksC0269x.f6106J.K();
        }
        return this.f5945z;
    }

    public final J3.e L() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5943x;
        if (componentCallbacksC0269x != null) {
            return componentCallbacksC0269x.f6106J.L();
        }
        return this.f5909A;
    }

    public final void M(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0269x);
        }
        if (!componentCallbacksC0269x.f6113Q) {
            componentCallbacksC0269x.f6113Q = true;
            componentCallbacksC0269x.f6122a0 = true ^ componentCallbacksC0269x.f6122a0;
            f0(componentCallbacksC0269x);
        }
    }

    public final boolean O() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5943x;
        if (componentCallbacksC0269x == null) {
            return true;
        }
        if (componentCallbacksC0269x.z() && this.f5943x.t().O()) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if (!this.f5914G && !this.f5915H) {
            return false;
        }
        return true;
    }

    public final void S(int i7, boolean z7) {
        HashMap hashMap;
        C0271z c0271z;
        if (this.f5941v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z7 && i7 == this.f5940u) {
            return;
        }
        this.f5940u = i7;
        C4.b bVar = this.f5925c;
        Iterator it = ((ArrayList) bVar.f421r).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = (HashMap) bVar.f422s;
            if (!hasNext) {
                break;
            }
            Z z8 = (Z) hashMap.get(((ComponentCallbacksC0269x) it.next()).f6138u);
            if (z8 != null) {
                z8.k();
            }
        }
        for (Z z9 : hashMap.values()) {
            if (z9 != null) {
                z9.k();
                ComponentCallbacksC0269x componentCallbacksC0269x = z9.f5978c;
                if (componentCallbacksC0269x.f6099B && !componentCallbacksC0269x.B()) {
                    if (componentCallbacksC0269x.f6101D && !((HashMap) bVar.f423t).containsKey(componentCallbacksC0269x.f6138u)) {
                        bVar.W(componentCallbacksC0269x.f6138u, z9.o());
                    }
                    bVar.K(z9);
                }
            }
        }
        h0();
        if (this.F && (c0271z = this.f5941v) != null && this.f5940u == 7) {
            c0271z.f6150v.invalidateOptionsMenu();
            this.F = false;
        }
    }

    public final void T() {
        if (this.f5941v == null) {
            return;
        }
        this.f5914G = false;
        this.f5915H = false;
        this.f5921N.f5959i = false;
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null) {
                componentCallbacksC0269x.f6108L.T();
            }
        }
    }

    public final boolean U() {
        return V(-1, 0);
    }

    public final boolean V(int i7, int i8) {
        A(false);
        z(true);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5944y;
        if (componentCallbacksC0269x != null && i7 < 0 && componentCallbacksC0269x.n().V(-1, 0)) {
            return true;
        }
        boolean W = W(this.f5918K, this.f5919L, null, i7, i8);
        if (W) {
            this.f5924b = true;
            try {
                Y(this.f5918K, this.f5919L);
            } finally {
                d();
            }
        }
        j0();
        v();
        ((HashMap) this.f5925c.f422s).values().removeAll(Collections.singleton(null));
        return W;
    }

    public final boolean W(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i8) {
        boolean z7;
        if ((i8 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        int D6 = D(i7, str, z7);
        if (D6 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= D6; size--) {
            arrayList.add((C0247a) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void X(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0269x + " nesting=" + componentCallbacksC0269x.f6105I);
        }
        boolean z7 = !componentCallbacksC0269x.B();
        if (!componentCallbacksC0269x.f6114R || z7) {
            C4.b bVar = this.f5925c;
            synchronized (((ArrayList) bVar.f421r)) {
                ((ArrayList) bVar.f421r).remove(componentCallbacksC0269x);
            }
            componentCallbacksC0269x.f6098A = false;
            if (N(componentCallbacksC0269x)) {
                this.F = true;
            }
            componentCallbacksC0269x.f6099B = true;
            f0(componentCallbacksC0269x);
        }
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i7 = 0;
            int i8 = 0;
            while (i7 < size) {
                if (!((C0247a) arrayList.get(i7)).f5992p) {
                    if (i8 != i7) {
                        C(arrayList, arrayList2, i8, i7);
                    }
                    i8 = i7 + 1;
                    if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                        while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C0247a) arrayList.get(i8)).f5992p) {
                            i8++;
                        }
                    }
                    C(arrayList, arrayList2, i7, i8);
                    i7 = i8 - 1;
                }
                i7++;
            }
            if (i8 != size) {
                C(arrayList, arrayList2, i8, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void Z(Bundle bundle) {
        D d;
        Z z7;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f5941v.f6147s.getClassLoader());
                this.f5932l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f5941v.f6147s.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        C4.b bVar = this.f5925c;
        HashMap hashMap2 = (HashMap) bVar.f423t;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        T t5 = (T) bundle.getParcelable("state");
        if (t5 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) bVar.f422s;
        hashMap3.clear();
        Iterator it = t5.f5946q.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d = this.n;
            if (!hasNext) {
                break;
            }
            Bundle W = bVar.W((String) it.next(), null);
            if (W != null) {
                ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) this.f5921N.d.get(((X) W.getParcelable("state")).f5965r);
                if (componentCallbacksC0269x != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC0269x);
                    }
                    z7 = new Z(d, bVar, componentCallbacksC0269x, W);
                } else {
                    z7 = new Z(this.n, this.f5925c, this.f5941v.f6147s.getClassLoader(), K(), W);
                }
                ComponentCallbacksC0269x componentCallbacksC0269x2 = z7.f5978c;
                componentCallbacksC0269x2.f6135r = W;
                componentCallbacksC0269x2.f6106J = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC0269x2.f6138u + "): " + componentCallbacksC0269x2);
                }
                z7.m(this.f5941v.f6147s.getClassLoader());
                bVar.I(z7);
                z7.f5979e = this.f5940u;
            }
        }
        V v5 = this.f5921N;
        v5.getClass();
        Iterator it2 = new ArrayList(v5.d.values()).iterator();
        while (it2.hasNext()) {
            ComponentCallbacksC0269x componentCallbacksC0269x3 = (ComponentCallbacksC0269x) it2.next();
            if (hashMap3.get(componentCallbacksC0269x3.f6138u) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC0269x3 + " that was not found in the set of active Fragments " + t5.f5946q);
                }
                this.f5921N.g(componentCallbacksC0269x3);
                componentCallbacksC0269x3.f6106J = this;
                Z z8 = new Z(d, bVar, componentCallbacksC0269x3);
                z8.f5979e = 1;
                z8.k();
                componentCallbacksC0269x3.f6099B = true;
                z8.k();
            }
        }
        ArrayList<String> arrayList = t5.f5947r;
        ((ArrayList) bVar.f421r).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                ComponentCallbacksC0269x u7 = bVar.u(str3);
                if (u7 != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + u7);
                    }
                    bVar.c(u7);
                } else {
                    throw new IllegalStateException(AbstractC1111a.r("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (t5.f5948s != null) {
            this.d = new ArrayList(t5.f5948s.length);
            int i7 = 0;
            while (true) {
                C0248b[] c0248bArr = t5.f5948s;
                if (i7 >= c0248bArr.length) {
                    break;
                }
                C0248b c0248b = c0248bArr[i7];
                c0248b.getClass();
                C0247a c0247a = new C0247a(this);
                c0248b.a(c0247a);
                c0247a.f5995s = c0248b.f6014w;
                int i8 = 0;
                while (true) {
                    ArrayList arrayList2 = c0248b.f6009r;
                    if (i8 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i8);
                    if (str4 != null) {
                        ((a0) c0247a.f5980a.get(i8)).f5998b = bVar.u(str4);
                    }
                    i8++;
                }
                c0247a.d(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder o7 = AbstractC0515y1.o(i7, "restoreAllState: back stack #", " (index ");
                    o7.append(c0247a.f5995s);
                    o7.append("): ");
                    o7.append(c0247a);
                    Log.v("FragmentManager", o7.toString());
                    PrintWriter printWriter = new PrintWriter(new c0());
                    c0247a.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0247a);
                i7++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.f5930j.set(t5.f5949t);
        String str5 = t5.f5950u;
        if (str5 != null) {
            ComponentCallbacksC0269x u8 = bVar.u(str5);
            this.f5944y = u8;
            r(u8);
        }
        ArrayList arrayList3 = t5.f5951v;
        if (arrayList3 != null) {
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                this.f5931k.put((String) arrayList3.get(i9), (C0249c) t5.f5952w.get(i9));
            }
        }
        this.f5913E = new ArrayDeque(t5.f5953x);
    }

    public final Z a(ComponentCallbacksC0269x componentCallbacksC0269x) {
        String str = componentCallbacksC0269x.f6124c0;
        if (str != null) {
            AbstractC0551d.c(componentCallbacksC0269x, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0269x);
        }
        Z g7 = g(componentCallbacksC0269x);
        componentCallbacksC0269x.f6106J = this;
        C4.b bVar = this.f5925c;
        bVar.I(g7);
        if (!componentCallbacksC0269x.f6114R) {
            bVar.c(componentCallbacksC0269x);
            componentCallbacksC0269x.f6099B = false;
            if (componentCallbacksC0269x.W == null) {
                componentCallbacksC0269x.f6122a0 = false;
            }
            if (N(componentCallbacksC0269x)) {
                this.F = true;
            }
        }
        return g7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.fragment.app.T, android.os.Parcelable, java.lang.Object] */
    public final Bundle a0() {
        ArrayList arrayList;
        C0248b[] c0248bArr;
        Bundle bundle = new Bundle();
        G();
        x();
        A(true);
        this.f5914G = true;
        this.f5921N.f5959i = true;
        C4.b bVar = this.f5925c;
        bVar.getClass();
        HashMap hashMap = (HashMap) bVar.f422s;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (Z z7 : hashMap.values()) {
            if (z7 != null) {
                ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
                bVar.W(componentCallbacksC0269x.f6138u, z7.o());
                arrayList2.add(componentCallbacksC0269x.f6138u);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0269x + ": " + componentCallbacksC0269x.f6135r);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f5925c.f423t;
        if (hashMap2.isEmpty()) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            C4.b bVar2 = this.f5925c;
            synchronized (((ArrayList) bVar2.f421r)) {
                try {
                    if (((ArrayList) bVar2.f421r).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) bVar2.f421r).size());
                        Iterator it = ((ArrayList) bVar2.f421r).iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC0269x componentCallbacksC0269x2 = (ComponentCallbacksC0269x) it.next();
                            arrayList.add(componentCallbacksC0269x2.f6138u);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC0269x2.f6138u + "): " + componentCallbacksC0269x2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                c0248bArr = new C0248b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    c0248bArr[i7] = new C0248b((C0247a) this.d.get(i7));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder o7 = AbstractC0515y1.o(i7, "saveAllState: adding back stack #", ": ");
                        o7.append(this.d.get(i7));
                        Log.v("FragmentManager", o7.toString());
                    }
                }
            } else {
                c0248bArr = null;
            }
            ?? obj = new Object();
            obj.f5950u = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f5951v = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f5952w = arrayList4;
            obj.f5946q = arrayList2;
            obj.f5947r = arrayList;
            obj.f5948s = c0248bArr;
            obj.f5949t = this.f5930j.get();
            ComponentCallbacksC0269x componentCallbacksC0269x3 = this.f5944y;
            if (componentCallbacksC0269x3 != null) {
                obj.f5950u = componentCallbacksC0269x3.f6138u;
            }
            arrayList3.addAll(this.f5931k.keySet());
            arrayList4.addAll(this.f5931k.values());
            obj.f5953x = new ArrayList(this.f5913E);
            bundle.putParcelable("state", obj);
            for (String str : this.f5932l.keySet()) {
                bundle.putBundle(AbstractC0515y1.x("result_", str), (Bundle) this.f5932l.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(AbstractC0515y1.x("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0271z c0271z, p6.l lVar, ComponentCallbacksC0269x componentCallbacksC0269x) {
        V v5;
        String str;
        C0271z c0271z2;
        if (this.f5941v == null) {
            this.f5941v = c0271z;
            this.f5942w = lVar;
            this.f5943x = componentCallbacksC0269x;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f5934o;
            if (componentCallbacksC0269x != 0) {
                copyOnWriteArrayList.add(new J(componentCallbacksC0269x));
            } else if (c0271z instanceof W) {
                copyOnWriteArrayList.add(c0271z);
            }
            if (this.f5943x != null) {
                j0();
            }
            if (c0271z instanceof androidx.activity.x) {
                androidx.activity.w e3 = c0271z.f6150v.e();
                this.f5927g = e3;
                if (componentCallbacksC0269x != 0) {
                    c0271z2 = componentCallbacksC0269x;
                } else {
                    c0271z2 = c0271z;
                }
                e3.a(c0271z2, this.f5929i);
            }
            if (componentCallbacksC0269x != 0) {
                V v7 = componentCallbacksC0269x.f6106J.f5921N;
                HashMap hashMap = v7.f5956e;
                V v8 = (V) hashMap.get(componentCallbacksC0269x.f6138u);
                if (v8 == null) {
                    v8 = new V(v7.f5957g);
                    hashMap.put(componentCallbacksC0269x.f6138u, v8);
                }
                this.f5921N = v8;
            } else {
                if (c0271z instanceof androidx.lifecycle.c0) {
                    v5 = (V) new C0002c(c0271z.f6150v.p(), V.f5955j).x(V.class);
                } else {
                    v5 = new V(false);
                }
                this.f5921N = v5;
            }
            this.f5921N.f5959i = R();
            this.f5925c.f424u = this.f5921N;
            C0271z c0271z3 = this.f5941v;
            if ((c0271z3 instanceof A0.g) && componentCallbacksC0269x == 0) {
                A0.e f = c0271z3.f();
                f.d("android:support:fragments", new androidx.activity.e(2, this));
                Bundle b7 = f.b("android:support:fragments");
                if (b7 != null) {
                    Z(b7);
                }
            }
            C0271z c0271z4 = this.f5941v;
            if (c0271z4 instanceof androidx.activity.result.h) {
                androidx.activity.h hVar = c0271z4.f6150v.f5323A;
                if (componentCallbacksC0269x != 0) {
                    str = AbstractC1111a.t(new StringBuilder(), componentCallbacksC0269x.f6138u, ":");
                } else {
                    str = "";
                }
                String x7 = AbstractC0515y1.x("FragmentManager:", str);
                this.f5910B = hVar.d(AbstractC0515y1.m(x7, "StartActivityForResult"), new K(3), new F(this, 1));
                this.f5911C = hVar.d(AbstractC0515y1.m(x7, "StartIntentSenderForResult"), new K(0), new F(this, 2));
                this.f5912D = hVar.d(AbstractC0515y1.m(x7, "RequestPermissions"), new K(1), new F(this, 0));
            }
            C0271z c0271z5 = this.f5941v;
            if (c0271z5 instanceof A.i) {
                c0271z5.W(this.f5935p);
            }
            C0271z c0271z6 = this.f5941v;
            if (c0271z6 instanceof A.j) {
                c0271z6.Z(this.f5936q);
            }
            C0271z c0271z7 = this.f5941v;
            if (c0271z7 instanceof z.i) {
                c0271z7.X(this.f5937r);
            }
            C0271z c0271z8 = this.f5941v;
            if (c0271z8 instanceof z.j) {
                c0271z8.Y(this.f5938s);
            }
            C0271z c0271z9 = this.f5941v;
            if ((c0271z9 instanceof InterfaceC0035k) && componentCallbacksC0269x == 0) {
                c0271z9.V(this.f5939t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0() {
        synchronized (this.f5923a) {
            try {
                if (this.f5923a.size() == 1) {
                    this.f5941v.f6148t.removeCallbacks(this.f5922O);
                    this.f5941v.f6148t.post(this.f5922O);
                    j0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0269x);
        }
        if (componentCallbacksC0269x.f6114R) {
            componentCallbacksC0269x.f6114R = false;
            if (!componentCallbacksC0269x.f6098A) {
                this.f5925c.c(componentCallbacksC0269x);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "add from attach: " + componentCallbacksC0269x);
                }
                if (N(componentCallbacksC0269x)) {
                    this.F = true;
                }
            }
        }
    }

    public final void c0(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        ViewGroup J6 = J(componentCallbacksC0269x);
        if (J6 != null && (J6 instanceof FragmentContainerView)) {
            ((FragmentContainerView) J6).setDrawDisappearingViewsLast(!z7);
        }
    }

    public final void d() {
        this.f5924b = false;
        this.f5919L.clear();
        this.f5918K.clear();
    }

    public final void d0(ComponentCallbacksC0269x componentCallbacksC0269x, EnumC0337o enumC0337o) {
        if (componentCallbacksC0269x.equals(this.f5925c.u(componentCallbacksC0269x.f6138u)) && (componentCallbacksC0269x.f6107K == null || componentCallbacksC0269x.f6106J == this)) {
            componentCallbacksC0269x.f6125d0 = enumC0337o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0269x + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet e() {
        C0259m c0259m;
        HashSet hashSet = new HashSet();
        Iterator it = this.f5925c.y().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((Z) it.next()).f5978c.f6118V;
            if (viewGroup != null) {
                M5.g.f(L(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0259m) {
                    c0259m = (C0259m) tag;
                } else {
                    c0259m = new C0259m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0259m);
                }
                hashSet.add(c0259m);
            }
        }
        return hashSet;
    }

    public final void e0(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (componentCallbacksC0269x != null) {
            if (!componentCallbacksC0269x.equals(this.f5925c.u(componentCallbacksC0269x.f6138u)) || (componentCallbacksC0269x.f6107K != null && componentCallbacksC0269x.f6106J != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC0269x + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC0269x componentCallbacksC0269x2 = this.f5944y;
        this.f5944y = componentCallbacksC0269x;
        r(componentCallbacksC0269x2);
        r(this.f5944y);
    }

    public final HashSet f(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C0247a) arrayList.get(i7)).f5980a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC0269x componentCallbacksC0269x = ((a0) it.next()).f5998b;
                if (componentCallbacksC0269x != null && (viewGroup = componentCallbacksC0269x.f6118V) != null) {
                    hashSet.add(C0259m.m(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final void f0(ComponentCallbacksC0269x componentCallbacksC0269x) {
        int i7;
        int i8;
        int i9;
        int i10;
        ViewGroup J6 = J(componentCallbacksC0269x);
        if (J6 != null) {
            C0267v c0267v = componentCallbacksC0269x.f6121Z;
            boolean z7 = false;
            if (c0267v == null) {
                i7 = 0;
            } else {
                i7 = c0267v.f6089b;
            }
            if (c0267v == null) {
                i8 = 0;
            } else {
                i8 = c0267v.f6090c;
            }
            int i11 = i8 + i7;
            if (c0267v == null) {
                i9 = 0;
            } else {
                i9 = c0267v.d;
            }
            int i12 = i9 + i11;
            if (c0267v == null) {
                i10 = 0;
            } else {
                i10 = c0267v.f6091e;
            }
            if (i10 + i12 > 0) {
                if (J6.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    J6.setTag(R.id.visible_removing_fragment_view_tag, componentCallbacksC0269x);
                }
                ComponentCallbacksC0269x componentCallbacksC0269x2 = (ComponentCallbacksC0269x) J6.getTag(R.id.visible_removing_fragment_view_tag);
                C0267v c0267v2 = componentCallbacksC0269x.f6121Z;
                if (c0267v2 != null) {
                    z7 = c0267v2.f6088a;
                }
                if (componentCallbacksC0269x2.f6121Z != null) {
                    componentCallbacksC0269x2.l().f6088a = z7;
                }
            }
        }
    }

    public final Z g(ComponentCallbacksC0269x componentCallbacksC0269x) {
        String str = componentCallbacksC0269x.f6138u;
        C4.b bVar = this.f5925c;
        Z z7 = (Z) ((HashMap) bVar.f422s).get(str);
        if (z7 != null) {
            return z7;
        }
        Z z8 = new Z(this.n, bVar, componentCallbacksC0269x);
        z8.m(this.f5941v.f6147s.getClassLoader());
        z8.f5979e = this.f5940u;
        return z8;
    }

    public final void h(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0269x);
        }
        if (!componentCallbacksC0269x.f6114R) {
            componentCallbacksC0269x.f6114R = true;
            if (componentCallbacksC0269x.f6098A) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0269x);
                }
                C4.b bVar = this.f5925c;
                synchronized (((ArrayList) bVar.f421r)) {
                    ((ArrayList) bVar.f421r).remove(componentCallbacksC0269x);
                }
                componentCallbacksC0269x.f6098A = false;
                if (N(componentCallbacksC0269x)) {
                    this.F = true;
                }
                f0(componentCallbacksC0269x);
            }
        }
    }

    public final void h0() {
        Iterator it = this.f5925c.y().iterator();
        while (it.hasNext()) {
            Z z7 = (Z) it.next();
            ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
            if (componentCallbacksC0269x.f6119X) {
                if (this.f5924b) {
                    this.f5917J = true;
                } else {
                    componentCallbacksC0269x.f6119X = false;
                    z7.k();
                }
            }
        }
    }

    public final void i(boolean z7) {
        if (z7 && (this.f5941v instanceof A.i)) {
            i0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null) {
                componentCallbacksC0269x.f6117U = true;
                if (z7) {
                    componentCallbacksC0269x.f6108L.i(true);
                }
            }
        }
    }

    public final void i0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c0());
        C0271z c0271z = this.f5941v;
        try {
            if (c0271z != null) {
                c0271z.f6150v.dump("  ", null, printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
        }
        throw runtimeException;
    }

    public final boolean j() {
        if (this.f5940u < 1) {
            return false;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && componentCallbacksC0269x.W()) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        synchronized (this.f5923a) {
            try {
                boolean z7 = true;
                if (!this.f5923a.isEmpty()) {
                    this.f5929i.e(true);
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                z7 = (I() <= 0 || !Q(this.f5943x)) ? false : false;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z7);
                }
                this.f5929i.e(z7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        if (this.f5940u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && P(componentCallbacksC0269x) && !componentCallbacksC0269x.f6113Q && componentCallbacksC0269x.f6108L.k()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC0269x);
                z7 = true;
            }
        }
        if (this.f5926e != null) {
            for (int i7 = 0; i7 < this.f5926e.size(); i7++) {
                ComponentCallbacksC0269x componentCallbacksC0269x2 = (ComponentCallbacksC0269x) this.f5926e.get(i7);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0269x2)) {
                    componentCallbacksC0269x2.getClass();
                }
            }
        }
        this.f5926e = arrayList;
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r0 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r6 = this;
            r0 = 1
            r6.f5916I = r0
            r6.A(r0)
            r6.x()
            androidx.fragment.app.z r1 = r6.f5941v
            boolean r2 = r1 instanceof androidx.lifecycle.c0
            C4.b r3 = r6.f5925c
            if (r2 == 0) goto L18
            java.lang.Object r0 = r3.f424u
            androidx.fragment.app.V r0 = (androidx.fragment.app.V) r0
            boolean r0 = r0.f5958h
            goto L25
        L18:
            android.content.Context r1 = r1.f6147s
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L27
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L25:
            if (r0 == 0) goto L58
        L27:
            java.util.Map r0 = r6.f5931k
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.c r1 = (androidx.fragment.app.C0249c) r1
            java.util.List r1 = r1.f6024q
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r3.f424u
            androidx.fragment.app.V r4 = (androidx.fragment.app.V) r4
            r5 = 0
            r4.e(r2, r5)
            goto L43
        L58:
            r0 = -1
            r6.u(r0)
            androidx.fragment.app.z r0 = r6.f5941v
            boolean r1 = r0 instanceof A.j
            if (r1 == 0) goto L67
            androidx.fragment.app.E r1 = r6.f5936q
            r0.e0(r1)
        L67:
            androidx.fragment.app.z r0 = r6.f5941v
            boolean r1 = r0 instanceof A.i
            if (r1 == 0) goto L72
            androidx.fragment.app.E r1 = r6.f5935p
            r0.b0(r1)
        L72:
            androidx.fragment.app.z r0 = r6.f5941v
            boolean r1 = r0 instanceof z.i
            if (r1 == 0) goto L7d
            androidx.fragment.app.E r1 = r6.f5937r
            r0.c0(r1)
        L7d:
            androidx.fragment.app.z r0 = r6.f5941v
            boolean r1 = r0 instanceof z.j
            if (r1 == 0) goto L88
            androidx.fragment.app.E r1 = r6.f5938s
            r0.d0(r1)
        L88:
            androidx.fragment.app.z r0 = r6.f5941v
            boolean r1 = r0 instanceof K.InterfaceC0035k
            if (r1 == 0) goto L97
            androidx.fragment.app.x r1 = r6.f5943x
            if (r1 != 0) goto L97
            androidx.fragment.app.H r1 = r6.f5939t
            r0.a0(r1)
        L97:
            r0 = 0
            r6.f5941v = r0
            r6.f5942w = r0
            r6.f5943x = r0
            androidx.activity.w r1 = r6.f5927g
            if (r1 == 0) goto Lbc
            androidx.fragment.app.G r1 = r6.f5929i
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f5343b
            java.util.Iterator r1 = r1.iterator()
        Laa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r1.next()
            androidx.activity.c r2 = (androidx.activity.c) r2
            r2.cancel()
            goto Laa
        Lba:
            r6.f5927g = r0
        Lbc:
            androidx.activity.result.d r0 = r6.f5910B
            if (r0 == 0) goto Lcd
            r0.b()
            androidx.activity.result.d r0 = r6.f5911C
            r0.b()
            androidx.activity.result.d r0 = r6.f5912D
            r0.b()
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.S.l():void");
    }

    public final void m(boolean z7) {
        if (z7 && (this.f5941v instanceof A.j)) {
            i0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null) {
                componentCallbacksC0269x.f6117U = true;
                if (z7) {
                    componentCallbacksC0269x.f6108L.m(true);
                }
            }
        }
    }

    public final void n(boolean z7, boolean z8) {
        if (z8 && (this.f5941v instanceof z.i)) {
            i0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && z8) {
                componentCallbacksC0269x.f6108L.n(z7, true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f5925c.z().iterator();
        while (it.hasNext()) {
            ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) it.next();
            if (componentCallbacksC0269x != null) {
                componentCallbacksC0269x.M(componentCallbacksC0269x.A());
                componentCallbacksC0269x.f6108L.o();
            }
        }
    }

    public final boolean p() {
        if (this.f5940u < 1) {
            return false;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && !componentCallbacksC0269x.f6113Q && componentCallbacksC0269x.f6108L.p()) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        if (this.f5940u < 1) {
            return;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && !componentCallbacksC0269x.f6113Q) {
                componentCallbacksC0269x.f6108L.q();
            }
        }
    }

    public final void r(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (componentCallbacksC0269x != null) {
            if (componentCallbacksC0269x.equals(this.f5925c.u(componentCallbacksC0269x.f6138u))) {
                componentCallbacksC0269x.f6106J.getClass();
                boolean Q4 = Q(componentCallbacksC0269x);
                Boolean bool = componentCallbacksC0269x.f6143z;
                if (bool == null || bool.booleanValue() != Q4) {
                    componentCallbacksC0269x.f6143z = Boolean.valueOf(Q4);
                    componentCallbacksC0269x.P(Q4);
                    S s6 = componentCallbacksC0269x.f6108L;
                    s6.j0();
                    s6.r(s6.f5944y);
                }
            }
        }
    }

    public final void s(boolean z7, boolean z8) {
        if (z8 && (this.f5941v instanceof z.j)) {
            i0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && z8) {
                componentCallbacksC0269x.f6108L.s(z7, true);
            }
        }
    }

    public final boolean t() {
        boolean z7 = false;
        if (this.f5940u < 1) {
            return false;
        }
        for (ComponentCallbacksC0269x componentCallbacksC0269x : this.f5925c.A()) {
            if (componentCallbacksC0269x != null && P(componentCallbacksC0269x) && !componentCallbacksC0269x.f6113Q && componentCallbacksC0269x.f6108L.t()) {
                z7 = true;
            }
        }
        return z7;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f5943x;
        if (componentCallbacksC0269x != null) {
            sb.append(componentCallbacksC0269x.getClass().getSimpleName());
            sb.append("{");
            obj = this.f5943x;
        } else {
            C0271z c0271z = this.f5941v;
            if (c0271z != null) {
                sb.append(c0271z.getClass().getSimpleName());
                sb.append("{");
                obj = this.f5941v;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i7) {
        try {
            this.f5924b = true;
            for (Z z7 : ((HashMap) this.f5925c.f422s).values()) {
                if (z7 != null) {
                    z7.f5979e = i7;
                }
            }
            S(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0259m) it.next()).l();
            }
            this.f5924b = false;
            A(true);
        } catch (Throwable th) {
            this.f5924b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f5917J) {
            this.f5917J = false;
            h0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        String m7 = AbstractC0515y1.m(str, "    ");
        C4.b bVar = this.f5925c;
        bVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) bVar.f422s;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Z z8 : hashMap.values()) {
                printWriter.print(str);
                if (z8 != null) {
                    ComponentCallbacksC0269x componentCallbacksC0269x = z8.f5978c;
                    printWriter.println(componentCallbacksC0269x);
                    componentCallbacksC0269x.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC0269x.f6110N));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC0269x.f6111O));
                    printWriter.print(" mTag=");
                    printWriter.println(componentCallbacksC0269x.f6112P);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(componentCallbacksC0269x.f6134q);
                    printWriter.print(" mWho=");
                    printWriter.print(componentCallbacksC0269x.f6138u);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(componentCallbacksC0269x.f6105I);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(componentCallbacksC0269x.f6098A);
                    printWriter.print(" mRemoving=");
                    printWriter.print(componentCallbacksC0269x.f6099B);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(componentCallbacksC0269x.f6102E);
                    printWriter.print(" mInLayout=");
                    printWriter.println(componentCallbacksC0269x.F);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(componentCallbacksC0269x.f6113Q);
                    printWriter.print(" mDetached=");
                    printWriter.print(componentCallbacksC0269x.f6114R);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(componentCallbacksC0269x.f6116T);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(componentCallbacksC0269x.f6115S);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(componentCallbacksC0269x.f6120Y);
                    if (componentCallbacksC0269x.f6106J != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(componentCallbacksC0269x.f6106J);
                    }
                    if (componentCallbacksC0269x.f6107K != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(componentCallbacksC0269x.f6107K);
                    }
                    if (componentCallbacksC0269x.f6109M != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(componentCallbacksC0269x.f6109M);
                    }
                    if (componentCallbacksC0269x.f6139v != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(componentCallbacksC0269x.f6139v);
                    }
                    if (componentCallbacksC0269x.f6135r != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(componentCallbacksC0269x.f6135r);
                    }
                    if (componentCallbacksC0269x.f6136s != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(componentCallbacksC0269x.f6136s);
                    }
                    if (componentCallbacksC0269x.f6137t != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(componentCallbacksC0269x.f6137t);
                    }
                    Object obj = componentCallbacksC0269x.f6140w;
                    if (obj == null) {
                        S s6 = componentCallbacksC0269x.f6106J;
                        if (s6 != null && (str2 = componentCallbacksC0269x.f6141x) != null) {
                            obj = s6.f5925c.u(str2);
                        } else {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(componentCallbacksC0269x.f6142y);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0267v c0267v = componentCallbacksC0269x.f6121Z;
                    if (c0267v == null) {
                        z7 = false;
                    } else {
                        z7 = c0267v.f6088a;
                    }
                    printWriter.println(z7);
                    C0267v c0267v2 = componentCallbacksC0269x.f6121Z;
                    if (c0267v2 != null && c0267v2.f6089b != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0267v c0267v3 = componentCallbacksC0269x.f6121Z;
                        if (c0267v3 == null) {
                            i10 = 0;
                        } else {
                            i10 = c0267v3.f6089b;
                        }
                        printWriter.println(i10);
                    }
                    C0267v c0267v4 = componentCallbacksC0269x.f6121Z;
                    if (c0267v4 != null && c0267v4.f6090c != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0267v c0267v5 = componentCallbacksC0269x.f6121Z;
                        if (c0267v5 == null) {
                            i9 = 0;
                        } else {
                            i9 = c0267v5.f6090c;
                        }
                        printWriter.println(i9);
                    }
                    C0267v c0267v6 = componentCallbacksC0269x.f6121Z;
                    if (c0267v6 != null && c0267v6.d != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0267v c0267v7 = componentCallbacksC0269x.f6121Z;
                        if (c0267v7 == null) {
                            i8 = 0;
                        } else {
                            i8 = c0267v7.d;
                        }
                        printWriter.println(i8);
                    }
                    C0267v c0267v8 = componentCallbacksC0269x.f6121Z;
                    if (c0267v8 != null && c0267v8.f6091e != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0267v c0267v9 = componentCallbacksC0269x.f6121Z;
                        if (c0267v9 == null) {
                            i7 = 0;
                        } else {
                            i7 = c0267v9.f6091e;
                        }
                        printWriter.println(i7);
                    }
                    if (componentCallbacksC0269x.f6118V != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(componentCallbacksC0269x.f6118V);
                    }
                    if (componentCallbacksC0269x.W != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(componentCallbacksC0269x.W);
                    }
                    if (componentCallbacksC0269x.o() != null) {
                        o.k kVar = ((C0985a) new C0002c(componentCallbacksC0269x.p(), C0985a.f12380e).x(C0985a.class)).d;
                        if (kVar.k() > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (kVar.k() > 0) {
                                AbstractC0515y1.v(kVar.l(0));
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(kVar.g(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + componentCallbacksC0269x.f6108L + ":");
                    componentCallbacksC0269x.f6108L.w(AbstractC0515y1.m(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) bVar.f421r;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(((ComponentCallbacksC0269x) arrayList.get(i11)).toString());
            }
        }
        ArrayList arrayList2 = this.f5926e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i12 = 0; i12 < size; i12++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(((ComponentCallbacksC0269x) this.f5926e.get(i12)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i13 = 0; i13 < size3; i13++) {
                C0247a c0247a = (C0247a) this.d.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(c0247a.toString());
                c0247a.g(m7, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5930j.get());
        synchronized (this.f5923a) {
            try {
                int size4 = this.f5923a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i14 = 0; i14 < size4; i14++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i14);
                        printWriter.print(": ");
                        printWriter.println((N) this.f5923a.get(i14));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5941v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5942w);
        if (this.f5943x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5943x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5940u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5914G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5915H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5916I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0259m) it.next()).l();
        }
    }

    public final void y(N n, boolean z7) {
        if (!z7) {
            if (this.f5941v == null) {
                if (this.f5916I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (R()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f5923a) {
            try {
                if (this.f5941v == null) {
                    if (z7) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.f5923a.add(n);
                b0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z7) {
        if (!this.f5924b) {
            if (this.f5941v == null) {
                if (this.f5916I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f5941v.f6148t.getLooper()) {
                if (!z7 && R()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.f5918K == null) {
                    this.f5918K = new ArrayList();
                    this.f5919L = new ArrayList();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }
}
