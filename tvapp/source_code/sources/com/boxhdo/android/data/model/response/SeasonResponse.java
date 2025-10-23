package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class SeasonResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7639a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7640b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7641c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7642e;
    public final List f;

    public SeasonResponse(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "episode_count") Long l7, @i(name = "season_number") Integer num, @i(name = "air_date") String str2, @i(name = "episodes") List<EpisodeResponse> list) {
        this.f7639a = j7;
        this.f7640b = str;
        this.f7641c = l7;
        this.d = num;
        this.f7642e = str2;
        this.f = list;
    }

    public final SeasonResponse copy(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "episode_count") Long l7, @i(name = "season_number") Integer num, @i(name = "air_date") String str2, @i(name = "episodes") List<EpisodeResponse> list) {
        return new SeasonResponse(j7, str, l7, num, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonResponse) {
            SeasonResponse seasonResponse = (SeasonResponse) obj;
            return this.f7639a == seasonResponse.f7639a && g.a(this.f7640b, seasonResponse.f7640b) && g.a(this.f7641c, seasonResponse.f7641c) && g.a(this.d, seasonResponse.d) && g.a(this.f7642e, seasonResponse.f7642e) && g.a(this.f, seasonResponse.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j7 = this.f7639a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7640b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        Long l7 = this.f7641c;
        if (l7 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l7.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f7642e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        List list = this.f;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i12 + i8;
    }

    public final String toString() {
        return "SeasonResponse(id=" + this.f7639a + ", name=" + this.f7640b + ", episodeCount=" + this.f7641c + ", seasonNumber=" + this.d + ", airDate=" + this.f7642e + ", episodes=" + this.f + ")";
    }
}
