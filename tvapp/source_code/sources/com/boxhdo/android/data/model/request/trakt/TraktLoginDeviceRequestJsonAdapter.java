package com.boxhdo.android.data.model.request.trakt;

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
public final class TraktLoginDeviceRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7378a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7379b;

    public TraktLoginDeviceRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7378a = D.G("client_id", "client_secret", "code");
        this.f7379b = yVar.c(String.class, v.f137q, "clientId");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7378a);
            if (X6 != -1) {
                k kVar = this.f7379b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2 && (str3 = (String) kVar.b(nVar)) == null) {
                            throw e.j("code", "code", nVar);
                        }
                    } else {
                        str2 = (String) kVar.b(nVar);
                        if (str2 == null) {
                            throw e.j("clientSecret", "client_secret", nVar);
                        }
                    }
                } else {
                    str = (String) kVar.b(nVar);
                    if (str == null) {
                        throw e.j("clientId", "client_id", nVar);
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
                    return new TraktLoginDeviceRequest(str, str2, str3);
                }
                throw e.e("code", "code", nVar);
            }
            throw e.e("clientSecret", "client_secret", nVar);
        }
        throw e.e("clientId", "client_id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktLoginDeviceRequest traktLoginDeviceRequest = (TraktLoginDeviceRequest) obj;
        g.f(qVar, "writer");
        if (traktLoginDeviceRequest != null) {
            qVar.b();
            qVar.j("client_id");
            k kVar = this.f7379b;
            kVar.f(qVar, traktLoginDeviceRequest.f7375a);
            qVar.j("client_secret");
            kVar.f(qVar, traktLoginDeviceRequest.f7376b);
            qVar.j("code");
            kVar.f(qVar, traktLoginDeviceRequest.f7377c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(45, "GeneratedJsonAdapter(TraktLoginDeviceRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
