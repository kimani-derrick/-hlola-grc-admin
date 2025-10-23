package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class LoginCodeResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7571a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7572b;

    public LoginCodeResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7571a = D.G("code");
        this.f7572b = yVar.c(String.class, v.f137q, "code");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7571a);
            if (X6 != -1) {
                if (X6 == 0) {
                    str = (String) this.f7572b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new LoginCodeResponse(str);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        LoginCodeResponse loginCodeResponse = (LoginCodeResponse) obj;
        g.f(qVar, "writer");
        if (loginCodeResponse != null) {
            qVar.b();
            qVar.j("code");
            this.f7572b.f(qVar, loginCodeResponse.f7570a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(LoginCodeResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
