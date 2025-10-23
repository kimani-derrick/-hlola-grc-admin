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
public final class TraktItemRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7373a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7374b;

    public TraktItemRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7373a = D.G("ids");
        this.f7374b = yVar.c(TraktIdsRequest.class, v.f137q, "ids");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        TraktIdsRequest traktIdsRequest = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7373a);
            if (X6 != -1) {
                if (X6 == 0 && (traktIdsRequest = (TraktIdsRequest) this.f7374b.b(nVar)) == null) {
                    throw e.j("ids", "ids", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (traktIdsRequest != null) {
            return new TraktItemRequest(traktIdsRequest);
        }
        throw e.e("ids", "ids", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktItemRequest traktItemRequest = (TraktItemRequest) obj;
        g.f(qVar, "writer");
        if (traktItemRequest != null) {
            qVar.b();
            qVar.j("ids");
            this.f7374b.f(qVar, traktItemRequest.f7372a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(38, "GeneratedJsonAdapter(TraktItemRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
