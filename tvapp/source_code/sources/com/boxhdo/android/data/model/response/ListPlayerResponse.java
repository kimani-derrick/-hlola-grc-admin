package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ListPlayerResponse {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f7556a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7557b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7558c;
    public final List d;

    public ListPlayerResponse(@i(name = "allowed") Boolean bool, @i(name = "percent_show") Integer num, @i(name = "force") Integer num2, @i(name = "players") List<PlayerResponse> list) {
        this.f7556a = bool;
        this.f7557b = num;
        this.f7558c = num2;
        this.d = list;
    }

    public final ListPlayerResponse copy(@i(name = "allowed") Boolean bool, @i(name = "percent_show") Integer num, @i(name = "force") Integer num2, @i(name = "players") List<PlayerResponse> list) {
        return new ListPlayerResponse(bool, num, num2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListPlayerResponse) {
            ListPlayerResponse listPlayerResponse = (ListPlayerResponse) obj;
            return g.a(this.f7556a, listPlayerResponse.f7556a) && g.a(this.f7557b, listPlayerResponse.f7557b) && g.a(this.f7558c, listPlayerResponse.f7558c) && g.a(this.d, listPlayerResponse.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f7556a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f7557b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7558c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ListPlayerResponse(allowed=" + this.f7556a + ", percentShow=" + this.f7557b + ", force=" + this.f7558c + ", players=" + this.d + ")";
    }
}
