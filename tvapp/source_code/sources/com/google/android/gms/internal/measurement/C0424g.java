package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.measurement.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424g implements InterfaceC0464o {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8560q;

    public C0424g(Boolean bool) {
        this.f8560q = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        return Boolean.valueOf(this.f8560q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0424g) && this.f8560q == ((C0424g) obj).f8560q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        return Boolean.toString(this.f8560q);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f8560q).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        return new C0424g(Boolean.valueOf(this.f8560q));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z7 = this.f8560q;
        if (equals) {
            return new C0474q(Boolean.toString(z7));
        }
        String bool = Boolean.toString(z7);
        throw new IllegalArgumentException(bool + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        return Double.valueOf(this.f8560q ? 1.0d : 0.0d);
    }

    public final String toString() {
        return String.valueOf(this.f8560q);
    }
}
