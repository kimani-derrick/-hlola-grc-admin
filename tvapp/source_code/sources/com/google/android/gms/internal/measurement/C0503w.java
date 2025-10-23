package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.measurement.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503w {

    /* renamed from: a  reason: collision with root package name */
    public final C4.b f8706a;

    /* renamed from: b  reason: collision with root package name */
    public C4.b f8707b;

    /* renamed from: c  reason: collision with root package name */
    public final C0404c f8708c;
    public final androidx.fragment.app.D d;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.google.android.gms.internal.measurement.c] */
    public C0503w() {
        C4.b bVar = new C4.b(14);
        this.f8706a = bVar;
        this.f8707b = ((C4.b) bVar.f422s).Z();
        ?? obj = new Object();
        obj.f8515a = new C0409d("", 0L, null);
        obj.f8516b = new C0409d("", 0L, null);
        obj.f8517c = new ArrayList();
        this.f8708c = obj;
        this.d = new androidx.fragment.app.D(4);
        CallableC0394a callableC0394a = new CallableC0394a(0);
        callableC0394a.f8503b = this;
        C0516y2 c0516y2 = (C0516y2) bVar.f424u;
        ((HashMap) c0516y2.f8717a).put("internal.registerCallback", callableC0394a);
        CallableC0394a callableC0394a2 = new CallableC0394a(1);
        callableC0394a2.f8503b = this;
        ((HashMap) c0516y2.f8717a).put("internal.eventLogger", callableC0394a2);
    }

    public final void a(C0510x1 c0510x1) {
        AbstractC0444k abstractC0444k;
        C4.b bVar = this.f8706a;
        try {
            this.f8707b = ((C4.b) bVar.f422s).Z();
            if (!(bVar.b0(this.f8707b, (C0520z1[]) c0510x1.s().toArray(new C0520z1[0])) instanceof C0434i)) {
                for (C0505w1 c0505w1 : c0510x1.r().t()) {
                    InterfaceC0481r2 s6 = c0505w1.s();
                    String r3 = c0505w1.r();
                    Iterator it = s6.iterator();
                    while (it.hasNext()) {
                        InterfaceC0464o b02 = bVar.b0(this.f8707b, (C0520z1) it.next());
                        if (b02 instanceof C0459n) {
                            C4.b bVar2 = this.f8707b;
                            if (!bVar2.h0(r3)) {
                                abstractC0444k = null;
                            } else {
                                InterfaceC0464o e02 = bVar2.e0(r3);
                                if (e02 instanceof AbstractC0444k) {
                                    abstractC0444k = (AbstractC0444k) e02;
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + r3);
                                }
                            }
                            if (abstractC0444k != null) {
                                abstractC0444k.a(this.f8707b, Collections.singletonList(b02));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: " + r3);
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final boolean b(C0409d c0409d) {
        C0404c c0404c = this.f8708c;
        try {
            c0404c.f8515a = c0409d;
            c0404c.f8516b = (C0409d) c0409d.clone();
            c0404c.f8517c.clear();
            ((C4.b) this.f8706a.f423t).i0("runtime.counter", new C0429h(Double.valueOf(0.0d)));
            this.d.U(this.f8707b.Z(), c0404c);
            C0404c c0404c2 = this.f8708c;
            if (!(!c0404c2.f8516b.equals(c0404c2.f8515a))) {
                if (!(!this.f8708c.f8517c.isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
