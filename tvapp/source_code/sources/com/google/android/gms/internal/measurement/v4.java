package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class v4 extends AbstractC0444k {

    /* renamed from: s  reason: collision with root package name */
    public final C0516y2 f8704s;

    /* renamed from: t  reason: collision with root package name */
    public final HashMap f8705t;

    public v4(C0516y2 c0516y2) {
        super("require");
        this.f8705t = new HashMap();
        this.f8704s = c0516y2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0444k
    public final InterfaceC0464o a(C4.b bVar, List list) {
        InterfaceC0464o interfaceC0464o;
        Q.i("require", 1, list);
        String g7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) list.get(0)).g();
        HashMap hashMap = this.f8705t;
        if (hashMap.containsKey(g7)) {
            return (InterfaceC0464o) hashMap.get(g7);
        }
        HashMap hashMap2 = (HashMap) this.f8704s.f8717a;
        if (hashMap2.containsKey(g7)) {
            try {
                interfaceC0464o = (InterfaceC0464o) ((Callable) hashMap2.get(g7)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(AbstractC0515y1.x("Failed to create API implementation: ", g7));
            }
        } else {
            interfaceC0464o = InterfaceC0464o.f8621e;
        }
        if (interfaceC0464o instanceof AbstractC0444k) {
            hashMap.put(g7, (AbstractC0444k) interfaceC0464o);
        }
        return interfaceC0464o;
    }
}
