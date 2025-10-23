package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.C0962b;
import m.C0984a;
import r0.AbstractC1111a;
/* renamed from: androidx.lifecycle.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344w extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6828r;

    /* renamed from: s  reason: collision with root package name */
    public C0984a f6829s;

    /* renamed from: t  reason: collision with root package name */
    public EnumC0337o f6830t;

    /* renamed from: u  reason: collision with root package name */
    public final WeakReference f6831u;

    /* renamed from: v  reason: collision with root package name */
    public int f6832v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6833w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6834x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f6835y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0344w(InterfaceC0342u interfaceC0342u) {
        super(3);
        M5.g.f(interfaceC0342u, "provider");
        this.f6828r = true;
        this.f6829s = new C0984a();
        this.f6830t = EnumC0337o.f6818r;
        this.f6835y = new ArrayList();
        this.f6831u = new WeakReference(interfaceC0342u);
    }

    public final EnumC0337o E(InterfaceC0341t interfaceC0341t) {
        m.c cVar;
        EnumC0337o enumC0337o;
        C0343v c0343v;
        HashMap hashMap = this.f6829s.f12365u;
        EnumC0337o enumC0337o2 = null;
        if (hashMap.containsKey(interfaceC0341t)) {
            cVar = ((m.c) hashMap.get(interfaceC0341t)).f12372t;
        } else {
            cVar = null;
        }
        if (cVar != null && (c0343v = (C0343v) cVar.f12370r) != null) {
            enumC0337o = c0343v.f6826a;
        } else {
            enumC0337o = null;
        }
        ArrayList arrayList = this.f6835y;
        if (!arrayList.isEmpty()) {
            enumC0337o2 = (EnumC0337o) arrayList.get(arrayList.size() - 1);
        }
        EnumC0337o enumC0337o3 = this.f6830t;
        M5.g.f(enumC0337o3, "state1");
        if (enumC0337o == null || enumC0337o.compareTo(enumC0337o3) >= 0) {
            enumC0337o = enumC0337o3;
        }
        if (enumC0337o2 == null || enumC0337o2.compareTo(enumC0337o) >= 0) {
            return enumC0337o;
        }
        return enumC0337o2;
    }

    public final void F(String str) {
        if (this.f6828r) {
            C0962b.K().f12229c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1111a.r("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void G(EnumC0336n enumC0336n) {
        M5.g.f(enumC0336n, "event");
        F("handleLifecycleEvent");
        H(enumC0336n.a());
    }

    public final void H(EnumC0337o enumC0337o) {
        EnumC0337o enumC0337o2 = this.f6830t;
        if (enumC0337o2 == enumC0337o) {
            return;
        }
        EnumC0337o enumC0337o3 = EnumC0337o.f6818r;
        EnumC0337o enumC0337o4 = EnumC0337o.f6817q;
        if (enumC0337o2 == enumC0337o3 && enumC0337o == enumC0337o4) {
            throw new IllegalStateException(("no event down from " + this.f6830t + " in component " + this.f6831u.get()).toString());
        }
        this.f6830t = enumC0337o;
        if (this.f6833w || this.f6832v != 0) {
            this.f6834x = true;
            return;
        }
        this.f6833w = true;
        J();
        this.f6833w = false;
        if (this.f6830t == enumC0337o4) {
            this.f6829s = new C0984a();
        }
    }

    public final void I(EnumC0337o enumC0337o) {
        M5.g.f(enumC0337o, "state");
        F("setCurrentState");
        H(enumC0337o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        r7.f6834x = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0344w.J():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.v, java.lang.Object] */
    @Override // P1.c
    public final void g(InterfaceC0341t interfaceC0341t) {
        InterfaceC0340s reflectiveGenericLifecycleObserver;
        InterfaceC0342u interfaceC0342u;
        ArrayList arrayList = this.f6835y;
        M5.g.f(interfaceC0341t, "observer");
        F("addObserver");
        EnumC0337o enumC0337o = this.f6830t;
        EnumC0337o enumC0337o2 = EnumC0337o.f6817q;
        if (enumC0337o != enumC0337o2) {
            enumC0337o2 = EnumC0337o.f6818r;
        }
        ?? obj = new Object();
        HashMap hashMap = AbstractC0345x.f6836a;
        boolean z7 = interfaceC0341t instanceof InterfaceC0340s;
        boolean z8 = interfaceC0341t instanceof InterfaceC0328f;
        boolean z9 = false;
        if (z7 && z8) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0328f) interfaceC0341t, (InterfaceC0340s) interfaceC0341t);
        } else if (z8) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0328f) interfaceC0341t, null);
        } else if (z7) {
            reflectiveGenericLifecycleObserver = (InterfaceC0340s) interfaceC0341t;
        } else {
            Class<?> cls = interfaceC0341t.getClass();
            if (AbstractC0345x.b(cls) == 2) {
                Object obj2 = AbstractC0345x.f6837b.get(cls);
                M5.g.c(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0331i[] interfaceC0331iArr = new InterfaceC0331i[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0331iArr);
                    } else {
                        AbstractC0345x.a((Constructor) list.get(0), interfaceC0341t);
                        throw null;
                    }
                } else {
                    AbstractC0345x.a((Constructor) list.get(0), interfaceC0341t);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0341t);
            }
        }
        obj.f6827b = reflectiveGenericLifecycleObserver;
        obj.f6826a = enumC0337o2;
        if (((C0343v) this.f6829s.f(interfaceC0341t, obj)) != null || (interfaceC0342u = (InterfaceC0342u) this.f6831u.get()) == null) {
            return;
        }
        if (this.f6832v != 0 || this.f6833w) {
            z9 = true;
        }
        EnumC0337o E4 = E(interfaceC0341t);
        this.f6832v++;
        while (obj.f6826a.compareTo(E4) < 0 && this.f6829s.f12365u.containsKey(interfaceC0341t)) {
            arrayList.add(obj.f6826a);
            C0334l c0334l = EnumC0336n.Companion;
            EnumC0337o enumC0337o3 = obj.f6826a;
            c0334l.getClass();
            EnumC0336n b7 = C0334l.b(enumC0337o3);
            if (b7 != null) {
                obj.a(interfaceC0342u, b7);
                arrayList.remove(arrayList.size() - 1);
                E4 = E(interfaceC0341t);
            } else {
                throw new IllegalStateException("no event up from " + obj.f6826a);
            }
        }
        if (!z9) {
            J();
        }
        this.f6832v--;
    }

    @Override // P1.c
    public final EnumC0337o l() {
        return this.f6830t;
    }

    @Override // P1.c
    public final void v(InterfaceC0341t interfaceC0341t) {
        M5.g.f(interfaceC0341t, "observer");
        F("removeObserver");
        this.f6829s.c(interfaceC0341t);
    }
}
