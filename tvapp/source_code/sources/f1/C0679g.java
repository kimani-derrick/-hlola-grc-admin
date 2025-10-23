package f1;

import W5.InterfaceC0116x;
import android.os.CancellationSignal;
import b1.C0361h;
import b1.CallableC0360g;
import c1.C0389c;
import java.util.ArrayList;
import k3.AbstractC0958a;
import w4.l0;
import x0.AbstractC1448d;
import x0.C1458n;
import z5.C1530l;
/* renamed from: f1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10266u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10267v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0679g(C0694v c0694v, D5.d dVar) {
        super(2, dVar);
        this.f10267v = c0694v;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0679g(this.f10267v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0679g) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10266u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0694v c0694v = this.f10267v;
            if (l0.v(c0694v.f10323b) == null) {
                this.f10266u = 1;
                C0361h c0361h = c0694v.f10324c;
                c0361h.getClass();
                C1458n a7 = C1458n.a("SELECT * FROM tbl_watch_list", 0);
                obj = AbstractC1448d.a(c0361h.f7059a, new CancellationSignal(), new CallableC0360g(c0361h, a7, 1), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                return new Y0.b(l0.t(c0694v.f10323b));
            }
        }
        Iterable<C0389c> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(A5.m.P(iterable));
        for (C0389c c0389c : iterable) {
            arrayList.add(new Long(c0389c.f7244b));
        }
        return new Y0.b(arrayList);
    }
}
