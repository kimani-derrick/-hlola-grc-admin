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
public final class RatingRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7334a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7335b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7336c;

    public RatingRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7334a = D.G("movie_id", "vote");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7335b = yVar.c(cls, vVar, "movieId");
        this.f7336c = yVar.c(Integer.TYPE, vVar, "vote");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7334a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1 && (num = (Integer) this.f7336c.b(nVar)) == null) {
                        throw e.j("vote", "vote", nVar);
                    }
                } else {
                    l7 = (Long) this.f7335b.b(nVar);
                    if (l7 == null) {
                        throw e.j("movieId", "movie_id", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            long longValue = l7.longValue();
            if (num != null) {
                return new RatingRequest(longValue, num.intValue());
            }
            throw e.e("vote", "vote", nVar);
        }
        throw e.e("movieId", "movie_id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        RatingRequest ratingRequest = (RatingRequest) obj;
        g.f(qVar, "writer");
        if (ratingRequest != null) {
            qVar.b();
            qVar.j("movie_id");
            this.f7335b.f(qVar, Long.valueOf(ratingRequest.f7332a));
            qVar.j("vote");
            this.f7336c.f(qVar, Integer.valueOf(ratingRequest.f7333b));
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(RatingRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
