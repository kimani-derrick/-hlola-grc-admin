package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.measurement.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434i implements InterfaceC0464o {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0464o f8579q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8580r;

    public C0434i(String str) {
        this.f8579q = InterfaceC0464o.f8621e;
        this.f8580r = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0434i) {
            C0434i c0434i = (C0434i) obj;
            return this.f8580r.equals(c0434i.f8580r) && this.f8579q.equals(c0434i.f8579q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f8579q.hashCode() + (this.f8580r.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        return new C0434i(this.f8580r, this.f8579q.l());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        throw new IllegalStateException("Control is not a double");
    }

    public C0434i(String str, InterfaceC0464o interfaceC0464o) {
        this.f8579q = interfaceC0464o;
        this.f8580r = str;
    }
}
