package com.google.android.gms.internal.measurement;

import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399b extends AbstractC0444k {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f8510s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0399b(String str, int i7) {
        super(str);
        this.f8510s = i7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0444k
    public final InterfaceC0464o a(C4.b bVar, List list) {
        switch (this.f8510s) {
            case 0:
                return new C0429h(Double.valueOf(0.0d));
            case 1:
                return InterfaceC0464o.f8621e;
            case 2:
            case 3:
                return this;
            default:
                return InterfaceC0464o.f8621e;
        }
    }
}
