package x0;

import W5.InterfaceC0099f;
import W5.InterfaceC0116x;
import java.util.concurrent.Callable;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: x0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447c extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Callable f16147u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0099f f16148v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1447c(Callable callable, InterfaceC0099f interfaceC0099f, D5.d dVar) {
        super(2, dVar);
        this.f16147u = callable;
        this.f16148v = interfaceC0099f;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1447c(this.f16147u, this.f16148v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1447c) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        InterfaceC0099f interfaceC0099f = this.f16148v;
        AbstractC0958a.H(obj);
        try {
            interfaceC0099f.m(this.f16147u.call());
        } catch (Throwable th) {
            interfaceC0099f.m(AbstractC0958a.m(th));
        }
        return C1530l.f16479a;
    }
}
