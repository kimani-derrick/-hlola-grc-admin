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
public final class AddToWatchListRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7306a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7307b;

    public AddToWatchListRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7306a = D.G("movie_id");
        this.f7307b = yVar.c(Long.TYPE, v.f137q, "movieId");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7306a);
            if (X6 != -1) {
                if (X6 == 0 && (l7 = (Long) this.f7307b.b(nVar)) == null) {
                    throw e.j("movieId", "movie_id", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            return new AddToWatchListRequest(l7.longValue());
        }
        throw e.e("movieId", "movie_id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        AddToWatchListRequest addToWatchListRequest = (AddToWatchListRequest) obj;
        g.f(qVar, "writer");
        if (addToWatchListRequest != null) {
            qVar.b();
            qVar.j("movie_id");
            this.f7307b.f(qVar, Long.valueOf(addToWatchListRequest.f7305a));
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(AddToWatchListRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
