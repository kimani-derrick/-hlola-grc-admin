package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class MovieListResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7578a;

    public MovieListResponse(@i(name = "movies") List<MovieResponse> list) {
        this.f7578a = list;
    }

    public final MovieListResponse copy(@i(name = "movies") List<MovieResponse> list) {
        return new MovieListResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieListResponse) && g.a(this.f7578a, ((MovieListResponse) obj).f7578a);
    }

    public final int hashCode() {
        List list = this.f7578a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "MovieListResponse(movies=" + this.f7578a + ")";
    }
}
