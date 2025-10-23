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
public final class RegisterRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7343a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7344b;

    public RegisterRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7343a = D.G("email", "name", "password");
        this.f7344b = yVar.c(String.class, v.f137q, "email");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7343a);
            if (X6 != -1) {
                k kVar = this.f7344b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2 && (str3 = (String) kVar.b(nVar)) == null) {
                            throw e.j("password", "password", nVar);
                        }
                    } else {
                        str2 = (String) kVar.b(nVar);
                        if (str2 == null) {
                            throw e.j("name", "name", nVar);
                        }
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
                if (str3 != null) {
                    return new RegisterRequest(str, str2, str3);
                }
                throw e.e("password", "password", nVar);
            }
            throw e.e("name", "name", nVar);
        }
        throw e.e("email", "email", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        RegisterRequest registerRequest = (RegisterRequest) obj;
        g.f(qVar, "writer");
        if (registerRequest != null) {
            qVar.b();
            qVar.j("email");
            k kVar = this.f7344b;
            kVar.f(qVar, registerRequest.f7340a);
            qVar.j("name");
            kVar.f(qVar, registerRequest.f7341b);
            qVar.j("password");
            kVar.f(qVar, registerRequest.f7342c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(37, "GeneratedJsonAdapter(RegisterRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
