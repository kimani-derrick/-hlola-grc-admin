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
public final class EpisodeResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7497a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7498b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7499c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7500e;

    public EpisodeResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7497a = D.G("id", "movie_id", "still_path", "season_id", "name", "episode_number", "air_date", "runtime");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7498b = yVar.c(cls, vVar, "id");
        this.f7499c = yVar.c(Long.class, vVar, "movieId");
        this.d = yVar.c(String.class, vVar, "stillPath");
        this.f7500e = yVar.c(Integer.class, vVar, "runtime");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Long l8 = null;
        String str = null;
        Long l9 = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7497a);
            k kVar = this.f7499c;
            k kVar2 = this.d;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7498b.b(nVar);
                    if (l7 != null) {
                        break;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 1:
                    l8 = (Long) kVar.b(nVar);
                    break;
                case 2:
                    str = (String) kVar2.b(nVar);
                    break;
                case 3:
                    l9 = (Long) kVar.b(nVar);
                    break;
                case 4:
                    str2 = (String) kVar2.b(nVar);
                    break;
                case 5:
                    l10 = (Long) kVar.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str3 = (String) kVar2.b(nVar);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    num = (Integer) this.f7500e.b(nVar);
                    break;
            }
        }
        nVar.h();
        if (l7 != null) {
            return new EpisodeResponse(l7.longValue(), l8, str, l9, str2, l10, str3, num);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        EpisodeResponse episodeResponse = (EpisodeResponse) obj;
        g.f(qVar, "writer");
        if (episodeResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7498b.f(qVar, Long.valueOf(episodeResponse.f7491a));
            qVar.j("movie_id");
            k kVar = this.f7499c;
            kVar.f(qVar, episodeResponse.f7492b);
            qVar.j("still_path");
            k kVar2 = this.d;
            kVar2.f(qVar, episodeResponse.f7493c);
            qVar.j("season_id");
            kVar.f(qVar, episodeResponse.d);
            qVar.j("name");
            kVar2.f(qVar, episodeResponse.f7494e);
            qVar.j("episode_number");
            kVar.f(qVar, episodeResponse.f);
            qVar.j("air_date");
            kVar2.f(qVar, episodeResponse.f7495g);
            qVar.j("runtime");
            this.f7500e.f(qVar, episodeResponse.f7496h);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(37, "GeneratedJsonAdapter(EpisodeResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
