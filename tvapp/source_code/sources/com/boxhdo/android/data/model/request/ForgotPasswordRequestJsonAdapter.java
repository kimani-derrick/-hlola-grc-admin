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
public final class ForgotPasswordRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7318a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7319b;

    public ForgotPasswordRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7318a = D.G("email");
        this.f7319b = yVar.c(String.class, v.f137q, "email");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7318a);
            if (X6 != -1) {
                if (X6 == 0 && (str = (String) this.f7319b.b(nVar)) == null) {
                    throw e.j("email", "email", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            return new ForgotPasswordRequest(str);
        }
        throw e.e("email", "email", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ForgotPasswordRequest forgotPasswordRequest = (ForgotPasswordRequest) obj;
        g.f(qVar, "writer");
        if (forgotPasswordRequest != null) {
            qVar.b();
            qVar.j("email");
            this.f7319b.f(qVar, forgotPasswordRequest.f7317a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(ForgotPasswordRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
