package x0;

import W5.InterfaceC0116x;
import java.util.concurrent.Callable;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: x0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446b extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Callable f16146u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446b(Callable callable, D5.d dVar) {
        super(2, dVar);
        this.f16146u = callable;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1446b(this.f16146u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1446b) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        return this.f16146u.call();
    }
}
