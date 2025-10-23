package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktMovie {

    /* renamed from: a  reason: collision with root package name */
    public final TraktIds f7735a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7736b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7737c;

    public TraktMovie(@i(name = "ids") TraktIds traktIds, @i(name = "title") String str, @i(name = "year") Integer num) {
        this.f7735a = traktIds;
        this.f7736b = str;
        this.f7737c = num;
    }

    public final TraktMovie copy(@i(name = "ids") TraktIds traktIds, @i(name = "title") String str, @i(name = "year") Integer num) {
        return new TraktMovie(traktIds, str, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktMovie) {
            TraktMovie traktMovie = (TraktMovie) obj;
            return g.a(this.f7735a, traktMovie.f7735a) && g.a(this.f7736b, traktMovie.f7736b) && g.a(this.f7737c, traktMovie.f7737c);
        }
        return false;
    }

    public final int hashCode() {
        TraktIds traktIds = this.f7735a;
        int hashCode = (traktIds == null ? 0 : traktIds.hashCode()) * 31;
        String str = this.f7736b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f7737c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TraktMovie(ids=" + this.f7735a + ", title=" + this.f7736b + ", year=" + this.f7737c + ")";
    }
}
