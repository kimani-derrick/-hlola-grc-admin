package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class ContinueWatchResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7448a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7449b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7450c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7451e;
    public final k f;

    public ContinueWatchResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7448a = D.G("id", "user_id", "movie_id", "season_id", "episode_id", "season_number", "episode_number", "time", "percent", "status", "updated_at", "movie");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7449b = yVar.c(cls, vVar, "id");
        this.f7450c = yVar.c(Long.class, vVar, "userId");
        this.d = yVar.c(Integer.class, vVar, "seasonNumber");
        this.f7451e = yVar.c(Double.class, vVar, "percent");
        this.f = yVar.c(MovieResponse.class, vVar, "movie");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        Long l10 = null;
        Long l11 = null;
        Integer num = null;
        Integer num2 = null;
        Long l12 = null;
        Double d = null;
        Integer num3 = null;
        Long l13 = null;
        MovieResponse movieResponse = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7448a);
            k kVar = this.d;
            Long l14 = l13;
            k kVar2 = this.f7450c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7449b.b(nVar);
                    if (l7 == null) {
                        throw e.j("id", "id", nVar);
                    }
                    break;
                case 1:
                    l8 = (Long) kVar2.b(nVar);
                    break;
                case 2:
                    l9 = (Long) kVar2.b(nVar);
                    break;
                case 3:
                    l10 = (Long) kVar2.b(nVar);
                    break;
                case 4:
                    l11 = (Long) kVar2.b(nVar);
                    break;
                case 5:
                    num = (Integer) kVar.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    num2 = (Integer) kVar.b(nVar);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    l12 = (Long) kVar2.b(nVar);
                    break;
                case 8:
                    d = (Double) this.f7451e.b(nVar);
                    break;
                case 9:
                    num3 = (Integer) kVar.b(nVar);
                    break;
                case 10:
                    l13 = (Long) kVar2.b(nVar);
                    continue;
                case 11:
                    movieResponse = (MovieResponse) this.f.b(nVar);
                    break;
            }
            l13 = l14;
        }
        Long l15 = l13;
        nVar.h();
        if (l7 != null) {
            return new ContinueWatchResponse(l7.longValue(), l8, l9, l10, l11, num, num2, l12, d, num3, l15, movieResponse);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ContinueWatchResponse continueWatchResponse = (ContinueWatchResponse) obj;
        g.f(qVar, "writer");
        if (continueWatchResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7449b.f(qVar, Long.valueOf(continueWatchResponse.f7438a));
            qVar.j("user_id");
            k kVar = this.f7450c;
            kVar.f(qVar, continueWatchResponse.f7439b);
            qVar.j("movie_id");
            kVar.f(qVar, continueWatchResponse.f7440c);
            qVar.j("season_id");
            kVar.f(qVar, continueWatchResponse.d);
            qVar.j("episode_id");
            kVar.f(qVar, continueWatchResponse.f7441e);
            qVar.j("season_number");
            k kVar2 = this.d;
            kVar2.f(qVar, continueWatchResponse.f);
            qVar.j("episode_number");
            kVar2.f(qVar, continueWatchResponse.f7442g);
            qVar.j("time");
            kVar.f(qVar, continueWatchResponse.f7443h);
            qVar.j("percent");
            this.f7451e.f(qVar, continueWatchResponse.f7444i);
            qVar.j("status");
            kVar2.f(qVar, continueWatchResponse.f7445j);
            qVar.j("updated_at");
            kVar.f(qVar, continueWatchResponse.f7446k);
            qVar.j("movie");
            this.f.f(qVar, continueWatchResponse.f7447l);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(ContinueWatchResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
