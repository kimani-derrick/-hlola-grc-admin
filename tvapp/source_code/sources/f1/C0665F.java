package f1;

import W5.InterfaceC0116x;
import com.boxhdo.android.data.model.request.trakt.TraktLoginDeviceRequest;
import com.boxhdo.android.data.model.response.trakt.TraktLoginResponse;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665F extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10218u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10219v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f10220w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0665F(C0669J c0669j, String str, D5.d dVar) {
        super(2, dVar);
        this.f10219v = c0669j;
        this.f10220w = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0665F(this.f10219v, this.f10220w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0665F) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10218u;
        C0669J c0669j = this.f10219v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            g6.o oVar = g6.o.f10858a;
            TraktLoginDeviceRequest traktLoginDeviceRequest = new TraktLoginDeviceRequest(oVar.P(), oVar.S(), this.f10220w);
            this.f10218u = 1;
            obj = ((e1.r) c0669j.f10229a.get()).g(traktLoginDeviceRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        l0.R(c0669j.f10230b, (TraktLoginResponse) obj);
        return new Y0.b(C1530l.f16479a);
    }
}
