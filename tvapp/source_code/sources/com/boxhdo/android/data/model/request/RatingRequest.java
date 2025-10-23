package com.boxhdo.android.data.model.request;

import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class RatingRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f7332a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7333b;

    public RatingRequest(@i(name = "movie_id") long j7, @i(name = "vote") int i7) {
        this.f7332a = j7;
        this.f7333b = i7;
    }

    public final RatingRequest copy(@i(name = "movie_id") long j7, @i(name = "vote") int i7) {
        return new RatingRequest(j7, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RatingRequest) {
            RatingRequest ratingRequest = (RatingRequest) obj;
            return this.f7332a == ratingRequest.f7332a && this.f7333b == ratingRequest.f7333b;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7332a;
        return (((int) (j7 ^ (j7 >>> 32))) * 31) + this.f7333b;
    }

    public final String toString() {
        return "RatingRequest(movieId=" + this.f7332a + ", vote=" + this.f7333b + ")";
    }
}
