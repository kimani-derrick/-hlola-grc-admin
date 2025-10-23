package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class GenreListResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7514a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7515b;

    public GenreListResponse(@i(name = "genres") List<GenreResponse> list, @i(name = "countries") List<CountryResponse> list2) {
        this.f7514a = list;
        this.f7515b = list2;
    }

    public final GenreListResponse copy(@i(name = "genres") List<GenreResponse> list, @i(name = "countries") List<CountryResponse> list2) {
        return new GenreListResponse(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenreListResponse) {
            GenreListResponse genreListResponse = (GenreListResponse) obj;
            return g.a(this.f7514a, genreListResponse.f7514a) && g.a(this.f7515b, genreListResponse.f7515b);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f7514a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f7515b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "GenreListResponse(genres=" + this.f7514a + ", countries=" + this.f7515b + ")";
    }
}
