package com.boxhdo.android.data.model.request.trakt;

import androidx.databinding.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktIdsRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f7368a;

    public TraktIdsRequest(@i(name = "tmdb") long j7) {
        this.f7368a = j7;
    }

    public final TraktIdsRequest copy(@i(name = "tmdb") long j7) {
        return new TraktIdsRequest(j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktIdsRequest) && this.f7368a == ((TraktIdsRequest) obj).f7368a;
    }

    public final int hashCode() {
        long j7 = this.f7368a;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        return "TraktIdsRequest(tmdb=" + this.f7368a + ")";
    }

    public /* synthetic */ TraktIdsRequest(long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7);
    }
}
