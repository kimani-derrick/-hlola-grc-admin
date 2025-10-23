package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class PageDataResponse<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f7617a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7618b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7619c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7620e;

    public PageDataResponse(@i(name = "page") Integer num, @i(name = "limit") Integer num2, @i(name = "total_pages") Integer num3, @i(name = "count") Integer num4, @i(name = "rows") List<? extends T> list) {
        this.f7617a = num;
        this.f7618b = num2;
        this.f7619c = num3;
        this.d = num4;
        this.f7620e = list;
    }

    public final PageDataResponse<T> copy(@i(name = "page") Integer num, @i(name = "limit") Integer num2, @i(name = "total_pages") Integer num3, @i(name = "count") Integer num4, @i(name = "rows") List<? extends T> list) {
        return new PageDataResponse<>(num, num2, num3, num4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PageDataResponse) {
            PageDataResponse pageDataResponse = (PageDataResponse) obj;
            return g.a(this.f7617a, pageDataResponse.f7617a) && g.a(this.f7618b, pageDataResponse.f7618b) && g.a(this.f7619c, pageDataResponse.f7619c) && g.a(this.d, pageDataResponse.d) && g.a(this.f7620e, pageDataResponse.f7620e);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f7617a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f7618b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7619c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.f7620e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PageDataResponse(page=" + this.f7617a + ", limit=" + this.f7618b + ", totalPages=" + this.f7619c + ", count=" + this.d + ", result=" + this.f7620e + ")";
    }
}
