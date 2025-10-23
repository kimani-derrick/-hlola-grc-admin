package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class VoteResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7713a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7714b;

    public VoteResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7713a = D.G("movieId", "count", "totalScore");
        this.f7714b = yVar.c(Long.class, v.f137q, "movieId");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7713a);
            if (X6 != -1) {
                k kVar = this.f7714b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            l9 = (Long) kVar.b(nVar);
                        }
                    } else {
                        l8 = (Long) kVar.b(nVar);
                    }
                } else {
                    l7 = (Long) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new VoteResponse(l7, l8, l9);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        VoteResponse voteResponse = (VoteResponse) obj;
        g.f(qVar, "writer");
        if (voteResponse != null) {
            qVar.b();
            qVar.j("movieId");
            k kVar = this.f7714b;
            kVar.f(qVar, voteResponse.f7710a);
            qVar.j("count");
            kVar.f(qVar, voteResponse.f7711b);
            qVar.j("totalScore");
            kVar.f(qVar, voteResponse.f7712c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(34, "GeneratedJsonAdapter(VoteResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
