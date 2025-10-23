package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktIds {

    /* renamed from: a  reason: collision with root package name */
    public final String f7722a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7723b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7724c;
    public final Long d;

    public TraktIds(@i(name = "imdb") String str, @i(name = "slug") String str2, @i(name = "tmdb") Long l7, @i(name = "trakt") Long l8) {
        this.f7722a = str;
        this.f7723b = str2;
        this.f7724c = l7;
        this.d = l8;
    }

    public final TraktIds copy(@i(name = "imdb") String str, @i(name = "slug") String str2, @i(name = "tmdb") Long l7, @i(name = "trakt") Long l8) {
        return new TraktIds(str, str2, l7, l8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktIds) {
            TraktIds traktIds = (TraktIds) obj;
            return g.a(this.f7722a, traktIds.f7722a) && g.a(this.f7723b, traktIds.f7723b) && g.a(this.f7724c, traktIds.f7724c) && g.a(this.d, traktIds.d);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7722a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7723b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l7 = this.f7724c;
        int hashCode3 = (hashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.d;
        return hashCode3 + (l8 != null ? l8.hashCode() : 0);
    }

    public final String toString() {
        return "TraktIds(imdb=" + this.f7722a + ", slug=" + this.f7723b + ", tmdb=" + this.f7724c + ", trakt=" + this.d + ")";
    }
}
