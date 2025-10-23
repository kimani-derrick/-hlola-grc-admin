package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktSeason {

    /* renamed from: a  reason: collision with root package name */
    public final TraktIds f7758a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7759b;

    public TraktSeason(@i(name = "ids") TraktIds traktIds, @i(name = "number") Integer num) {
        this.f7758a = traktIds;
        this.f7759b = num;
    }

    public final TraktSeason copy(@i(name = "ids") TraktIds traktIds, @i(name = "number") Integer num) {
        return new TraktSeason(traktIds, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktSeason) {
            TraktSeason traktSeason = (TraktSeason) obj;
            return g.a(this.f7758a, traktSeason.f7758a) && g.a(this.f7759b, traktSeason.f7759b);
        }
        return false;
    }

    public final int hashCode() {
        TraktIds traktIds = this.f7758a;
        int hashCode = (traktIds == null ? 0 : traktIds.hashCode()) * 31;
        Integer num = this.f7759b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TraktSeason(ids=" + this.f7758a + ", number=" + this.f7759b + ")";
    }
}
