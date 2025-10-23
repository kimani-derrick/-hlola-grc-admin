package f1;

import W5.InterfaceC0116x;
import java.util.ArrayList;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692t extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0694v f10315u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f10316v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692t(C0694v c0694v, long j7, D5.d dVar) {
        super(2, dVar);
        this.f10315u = c0694v;
        this.f10316v = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0692t(this.f10315u, this.f10316v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0692t) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        C0694v c0694v = this.f10315u;
        ArrayList m02 = A5.k.m0(l0.t(c0694v.f10323b));
        m02.remove(new Long(this.f10316v));
        l0.Q(c0694v.f10323b, m02);
        return new Y0.b(C1530l.f16479a);
    }
}
