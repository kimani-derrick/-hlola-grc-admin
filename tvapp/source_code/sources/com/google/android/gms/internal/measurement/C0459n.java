package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.measurement.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0459n implements InterfaceC0439j, InterfaceC0464o {

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f8615q = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final InterfaceC0464o b(String str) {
        HashMap hashMap = this.f8615q;
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
        if (obj instanceof C0459n) {
            return this.f8615q.equals(((C0459n) obj).f8615q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final boolean f(String str) {
        return this.f8615q.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return new C0449l(this.f8615q.keySet().iterator());
    }

    public final int hashCode() {
        return this.f8615q.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        String str;
        InterfaceC0464o l7;
        C0459n c0459n = new C0459n();
        for (Map.Entry entry : this.f8615q.entrySet()) {
            boolean z7 = entry.getValue() instanceof InterfaceC0439j;
            HashMap hashMap = c0459n.f8615q;
            if (z7) {
                str = (String) entry.getKey();
                l7 = (InterfaceC0464o) entry.getValue();
            } else {
                str = (String) entry.getKey();
                l7 = ((InterfaceC0464o) entry.getValue()).l();
            }
            hashMap.put(str, l7);
        }
        return c0459n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final void n(String str, InterfaceC0464o interfaceC0464o) {
        HashMap hashMap = this.f8615q;
        if (interfaceC0464o == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0464o);
        }
    }

    public InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0474q(toString());
        }
        return M1.k(this, new C0474q(str), bVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        return Double.valueOf(Double.NaN);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.f8615q;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
