package f1;

import W5.InterfaceC0116x;
import com.boxhdo.android.data.model.request.trakt.TraktDeviceRequest;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: f1.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662C extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10211u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10212v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0662C(C0669J c0669j, D5.d dVar) {
        super(2, dVar);
        this.f10212v = c0669j;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0662C(this.f10212v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0662C) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10211u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TraktDeviceRequest traktDeviceRequest = new TraktDeviceRequest(g6.o.f10858a.P());
            this.f10211u = 1;
            obj = ((e1.r) this.f10212v.f10229a.get()).a(traktDeviceRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
