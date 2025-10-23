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
public final class UserInfoResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7694a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7695b;

    public UserInfoResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7694a = D.G("user");
        this.f7695b = yVar.c(UserResponse.class, v.f137q, "user");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        UserResponse userResponse = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7694a);
            if (X6 != -1) {
                if (X6 == 0 && (userResponse = (UserResponse) this.f7695b.b(nVar)) == null) {
                    throw e.j("user", "user", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (userResponse != null) {
            return new UserInfoResponse(userResponse);
        }
        throw e.e("user", "user", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        UserInfoResponse userInfoResponse = (UserInfoResponse) obj;
        g.f(qVar, "writer");
        if (userInfoResponse != null) {
            qVar.b();
            qVar.j("user");
            this.f7695b.f(qVar, userInfoResponse.f7693a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(38, "GeneratedJsonAdapter(UserInfoResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
