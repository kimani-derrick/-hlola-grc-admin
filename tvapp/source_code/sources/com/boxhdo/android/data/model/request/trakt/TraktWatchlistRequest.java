package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktWatchlistRequest {

    /* renamed from: a  reason: collision with root package name */
    public final List f7397a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7398b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7399c;
    public final List d;

    public TraktWatchlistRequest(@i(name = "movies") List<TraktItemRequest> list, @i(name = "seasons") List<TraktItemRequest> list2, @i(name = "shows") List<TraktItemRequest> list3, @i(name = "episodes") List<TraktItemRequest> list4) {
        this.f7397a = list;
        this.f7398b = list2;
        this.f7399c = list3;
        this.d = list4;
    }

    public final TraktWatchlistRequest copy(@i(name = "movies") List<TraktItemRequest> list, @i(name = "seasons") List<TraktItemRequest> list2, @i(name = "shows") List<TraktItemRequest> list3, @i(name = "episodes") List<TraktItemRequest> list4) {
        return new TraktWatchlistRequest(list, list2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktWatchlistRequest) {
            TraktWatchlistRequest traktWatchlistRequest = (TraktWatchlistRequest) obj;
            return g.a(this.f7397a, traktWatchlistRequest.f7397a) && g.a(this.f7398b, traktWatchlistRequest.f7398b) && g.a(this.f7399c, traktWatchlistRequest.f7399c) && g.a(this.d, traktWatchlistRequest.d);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f7397a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f7398b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f7399c;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "TraktWatchlistRequest(movies=" + this.f7397a + ", seasons=" + this.f7398b + ", shows=" + this.f7399c + ", episodes=" + this.d + ")";
    }

    public /* synthetic */ TraktWatchlistRequest(List list, List list2, List list3, List list4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : list2, (i7 & 4) != 0 ? null : list3, (i7 & 8) != 0 ? null : list4);
    }
}
