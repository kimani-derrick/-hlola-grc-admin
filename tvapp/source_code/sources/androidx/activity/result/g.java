package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p6.l;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5365a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5366b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5367c = new HashMap();
    public ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient HashMap f5368e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f5369g = new Bundle();

    public final boolean a(int i7, int i8, Intent intent) {
        b bVar;
        String str = (String) this.f5365a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f5368e.get(str);
        if (eVar != null && (bVar = eVar.f5361a) != null && this.d.contains(str)) {
            bVar.a(eVar.f5362b.D(intent, i8));
            this.d.remove(str);
            return true;
        }
        this.f.remove(str);
        this.f5369g.putParcelable(str, new a(intent, i8));
        return true;
    }

    public abstract void b(int i7, l lVar, Object obj);

    public final d c(final String str, ComponentCallbacksC0269x componentCallbacksC0269x, final l lVar, final b bVar) {
        C0344w c0344w = componentCallbacksC0269x.f6126e0;
        if (c0344w.f6830t.compareTo(EnumC0337o.f6820t) < 0) {
            e(str);
            HashMap hashMap = this.f5367c;
            f fVar = (f) hashMap.get(str);
            if (fVar == null) {
                fVar = new f(c0344w);
            }
            InterfaceC0340s interfaceC0340s = new InterfaceC0340s() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.InterfaceC0340s
                public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                    boolean equals = EnumC0336n.ON_START.equals(enumC0336n);
                    String str2 = str;
                    g gVar = g.this;
                    if (!equals) {
                        if (EnumC0336n.ON_STOP.equals(enumC0336n)) {
                            gVar.f5368e.remove(str2);
                            return;
                        } else if (EnumC0336n.ON_DESTROY.equals(enumC0336n)) {
                            gVar.f(str2);
                            return;
                        } else {
                            return;
                        }
                    }
                    HashMap hashMap2 = gVar.f5368e;
                    b bVar2 = bVar;
                    l lVar2 = lVar;
                    hashMap2.put(str2, new e(bVar2, lVar2));
                    HashMap hashMap3 = gVar.f;
                    if (hashMap3.containsKey(str2)) {
                        Object obj = hashMap3.get(str2);
                        hashMap3.remove(str2);
                        bVar2.a(obj);
                    }
                    Bundle bundle = gVar.f5369g;
                    a aVar = (a) bundle.getParcelable(str2);
                    if (aVar != null) {
                        bundle.remove(str2);
                        bVar2.a(lVar2.D(aVar.f5357r, aVar.f5356q));
                    }
                }
            };
            fVar.f5363a.g(interfaceC0340s);
            fVar.f5364b.add(interfaceC0340s);
            hashMap.put(str, fVar);
            return new d(this, str, lVar, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + componentCallbacksC0269x + " is attempting to register while current state is " + c0344w.f6830t + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final d d(String str, l lVar, b bVar) {
        e(str);
        this.f5368e.put(str, new e(bVar, lVar));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f5369g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.a(lVar.D(aVar.f5357r, aVar.f5356q));
        }
        return new d(this, str, lVar, 1);
    }

    public final void e(String str) {
        HashMap hashMap = this.f5366b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        P5.e.f2815q.getClass();
        int nextInt = P5.e.f2816r.e().nextInt(2147418112);
        while (true) {
            int i7 = nextInt + 65536;
            HashMap hashMap2 = this.f5365a;
            if (hashMap2.containsKey(Integer.valueOf(i7))) {
                P5.e.f2815q.getClass();
                nextInt = P5.e.f2816r.e().nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i7), str);
                hashMap.put(str, Integer.valueOf(i7));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.f5366b.remove(str)) != null) {
            this.f5365a.remove(num);
        }
        this.f5368e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            StringBuilder u7 = AbstractC1111a.u("Dropping pending result for request ", str, ": ");
            u7.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", u7.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f5369g;
        if (bundle.containsKey(str)) {
            StringBuilder u8 = AbstractC1111a.u("Dropping pending result for request ", str, ": ");
            u8.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", u8.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f5367c;
        f fVar = (f) hashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f5364b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f5363a.v((InterfaceC0340s) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
