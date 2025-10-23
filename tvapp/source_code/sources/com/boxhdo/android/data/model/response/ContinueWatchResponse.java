package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ContinueWatchResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7438a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f7439b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7440c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f7441e;
    public final Integer f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f7442g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f7443h;

    /* renamed from: i  reason: collision with root package name */
    public final Double f7444i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f7445j;

    /* renamed from: k  reason: collision with root package name */
    public final Long f7446k;

    /* renamed from: l  reason: collision with root package name */
    public final MovieResponse f7447l;

    public ContinueWatchResponse(@i(name = "id") long j7, @i(name = "user_id") Long l7, @i(name = "movie_id") Long l8, @i(name = "season_id") Long l9, @i(name = "episode_id") Long l10, @i(name = "season_number") Integer num, @i(name = "episode_number") Integer num2, @i(name = "time") Long l11, @i(name = "percent") Double d, @i(name = "status") Integer num3, @i(name = "updated_at") Long l12, @i(name = "movie") MovieResponse movieResponse) {
        this.f7438a = j7;
        this.f7439b = l7;
        this.f7440c = l8;
        this.d = l9;
        this.f7441e = l10;
        this.f = num;
        this.f7442g = num2;
        this.f7443h = l11;
        this.f7444i = d;
        this.f7445j = num3;
        this.f7446k = l12;
        this.f7447l = movieResponse;
    }

    public final ContinueWatchResponse copy(@i(name = "id") long j7, @i(name = "user_id") Long l7, @i(name = "movie_id") Long l8, @i(name = "season_id") Long l9, @i(name = "episode_id") Long l10, @i(name = "season_number") Integer num, @i(name = "episode_number") Integer num2, @i(name = "time") Long l11, @i(name = "percent") Double d, @i(name = "status") Integer num3, @i(name = "updated_at") Long l12, @i(name = "movie") MovieResponse movieResponse) {
        return new ContinueWatchResponse(j7, l7, l8, l9, l10, num, num2, l11, d, num3, l12, movieResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContinueWatchResponse) {
            ContinueWatchResponse continueWatchResponse = (ContinueWatchResponse) obj;
            return this.f7438a == continueWatchResponse.f7438a && g.a(this.f7439b, continueWatchResponse.f7439b) && g.a(this.f7440c, continueWatchResponse.f7440c) && g.a(this.d, continueWatchResponse.d) && g.a(this.f7441e, continueWatchResponse.f7441e) && g.a(this.f, continueWatchResponse.f) && g.a(this.f7442g, continueWatchResponse.f7442g) && g.a(this.f7443h, continueWatchResponse.f7443h) && g.a(this.f7444i, continueWatchResponse.f7444i) && g.a(this.f7445j, continueWatchResponse.f7445j) && g.a(this.f7446k, continueWatchResponse.f7446k) && g.a(this.f7447l, continueWatchResponse.f7447l);
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
        long j7 = this.f7438a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        Long l7 = this.f7439b;
        if (l7 == null) {
            hashCode = 0;
        } else {
            hashCode = l7.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        Long l8 = this.f7440c;
        if (l8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l8.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l9 = this.d;
        if (l9 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l9.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Long l10 = this.f7441e;
        if (l10 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l10.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Integer num = this.f;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Integer num2 = this.f7442g;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Long l11 = this.f7443h;
        if (l11 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l11.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Double d = this.f7444i;
        if (d == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = d.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Integer num3 = this.f7445j;
        if (num3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num3.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Long l12 = this.f7446k;
        if (l12 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l12.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        MovieResponse movieResponse = this.f7447l;
        if (movieResponse != null) {
            i8 = movieResponse.hashCode();
        }
        return i18 + i8;
    }

    public final String toString() {
        return "ContinueWatchResponse(id=" + this.f7438a + ", userId=" + this.f7439b + ", movieId=" + this.f7440c + ", seasonId=" + this.d + ", episodeId=" + this.f7441e + ", seasonNumber=" + this.f + ", episodeNumber=" + this.f7442g + ", time=" + this.f7443h + ", percent=" + this.f7444i + ", status=" + this.f7445j + ", updatedAt=" + this.f7446k + ", movie=" + this.f7447l + ")";
    }
}
