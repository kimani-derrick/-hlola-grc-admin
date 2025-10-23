package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class FilterResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7510a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7511b;

    public FilterResponse(@i(name = "id") String str, @i(name = "title") String str2) {
        this.f7510a = str;
        this.f7511b = str2;
    }

    public final FilterResponse copy(@i(name = "id") String str, @i(name = "title") String str2) {
        return new FilterResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterResponse) {
            FilterResponse filterResponse = (FilterResponse) obj;
            return g.a(this.f7510a, filterResponse.f7510a) && g.a(this.f7511b, filterResponse.f7511b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7510a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7511b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FilterResponse(id=" + this.f7510a + ", title=" + this.f7511b + ")";
    }
}
