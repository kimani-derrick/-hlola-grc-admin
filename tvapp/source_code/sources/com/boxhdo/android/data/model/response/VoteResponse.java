package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class VoteResponse {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7710a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f7711b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7712c;

    public VoteResponse(@i(name = "movieId") Long l7, @i(name = "count") Long l8, @i(name = "totalScore") Long l9) {
        this.f7710a = l7;
        this.f7711b = l8;
        this.f7712c = l9;
    }

    public final VoteResponse copy(@i(name = "movieId") Long l7, @i(name = "count") Long l8, @i(name = "totalScore") Long l9) {
        return new VoteResponse(l7, l8, l9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VoteResponse) {
            VoteResponse voteResponse = (VoteResponse) obj;
            return g.a(this.f7710a, voteResponse.f7710a) && g.a(this.f7711b, voteResponse.f7711b) && g.a(this.f7712c, voteResponse.f7712c);
        }
        return false;
    }

    public final int hashCode() {
        Long l7 = this.f7710a;
        int hashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l8 = this.f7711b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.f7712c;
        return hashCode2 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return "VoteResponse(movieId=" + this.f7710a + ", count=" + this.f7711b + ", totalScore=" + this.f7712c + ")";
    }
}
