package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469p extends AbstractC0444k {

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f8635s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f8636t;

    /* renamed from: u  reason: collision with root package name */
    public final C4.b f8637u;

    public C0469p(C0469p c0469p) {
        super(c0469p.f8593q);
        ArrayList arrayList = new ArrayList(c0469p.f8635s.size());
        this.f8635s = arrayList;
        arrayList.addAll(c0469p.f8635s);
        ArrayList arrayList2 = new ArrayList(c0469p.f8636t.size());
        this.f8636t = arrayList2;
        arrayList2.addAll(c0469p.f8636t);
        this.f8637u = c0469p.f8637u;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0444k
    public final InterfaceC0464o a(C4.b bVar, List list) {
        C0493u c0493u;
        C4.b Z6 = this.f8637u.Z();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8635s;
            int size = arrayList.size();
            c0493u = InterfaceC0464o.f8621e;
            if (i7 >= size) {
                break;
            }
            if (i7 < list.size()) {
                Z6.g0((String) arrayList.get(i7), ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(i7)));
            } else {
                Z6.g0((String) arrayList.get(i7), c0493u);
            }
            i7++;
        }
        Iterator it = this.f8636t.iterator();
        while (it.hasNext()) {
            InterfaceC0464o interfaceC0464o = (InterfaceC0464o) it.next();
            androidx.fragment.app.D d = (androidx.fragment.app.D) Z6.f422s;
            InterfaceC0464o S6 = d.S(Z6, interfaceC0464o);
            if (S6 instanceof r) {
                S6 = d.S(Z6, interfaceC0464o);
            }
            if (S6 instanceof C0434i) {
                return ((C0434i) S6).f8579q;
            }
        }
        return c0493u;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0444k, com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        return new C0469p(this);
    }

    public C0469p(String str, ArrayList arrayList, List list, C4.b bVar) {
        super(str);
        this.f8635s = new ArrayList();
        this.f8637u = bVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f8635s.add(((InterfaceC0464o) it.next()).g());
            }
        }
        this.f8636t = new ArrayList(list);
    }
}
