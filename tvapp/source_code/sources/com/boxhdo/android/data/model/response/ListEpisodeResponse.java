package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ListEpisodeResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7551a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7552b;

    public ListEpisodeResponse(@i(name = "episodes") List<EpisodeResponse> list, @i(name = "continueWatch") List<ContinueWatchResponse> list2) {
        this.f7551a = list;
        this.f7552b = list2;
    }

    public final ListEpisodeResponse copy(@i(name = "episodes") List<EpisodeResponse> list, @i(name = "continueWatch") List<ContinueWatchResponse> list2) {
        return new ListEpisodeResponse(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListEpisodeResponse) {
            ListEpisodeResponse listEpisodeResponse = (ListEpisodeResponse) obj;
            return g.a(this.f7551a, listEpisodeResponse.f7551a) && g.a(this.f7552b, listEpisodeResponse.f7552b);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f7551a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f7552b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ListEpisodeResponse(episodes=" + this.f7551a + ", continueWatch=" + this.f7552b + ")";
    }
}
