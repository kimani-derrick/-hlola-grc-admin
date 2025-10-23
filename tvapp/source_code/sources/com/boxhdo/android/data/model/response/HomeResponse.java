package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class HomeResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7525a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7526b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7527c;
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7528e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final List f7529g;

    /* renamed from: h  reason: collision with root package name */
    public final List f7530h;

    /* renamed from: i  reason: collision with root package name */
    public final List f7531i;

    /* renamed from: j  reason: collision with root package name */
    public final List f7532j;

    public HomeResponse(@i(name = "id") String str, @i(name = "type") Integer num, @i(name = "title") String str2, @i(name = "shortcut") List<ShortcutResponse> list, @i(name = "slide") List<MovieResponse> list2, @i(name = "filter") List<FilterResponse> list3, @i(name = "data") List<MovieResponse> list4, @i(name = "tabs") List<TabResponse> list5, @i(name = "continue-watch") List<ContinueWatchResponse> list6, @i(name = "list") List<NetworkResponse> list7) {
        this.f7525a = str;
        this.f7526b = num;
        this.f7527c = str2;
        this.d = list;
        this.f7528e = list2;
        this.f = list3;
        this.f7529g = list4;
        this.f7530h = list5;
        this.f7531i = list6;
        this.f7532j = list7;
    }

    public final HomeResponse copy(@i(name = "id") String str, @i(name = "type") Integer num, @i(name = "title") String str2, @i(name = "shortcut") List<ShortcutResponse> list, @i(name = "slide") List<MovieResponse> list2, @i(name = "filter") List<FilterResponse> list3, @i(name = "data") List<MovieResponse> list4, @i(name = "tabs") List<TabResponse> list5, @i(name = "continue-watch") List<ContinueWatchResponse> list6, @i(name = "list") List<NetworkResponse> list7) {
        return new HomeResponse(str, num, str2, list, list2, list3, list4, list5, list6, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeResponse) {
            HomeResponse homeResponse = (HomeResponse) obj;
            return g.a(this.f7525a, homeResponse.f7525a) && g.a(this.f7526b, homeResponse.f7526b) && g.a(this.f7527c, homeResponse.f7527c) && g.a(this.d, homeResponse.d) && g.a(this.f7528e, homeResponse.f7528e) && g.a(this.f, homeResponse.f) && g.a(this.f7529g, homeResponse.f7529g) && g.a(this.f7530h, homeResponse.f7530h) && g.a(this.f7531i, homeResponse.f7531i) && g.a(this.f7532j, homeResponse.f7532j);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7525a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f7526b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f7527c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f7528e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f7529g;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f7530h;
        int hashCode8 = (hashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f7531i;
        int hashCode9 = (hashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f7532j;
        return hashCode9 + (list7 != null ? list7.hashCode() : 0);
    }

    public final String toString() {
        return "HomeResponse(id=" + this.f7525a + ", type=" + this.f7526b + ", title=" + this.f7527c + ", shortcut=" + this.d + ", slide=" + this.f7528e + ", filter=" + this.f + ", data=" + this.f7529g + ", tabs=" + this.f7530h + ", continueWatch=" + this.f7531i + ", networks=" + this.f7532j + ")";
    }
}
