package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class MovieResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7581a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7582b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7583c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7584e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7585g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f7586h;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f7587i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7588j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7589k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f7590l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f7591m;
    public final Integer n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7592o;

    /* renamed from: p  reason: collision with root package name */
    public final Double f7593p;

    /* renamed from: q  reason: collision with root package name */
    public final Long f7594q;

    /* renamed from: r  reason: collision with root package name */
    public final List f7595r;

    /* renamed from: s  reason: collision with root package name */
    public final List f7596s;

    /* renamed from: t  reason: collision with root package name */
    public final List f7597t;

    /* renamed from: u  reason: collision with root package name */
    public final List f7598u;

    /* renamed from: v  reason: collision with root package name */
    public final Integer f7599v;

    /* renamed from: w  reason: collision with root package name */
    public final VoteResponse f7600w;

    public MovieResponse(@i(name = "id") long j7, @i(name = "backdrop_path") String str, @i(name = "title") String str2, @i(name = "tmdb_id") Long l7, @i(name = "overview") String str3, @i(name = "poster_path") String str4, @i(name = "release_date") String str5, @i(name = "runtime") Integer num, @i(name = "type") Integer num2, @i(name = "slug") String str6, @i(name = "trailer") String str7, @i(name = "info_completed") Integer num3, @i(name = "latest_season") Integer num4, @i(name = "latest_episode") Integer num5, @i(name = "quality") String str8, @i(name = "imdb_rating") Double d, @i(name = "update_at") Long l8, @i(name = "genres") List<GenreResponse> list, @i(name = "casts") List<CastResponse> list2, @i(name = "countries") List<CountryResponse> list3, @i(name = "companies") List<CompanyResponse> list4, @i(name = "in_watch_list") Integer num6, @i(name = "vote") VoteResponse voteResponse) {
        this.f7581a = j7;
        this.f7582b = str;
        this.f7583c = str2;
        this.d = l7;
        this.f7584e = str3;
        this.f = str4;
        this.f7585g = str5;
        this.f7586h = num;
        this.f7587i = num2;
        this.f7588j = str6;
        this.f7589k = str7;
        this.f7590l = num3;
        this.f7591m = num4;
        this.n = num5;
        this.f7592o = str8;
        this.f7593p = d;
        this.f7594q = l8;
        this.f7595r = list;
        this.f7596s = list2;
        this.f7597t = list3;
        this.f7598u = list4;
        this.f7599v = num6;
        this.f7600w = voteResponse;
    }

    public final MovieResponse copy(@i(name = "id") long j7, @i(name = "backdrop_path") String str, @i(name = "title") String str2, @i(name = "tmdb_id") Long l7, @i(name = "overview") String str3, @i(name = "poster_path") String str4, @i(name = "release_date") String str5, @i(name = "runtime") Integer num, @i(name = "type") Integer num2, @i(name = "slug") String str6, @i(name = "trailer") String str7, @i(name = "info_completed") Integer num3, @i(name = "latest_season") Integer num4, @i(name = "latest_episode") Integer num5, @i(name = "quality") String str8, @i(name = "imdb_rating") Double d, @i(name = "update_at") Long l8, @i(name = "genres") List<GenreResponse> list, @i(name = "casts") List<CastResponse> list2, @i(name = "countries") List<CountryResponse> list3, @i(name = "companies") List<CompanyResponse> list4, @i(name = "in_watch_list") Integer num6, @i(name = "vote") VoteResponse voteResponse) {
        return new MovieResponse(j7, str, str2, l7, str3, str4, str5, num, num2, str6, str7, num3, num4, num5, str8, d, l8, list, list2, list3, list4, num6, voteResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MovieResponse) {
            MovieResponse movieResponse = (MovieResponse) obj;
            return this.f7581a == movieResponse.f7581a && g.a(this.f7582b, movieResponse.f7582b) && g.a(this.f7583c, movieResponse.f7583c) && g.a(this.d, movieResponse.d) && g.a(this.f7584e, movieResponse.f7584e) && g.a(this.f, movieResponse.f) && g.a(this.f7585g, movieResponse.f7585g) && g.a(this.f7586h, movieResponse.f7586h) && g.a(this.f7587i, movieResponse.f7587i) && g.a(this.f7588j, movieResponse.f7588j) && g.a(this.f7589k, movieResponse.f7589k) && g.a(this.f7590l, movieResponse.f7590l) && g.a(this.f7591m, movieResponse.f7591m) && g.a(this.n, movieResponse.n) && g.a(this.f7592o, movieResponse.f7592o) && g.a(this.f7593p, movieResponse.f7593p) && g.a(this.f7594q, movieResponse.f7594q) && g.a(this.f7595r, movieResponse.f7595r) && g.a(this.f7596s, movieResponse.f7596s) && g.a(this.f7597t, movieResponse.f7597t) && g.a(this.f7598u, movieResponse.f7598u) && g.a(this.f7599v, movieResponse.f7599v) && g.a(this.f7600w, movieResponse.f7600w);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        long j7 = this.f7581a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7582b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7583c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l7 = this.d;
        if (l7 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l7.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.f7584e;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str5 = this.f7585g;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Integer num = this.f7586h;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Integer num2 = this.f7587i;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str6 = this.f7588j;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str7 = this.f7589k;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Integer num3 = this.f7590l;
        if (num3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num3.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Integer num4 = this.f7591m;
        if (num4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num4.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        Integer num5 = this.n;
        if (num5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num5.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        String str8 = this.f7592o;
        if (str8 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str8.hashCode();
        }
        int i22 = (i21 + hashCode14) * 31;
        Double d = this.f7593p;
        if (d == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = d.hashCode();
        }
        int i23 = (i22 + hashCode15) * 31;
        Long l8 = this.f7594q;
        if (l8 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = l8.hashCode();
        }
        int i24 = (i23 + hashCode16) * 31;
        List list = this.f7595r;
        if (list == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = list.hashCode();
        }
        int i25 = (i24 + hashCode17) * 31;
        List list2 = this.f7596s;
        if (list2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list2.hashCode();
        }
        int i26 = (i25 + hashCode18) * 31;
        List list3 = this.f7597t;
        if (list3 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = list3.hashCode();
        }
        int i27 = (i26 + hashCode19) * 31;
        List list4 = this.f7598u;
        if (list4 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = list4.hashCode();
        }
        int i28 = (i27 + hashCode20) * 31;
        Integer num6 = this.f7599v;
        if (num6 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = num6.hashCode();
        }
        int i29 = (i28 + hashCode21) * 31;
        VoteResponse voteResponse = this.f7600w;
        if (voteResponse != null) {
            i8 = voteResponse.hashCode();
        }
        return i29 + i8;
    }

    public final String toString() {
        return "MovieResponse(id=" + this.f7581a + ", backdropPath=" + this.f7582b + ", title=" + this.f7583c + ", tmdbID=" + this.d + ", overview=" + this.f7584e + ", posterPath=" + this.f + ", releaseDate=" + this.f7585g + ", runtime=" + this.f7586h + ", type=" + this.f7587i + ", slug=" + this.f7588j + ", trailer=" + this.f7589k + ", infoCompleted=" + this.f7590l + ", latestSeason=" + this.f7591m + ", latestEpisode=" + this.n + ", quality=" + this.f7592o + ", imdbRating=" + this.f7593p + ", updateAt=" + this.f7594q + ", genres=" + this.f7595r + ", casts=" + this.f7596s + ", countries=" + this.f7597t + ", companies=" + this.f7598u + ", inWatchList=" + this.f7599v + ", voteResponse=" + this.f7600w + ")";
    }

    public /* synthetic */ MovieResponse(long j7, String str, String str2, Long l7, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, Integer num3, Integer num4, Integer num5, String str8, Double d, Long l8, List list, List list2, List list3, List list4, Integer num6, VoteResponse voteResponse, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, str, str2, l7, str3, str4, str5, num, num2, str6, str7, num3, num4, num5, str8, d, l8, list, (i7 & 262144) != 0 ? null : list2, (i7 & 524288) != 0 ? null : list3, (i7 & 1048576) != 0 ? null : list4, (i7 & 2097152) != 0 ? null : num6, (i7 & 4194304) != 0 ? null : voteResponse);
    }
}
