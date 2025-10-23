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
public final class SendVerifyEmailRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7352a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7353b;

    public SendVerifyEmailRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7352a = D.G("email");
        this.f7353b = yVar.c(String.class, v.f137q, "email");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7352a);
            if (X6 != -1) {
                if (X6 == 0 && (str = (String) this.f7353b.b(nVar)) == null) {
                    throw e.j("email", "email", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            return new SendVerifyEmailRequest(str);
        }
        throw e.e("email", "email", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        SendVerifyEmailRequest sendVerifyEmailRequest = (SendVerifyEmailRequest) obj;
        g.f(qVar, "writer");
        if (sendVerifyEmailRequest != null) {
            qVar.b();
            qVar.j("email");
            this.f7353b.f(qVar, sendVerifyEmailRequest.f7351a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(44, "GeneratedJsonAdapter(SendVerifyEmailRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
