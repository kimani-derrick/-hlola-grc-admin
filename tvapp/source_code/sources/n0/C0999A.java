package n0;

import a.AbstractC0189a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.b0;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p.AbstractC1078a;
import r0.AbstractC1111a;
import z5.C1527i;
/* renamed from: n0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999A {

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f12454A;

    /* renamed from: B  reason: collision with root package name */
    public final C1527i f12455B;

    /* renamed from: C  reason: collision with root package name */
    public final Z5.r f12456C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12457a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f12458b;

    /* renamed from: c  reason: collision with root package name */
    public y f12459c;
    public Bundle d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable[] f12460e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final A5.i f12461g;

    /* renamed from: h  reason: collision with root package name */
    public final Z5.w f12462h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f12463i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f12464j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f12465k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f12466l;

    /* renamed from: m  reason: collision with root package name */
    public InterfaceC0342u f12467m;
    public androidx.activity.w n;

    /* renamed from: o  reason: collision with root package name */
    public q f12468o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList f12469p;

    /* renamed from: q  reason: collision with root package name */
    public EnumC0337o f12470q;

    /* renamed from: r  reason: collision with root package name */
    public final A0.b f12471r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.fragment.app.G f12472s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12473t;

    /* renamed from: u  reason: collision with root package name */
    public final O f12474u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f12475v;

    /* renamed from: w  reason: collision with root package name */
    public L5.l f12476w;

    /* renamed from: x  reason: collision with root package name */
    public L5.l f12477x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f12478y;

    /* renamed from: z  reason: collision with root package name */
    public int f12479z;

    public C0999A(Context context) {
        Object obj;
        this.f12457a = context;
        Iterator it = T5.j.K(context, C1012c.f12523t).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f12458b = (Activity) obj;
        this.f12461g = new A5.i();
        this.f12462h = Z5.s.b(A5.t.f135q);
        this.f12463i = new LinkedHashMap();
        this.f12464j = new LinkedHashMap();
        this.f12465k = new LinkedHashMap();
        this.f12466l = new LinkedHashMap();
        this.f12469p = new CopyOnWriteArrayList();
        this.f12470q = EnumC0337o.f6818r;
        this.f12471r = new A0.b(1, this);
        this.f12472s = new androidx.fragment.app.G(1, this);
        this.f12473t = true;
        O o7 = new O();
        this.f12474u = o7;
        this.f12475v = new LinkedHashMap();
        this.f12478y = new LinkedHashMap();
        o7.a(new z(o7));
        o7.a(new C1013d(this.f12457a));
        this.f12454A = new ArrayList();
        this.f12455B = new C1527i(new D0.h(12, this));
        this.f12456C = Z5.s.a(1, 2, 2);
    }

    public static /* synthetic */ void o(C0999A c0999a, C1019j c1019j) {
        c0999a.n(c1019j, false, new A5.i());
    }

    public final void a(v vVar, Bundle bundle, C1019j c1019j, List list) {
        v vVar2;
        Object obj;
        v vVar3;
        Object obj2;
        Object obj3;
        Object obj4;
        v vVar4 = c1019j.f12543r;
        boolean z7 = vVar4 instanceof InterfaceC1014e;
        A5.i iVar = this.f12461g;
        if (!z7) {
            while (!iVar.isEmpty() && (((C1019j) iVar.last()).f12543r instanceof InterfaceC1014e) && m(((C1019j) iVar.last()).f12543r.f12607x, true, false)) {
            }
        }
        A5.i iVar2 = new A5.i();
        boolean z8 = vVar instanceof y;
        Context context = this.f12457a;
        C1019j c1019j2 = null;
        if (z8) {
            v vVar5 = vVar4;
            do {
                M5.g.c(vVar5);
                vVar5 = vVar5.f12601r;
                if (vVar5 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj4 = listIterator.previous();
                            if (M5.g.a(((C1019j) obj4).f12543r, vVar5)) {
                                break;
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    C1019j c1019j3 = (C1019j) obj4;
                    if (c1019j3 == null) {
                        c1019j3 = m3.i.d(context, vVar5, bundle, f(), this.f12468o);
                    }
                    iVar2.f(c1019j3);
                    if ((!iVar.isEmpty()) && ((C1019j) iVar.last()).f12543r == vVar5) {
                        o(this, (C1019j) iVar.last());
                    }
                }
                if (vVar5 == null) {
                    break;
                }
            } while (vVar5 != vVar);
        }
        if (iVar2.isEmpty()) {
            vVar2 = vVar4;
        } else {
            vVar2 = ((C1019j) iVar2.first()).f12543r;
        }
        while (vVar2 != null && c(vVar2.f12607x) == null) {
            vVar2 = vVar2.f12601r;
            if (vVar2 != null) {
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (M5.g.a(((C1019j) obj3).f12543r, vVar2)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                C1019j c1019j4 = (C1019j) obj3;
                if (c1019j4 == null) {
                    c1019j4 = m3.i.d(context, vVar2, vVar2.c(bundle), f(), this.f12468o);
                }
                iVar2.f(c1019j4);
            }
        }
        if (!iVar2.isEmpty()) {
            vVar4 = ((C1019j) iVar2.first()).f12543r;
        }
        while (!iVar.isEmpty() && (((C1019j) iVar.last()).f12543r instanceof y) && ((y) ((C1019j) iVar.last()).f12543r).n(vVar4.f12607x, false) == null) {
            o(this, (C1019j) iVar.last());
        }
        if (iVar.isEmpty()) {
            obj = null;
        } else {
            obj = iVar.f130r[iVar.f129q];
        }
        C1019j c1019j5 = (C1019j) obj;
        if (c1019j5 == null) {
            if (iVar2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = iVar2.f130r[iVar2.f129q];
            }
            c1019j5 = (C1019j) obj2;
        }
        if (c1019j5 != null) {
            vVar3 = c1019j5.f12543r;
        } else {
            vVar3 = null;
        }
        if (!M5.g.a(vVar3, this.f12459c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                v vVar6 = ((C1019j) previous).f12543r;
                y yVar = this.f12459c;
                M5.g.c(yVar);
                if (M5.g.a(vVar6, yVar)) {
                    c1019j2 = previous;
                    break;
                }
            }
            C1019j c1019j6 = c1019j2;
            if (c1019j6 == null) {
                y yVar2 = this.f12459c;
                M5.g.c(yVar2);
                y yVar3 = this.f12459c;
                M5.g.c(yVar3);
                c1019j6 = m3.i.d(context, yVar2, yVar3.c(bundle), f(), this.f12468o);
            }
            iVar2.f(c1019j6);
        }
        Iterator it = iVar2.iterator();
        while (it.hasNext()) {
            C1019j c1019j7 = (C1019j) it.next();
            Object obj5 = this.f12475v.get(this.f12474u.b(c1019j7.f12543r.f12600q));
            if (obj5 != null) {
                ((C1021l) obj5).a(c1019j7);
            } else {
                throw new IllegalStateException(AbstractC1111a.t(new StringBuilder("NavigatorBackStack for "), vVar.f12600q, " should already be created").toString());
            }
        }
        iVar.addAll(iVar2);
        iVar.g(c1019j);
        Iterator it2 = A5.k.f0(iVar2, c1019j).iterator();
        while (it2.hasNext()) {
            C1019j c1019j8 = (C1019j) it2.next();
            y yVar4 = c1019j8.f12543r.f12601r;
            if (yVar4 != null) {
                g(c1019j8, d(yVar4.f12607x));
            }
        }
    }

    public final boolean b() {
        A5.i iVar;
        while (true) {
            iVar = this.f12461g;
            if (iVar.isEmpty() || !(((C1019j) iVar.last()).f12543r instanceof y)) {
                break;
            }
            o(this, (C1019j) iVar.last());
        }
        C1019j c1019j = (C1019j) iVar.o();
        ArrayList arrayList = this.f12454A;
        if (c1019j != null) {
            arrayList.add(c1019j);
        }
        this.f12479z++;
        t();
        int i7 = this.f12479z - 1;
        this.f12479z = i7;
        if (i7 == 0) {
            ArrayList m02 = A5.k.m0(arrayList);
            arrayList.clear();
            Iterator it = m02.iterator();
            while (it.hasNext()) {
                C1019j c1019j2 = (C1019j) it.next();
                Iterator it2 = this.f12469p.iterator();
                if (!it2.hasNext()) {
                    this.f12456C.n(c1019j2);
                } else {
                    AbstractC0515y1.v(it2.next());
                    v vVar = c1019j2.f12543r;
                    throw null;
                }
            }
            this.f12462h.f(p());
        }
        if (c1019j != null) {
            return true;
        }
        return false;
    }

    public final v c(int i7) {
        v vVar;
        y yVar;
        y yVar2 = this.f12459c;
        if (yVar2 == null) {
            return null;
        }
        if (yVar2.f12607x == i7) {
            return yVar2;
        }
        C1019j c1019j = (C1019j) this.f12461g.o();
        if (c1019j == null || (vVar = c1019j.f12543r) == null) {
            vVar = this.f12459c;
            M5.g.c(vVar);
        }
        if (vVar.f12607x != i7) {
            if (vVar instanceof y) {
                yVar = (y) vVar;
            } else {
                yVar = vVar.f12601r;
                M5.g.c(yVar);
            }
            return yVar.n(i7, true);
        }
        return vVar;
    }

    public final C1019j d(int i7) {
        Object obj;
        A5.i iVar = this.f12461g;
        ListIterator<E> listIterator = iVar.listIterator(iVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((C1019j) obj).f12543r.f12607x == i7) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1019j c1019j = (C1019j) obj;
        if (c1019j != null) {
            return c1019j;
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        o7.append(e());
        throw new IllegalArgumentException(o7.toString().toString());
    }

    public final v e() {
        C1019j c1019j = (C1019j) this.f12461g.o();
        if (c1019j != null) {
            return c1019j.f12543r;
        }
        return null;
    }

    public final EnumC0337o f() {
        if (this.f12467m == null) {
            return EnumC0337o.f6819s;
        }
        return this.f12470q;
    }

    public final void g(C1019j c1019j, C1019j c1019j2) {
        this.f12463i.put(c1019j, c1019j2);
        LinkedHashMap linkedHashMap = this.f12464j;
        if (linkedHashMap.get(c1019j2) == null) {
            linkedHashMap.put(c1019j2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c1019j2);
        M5.g.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void h(int i7, Bundle bundle) {
        v vVar;
        int i8;
        C1002D c1002d;
        int i9;
        A5.i iVar = this.f12461g;
        if (iVar.isEmpty()) {
            vVar = this.f12459c;
        } else {
            vVar = ((C1019j) iVar.last()).f12543r;
        }
        if (vVar != null) {
            C1015f f = vVar.f(i7);
            Bundle bundle2 = null;
            if (f != null) {
                c1002d = f.f12533b;
                Bundle bundle3 = f.f12534c;
                i8 = f.f12532a;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                }
            } else {
                i8 = i7;
                c1002d = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i8 == 0 && c1002d != null && (i9 = c1002d.f12488c) != -1) {
                l(i9, c1002d.d);
                return;
            } else if (i8 != 0) {
                v c5 = c(i8);
                if (c5 == null) {
                    int i10 = v.f12599z;
                    Context context = this.f12457a;
                    String u7 = AbstractC0189a.u(context, i8);
                    if (f == null) {
                        throw new IllegalArgumentException("Navigation action/destination " + u7 + " cannot be found from the current destination " + vVar);
                    }
                    StringBuilder u8 = AbstractC1111a.u("Navigation destination ", u7, " referenced from action ");
                    u8.append(AbstractC0189a.u(context, i7));
                    u8.append(" cannot be found from the current destination ");
                    u8.append(vVar);
                    throw new IllegalArgumentException(u8.toString().toString());
                }
                i(c5, bundle2, c1002d);
                return;
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
        }
        throw new IllegalStateException("no current navigation node");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9 A[LOOP:1: B:35:0x00f3->B:37:0x00f9, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v3, types: [M5.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(n0.v r18, android.os.Bundle r19, n0.C1002D r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0999A.i(n0.v, android.os.Bundle, n0.D):void");
    }

    public final void j(w wVar) {
        h(wVar.a(), wVar.b());
    }

    public final boolean k() {
        if (this.f12461g.isEmpty()) {
            return false;
        }
        v e3 = e();
        M5.g.c(e3);
        return l(e3.f12607x, true);
    }

    public final boolean l(int i7, boolean z7) {
        if (!m(i7, z7, false) || !b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [M5.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [M5.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final boolean m(int i7, boolean z7, boolean z8) {
        v vVar;
        String str;
        String str2;
        C1020k c1020k;
        String str3;
        A5.i iVar = this.f12461g;
        if (iVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = A5.k.g0(iVar).iterator();
        while (true) {
            if (it.hasNext()) {
                v vVar2 = ((C1019j) it.next()).f12543r;
                N b7 = this.f12474u.b(vVar2.f12600q);
                if (z7 || vVar2.f12607x != i7) {
                    arrayList.add(b7);
                }
                if (vVar2.f12607x == i7) {
                    vVar = vVar2;
                    break;
                }
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar == null) {
            int i8 = v.f12599z;
            String u7 = AbstractC0189a.u(this.f12457a, i7);
            Log.i("NavController", "Ignoring popBackStack to destination " + u7 + " as it was not found on the current back stack");
            return false;
        }
        ?? obj = new Object();
        A5.i iVar2 = new A5.i();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                ?? obj2 = new Object();
                this.f12477x = new C1023n(obj2, obj, this, z8, iVar2);
                ((N) it2.next()).i((C1019j) iVar.last(), z8);
                str = null;
                this.f12477x = null;
                if (!obj2.f2312q) {
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (z8) {
            LinkedHashMap linkedHashMap = this.f12465k;
            if (!z7) {
                T5.e eVar = new T5.e(new T5.f(1, new C1024o(this, 0), T5.j.K(vVar, C1012c.f12524u)), (byte) 0);
                while (eVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((v) eVar.next()).f12607x);
                    if (iVar2.isEmpty()) {
                        c1020k = str;
                    } else {
                        c1020k = iVar2.f130r[iVar2.f129q];
                    }
                    C1020k c1020k2 = c1020k;
                    if (c1020k2 != null) {
                        str3 = c1020k2.f12552q;
                    } else {
                        str3 = str;
                    }
                    linkedHashMap.put(valueOf, str3);
                }
            }
            if (!iVar2.isEmpty()) {
                C1020k c1020k3 = (C1020k) iVar2.first();
                T5.e eVar2 = new T5.e(new T5.f(1, new C1024o(this, 1), T5.j.K(c(c1020k3.f12553r), C1012c.f12525v)), (byte) 0);
                while (true) {
                    boolean hasNext = eVar2.hasNext();
                    str2 = c1020k3.f12552q;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((v) eVar2.next()).f12607x), str2);
                }
                this.f12466l.put(str2, iVar2);
            }
        }
        u();
        return obj.f2312q;
    }

    public final void n(C1019j c1019j, boolean z7, A5.i iVar) {
        q qVar;
        T4.c cVar;
        Set set;
        A5.i iVar2 = this.f12461g;
        C1019j c1019j2 = (C1019j) iVar2.last();
        if (M5.g.a(c1019j2, c1019j)) {
            iVar2.t();
            C1021l c1021l = (C1021l) this.f12475v.get(this.f12474u.b(c1019j2.f12543r.f12600q));
            boolean z8 = true;
            if ((c1021l == null || (cVar = c1021l.f) == null || (set = (Set) ((Z5.u) cVar.f3382r).getValue()) == null || !set.contains(c1019j2)) && !this.f12464j.containsKey(c1019j2)) {
                z8 = false;
            }
            EnumC0337o enumC0337o = c1019j2.f12549x.f6830t;
            EnumC0337o enumC0337o2 = EnumC0337o.f6819s;
            if (enumC0337o.compareTo(enumC0337o2) >= 0) {
                if (z7) {
                    c1019j2.b(enumC0337o2);
                    iVar.f(new C1020k(c1019j2));
                }
                if (!z8) {
                    c1019j2.b(EnumC0337o.f6817q);
                    s(c1019j2);
                } else {
                    c1019j2.b(enumC0337o2);
                }
            }
            if (!z7 && !z8 && (qVar = this.f12468o) != null) {
                String str = c1019j2.f12547v;
                M5.g.f(str, "backStackEntryId");
                b0 b0Var = (b0) qVar.d.remove(str);
                if (b0Var != null) {
                    b0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + c1019j.f12543r + ", which is not the top of the back stack (" + c1019j2.f12543r + ')').toString());
    }

    public final ArrayList p() {
        EnumC0337o enumC0337o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12475v.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0337o = EnumC0337o.f6820t;
            if (!hasNext) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) ((Z5.u) ((C1021l) it.next()).f.f3382r).getValue()) {
                C1019j c1019j = (C1019j) obj;
                if (!arrayList.contains(c1019j) && c1019j.f12541B.compareTo(enumC0337o) < 0) {
                    arrayList2.add(obj);
                }
            }
            A5.q.R(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f12461g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C1019j c1019j2 = (C1019j) next;
            if (!arrayList.contains(c1019j2) && c1019j2.f12541B.compareTo(enumC0337o) >= 0) {
                arrayList3.add(next);
            }
        }
        A5.q.R(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C1019j) next2).f12543r instanceof y)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M5.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [M5.m, java.lang.Object] */
    public final boolean q(int i7, Bundle bundle, C1002D c1002d) {
        v vVar;
        String str;
        C1019j c1019j;
        v vVar2;
        y yVar;
        v n;
        LinkedHashMap linkedHashMap = this.f12465k;
        if (!linkedHashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i7));
        Collection values = linkedHashMap.values();
        M5.g.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (M5.g.a((String) it.next(), str2)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f12466l;
        if ((linkedHashMap2 instanceof N5.a) && !(linkedHashMap2 instanceof N5.d)) {
            M5.r.c(linkedHashMap2, "kotlin.collections.MutableMap");
            throw null;
        }
        A5.i iVar = (A5.i) linkedHashMap2.remove(str2);
        ArrayList arrayList = new ArrayList();
        C1019j c1019j2 = (C1019j) this.f12461g.o();
        if ((c1019j2 != null && (vVar = c1019j2.f12543r) != null) || (vVar = this.f12459c) != null) {
            if (iVar != null) {
                Iterator it2 = iVar.iterator();
                while (it2.hasNext()) {
                    C1020k c1020k = (C1020k) it2.next();
                    int i8 = c1020k.f12553r;
                    if (vVar.f12607x == i8) {
                        n = vVar;
                    } else {
                        if (vVar instanceof y) {
                            yVar = (y) vVar;
                        } else {
                            yVar = vVar.f12601r;
                            M5.g.c(yVar);
                        }
                        n = yVar.n(i8, true);
                    }
                    Context context = this.f12457a;
                    if (n != null) {
                        arrayList.add(c1020k.a(context, n, f(), this.f12468o));
                        vVar = n;
                    } else {
                        int i9 = v.f12599z;
                        throw new IllegalStateException(("Restore State failed: destination " + AbstractC0189a.u(context, c1020k.f12553r) + " cannot be found from the current destination " + vVar).toString());
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(((C1019j) next).f12543r instanceof y)) {
                    arrayList3.add(next);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C1019j c1019j3 = (C1019j) it4.next();
                List list = (List) A5.k.c0(arrayList2);
                if (list != null && (c1019j = (C1019j) A5.k.b0(list)) != null && (vVar2 = c1019j.f12543r) != null) {
                    str = vVar2.f12600q;
                } else {
                    str = null;
                }
                if (M5.g.a(str, c1019j3.f12543r.f12600q)) {
                    list.add(c1019j3);
                } else {
                    arrayList2.add(A5.l.M(c1019j3));
                }
            }
            ?? obj = new Object();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                List list2 = (List) it5.next();
                N b7 = this.f12474u.b(((C1019j) A5.k.W(list2)).f12543r.f12600q);
                this.f12476w = new C1025p(obj, arrayList, new Object(), this, bundle);
                b7.d(list2, c1002d);
                this.f12476w = null;
            }
            return obj.f2312q;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final void r(y yVar, Bundle bundle) {
        Activity activity;
        Intent intent;
        int[] iArr;
        ArrayList arrayList;
        Bundle bundle2;
        String str;
        v n;
        y yVar2;
        int i7;
        Bundle bundle3;
        v n7;
        y yVar3;
        ArrayList<String> stringArrayList;
        boolean a7 = M5.g.a(this.f12459c, yVar);
        A5.i iVar = this.f12461g;
        if (!a7) {
            y yVar4 = this.f12459c;
            LinkedHashMap linkedHashMap = this.f12475v;
            if (yVar4 != null) {
                Iterator it = new ArrayList(this.f12465k.keySet()).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    M5.g.e(num, "id");
                    int intValue = num.intValue();
                    for (C1021l c1021l : linkedHashMap.values()) {
                        c1021l.d = true;
                    }
                    boolean q5 = q(intValue, null, null);
                    for (C1021l c1021l2 : linkedHashMap.values()) {
                        c1021l2.d = false;
                    }
                    if (q5) {
                        m(intValue, true, false);
                    }
                }
                m(yVar4.f12607x, true, false);
            }
            this.f12459c = yVar;
            Bundle bundle4 = this.d;
            O o7 = this.f12474u;
            if (bundle4 != null && (stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                Iterator<String> it2 = stringArrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    M5.g.e(next, "name");
                    N b7 = o7.b(next);
                    Bundle bundle5 = bundle4.getBundle(next);
                    if (bundle5 != null) {
                        b7.g(bundle5);
                    }
                }
            }
            Parcelable[] parcelableArr = this.f12460e;
            Context context = this.f12457a;
            if (parcelableArr != null) {
                for (Parcelable parcelable : parcelableArr) {
                    C1020k c1020k = (C1020k) parcelable;
                    v c5 = c(c1020k.f12553r);
                    if (c5 != null) {
                        C1019j a8 = c1020k.a(context, c5, f(), this.f12468o);
                        N b8 = o7.b(c5.f12600q);
                        Object obj = linkedHashMap.get(b8);
                        if (obj == null) {
                            obj = new C1021l(this, b8);
                            linkedHashMap.put(b8, obj);
                        }
                        iVar.g(a8);
                        ((C1021l) obj).a(a8);
                        y yVar5 = a8.f12543r.f12601r;
                        if (yVar5 != null) {
                            g(a8, d(yVar5.f12607x));
                        }
                    } else {
                        int i8 = v.f12599z;
                        StringBuilder u7 = AbstractC1111a.u("Restoring the Navigation back stack failed: destination ", AbstractC0189a.u(context, c1020k.f12553r), " cannot be found from the current destination ");
                        u7.append(e());
                        throw new IllegalStateException(u7.toString());
                    }
                }
                u();
                this.f12460e = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : A5.w.N(o7.f12514a).values()) {
                if (!((N) obj2).f12512b) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                N n8 = (N) it3.next();
                Object obj3 = linkedHashMap.get(n8);
                if (obj3 == null) {
                    obj3 = new C1021l(this, n8);
                    linkedHashMap.put(n8, obj3);
                }
                n8.e((C1021l) obj3);
            }
            if (this.f12459c != null && iVar.isEmpty()) {
                if (!this.f && (activity = this.f12458b) != null && (intent = activity.getIntent()) != null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    } else {
                        iArr = null;
                    }
                    if (extras != null) {
                        arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    } else {
                        arrayList = null;
                    }
                    Bundle bundle6 = new Bundle();
                    if (extras != null) {
                        bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        bundle6.putAll(bundle2);
                    }
                    if (iArr == null || iArr.length == 0) {
                        y yVar6 = this.f12459c;
                        M5.g.c(yVar6);
                        u g7 = yVar6.g(new g5.b(intent));
                        if (g7 != null) {
                            v vVar = g7.f12594q;
                            vVar.getClass();
                            A5.i iVar2 = new A5.i();
                            y yVar7 = vVar;
                            while (true) {
                                y yVar8 = yVar7.f12601r;
                                if (yVar8 == null || yVar8.f12614B != yVar7.f12607x) {
                                    iVar2.f(yVar7);
                                }
                                if (!M5.g.a(yVar8, null) && yVar8 != null) {
                                    yVar7 = yVar8;
                                }
                            }
                            List<v> l02 = A5.k.l0(iVar2);
                            ArrayList arrayList3 = new ArrayList(A5.m.P(l02));
                            for (v vVar2 : l02) {
                                arrayList3.add(Integer.valueOf(vVar2.f12607x));
                            }
                            iArr = A5.k.k0(arrayList3);
                            Bundle c6 = vVar.c(g7.f12595r);
                            if (c6 != null) {
                                bundle6.putAll(c6);
                            }
                            arrayList = null;
                        }
                    }
                    if (iArr != null && iArr.length != 0) {
                        y yVar9 = this.f12459c;
                        int length = iArr.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                int i10 = iArr[i9];
                                if (i9 == 0) {
                                    y yVar10 = this.f12459c;
                                    M5.g.c(yVar10);
                                    if (yVar10.f12607x == i10) {
                                        n7 = this.f12459c;
                                    } else {
                                        n7 = null;
                                    }
                                } else {
                                    M5.g.c(yVar9);
                                    n7 = yVar9.n(i10, true);
                                }
                                if (n7 == null) {
                                    int i11 = v.f12599z;
                                    str = AbstractC0189a.u(context, i10);
                                    break;
                                }
                                if (i9 != iArr.length - 1 && (n7 instanceof y)) {
                                    while (true) {
                                        yVar3 = (y) n7;
                                        M5.g.c(yVar3);
                                        if (!(yVar3.n(yVar3.f12614B, true) instanceof y)) {
                                            break;
                                        }
                                        n7 = yVar3.n(yVar3.f12614B, true);
                                    }
                                    yVar9 = yVar3;
                                }
                                i9++;
                            } else {
                                str = null;
                                break;
                            }
                        }
                        if (str != null) {
                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                        } else {
                            bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                            int length2 = iArr.length;
                            Bundle[] bundleArr = new Bundle[length2];
                            for (int i12 = 0; i12 < length2; i12++) {
                                Bundle bundle7 = new Bundle();
                                bundle7.putAll(bundle6);
                                if (arrayList != null && (bundle3 = (Bundle) arrayList.get(i12)) != null) {
                                    bundle7.putAll(bundle3);
                                }
                                bundleArr[i12] = bundle7;
                            }
                            int flags = intent.getFlags();
                            int i13 = 268435456 & flags;
                            if (i13 != 0 && (flags & 32768) == 0) {
                                intent.addFlags(32768);
                                ArrayList arrayList4 = new ArrayList();
                                ComponentName component = intent.getComponent();
                                if (component == null) {
                                    component = intent.resolveActivity(context.getPackageManager());
                                }
                                if (component != null) {
                                    int size = arrayList4.size();
                                    while (true) {
                                        try {
                                            Intent m7 = p6.d.m(context, component);
                                            if (m7 == null) {
                                                break;
                                            }
                                            arrayList4.add(size, m7);
                                            component = m7.getComponent();
                                        } catch (PackageManager.NameNotFoundException e3) {
                                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                            throw new IllegalArgumentException(e3);
                                        }
                                    }
                                }
                                arrayList4.add(intent);
                                if (!arrayList4.isEmpty()) {
                                    Intent[] intentArr = (Intent[]) arrayList4.toArray(new Intent[0]);
                                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                    context.startActivities(intentArr, null);
                                    activity.finish();
                                    activity.overridePendingTransition(0, 0);
                                    return;
                                }
                                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                            } else if (i13 != 0) {
                                if (!iVar.isEmpty()) {
                                    y yVar11 = this.f12459c;
                                    M5.g.c(yVar11);
                                    i7 = 0;
                                    m(yVar11.f12607x, true, false);
                                } else {
                                    i7 = 0;
                                }
                                while (i7 < iArr.length) {
                                    int i14 = iArr[i7];
                                    int i15 = i7 + 1;
                                    Bundle bundle8 = bundleArr[i7];
                                    v c7 = c(i14);
                                    if (c7 != null) {
                                        i(c7, bundle8, h4.b.C(new X5.d(c7, 2, this)));
                                        i7 = i15;
                                    } else {
                                        int i16 = v.f12599z;
                                        StringBuilder u8 = AbstractC1111a.u("Deep Linking failed: destination ", AbstractC0189a.u(context, i14), " cannot be found from the current destination ");
                                        u8.append(e());
                                        throw new IllegalStateException(u8.toString());
                                    }
                                }
                                return;
                            } else {
                                y yVar12 = this.f12459c;
                                int length3 = iArr.length;
                                for (int i17 = 0; i17 < length3; i17++) {
                                    int i18 = iArr[i17];
                                    Bundle bundle9 = bundleArr[i17];
                                    if (i17 == 0) {
                                        n = this.f12459c;
                                    } else {
                                        M5.g.c(yVar12);
                                        n = yVar12.n(i18, true);
                                    }
                                    if (n != null) {
                                        if (i17 != iArr.length - 1) {
                                            if (n instanceof y) {
                                                while (true) {
                                                    yVar2 = (y) n;
                                                    M5.g.c(yVar2);
                                                    if (!(yVar2.n(yVar2.f12614B, true) instanceof y)) {
                                                        break;
                                                    }
                                                    n = yVar2.n(yVar2.f12614B, true);
                                                }
                                                yVar12 = yVar2;
                                            }
                                        } else {
                                            y yVar13 = this.f12459c;
                                            M5.g.c(yVar13);
                                            i(n, bundle9, new C1002D(false, false, yVar13.f12607x, true, false, 0, 0, -1, -1));
                                        }
                                    } else {
                                        int i19 = v.f12599z;
                                        throw new IllegalStateException("Deep Linking failed: destination " + AbstractC0189a.u(context, i18) + " cannot be found in graph " + yVar12);
                                    }
                                }
                                this.f = true;
                                return;
                            }
                        }
                    }
                }
                v vVar3 = this.f12459c;
                M5.g.c(vVar3);
                i(vVar3, bundle, null);
                return;
            }
            b();
            return;
        }
        o.k kVar = yVar.f12613A;
        int k5 = kVar.k();
        for (int i20 = 0; i20 < k5; i20++) {
            v vVar4 = (v) kVar.l(i20);
            y yVar14 = this.f12459c;
            M5.g.c(yVar14);
            o.k kVar2 = yVar14.f12613A;
            if (kVar2.f12810q) {
                o.h.a(kVar2);
            }
            int a9 = AbstractC1078a.a(kVar2.f12813t, i20, kVar2.f12811r);
            if (a9 >= 0) {
                Object[] objArr = kVar2.f12812s;
                Object obj4 = objArr[a9];
                objArr[a9] = vVar4;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = iVar.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                C1019j c1019j = (C1019j) next2;
                if (vVar4 != null && c1019j.f12543r.f12607x == vVar4.f12607x) {
                    arrayList5.add(next2);
                }
            }
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                C1019j c1019j2 = (C1019j) it5.next();
                M5.g.e(vVar4, "newDestination");
                c1019j2.getClass();
                c1019j2.f12543r = vVar4;
            }
        }
    }

    public final void s(C1019j c1019j) {
        Integer num;
        q qVar;
        M5.g.f(c1019j, "child");
        C1019j c1019j2 = (C1019j) this.f12463i.remove(c1019j);
        if (c1019j2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f12464j;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c1019j2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C1021l c1021l = (C1021l) this.f12475v.get(this.f12474u.b(c1019j2.f12543r.f12600q));
            if (c1021l != null) {
                C0999A c0999a = c1021l.f12561h;
                boolean a7 = M5.g.a(c0999a.f12478y.get(c1019j2), Boolean.TRUE);
                Z5.w wVar = c1021l.f12558c;
                Set set = (Set) wVar.getValue();
                M5.g.f(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(A5.w.J(set.size()));
                boolean z7 = false;
                for (Object obj : set) {
                    boolean z8 = true;
                    if (!z7 && M5.g.a(obj, c1019j2)) {
                        z7 = true;
                        z8 = false;
                    }
                    if (z8) {
                        linkedHashSet.add(obj);
                    }
                }
                wVar.f(linkedHashSet);
                c0999a.f12478y.remove(c1019j2);
                A5.i iVar = c0999a.f12461g;
                boolean contains = iVar.contains(c1019j2);
                Z5.w wVar2 = c0999a.f12462h;
                if (!contains) {
                    c0999a.s(c1019j2);
                    if (c1019j2.f12549x.f6830t.compareTo(EnumC0337o.f6819s) >= 0) {
                        c1019j2.b(EnumC0337o.f6817q);
                    }
                    boolean isEmpty = iVar.isEmpty();
                    String str = c1019j2.f12547v;
                    if (!isEmpty) {
                        Iterator it = iVar.iterator();
                        while (it.hasNext()) {
                            if (M5.g.a(((C1019j) it.next()).f12547v, str)) {
                                break;
                            }
                        }
                    }
                    if (!a7 && (qVar = c0999a.f12468o) != null) {
                        M5.g.f(str, "backStackEntryId");
                        b0 b0Var = (b0) qVar.d.remove(str);
                        if (b0Var != null) {
                            b0Var.a();
                        }
                    }
                    c0999a.t();
                } else if (!c1021l.d) {
                    c0999a.t();
                }
                wVar2.f(c0999a.p());
            }
            linkedHashMap.remove(c1019j2);
        }
    }

    public final void t() {
        v vVar;
        Boolean bool;
        AtomicInteger atomicInteger;
        T4.c cVar;
        Set set;
        ArrayList m02 = A5.k.m0(this.f12461g);
        if (m02.isEmpty()) {
            return;
        }
        v vVar2 = ((C1019j) A5.k.b0(m02)).f12543r;
        if (vVar2 instanceof InterfaceC1014e) {
            for (C1019j c1019j : A5.k.g0(m02)) {
                vVar = c1019j.f12543r;
                if (!(vVar instanceof y) && !(vVar instanceof InterfaceC1014e)) {
                    break;
                }
            }
        }
        vVar = null;
        HashMap hashMap = new HashMap();
        for (C1019j c1019j2 : A5.k.g0(m02)) {
            EnumC0337o enumC0337o = c1019j2.f12541B;
            v vVar3 = c1019j2.f12543r;
            EnumC0337o enumC0337o2 = EnumC0337o.f6821u;
            EnumC0337o enumC0337o3 = EnumC0337o.f6820t;
            if (vVar2 != null && vVar3.f12607x == vVar2.f12607x) {
                if (enumC0337o != enumC0337o2) {
                    C1021l c1021l = (C1021l) this.f12475v.get(this.f12474u.b(vVar3.f12600q));
                    if (c1021l != null && (cVar = c1021l.f) != null && (set = (Set) ((Z5.u) cVar.f3382r).getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(c1019j2));
                    } else {
                        bool = null;
                    }
                    if (!M5.g.a(bool, Boolean.TRUE) && ((atomicInteger = (AtomicInteger) this.f12464j.get(c1019j2)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(c1019j2, enumC0337o2);
                    } else {
                        hashMap.put(c1019j2, enumC0337o3);
                    }
                }
                vVar2 = vVar2.f12601r;
            } else if (vVar != null && vVar3.f12607x == vVar.f12607x) {
                if (enumC0337o == enumC0337o2) {
                    c1019j2.b(enumC0337o3);
                } else if (enumC0337o != enumC0337o3) {
                    hashMap.put(c1019j2, enumC0337o3);
                }
                vVar = vVar.f12601r;
            } else {
                c1019j2.b(EnumC0337o.f6819s);
            }
        }
        Iterator it = m02.iterator();
        while (it.hasNext()) {
            C1019j c1019j3 = (C1019j) it.next();
            EnumC0337o enumC0337o4 = (EnumC0337o) hashMap.get(c1019j3);
            if (enumC0337o4 != null) {
                c1019j3.b(enumC0337o4);
            } else {
                c1019j3.c();
            }
        }
    }

    public final void u() {
        boolean z7 = false;
        if (this.f12473t) {
            A5.i iVar = this.f12461g;
            if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
                Iterator it = iVar.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    if ((!(((C1019j) it.next()).f12543r instanceof y)) && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                if (i7 > 1) {
                    z7 = true;
                }
            }
        }
        this.f12472s.e(z7);
    }
}
