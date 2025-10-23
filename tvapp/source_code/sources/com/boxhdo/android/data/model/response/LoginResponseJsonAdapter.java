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
public final class LoginResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7575a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7576b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7577c;

    public LoginResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7575a = D.G("user", "tokens");
        v vVar = v.f137q;
        this.f7576b = yVar.c(UserResponse.class, vVar, "user");
        this.f7577c = yVar.c(TokenDataResponse.class, vVar, "tokens");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        UserResponse userResponse = null;
        TokenDataResponse tokenDataResponse = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7575a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1 && (tokenDataResponse = (TokenDataResponse) this.f7577c.b(nVar)) == null) {
                        throw e.j("tokens", "tokens", nVar);
                    }
                } else {
                    userResponse = (UserResponse) this.f7576b.b(nVar);
                    if (userResponse == null) {
                        throw e.j("user", "user", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (userResponse != null) {
            if (tokenDataResponse != null) {
                return new LoginResponse(userResponse, tokenDataResponse);
            }
            throw e.e("tokens", "tokens", nVar);
        }
        throw e.e("user", "user", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        LoginResponse loginResponse = (LoginResponse) obj;
        g.f(qVar, "writer");
        if (loginResponse != null) {
            qVar.b();
            qVar.j("user");
            this.f7576b.f(qVar, loginResponse.f7573a);
            qVar.j("tokens");
            this.f7577c.f(qVar, loginResponse.f7574b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(LoginResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
