package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import k.C0852F;
/* renamed from: com.google.android.gms.internal.measurement.w2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506w2 extends AbstractC0444k {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f8709s = 1;

    /* renamed from: t  reason: collision with root package name */
    public Object f8710t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0506w2(androidx.fragment.app.D d) {
        super("getValue");
        this.f8710t = d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0444k
    public final InterfaceC0464o a(C4.b bVar, List list) {
        HashMap hashMap;
        Object obj;
        String str;
        int i7;
        Object obj2;
        switch (this.f8709s) {
            case 0:
                Q.i(this.f8593q, 3, list);
                String g7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(0)).g();
                long a7 = (long) Q.a(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(1)).r().doubleValue());
                InterfaceC0464o S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(2));
                if (S6 instanceof C0459n) {
                    hashMap = Q.f((C0459n) S6);
                } else {
                    hashMap = new HashMap();
                }
                C0404c c0404c = (C0404c) this.f8710t;
                c0404c.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str2 : hashMap.keySet()) {
                    HashMap hashMap3 = c0404c.f8515a.f8534c;
                    if (hashMap3.containsKey(str2)) {
                        obj = hashMap3.get(str2);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str2, C0409d.a(obj, hashMap.get(str2), str2));
                }
                c0404c.f8517c.add(new C0409d(g7, a7, hashMap2));
                return InterfaceC0464o.f8621e;
            case 1:
                Q.i("getValue", 2, list);
                InterfaceC0464o S7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(0));
                InterfaceC0464o S8 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(1));
                String g8 = S7.g();
                androidx.fragment.app.D d = (androidx.fragment.app.D) this.f8710t;
                Map map = (Map) ((s3.Z) d.f5884s).f13945t.get((String) d.f5883r);
                if (map != null && map.containsKey(g8)) {
                    str = (String) map.get(g8);
                } else {
                    str = null;
                }
                if (str != null) {
                    return new C0474q(str);
                }
                return S8;
            case 2:
                return InterfaceC0464o.f8621e;
            case 3:
                Q.i(this.f8593q, 3, list);
                ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(0)).g();
                InterfaceC0464o S9 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(1));
                if (S9 instanceof C0469p) {
                    InterfaceC0464o S10 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(2));
                    if (S10 instanceof C0459n) {
                        C0459n c0459n = (C0459n) S10;
                        if (c0459n.f8615q.containsKey("type")) {
                            String g9 = c0459n.b("type").g();
                            if (c0459n.f8615q.containsKey("priority")) {
                                i7 = Q.k(c0459n.b("priority").r().doubleValue());
                            } else {
                                i7 = 1000;
                            }
                            C0469p c0469p = (C0469p) S9;
                            androidx.fragment.app.D d7 = (androidx.fragment.app.D) this.f8710t;
                            d7.getClass();
                            if ("create".equals(g9)) {
                                obj2 = d7.f5884s;
                            } else if ("edit".equals(g9)) {
                                obj2 = d7.f5883r;
                            } else {
                                throw new IllegalStateException(AbstractC0515y1.x("Unknown callback type: ", g9));
                            }
                            TreeMap treeMap = (TreeMap) obj2;
                            if (treeMap.containsKey(Integer.valueOf(i7))) {
                                i7 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i7), c0469p);
                            return InterfaceC0464o.f8621e;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
            default:
                try {
                    return C1.g(((Callable) this.f8710t).call());
                } catch (Exception unused) {
                    return InterfaceC0464o.f8621e;
                }
        }
    }

    public C0506w2(C0404c c0404c) {
        super("internal.eventLogger");
        this.f8710t = c0404c;
    }

    public /* synthetic */ C0506w2(String str) {
        super(str);
    }

    public C0506w2(C0852F c0852f) {
        super("internal.logger");
        this.f8710t = c0852f;
        this.f8594r.put("log", new u4(this, false, true));
        this.f8594r.put("silent", new C0399b("silent", 2));
        ((AbstractC0444k) this.f8594r.get("silent")).n("log", new u4(this, true, true));
        this.f8594r.put("unmonitored", new C0399b("unmonitored", 3));
        ((AbstractC0444k) this.f8594r.get("unmonitored")).n("log", new u4(this, false, false));
    }

    public C0506w2(s3.Y y3) {
        super("internal.appMetadata");
        this.f8710t = y3;
    }
}
