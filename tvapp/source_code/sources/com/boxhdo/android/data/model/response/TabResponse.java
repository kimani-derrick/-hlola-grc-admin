package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TabResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7674a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7675b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7676c;

    public TabResponse(@i(name = "id") String str, @i(name = "title") String str2, @i(name = "data") List<MovieResponse> list) {
        this.f7674a = str;
        this.f7675b = str2;
        this.f7676c = list;
    }

    public final TabResponse copy(@i(name = "id") String str, @i(name = "title") String str2, @i(name = "data") List<MovieResponse> list) {
        return new TabResponse(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabResponse) {
            TabResponse tabResponse = (TabResponse) obj;
            return g.a(this.f7674a, tabResponse.f7674a) && g.a(this.f7675b, tabResponse.f7675b) && g.a(this.f7676c, tabResponse.f7676c);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7674a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7675b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f7676c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TabResponse(id=" + this.f7674a + ", title=" + this.f7675b + ", data=" + this.f7676c + ")";
    }
}
