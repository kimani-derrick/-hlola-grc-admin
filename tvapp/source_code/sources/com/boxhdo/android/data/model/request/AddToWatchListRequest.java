package com.boxhdo.android.data.model.request;

import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class AddToWatchListRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f7305a;

    public AddToWatchListRequest(@i(name = "movie_id") long j7) {
        this.f7305a = j7;
    }

    public final AddToWatchListRequest copy(@i(name = "movie_id") long j7) {
        return new AddToWatchListRequest(j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToWatchListRequest) && this.f7305a == ((AddToWatchListRequest) obj).f7305a;
    }

    public final int hashCode() {
        long j7 = this.f7305a;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        return "AddToWatchListRequest(movieId=" + this.f7305a + ")";
    }
}
