package com.boxhdo.android.data.model.request;

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
public final class LoginRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7322a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7323b;

    public LoginRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7322a = D.G("email", "password");
        this.f7323b = yVar.c(String.class, v.f137q, "email");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7322a);
            if (X6 != -1) {
                k kVar = this.f7323b;
                if (X6 != 0) {
                    if (X6 == 1 && (str2 = (String) kVar.b(nVar)) == null) {
                        throw e.j("password", "password", nVar);
                    }
                } else {
                    str = (String) kVar.b(nVar);
                    if (str == null) {
                        throw e.j("email", "email", nVar);
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
                return new LoginRequest(str, str2);
            }
            throw e.e("password", "password", nVar);
        }
        throw e.e("email", "email", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        LoginRequest loginRequest = (LoginRequest) obj;
        g.f(qVar, "writer");
        if (loginRequest != null) {
            qVar.b();
            qVar.j("email");
            k kVar = this.f7323b;
            kVar.f(qVar, loginRequest.f7320a);
            qVar.j("password");
            kVar.f(qVar, loginRequest.f7321b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(34, "GeneratedJsonAdapter(LoginRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
