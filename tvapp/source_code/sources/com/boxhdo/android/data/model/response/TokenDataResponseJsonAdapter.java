package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class TokenDataResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7682a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7683b;

    public TokenDataResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7682a = D.G("access", "refresh");
        this.f7683b = yVar.c(TokenResponse.class, v.f137q, "accessToken");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        TokenResponse tokenResponse = null;
        TokenResponse tokenResponse2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7682a);
            if (X6 != -1) {
                k kVar = this.f7683b;
                if (X6 != 0) {
                    if (X6 == 1 && (tokenResponse2 = (TokenResponse) kVar.b(nVar)) == null) {
                        throw e.j("refreshToken", "refresh", nVar);
                    }
                } else {
                    tokenResponse = (TokenResponse) kVar.b(nVar);
                    if (tokenResponse == null) {
                        throw e.j("accessToken", "access", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (tokenResponse != null) {
            if (tokenResponse2 != null) {
                return new TokenDataResponse(tokenResponse, tokenResponse2);
            }
            throw e.e("refreshToken", "refresh", nVar);
        }
        throw e.e("accessToken", "access", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TokenDataResponse tokenDataResponse = (TokenDataResponse) obj;
        g.f(qVar, "writer");
        if (tokenDataResponse != null) {
            qVar.b();
            qVar.j("access");
            k kVar = this.f7683b;
            kVar.f(qVar, tokenDataResponse.f7680a);
            qVar.j("refresh");
            kVar.f(qVar, tokenDataResponse.f7681b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(TokenDataResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
