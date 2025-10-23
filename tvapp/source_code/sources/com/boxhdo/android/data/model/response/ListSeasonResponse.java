package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ListSeasonResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7562a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7563b;

    public ListSeasonResponse(@i(name = "seasons") List<SeasonResponse> list, @i(name = "continueWatch") List<ContinueWatchResponse> list2) {
        this.f7562a = list;
        this.f7563b = list2;
    }

    public final ListSeasonResponse copy(@i(name = "seasons") List<SeasonResponse> list, @i(name = "continueWatch") List<ContinueWatchResponse> list2) {
        return new ListSeasonResponse(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListSeasonResponse) {
            ListSeasonResponse listSeasonResponse = (ListSeasonResponse) obj;
            return g.a(this.f7562a, listSeasonResponse.f7562a) && g.a(this.f7563b, listSeasonResponse.f7563b);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f7562a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f7563b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ListSeasonResponse(seasons=" + this.f7562a + ", continueWatch=" + this.f7563b + ")";
    }
}
