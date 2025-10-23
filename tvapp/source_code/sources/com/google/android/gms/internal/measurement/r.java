package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class r implements InterfaceC0464o {

    /* renamed from: q  reason: collision with root package name */
    public final String f8655q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f8656r;

    public r(String str, ArrayList arrayList) {
        this.f8655q = str;
        ArrayList arrayList2 = new ArrayList();
        this.f8656r = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            String str = this.f8655q;
            if (str == null ? rVar.f8655q == null : str.equals(rVar.f8655q)) {
                ArrayList arrayList = this.f8656r;
                ArrayList arrayList2 = rVar.f8656r;
                return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        String str = this.f8655q;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f8656r;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
}
