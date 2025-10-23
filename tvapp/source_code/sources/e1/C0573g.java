package e1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import a1.C0197a;
import com.boxhdo.android.data.model.response.LoginResponse;
import com.boxhdo.android.data.model.response.RefreshTokenResponse;
import com.boxhdo.android.data.model.response.TokenDataResponse;
import com.boxhdo.android.data.model.response.TokenResponse;
import h6.B;
import h6.G;
import java.io.IOException;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: e1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public e6.a f9371u;

    /* renamed from: v  reason: collision with root package name */
    public int f9372v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e6.a f9373w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ G f9374x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ H.e f9375y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0573g(e6.a aVar, D5.d dVar, G g7, H.e eVar) {
        super(2, dVar);
        this.f9373w = aVar;
        this.f9374x = g7;
        this.f9375y = eVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0573g(this.f9373w, dVar, this.f9374x, this.f9375y);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0573g) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        e6.a aVar;
        String str;
        String str2;
        B q5;
        TokenDataResponse tokenDataResponse;
        TokenResponse tokenResponse;
        TokenDataResponse tokenDataResponse2;
        TokenDataResponse tokenDataResponse3;
        TokenResponse tokenResponse2;
        G g7 = this.f9374x;
        H.e eVar = this.f9375y;
        E5.a aVar2 = E5.a.f612q;
        int i7 = this.f9372v;
        if (i7 != 0) {
            if (i7 == 1) {
                aVar = this.f9371u;
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            e6.a aVar3 = this.f9373w;
            this.f9371u = aVar3;
            this.f9372v = 1;
            e6.d dVar = (e6.d) aVar3;
            if (dVar.d(this) == aVar2) {
                return aVar2;
            }
            aVar = dVar;
        }
        try {
            int i8 = g7.f11098t;
            B b7 = g7.f11095q;
            if (i8 == 401) {
                eVar.f780u = l0.w((C0197a) eVar.f777r);
                g6.o oVar = g6.o.f10858a;
                String o7 = oVar.o();
                LoginResponse loginResponse = (LoginResponse) eVar.f780u;
                if (loginResponse != null && (tokenDataResponse3 = loginResponse.f7574b) != null && (tokenResponse2 = tokenDataResponse3.f7680a) != null) {
                    str = tokenResponse2.f7684a;
                } else {
                    str = null;
                }
                String str3 = o7 + " " + str;
                if (b7.f11072c.b("Authorization") != null) {
                    if (!M5.g.a(b7.f11072c.b("Authorization"), str3)) {
                        LoginResponse loginResponse2 = (LoginResponse) eVar.f780u;
                        if (loginResponse2 != null && (tokenDataResponse2 = loginResponse2.f7574b) != null) {
                            H.e.j(eVar, tokenDataResponse2.f7680a.f7684a, tokenDataResponse2.f7681b.f7684a);
                        }
                        H.e b8 = b7.b();
                        b8.B("Authorization");
                        b8.o("Authorization", str3);
                        q5 = b8.q();
                    } else {
                        LoginResponse loginResponse3 = (LoginResponse) eVar.f780u;
                        if (loginResponse3 != null && (tokenDataResponse = loginResponse3.f7574b) != null && (tokenResponse = tokenDataResponse.f7681b) != null) {
                            str2 = tokenResponse.f7684a;
                        } else {
                            str2 = null;
                        }
                        Y0.c cVar = (Y0.c) AbstractC0117y.t(new C0574h(str2, eVar, null));
                        if (cVar instanceof Y0.b) {
                            RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) ((Y0.b) cVar).f4309a;
                            TokenDataResponse tokenDataResponse4 = refreshTokenResponse.f7633a;
                            H.e.j(eVar, tokenDataResponse4.f7680a.f7684a, tokenDataResponse4.f7681b.f7684a);
                            H.e b9 = b7.b();
                            b9.B("Authorization");
                            b9.o("Authorization", oVar.o() + " " + refreshTokenResponse.f7633a.f7680a.f7684a);
                            q5 = b9.q();
                        } else if (cVar instanceof Y0.a) {
                            C0197a c0197a = (C0197a) eVar.f777r;
                            String C3 = oVar.C();
                            c0197a.getClass();
                            M5.g.f(C3, "key");
                            B0.a aVar4 = (B0.a) c0197a.f4980a.edit();
                            aVar4.remove(C3);
                            aVar4.apply();
                            throw new IOException();
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    ((e6.d) aVar).e(null);
                    return q5;
                }
            }
            q5 = null;
            ((e6.d) aVar).e(null);
            return q5;
        } catch (Throwable th) {
            ((e6.d) aVar).e(null);
            throw th;
        }
    }
}
