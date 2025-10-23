package com.boxhdo.android.data.model.response.trakt;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class TraktLoginResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7732a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7733b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7734c;

    public TraktLoginResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7732a = D.G("access_token", "created_at", "expires_in", "refresh_token", "scope", "token_type");
        v vVar = v.f137q;
        this.f7733b = yVar.c(String.class, vVar, "accessToken");
        this.f7734c = yVar.c(Long.class, vVar, "createdAt");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        Long l7 = null;
        Long l8 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7732a);
            k kVar = this.f7734c;
            k kVar2 = this.f7733b;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    str = (String) kVar2.b(nVar);
                    break;
                case 1:
                    l7 = (Long) kVar.b(nVar);
                    break;
                case 2:
                    l8 = (Long) kVar.b(nVar);
                    break;
                case 3:
                    str2 = (String) kVar2.b(nVar);
                    break;
                case 4:
                    str3 = (String) kVar2.b(nVar);
                    break;
                case 5:
                    str4 = (String) kVar2.b(nVar);
                    break;
            }
        }
        nVar.h();
        return new TraktLoginResponse(str, l7, l8, str2, str3, str4);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktLoginResponse traktLoginResponse = (TraktLoginResponse) obj;
        g.f(qVar, "writer");
        if (traktLoginResponse != null) {
            qVar.b();
            qVar.j("access_token");
            k kVar = this.f7733b;
            kVar.f(qVar, traktLoginResponse.f7728a);
            qVar.j("created_at");
            k kVar2 = this.f7734c;
            kVar2.f(qVar, traktLoginResponse.f7729b);
            qVar.j("expires_in");
            kVar2.f(qVar, traktLoginResponse.f7730c);
            qVar.j("refresh_token");
            kVar.f(qVar, traktLoginResponse.d);
            qVar.j("scope");
            kVar.f(qVar, traktLoginResponse.f7731e);
            qVar.j("token_type");
            kVar.f(qVar, traktLoginResponse.f);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(40, "GeneratedJsonAdapter(TraktLoginResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
