package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.measurement.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518z implements Comparator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ AbstractC0444k f8718q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C4.b f8719r;

    public C0518z(AbstractC0444k abstractC0444k, C4.b bVar) {
        this.f8718q = abstractC0444k;
        this.f8719r = bVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0464o interfaceC0464o = (InterfaceC0464o) obj;
        InterfaceC0464o interfaceC0464o2 = (InterfaceC0464o) obj2;
        if (interfaceC0464o instanceof C0493u) {
            return !(interfaceC0464o2 instanceof C0493u) ? 1 : 0;
        } else if (interfaceC0464o2 instanceof C0493u) {
            return -1;
        } else {
            AbstractC0444k abstractC0444k = this.f8718q;
            return abstractC0444k == null ? interfaceC0464o.g().compareTo(interfaceC0464o2.g()) : (int) Q.a(abstractC0444k.a(this.f8719r, Arrays.asList(interfaceC0464o, interfaceC0464o2)).r().doubleValue());
        }
    }
}
