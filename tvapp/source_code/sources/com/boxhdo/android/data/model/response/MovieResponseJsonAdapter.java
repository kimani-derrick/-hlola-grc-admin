package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class MovieResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7601a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7602b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7603c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7604e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final k f7605g;

    /* renamed from: h  reason: collision with root package name */
    public final k f7606h;

    /* renamed from: i  reason: collision with root package name */
    public final k f7607i;

    /* renamed from: j  reason: collision with root package name */
    public final k f7608j;

    /* renamed from: k  reason: collision with root package name */
    public final k f7609k;

    /* renamed from: l  reason: collision with root package name */
    public volatile Constructor f7610l;

    public MovieResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7601a = D.G("id", "backdrop_path", "title", "tmdb_id", "overview", "poster_path", "release_date", "runtime", "type", "slug", "trailer", "info_completed", "latest_season", "latest_episode", "quality", "imdb_rating", "update_at", "genres", "casts", "countries", "companies", "in_watch_list", "vote");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7602b = yVar.c(cls, vVar, "id");
        this.f7603c = yVar.c(String.class, vVar, "backdropPath");
        this.d = yVar.c(Long.class, vVar, "tmdbID");
        this.f7604e = yVar.c(Integer.class, vVar, "runtime");
        this.f = yVar.c(Double.class, vVar, "imdbRating");
        this.f7605g = yVar.c(AbstractC1043D.f(GenreResponse.class), vVar, "genres");
        this.f7606h = yVar.c(AbstractC1043D.f(CastResponse.class), vVar, "casts");
        this.f7607i = yVar.c(AbstractC1043D.f(CountryResponse.class), vVar, "countries");
        this.f7608j = yVar.c(AbstractC1043D.f(CompanyResponse.class), vVar, "companies");
        this.f7609k = yVar.c(VoteResponse.class, vVar, "voteResponse");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        int i7;
        g.f(nVar, "reader");
        nVar.b();
        int i8 = -1;
        Long l7 = null;
        String str = null;
        String str2 = null;
        Long l8 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Integer num2 = null;
        String str6 = null;
        String str7 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str8 = null;
        Double d = null;
        Long l9 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Integer num6 = null;
        VoteResponse voteResponse = null;
        while (nVar.n()) {
            switch (nVar.X(this.f7601a)) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    continue;
                case 0:
                    l7 = (Long) this.f7602b.b(nVar);
                    if (l7 != null) {
                        continue;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 1:
                    str = (String) this.f7603c.b(nVar);
                    continue;
                case 2:
                    str2 = (String) this.f7603c.b(nVar);
                    continue;
                case 3:
                    l8 = (Long) this.d.b(nVar);
                    continue;
                case 4:
                    str3 = (String) this.f7603c.b(nVar);
                    continue;
                case 5:
                    str4 = (String) this.f7603c.b(nVar);
                    continue;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str5 = (String) this.f7603c.b(nVar);
                    continue;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    num = (Integer) this.f7604e.b(nVar);
                    continue;
                case 8:
                    num2 = (Integer) this.f7604e.b(nVar);
                    continue;
                case 9:
                    str6 = (String) this.f7603c.b(nVar);
                    continue;
                case 10:
                    str7 = (String) this.f7603c.b(nVar);
                    continue;
                case 11:
                    num3 = (Integer) this.f7604e.b(nVar);
                    continue;
                case 12:
                    num4 = (Integer) this.f7604e.b(nVar);
                    continue;
                case 13:
                    num5 = (Integer) this.f7604e.b(nVar);
                    continue;
                case 14:
                    str8 = (String) this.f7603c.b(nVar);
                    continue;
                case 15:
                    d = (Double) this.f.b(nVar);
                    continue;
                case 16:
                    l9 = (Long) this.d.b(nVar);
                    continue;
                case 17:
                    list = (List) this.f7605g.b(nVar);
                    continue;
                case 18:
                    list2 = (List) this.f7606h.b(nVar);
                    i7 = -262145;
                    break;
                case 19:
                    list3 = (List) this.f7607i.b(nVar);
                    i7 = -524289;
                    break;
                case 20:
                    list4 = (List) this.f7608j.b(nVar);
                    i7 = -1048577;
                    break;
                case 21:
                    num6 = (Integer) this.f7604e.b(nVar);
                    i7 = -2097153;
                    break;
                case 22:
                    voteResponse = (VoteResponse) this.f7609k.b(nVar);
                    i7 = -4194305;
                    break;
            }
            i8 &= i7;
        }
        nVar.h();
        if (i8 == -8126465) {
            if (l7 != null) {
                return new MovieResponse(l7.longValue(), str, str2, l8, str3, str4, str5, num, num2, str6, str7, num3, num4, num5, str8, d, l9, list, list2, list3, list4, num6, voteResponse);
            }
            throw e.e("id", "id", nVar);
        }
        Constructor constructor = this.f7610l;
        if (constructor == null) {
            constructor = MovieResponse.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, Long.class, String.class, String.class, String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, Integer.class, Integer.class, String.class, Double.class, Long.class, List.class, List.class, List.class, List.class, Integer.class, VoteResponse.class, Integer.TYPE, e.f12959c);
            this.f7610l = constructor;
            g.e(constructor, "MovieResponse::class.jav…his.constructorRef = it }");
        }
        if (l7 != null) {
            Object newInstance = constructor.newInstance(l7, str, str2, l8, str3, str4, str5, num, num2, str6, str7, num3, num4, num5, str8, d, l9, list, list2, list3, list4, num6, voteResponse, Integer.valueOf(i8), null);
            g.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return (MovieResponse) newInstance;
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        MovieResponse movieResponse = (MovieResponse) obj;
        g.f(qVar, "writer");
        if (movieResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7602b.f(qVar, Long.valueOf(movieResponse.f7581a));
            qVar.j("backdrop_path");
            k kVar = this.f7603c;
            kVar.f(qVar, movieResponse.f7582b);
            qVar.j("title");
            kVar.f(qVar, movieResponse.f7583c);
            qVar.j("tmdb_id");
            k kVar2 = this.d;
            kVar2.f(qVar, movieResponse.d);
            qVar.j("overview");
            kVar.f(qVar, movieResponse.f7584e);
            qVar.j("poster_path");
            kVar.f(qVar, movieResponse.f);
            qVar.j("release_date");
            kVar.f(qVar, movieResponse.f7585g);
            qVar.j("runtime");
            k kVar3 = this.f7604e;
            kVar3.f(qVar, movieResponse.f7586h);
            qVar.j("type");
            kVar3.f(qVar, movieResponse.f7587i);
            qVar.j("slug");
            kVar.f(qVar, movieResponse.f7588j);
            qVar.j("trailer");
            kVar.f(qVar, movieResponse.f7589k);
            qVar.j("info_completed");
            kVar3.f(qVar, movieResponse.f7590l);
            qVar.j("latest_season");
            kVar3.f(qVar, movieResponse.f7591m);
            qVar.j("latest_episode");
            kVar3.f(qVar, movieResponse.n);
            qVar.j("quality");
            kVar.f(qVar, movieResponse.f7592o);
            qVar.j("imdb_rating");
            this.f.f(qVar, movieResponse.f7593p);
            qVar.j("update_at");
            kVar2.f(qVar, movieResponse.f7594q);
            qVar.j("genres");
            this.f7605g.f(qVar, movieResponse.f7595r);
            qVar.j("casts");
            this.f7606h.f(qVar, movieResponse.f7596s);
            qVar.j("countries");
            this.f7607i.f(qVar, movieResponse.f7597t);
            qVar.j("companies");
            this.f7608j.f(qVar, movieResponse.f7598u);
            qVar.j("in_watch_list");
            kVar3.f(qVar, movieResponse.f7599v);
            qVar.j("vote");
            this.f7609k.f(qVar, movieResponse.f7600w);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(MovieResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
