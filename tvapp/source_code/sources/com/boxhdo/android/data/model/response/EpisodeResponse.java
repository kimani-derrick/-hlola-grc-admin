package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class EpisodeResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7491a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f7492b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7493c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7494e;
    public final Long f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7495g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f7496h;

    public EpisodeResponse(@i(name = "id") long j7, @i(name = "movie_id") Long l7, @i(name = "still_path") String str, @i(name = "season_id") Long l8, @i(name = "name") String str2, @i(name = "episode_number") Long l9, @i(name = "air_date") String str3, @i(name = "runtime") Integer num) {
        this.f7491a = j7;
        this.f7492b = l7;
        this.f7493c = str;
        this.d = l8;
        this.f7494e = str2;
        this.f = l9;
        this.f7495g = str3;
        this.f7496h = num;
    }

    public final EpisodeResponse copy(@i(name = "id") long j7, @i(name = "movie_id") Long l7, @i(name = "still_path") String str, @i(name = "season_id") Long l8, @i(name = "name") String str2, @i(name = "episode_number") Long l9, @i(name = "air_date") String str3, @i(name = "runtime") Integer num) {
        return new EpisodeResponse(j7, l7, str, l8, str2, l9, str3, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EpisodeResponse) {
            EpisodeResponse episodeResponse = (EpisodeResponse) obj;
            return this.f7491a == episodeResponse.f7491a && g.a(this.f7492b, episodeResponse.f7492b) && g.a(this.f7493c, episodeResponse.f7493c) && g.a(this.d, episodeResponse.d) && g.a(this.f7494e, episodeResponse.f7494e) && g.a(this.f, episodeResponse.f) && g.a(this.f7495g, episodeResponse.f7495g) && g.a(this.f7496h, episodeResponse.f7496h);
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
        long j7 = this.f7491a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        Long l7 = this.f7492b;
        if (l7 == null) {
            hashCode = 0;
        } else {
            hashCode = l7.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str = this.f7493c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l8 = this.d;
        if (l8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l8.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f7494e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l9 = this.f;
        if (l9 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l9.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str3 = this.f7495g;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Integer num = this.f7496h;
        if (num != null) {
            i8 = num.hashCode();
        }
        return i14 + i8;
    }

    public final String toString() {
        return "EpisodeResponse(id=" + this.f7491a + ", movieId=" + this.f7492b + ", stillPath=" + this.f7493c + ", seasonId=" + this.d + ", name=" + this.f7494e + ", episodeNumber=" + this.f + ", airDate=" + this.f7495g + ", runtime=" + this.f7496h + ")";
    }
}
