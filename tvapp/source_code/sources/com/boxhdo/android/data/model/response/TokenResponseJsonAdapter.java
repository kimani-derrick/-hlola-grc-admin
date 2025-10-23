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
public final class TokenResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7686a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7687b;

    public TokenResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7686a = D.G("token", "expires");
        this.f7687b = yVar.c(String.class, v.f137q, "token");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7686a);
            if (X6 != -1) {
                k kVar = this.f7687b;
                if (X6 != 0) {
                    if (X6 == 1 && (str2 = (String) kVar.b(nVar)) == null) {
                        throw e.j("expires", "expires", nVar);
                    }
                } else {
                    str = (String) kVar.b(nVar);
                    if (str == null) {
                        throw e.j("token", "token", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            if (str2 != null) {
                return new TokenResponse(str, str2);
            }
            throw e.e("expires", "expires", nVar);
        }
        throw e.e("token", "token", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TokenResponse tokenResponse = (TokenResponse) obj;
        g.f(qVar, "writer");
        if (tokenResponse != null) {
            qVar.b();
            qVar.j("token");
            String str = tokenResponse.f7684a;
            k kVar = this.f7687b;
            kVar.f(qVar, str);
            qVar.j("expires");
            kVar.f(qVar, tokenResponse.f7685b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(TokenResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
