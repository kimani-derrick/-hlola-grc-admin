package f1;

import W5.InterfaceC0116x;
import a1.C0197a;
import com.boxhdo.android.data.model.request.trakt.TraktLogoutRequest;
import com.boxhdo.android.data.model.response.trakt.TraktLoginResponse;
import k3.AbstractC0958a;
import w4.l0;
import x6.N;
import z5.C1530l;
/* renamed from: f1.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666G extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10221u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10222v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666G(C0669J c0669j, D5.d dVar) {
        super(2, dVar);
        this.f10222v = c0669j;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0666G(this.f10222v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0666G) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String str;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10221u;
        C0669J c0669j = this.f10222v;
        try {
        } catch (Throwable th) {
            AbstractC0958a.m(th);
        }
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TraktLoginResponse v5 = l0.v(c0669j.f10230b);
            if (v5 != null && (str = v5.f7728a) != null) {
                g6.o oVar = g6.o.f10858a;
                TraktLogoutRequest traktLogoutRequest = new TraktLogoutRequest(oVar.P(), oVar.S(), str);
                this.f10221u = 1;
                obj = ((e1.r) c0669j.f10229a.get()).d(traktLogoutRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            C0197a c0197a = c0669j.f10230b;
            c0197a.getClass();
            B0.a aVar2 = (B0.a) c0197a.f4980a.edit();
            aVar2.remove("PREF_WATCH_LIST");
            aVar2.apply();
            C0197a c0197a2 = c0669j.f10230b;
            l0.R(c0197a2, null);
            l0.S(c0197a2, null);
            return new Y0.b(C1530l.f16479a);
        }
        N n = (N) obj;
        C0197a c0197a3 = c0669j.f10230b;
        c0197a3.getClass();
        B0.a aVar22 = (B0.a) c0197a3.f4980a.edit();
        aVar22.remove("PREF_WATCH_LIST");
        aVar22.apply();
        C0197a c0197a22 = c0669j.f10230b;
        l0.R(c0197a22, null);
        l0.S(c0197a22, null);
        return new Y0.b(C1530l.f16479a);
    }
}
