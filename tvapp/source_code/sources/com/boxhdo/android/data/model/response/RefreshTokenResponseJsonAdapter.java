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
public final class RefreshTokenResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7634a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7635b;

    public RefreshTokenResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7634a = D.G("tokens");
        this.f7635b = yVar.c(TokenDataResponse.class, v.f137q, "tokens");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        TokenDataResponse tokenDataResponse = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7634a);
            if (X6 != -1) {
                if (X6 == 0 && (tokenDataResponse = (TokenDataResponse) this.f7635b.b(nVar)) == null) {
                    throw e.j("tokens", "tokens", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (tokenDataResponse != null) {
            return new RefreshTokenResponse(tokenDataResponse);
        }
        throw e.e("tokens", "tokens", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) obj;
        g.f(qVar, "writer");
        if (refreshTokenResponse != null) {
            qVar.b();
            qVar.j("tokens");
            this.f7635b.f(qVar, refreshTokenResponse.f7633a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(42, "GeneratedJsonAdapter(RefreshTokenResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
