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
public final class RefreshTokenRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7338a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7339b;

    public RefreshTokenRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7338a = D.G("refreshToken");
        this.f7339b = yVar.c(String.class, v.f137q, "refreshToken");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7338a);
            if (X6 != -1) {
                if (X6 == 0 && (str = (String) this.f7339b.b(nVar)) == null) {
                    throw e.j("refreshToken", "refreshToken", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            return new RefreshTokenRequest(str);
        }
        throw e.e("refreshToken", "refreshToken", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        RefreshTokenRequest refreshTokenRequest = (RefreshTokenRequest) obj;
        g.f(qVar, "writer");
        if (refreshTokenRequest != null) {
            qVar.b();
            qVar.j("refreshToken");
            this.f7339b.f(qVar, refreshTokenRequest.f7337a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(41, "GeneratedJsonAdapter(RefreshTokenRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
