package o4;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d implements InterfaceC1070b {

    /* renamed from: x  reason: collision with root package name */
    public static final U4.n f12922x = new U4.n(1);

    /* renamed from: u  reason: collision with root package name */
    public final i f12927u;

    /* renamed from: w  reason: collision with root package name */
    public final J3.e f12929w;

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f12923q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    public final HashMap f12924r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    public final HashMap f12925s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    public final HashSet f12926t = new HashSet();

    /* renamed from: v  reason: collision with root package name */
    public final AtomicReference f12928v = new AtomicReference();

    public d(ArrayList arrayList, ArrayList arrayList2, J3.e eVar) {
        i iVar = new i();
        this.f12927u = iVar;
        this.f12929w = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1069a.c(iVar, i.class, K4.b.class, K4.a.class));
        arrayList3.add(C1069a.c(this, d.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C1069a c1069a = (C1069a) it.next();
            if (c1069a != null) {
                arrayList3.add(c1069a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((M4.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f12929w.A(componentRegistrar));
                        it3.remove();
                    }
                } catch (j e3) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e3);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C1069a) it4.next()).f12918b.toArray();
                int length = array.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Object obj = array[i7];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f12926t.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f12926t.add(obj.toString());
                        }
                        i7++;
                    }
                }
            }
            if (this.f12923q.isEmpty()) {
                p6.d.h(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f12923q.keySet());
                arrayList6.addAll(arrayList3);
                p6.d.h(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C1069a c1069a2 = (C1069a) it5.next();
                this.f12923q.put(c1069a2, new k(new L4.c(this, 2, c1069a2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f12928v.get();
        if (bool != null) {
            a(this.f12923q, bool.booleanValue());
        }
    }

    public final void a(Map map, boolean z7) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            M4.b bVar = (M4.b) entry.getValue();
            int i7 = ((C1069a) entry.getKey()).d;
            if (i7 == 1 || (i7 == 2 && z7)) {
                bVar.get();
            }
        }
        i iVar = this.f12927u;
        synchronized (iVar) {
            arrayDeque = iVar.f12939b;
            if (arrayDeque != null) {
                iVar.f12939b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                AbstractC0515y1.v(it.next());
                throw null;
            }
        }
    }

    @Override // o4.InterfaceC1070b
    public final Set b(o oVar) {
        return (Set) k(oVar).get();
    }

    @Override // o4.InterfaceC1070b
    public final Object c(Class cls) {
        return g(o.a(cls));
    }

    @Override // o4.InterfaceC1070b
    public final M4.b d(Class cls) {
        return f(o.a(cls));
    }

    @Override // o4.InterfaceC1070b
    public final m e(o oVar) {
        M4.b f = f(oVar);
        if (f == null) {
            return new m(m.f12945c, m.d);
        }
        if (f instanceof m) {
            return (m) f;
        }
        return new m(null, f);
    }

    @Override // o4.InterfaceC1070b
    public final synchronized M4.b f(o oVar) {
        p6.l.h(oVar, "Null interface requested.");
        return (M4.b) this.f12924r.get(oVar);
    }

    @Override // o4.InterfaceC1070b
    public final Object g(o oVar) {
        M4.b f = f(oVar);
        if (f == null) {
            return null;
        }
        return f.get();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [o4.l, java.lang.Object] */
    public final void h() {
        boolean z7;
        for (C1069a c1069a : this.f12923q.keySet()) {
            for (g gVar : c1069a.f12919c) {
                if (gVar.f12936b == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                o oVar = gVar.f12935a;
                if (z7) {
                    HashMap hashMap = this.f12925s;
                    if (!hashMap.containsKey(oVar)) {
                        Set emptySet = Collections.emptySet();
                        ?? obj = new Object();
                        obj.f12944b = null;
                        obj.f12943a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f12943a.addAll(emptySet);
                        hashMap.put(oVar, obj);
                    }
                }
                HashMap hashMap2 = this.f12924r;
                if (hashMap2.containsKey(oVar)) {
                    continue;
                } else {
                    int i7 = gVar.f12936b;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            hashMap2.put(oVar, new m(m.f12945c, m.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + c1069a + ": " + oVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1069a c1069a = (C1069a) it.next();
            if (c1069a.f12920e == 0) {
                M4.b bVar = (M4.b) this.f12923q.get(c1069a);
                for (o oVar : c1069a.f12918b) {
                    HashMap hashMap = this.f12924r;
                    if (!hashMap.containsKey(oVar)) {
                        hashMap.put(oVar, bVar);
                    } else {
                        arrayList2.add(new A4.d((m) ((M4.b) hashMap.get(oVar)), 15, bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [o4.l, java.lang.Object] */
    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f12923q.entrySet()) {
            C1069a c1069a = (C1069a) entry.getKey();
            if (c1069a.f12920e != 0) {
                M4.b bVar = (M4.b) entry.getValue();
                for (o oVar : c1069a.f12918b) {
                    if (!hashMap.containsKey(oVar)) {
                        hashMap.put(oVar, new HashSet());
                    }
                    ((Set) hashMap.get(oVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f12925s;
            if (!hashMap2.containsKey(key)) {
                ?? obj = new Object();
                obj.f12944b = null;
                obj.f12943a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f12943a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((o) entry2.getKey(), obj);
            } else {
                l lVar = (l) hashMap2.get(entry2.getKey());
                for (M4.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new A4.d(lVar, 16, bVar2));
                }
            }
        }
        return arrayList;
    }

    public final synchronized M4.b k(o oVar) {
        l lVar = (l) this.f12925s.get(oVar);
        if (lVar != null) {
            return lVar;
        }
        return f12922x;
    }
}
