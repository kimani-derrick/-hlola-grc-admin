package androidx.fragment.app;

import H2.C0016q;
import H2.C0020v;
import a0.C0191b;
import a0.C0194e;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaCodec;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.Q0;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.C0404c;
import com.google.android.gms.internal.measurement.C0409d;
import com.google.android.gms.internal.measurement.C0429h;
import com.google.android.gms.internal.measurement.C0442j2;
import com.google.android.gms.internal.measurement.C0469p;
import com.google.android.gms.internal.measurement.C0488t;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.InterfaceC0464o;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.U2;
import e.AbstractC0565a;
import e2.C0617l0;
import e2.RunnableC0609h0;
import e2.RunnableC0611i0;
import e2.RunnableC0613j0;
import e2.z0;
import j2.C0834c;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k2.InterfaceC0946k;
import s3.AbstractC1203v;
import s3.C1154I;
import s3.C1175g0;
import s3.C1212z0;
import s3.E0;
import s3.f1;
import s3.j1;
import u4.AbstractC1284h;
import v6.C1344i;
import w4.l0;
/* loaded from: classes.dex */
public final class D implements androidx.leanback.widget.V, androidx.leanback.widget.S, H2.H, j2.o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5882q;

    /* renamed from: r  reason: collision with root package name */
    public Object f5883r;

    /* renamed from: s  reason: collision with root package name */
    public Object f5884s;

    public D(int i7) {
        this.f5882q = i7;
        switch (i7) {
            case 12:
                this.f5883r = new ArrayList();
                this.f5884s = new ArrayList();
                return;
            case 15:
                this.f5883r = new HashSet();
                return;
            default:
                this.f5883r = new TreeMap();
                this.f5884s = new TreeMap();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, v6.f, v6.g] */
    public static D G(String... strArr) {
        try {
            C1344i[] c1344iArr = new C1344i[strArr.length];
            ?? obj = new Object();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                n5.p.X(obj, strArr[i7]);
                obj.readByte();
                c1344iArr[i7] = obj.l(obj.f15388r);
            }
            return new D((String[]) strArr.clone(), l0.z(c1344iArr), 22, false);
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public Pair A(int i7, H2.A a7) {
        H2.A a8;
        C0617l0 c0617l0 = (C0617l0) this.f5883r;
        H2.A a9 = null;
        if (a7 != null) {
            int i8 = 0;
            while (true) {
                if (i8 < c0617l0.f10013c.size()) {
                    if (((H2.A) c0617l0.f10013c.get(i8)).d == a7.d) {
                        Object obj = c0617l0.f10012b;
                        int i9 = z0.f10101A;
                        a8 = a7.b(Pair.create(obj, a7.f1180a));
                        break;
                    }
                    i8++;
                } else {
                    a8 = null;
                    break;
                }
            }
            if (a8 == null) {
                return null;
            }
            a9 = a8;
        }
        return Pair.create(Integer.valueOf(i7 + c0617l0.d), a9);
    }

    public InterfaceC0946k B(Object... objArr) {
        Constructor g7;
        synchronized (((AtomicBoolean) this.f5884s)) {
            if (!((AtomicBoolean) this.f5884s).get()) {
                try {
                    g7 = ((f2.d) this.f5883r).g();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f5884s).set(true);
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating extension", e3);
                }
            }
            g7 = null;
        }
        if (g7 == null) {
            return null;
        }
        try {
            return (InterfaceC0946k) g7.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    @Override // H2.H
    public void C(int i7, H2.A a7, C0016q c0016q, C0020v c0020v) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0613j0(this, A6, c0016q, c0020v, 0));
        }
    }

    public KeyListener D(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((K1) ((Z5.n) this.f5884s).f4918q).getClass();
            if (!(keyListener instanceof C0194e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new C0194e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public void E(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = ((EditText) this.f5883r).getContext().obtainStyledAttributes(attributeSet, AbstractC0565a.f9345g, i7, 0);
        try {
            boolean z7 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z7 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            R(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // j2.o
    public void F(int i7, H2.A a7, int i8) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new Z2.l(this, A6, i8, 1));
        }
    }

    @Override // j2.o
    public void H(int i7, H2.A a7) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0611i0(this, A6, 3));
        }
    }

    public C0191b I(InputConnection inputConnection, EditorInfo editorInfo) {
        Z5.n nVar = (Z5.n) this.f5884s;
        if (inputConnection == null) {
            nVar.getClass();
            inputConnection = null;
        } else {
            K1 k12 = (K1) nVar.f4918q;
            k12.getClass();
            if (!(inputConnection instanceof C0191b)) {
                inputConnection = new C0191b((EditText) k12.f8367r, inputConnection, editorInfo);
            }
        }
        return (C0191b) inputConnection;
    }

    @Override // j2.o
    public void J(int i7, H2.A a7) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0611i0(this, A6, 1));
        }
    }

    public void K(Throwable th) {
        C1212z0 c1212z0 = (C1212z0) this.f5884s;
        c1212z0.D();
        c1212z0.f14414y = false;
        C1175g0 c1175g0 = (C1175g0) c1212z0.f2765q;
        if (!c1175g0.f14062w.O(null, AbstractC1203v.G0)) {
            c1212z0.e0();
            c1212z0.b().f13807v.c(th, "registerTriggerAsync failed with throwable");
            return;
        }
        c1212z0.Z().add((j1) this.f5883r);
        if (c1212z0.f14415z > 64) {
            c1212z0.f14415z = 1;
            c1212z0.b().f13810y.b(C1154I.J(c1175g0.o().K()), C1154I.J(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        c1212z0.b().f13810y.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", C1154I.J(c1175g0.o().K()), C1154I.J(String.valueOf(c1212z0.f14415z)), C1154I.J(th.toString()));
        int i7 = c1212z0.f14415z;
        if (c1212z0.f14398A == null) {
            c1212z0.f14398A = new E0(c1212z0, c1175g0, 0);
        }
        c1212z0.f14398A.b(i7 * 1000);
        c1212z0.f14415z <<= 1;
    }

    public void L(int i7, Bundle bundle) {
        Object obj;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i7 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                obj = this.f5883r;
            } else {
                obj = this.f5884s;
            }
            s4.b bVar = (s4.b) obj;
            if (bVar != null) {
                bVar.s(string, bundle2);
            }
        }
    }

    public void M(Exception exc, boolean z7) {
        int i7;
        this.f5884s = null;
        HashSet hashSet = (HashSet) this.f5883r;
        O3.E s6 = O3.E.s(hashSet);
        hashSet.clear();
        O3.C listIterator = s6.listIterator(0);
        while (listIterator.hasNext()) {
            C0834c c0834c = (C0834c) listIterator.next();
            c0834c.getClass();
            if (z7) {
                i7 = 1;
            } else {
                i7 = 3;
            }
            c0834c.k(exc, i7);
        }
    }

    public void N(w0.a0 a0Var, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        w0.U u7 = (w0.U) this.f5883r;
        h5.d dVar = (h5.d) this.f5884s;
        if (i8 > i7) {
            int i9 = i8 - 1;
            if (i7 > i9) {
                return;
            }
            while (true) {
                View x7 = dVar.f11018a.x(i9);
                if (x7 != null) {
                    u7.D0(x7, a0Var);
                }
                if (i9 != i7) {
                    i9--;
                } else {
                    return;
                }
            }
        } else {
            int i10 = i8 + 1;
            if (i10 > i7) {
                return;
            }
            while (true) {
                View x8 = dVar.f11018a.x(i7);
                if (x8 != null) {
                    u7.D0(x8, a0Var);
                }
                if (i7 != i10) {
                    i7--;
                } else {
                    return;
                }
            }
        }
    }

    public void O(w0.a0 a0Var, h5.e eVar) {
        M5.g.f(a0Var, "recycler");
        M5.g.f(eVar, "layoutRequest");
        if (eVar.f11030g && !eVar.f11036m) {
            if (eVar.f11026a == h5.c.f11014r) {
                P(a0Var, eVar);
            } else {
                Q(a0Var, eVar);
            }
        }
    }

    public void P(w0.a0 a0Var, h5.e eVar) {
        M5.g.f(a0Var, "recycler");
        M5.g.f(eVar, "layoutRequest");
        h5.d dVar = (h5.d) this.f5884s;
        int f = dVar.f11020c.f() + eVar.f11032i;
        w0.U u7 = dVar.f11018a;
        int y3 = u7.y() - 1;
        for (int i7 = y3; -1 < i7; i7--) {
            View x7 = u7.x(i7);
            if (x7 != null && (dVar.j(x7) < f || dVar.f11020c.o(x7) < f)) {
                N(a0Var, y3, i7);
                return;
            }
        }
    }

    public void Q(w0.a0 a0Var, h5.e eVar) {
        M5.g.f(a0Var, "recycler");
        M5.g.f(eVar, "layoutRequest");
        int i7 = -eVar.f11031h;
        h5.d dVar = (h5.d) this.f5884s;
        int y3 = dVar.f11018a.y();
        for (int i8 = 0; i8 < y3; i8++) {
            View x7 = dVar.f11018a.x(i8);
            if (x7 != null && (dVar.h(x7) > i7 || dVar.f11020c.n(x7) > i7)) {
                N(a0Var, 0, i8);
                return;
            }
        }
    }

    public void R(boolean z7) {
        a0.i iVar = (a0.i) ((K1) ((Z5.n) this.f5884s).f4918q).f8368s;
        if (iVar.f4978t != z7) {
            if (iVar.f4977s != null) {
                androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
                a0.h hVar = iVar.f4977s;
                a7.getClass();
                android.support.v4.media.session.b.j(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a7.f5842a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a7.f5843b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f4978t = z7;
            if (z7) {
                a0.i.a(iVar.f4975q, androidx.emoji2.text.j.a().b());
            }
        }
    }

    public InterfaceC0464o S(C4.b bVar, InterfaceC0464o interfaceC0464o) {
        C0488t c0488t;
        com.google.android.gms.internal.measurement.Q.g(bVar);
        if (interfaceC0464o instanceof com.google.android.gms.internal.measurement.r) {
            com.google.android.gms.internal.measurement.r rVar = (com.google.android.gms.internal.measurement.r) interfaceC0464o;
            ArrayList arrayList = rVar.f8656r;
            HashMap hashMap = (HashMap) this.f5883r;
            String str = rVar.f8655q;
            if (hashMap.containsKey(str)) {
                c0488t = (C0488t) hashMap.get(str);
            } else {
                c0488t = (C0488t) this.f5884s;
            }
            return c0488t.b(str, bVar, arrayList);
        }
        return interfaceC0464o;
    }

    public Object T() {
        String str;
        String str2 = (String) this.f5884s;
        ContentResolver contentResolver = ((Context) ((K1) this.f5883r).f8367r).getContentResolver();
        D1 d1 = B1.f8231a;
        if (contentResolver != null) {
            synchronized (d1) {
                try {
                    if (d1.f8242b == null) {
                        d1.f8241a.set(false);
                        d1.f8242b = new HashMap(16, 1.0f);
                        d1.f8245g = new Object();
                        contentResolver.registerContentObserver(A1.f8222a, true, new Q.a(1, d1));
                    } else if (d1.f8241a.getAndSet(false)) {
                        d1.f8242b.clear();
                        d1.f8243c.clear();
                        d1.d.clear();
                        d1.f8244e.clear();
                        d1.f.clear();
                        d1.f8245g = new Object();
                        d1.f8246h = false;
                    }
                    Object obj = d1.f8245g;
                    String str3 = null;
                    if (d1.f8242b.containsKey(str2)) {
                        String str4 = (String) d1.f8242b.get(str2);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    for (String str5 : d1.f8247i) {
                        if (str2.startsWith(str5)) {
                            if (!d1.f8246h) {
                                String[] strArr = d1.f8247i;
                                try {
                                    C0442j2 c0442j2 = d1.f8248j;
                                    C0442j2 c0442j22 = new C0442j2(2);
                                    c0442j2.getClass();
                                    HashMap f = C0442j2.f(contentResolver, strArr, c0442j22);
                                    if (!f.isEmpty()) {
                                        Set keySet = f.keySet();
                                        keySet.removeAll(d1.f8243c.keySet());
                                        keySet.removeAll(d1.d.keySet());
                                        keySet.removeAll(d1.f8244e.keySet());
                                        keySet.removeAll(d1.f.keySet());
                                    }
                                    if (!f.isEmpty()) {
                                        if (d1.f8242b.isEmpty()) {
                                            d1.f8242b = f;
                                        } else {
                                            d1.f8242b.putAll(f);
                                        }
                                    }
                                    d1.f8246h = true;
                                } catch (F1 unused) {
                                }
                                if (d1.f8242b.containsKey(str2) && (str = (String) d1.f8242b.get(str2)) != null) {
                                    str3 = str;
                                }
                            }
                            return str3;
                        }
                    }
                    try {
                        d1.f8248j.getClass();
                        String e3 = C0442j2.e(contentResolver, str2);
                        if (e3 != null && e3.equals(null)) {
                            e3 = null;
                        }
                        synchronized (d1) {
                            try {
                                if (obj == d1.f8245g) {
                                    d1.f8242b.put(str2, e3);
                                }
                            } finally {
                            }
                        }
                        if (e3 == null) {
                            return null;
                        }
                        return e3;
                    } catch (F1 unused2) {
                        return null;
                    }
                } finally {
                }
            }
        }
        d1.getClass();
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }

    public void U(C4.b bVar, C0404c c0404c) {
        int i7;
        U2 u22 = new U2(c0404c);
        TreeMap treeMap = (TreeMap) this.f5883r;
        for (Integer num : treeMap.keySet()) {
            C0409d c0409d = (C0409d) c0404c.f8516b.clone();
            InterfaceC0464o a7 = ((C0469p) treeMap.get(num)).a(bVar, Collections.singletonList(u22));
            if (a7 instanceof C0429h) {
                i7 = com.google.android.gms.internal.measurement.Q.k(((C0429h) a7).f8564q.doubleValue());
            } else {
                i7 = -1;
            }
            if (i7 == 2 || i7 == -1) {
                c0404c.f8516b = c0409d;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f5884s;
        for (Integer num2 : treeMap2.keySet()) {
            InterfaceC0464o a8 = ((C0469p) treeMap2.get(num2)).a(bVar, Collections.singletonList(u22));
            if (a8 instanceof C0429h) {
                com.google.android.gms.internal.measurement.Q.k(((C0429h) a8).f8564q.doubleValue());
            }
        }
    }

    public void V(C0488t c0488t) {
        Iterator it = c0488t.f8674a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f5883r).put(((com.google.android.gms.internal.measurement.G) it.next()).toString(), c0488t);
        }
    }

    @Override // H2.H
    public void a(int i7, H2.A a7, C0016q c0016q, C0020v c0020v) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0613j0(this, A6, c0016q, c0020v, 1));
        }
    }

    @Override // androidx.leanback.widget.S
    public void b(View view) {
        androidx.leanback.widget.G g7;
        switch (this.f5882q) {
            case 2:
                ((q1.j) this.f5884s).getClass();
                q1.j.v((androidx.leanback.widget.L) this.f5883r, view, true);
                return;
            default:
                A1.b bVar = (A1.b) this.f5884s;
                if (bVar.f21e != null) {
                    if (view == null) {
                        g7 = null;
                    } else {
                        g7 = (androidx.leanback.widget.G) ((Q0) this.f5883r).f6466c.M(view);
                    }
                    if (g7 == null) {
                        bVar.f21e.g(null, null, null, null);
                        return;
                    } else {
                        bVar.f21e.g(g7.f6367v, g7.f6369x, null, null);
                        return;
                    }
                }
                return;
        }
    }

    public void c(Object obj, String str) {
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f5883r).add(str + "=" + valueOf);
    }

    public void d() {
        this.f5883r = null;
        this.f5884s = null;
    }

    @Override // j2.o
    public void e(int i7, H2.A a7) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0611i0(this, A6, 0));
        }
    }

    @Override // j2.o
    public void f(int i7, H2.A a7) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0611i0(this, A6, 2));
        }
    }

    @Override // androidx.leanback.widget.V
    public void g(androidx.leanback.widget.Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        int i7 = ((androidx.leanback.app.F) ((ComponentCallbacksC0269x) ((androidx.leanback.app.q) this.f5883r).f6249a)).f6200r0;
        androidx.leanback.app.s sVar = (androidx.leanback.app.s) this.f5884s;
        sVar.w0(i7);
        androidx.leanback.widget.V v5 = sVar.f6276f1;
        if (v5 != null) {
            v5.g(z7, obj, c0297i0, abstractC0287d0);
        }
    }

    public void h(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.h(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void i(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        S s6 = (S) this.f5883r;
        Context context = s6.f5941v.f6147s;
        ComponentCallbacksC0269x componentCallbacksC0269x2 = s6.f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.i(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void j(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.j(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    @Override // H2.H
    public void k(int i7, H2.A a7, C0020v c0020v) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0609h0(this, A6, c0020v, 0));
        }
    }

    public void l(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.l(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void m(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.m(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void n(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.n(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void o(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        S s6 = (S) this.f5883r;
        Context context = s6.f5941v.f6147s;
        ComponentCallbacksC0269x componentCallbacksC0269x2 = s6.f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.o(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    @Override // H2.H
    public void p(int i7, H2.A a7, C0016q c0016q, C0020v c0020v, IOException iOException, boolean z7) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new H2.F(this, A6, c0016q, c0020v, iOException, z7, 1));
        }
    }

    @Override // H2.H
    public void q(int i7, H2.A a7, C0020v c0020v) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0609h0(this, A6, c0020v, 1));
        }
    }

    @Override // j2.o
    public void r(int i7, H2.A a7, Exception exc) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new H2.E(this, A6, exc, 6));
        }
    }

    public void s(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.s(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    @Override // H2.H
    public void t(int i7, H2.A a7, C0016q c0016q, C0020v c0020v) {
        Pair A6 = A(i7, a7);
        if (A6 != null) {
            ((Z2.D) ((Z2.j) ((J3.m) this.f5884s).f1401j)).c(new RunnableC0613j0(this, A6, c0016q, c0020v, 2));
        }
    }

    public String toString() {
        switch (this.f5882q) {
            case 9:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f5884s.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f5883r;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.u(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void v(ComponentCallbacksC0269x componentCallbacksC0269x, Bundle bundle, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.v(componentCallbacksC0269x, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void w(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.w(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void x(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.x(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void y(ComponentCallbacksC0269x componentCallbacksC0269x, View view, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        M5.g.f(view, "v");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.y(componentCallbacksC0269x, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public void z(ComponentCallbacksC0269x componentCallbacksC0269x, boolean z7) {
        M5.g.f(componentCallbacksC0269x, "f");
        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((S) this.f5883r).f5943x;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x2.t().n.z(componentCallbacksC0269x, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5884s).iterator();
        if (it.hasNext()) {
            AbstractC0515y1.v(it.next());
            throw null;
        }
    }

    public /* synthetic */ D(int i7, boolean z7) {
        this.f5882q = i7;
    }

    public D(Context context) {
        this.f5882q = 25;
        this.f5883r = context;
        this.f5884s = null;
    }

    public D(MediaCodec.CryptoInfo cryptoInfo) {
        this.f5882q = 13;
        this.f5883r = cryptoInfo;
        this.f5884s = B3.a.e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z5.n, java.lang.Object] */
    public D(EditText editText) {
        this.f5882q = 17;
        this.f5883r = editText;
        ?? obj = new Object();
        android.support.v4.media.session.b.j(editText, "editText cannot be null");
        obj.f4918q = new K1(editText);
        this.f5884s = obj;
    }

    public D(D d) {
        String str;
        this.f5882q = 24;
        int e3 = AbstractC1284h.e("com.google.firebase.crashlytics.unity_version", "string", (Context) d.f5883r);
        Context context = (Context) d.f5883r;
        if (e3 != 0) {
            this.f5883r = "Unity";
            String string = context.getResources().getString(e3);
            this.f5884s = string;
            str = AbstractC0515y1.x("Unity Editor version is: ", string);
            if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                return;
            }
        } else {
            if (context.getAssets() != null) {
                try {
                    InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (open != null) {
                        open.close();
                    }
                    this.f5883r = "Flutter";
                    this.f5884s = null;
                    if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                        return;
                    }
                    str = "Development platform is: Flutter";
                } catch (IOException unused) {
                    this.f5883r = null;
                    this.f5884s = null;
                    return;
                }
            }
            this.f5883r = null;
            this.f5884s = null;
            return;
        }
        Log.v("FirebaseCrashlytics", str, null);
    }

    public D(S s6) {
        this.f5882q = 0;
        M5.g.f(s6, "fragmentManager");
        this.f5883r = s6;
        this.f5884s = new CopyOnWriteArrayList();
    }

    public D(f2.d dVar) {
        this.f5882q = 19;
        this.f5883r = dVar;
        this.f5884s = new AtomicBoolean(false);
    }

    public /* synthetic */ D(Object obj) {
        this.f5882q = 9;
        g3.n.g(obj);
        this.f5884s = obj;
        this.f5883r = new ArrayList();
    }

    public /* synthetic */ D(Object obj, int i7, Object obj2) {
        this.f5882q = i7;
        this.f5884s = obj;
        this.f5883r = obj2;
    }

    public /* synthetic */ D(Object obj, Object obj2, int i7, boolean z7) {
        this.f5882q = i7;
        this.f5883r = obj;
        this.f5884s = obj2;
    }

    public D(Locale locale) {
        this.f5882q = 14;
        this.f5883r = locale;
        this.f5884s = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        int minimum = calendar.getMinimum(5);
        int maximum = calendar.getMaximum(5);
        String[] strArr = new String[(maximum - minimum) + 1];
        for (int i7 = minimum; i7 <= maximum; i7++) {
            strArr[i7 - minimum] = String.format("%02d", Integer.valueOf(i7));
        }
    }

    public D(f1 f1Var) {
        this.f5882q = 29;
        this.f5884s = f1Var;
    }

    public D(w0.U u7, h5.d dVar) {
        this.f5882q = 11;
        M5.g.f(u7, "layoutManager");
        M5.g.f(dVar, "layoutInfo");
        this.f5883r = u7;
        this.f5884s = dVar;
    }
}
