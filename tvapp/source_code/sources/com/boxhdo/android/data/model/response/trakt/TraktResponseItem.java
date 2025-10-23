package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktResponseItem {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7748a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7749b;

    /* renamed from: c  reason: collision with root package name */
    public final TraktMovie f7750c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final TraktSeason f7751e;
    public final TraktShow f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7752g;

    public TraktResponseItem(@i(name = "id") Long l7, @i(name = "listed_at") String str, @i(name = "movie") TraktMovie traktMovie, @i(name = "rank") Integer num, @i(name = "season") TraktSeason traktSeason, @i(name = "show") TraktShow traktShow, @i(name = "type") String str2) {
        this.f7748a = l7;
        this.f7749b = str;
        this.f7750c = traktMovie;
        this.d = num;
        this.f7751e = traktSeason;
        this.f = traktShow;
        this.f7752g = str2;
    }

    public final TraktResponseItem copy(@i(name = "id") Long l7, @i(name = "listed_at") String str, @i(name = "movie") TraktMovie traktMovie, @i(name = "rank") Integer num, @i(name = "season") TraktSeason traktSeason, @i(name = "show") TraktShow traktShow, @i(name = "type") String str2) {
        return new TraktResponseItem(l7, str, traktMovie, num, traktSeason, traktShow, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktResponseItem) {
            TraktResponseItem traktResponseItem = (TraktResponseItem) obj;
            return g.a(this.f7748a, traktResponseItem.f7748a) && g.a(this.f7749b, traktResponseItem.f7749b) && g.a(this.f7750c, traktResponseItem.f7750c) && g.a(this.d, traktResponseItem.d) && g.a(this.f7751e, traktResponseItem.f7751e) && g.a(this.f, traktResponseItem.f) && g.a(this.f7752g, traktResponseItem.f7752g);
        }
        return false;
    }

    public final int hashCode() {
        Long l7 = this.f7748a;
        int hashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        String str = this.f7749b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TraktMovie traktMovie = this.f7750c;
        int hashCode3 = (hashCode2 + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        TraktSeason traktSeason = this.f7751e;
        int hashCode5 = (hashCode4 + (traktSeason == null ? 0 : traktSeason.hashCode())) * 31;
        TraktShow traktShow = this.f;
        int hashCode6 = (hashCode5 + (traktShow == null ? 0 : traktShow.hashCode())) * 31;
        String str2 = this.f7752g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktResponseItem(id=");
        sb.append(this.f7748a);
        sb.append(", listedAt=");
        sb.append(this.f7749b);
        sb.append(", movie=");
        sb.append(this.f7750c);
        sb.append(", rank=");
        sb.append(this.d);
        sb.append(", season=");
        sb.append(this.f7751e);
        sb.append(", show=");
        sb.append(this.f);
        sb.append(", type=");
        return AbstractC1111a.t(sb, this.f7752g, ")");
    }
}
