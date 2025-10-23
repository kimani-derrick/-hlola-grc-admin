package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktItemRequest {

    /* renamed from: a  reason: collision with root package name */
    public final TraktIdsRequest f7372a;

    public TraktItemRequest(@i(name = "ids") TraktIdsRequest traktIdsRequest) {
        g.f(traktIdsRequest, "ids");
        this.f7372a = traktIdsRequest;
    }

    public final TraktItemRequest copy(@i(name = "ids") TraktIdsRequest traktIdsRequest) {
        g.f(traktIdsRequest, "ids");
        return new TraktItemRequest(traktIdsRequest);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktItemRequest) && g.a(this.f7372a, ((TraktItemRequest) obj).f7372a);
    }

    public final int hashCode() {
        return this.f7372a.hashCode();
    }

    public final String toString() {
        return "TraktItemRequest(ids=" + this.f7372a + ")";
    }
}
