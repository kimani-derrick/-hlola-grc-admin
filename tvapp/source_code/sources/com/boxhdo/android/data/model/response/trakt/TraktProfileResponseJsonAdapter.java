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
public final class TraktProfileResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7745a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7746b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7747c;

    public TraktProfileResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7745a = D.G("name", "private", "username", "vip", "location", "vip_ep");
        v vVar = v.f137q;
        this.f7746b = yVar.c(String.class, vVar, "name");
        this.f7747c = yVar.c(Boolean.class, vVar, "isPrivate");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        Boolean bool3 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7745a);
            k kVar = this.f7746b;
            k kVar2 = this.f7747c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    str = (String) kVar.b(nVar);
                    break;
                case 1:
                    bool = (Boolean) kVar2.b(nVar);
                    break;
                case 2:
                    str2 = (String) kVar.b(nVar);
                    break;
                case 3:
                    bool2 = (Boolean) kVar2.b(nVar);
                    break;
                case 4:
                    str3 = (String) kVar.b(nVar);
                    break;
                case 5:
                    bool3 = (Boolean) kVar2.b(nVar);
                    break;
            }
        }
        nVar.h();
        return new TraktProfileResponse(str, bool, str2, bool2, str3, bool3);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktProfileResponse traktProfileResponse = (TraktProfileResponse) obj;
        g.f(qVar, "writer");
        if (traktProfileResponse != null) {
            qVar.b();
            qVar.j("name");
            k kVar = this.f7746b;
            kVar.f(qVar, traktProfileResponse.f7741a);
            qVar.j("private");
            k kVar2 = this.f7747c;
            kVar2.f(qVar, traktProfileResponse.f7742b);
            qVar.j("username");
            kVar.f(qVar, traktProfileResponse.f7743c);
            qVar.j("vip");
            kVar2.f(qVar, traktProfileResponse.d);
            qVar.j("location");
            kVar.f(qVar, traktProfileResponse.f7744e);
            qVar.j("vip_ep");
            kVar2.f(qVar, traktProfileResponse.f);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(42, "GeneratedJsonAdapter(TraktProfileResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
