package e1;

import W5.InterfaceC0116x;
import a1.C0197a;
import com.boxhdo.android.data.model.request.RefreshTokenRequest;
import com.boxhdo.android.data.model.response.RefreshTokenResponse;
import java.io.IOException;
import k3.AbstractC0958a;
import w4.l0;
import x6.C1483p;
import z5.C1527i;
import z5.C1530l;
/* renamed from: e1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f9376u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f9377v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ H.e f9378w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0574h(String str, H.e eVar, D5.d dVar) {
        super(2, dVar);
        this.f9377v = str;
        this.f9378w = eVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0574h(this.f9377v, this.f9378w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0574h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        H.e eVar = this.f9378w;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f9376u;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC0958a.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0958a.H(obj);
                String str = this.f9377v;
                if (str == null) {
                    return new Y0.a(new IOException());
                }
                Object value = ((C1527i) eVar.f781v).getValue();
                M5.g.e(value, "<get-service>(...)");
                String str2 = l0.s((C0197a) eVar.f777r) + g6.o.f10858a.L();
                RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(str);
                this.f9376u = 1;
                obj = ((InterfaceC0569c) value).a(str2, refreshTokenRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return new Y0.b((RefreshTokenResponse) obj);
        } catch (Exception e3) {
            if ((e3 instanceof C1483p) && ((C1483p) e3).f16316q == 401) {
                return new Y0.a(new IOException());
            }
            return new Y0.a(new H1.a(""));
        }
    }
}
