package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0444k implements InterfaceC0439j, InterfaceC0464o {

    /* renamed from: q  reason: collision with root package name */
    public final String f8593q;

    /* renamed from: r  reason: collision with root package name */
    public final HashMap f8594r = new HashMap();

    public AbstractC0444k(String str) {
        this.f8593q = str;
    }

    public abstract InterfaceC0464o a(C4.b bVar, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final InterfaceC0464o b(String str) {
        HashMap hashMap = this.f8594r;
        return hashMap.containsKey(str) ? (InterfaceC0464o) hashMap.get(str) : InterfaceC0464o.f8621e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC0444k) {
            AbstractC0444k abstractC0444k = (AbstractC0444k) obj;
            String str = this.f8593q;
            if (str != null) {
                return str.equals(abstractC0444k.f8593q);
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final boolean f(String str) {
        return this.f8594r.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        return this.f8593q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return new C0449l(this.f8594r.keySet().iterator());
    }

    public final int hashCode() {
        String str = this.f8593q;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public InterfaceC0464o l() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final void n(String str, InterfaceC0464o interfaceC0464o) {
        HashMap hashMap = this.f8594r;
        if (interfaceC0464o == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0464o);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0474q(this.f8593q);
        }
        return M1.k(this, new C0474q(str), bVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        return Double.valueOf(Double.NaN);
    }
}
