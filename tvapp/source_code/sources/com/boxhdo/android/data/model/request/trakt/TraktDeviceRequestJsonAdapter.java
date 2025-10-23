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
public final class TraktDeviceRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7366a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7367b;

    public TraktDeviceRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7366a = D.G("client_id");
        this.f7367b = yVar.c(String.class, v.f137q, "clientId");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7366a);
            if (X6 != -1) {
                if (X6 == 0 && (str = (String) this.f7367b.b(nVar)) == null) {
                    throw e.j("clientId", "client_id", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            return new TraktDeviceRequest(str);
        }
        throw e.e("clientId", "client_id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktDeviceRequest traktDeviceRequest = (TraktDeviceRequest) obj;
        g.f(qVar, "writer");
        if (traktDeviceRequest != null) {
            qVar.b();
            qVar.j("client_id");
            this.f7367b.f(qVar, traktDeviceRequest.f7365a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(40, "GeneratedJsonAdapter(TraktDeviceRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
