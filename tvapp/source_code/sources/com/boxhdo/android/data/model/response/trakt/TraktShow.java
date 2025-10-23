package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktShow {

    /* renamed from: a  reason: collision with root package name */
    public final TraktIds f7763a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7764b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7765c;

    public TraktShow(@i(name = "ids") TraktIds traktIds, @i(name = "title") String str, @i(name = "year") Integer num) {
        this.f7763a = traktIds;
        this.f7764b = str;
        this.f7765c = num;
    }

    public final TraktShow copy(@i(name = "ids") TraktIds traktIds, @i(name = "title") String str, @i(name = "year") Integer num) {
        return new TraktShow(traktIds, str, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktShow) {
            TraktShow traktShow = (TraktShow) obj;
            return g.a(this.f7763a, traktShow.f7763a) && g.a(this.f7764b, traktShow.f7764b) && g.a(this.f7765c, traktShow.f7765c);
        }
        return false;
    }

    public final int hashCode() {
        TraktIds traktIds = this.f7763a;
        int hashCode = (traktIds == null ? 0 : traktIds.hashCode()) * 31;
        String str = this.f7764b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f7765c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TraktShow(ids=" + this.f7763a + ", title=" + this.f7764b + ", year=" + this.f7765c + ")";
    }
}
