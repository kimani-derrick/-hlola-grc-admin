package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.measurement.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493u implements InterfaceC0464o {
    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C0493u;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        return InterfaceC0464o.f8621e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        return Double.valueOf(Double.NaN);
    }
}
