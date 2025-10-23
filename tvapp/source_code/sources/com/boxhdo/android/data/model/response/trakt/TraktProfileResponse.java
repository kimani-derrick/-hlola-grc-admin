package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktProfileResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7741a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f7742b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7743c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7744e;
    public final Boolean f;

    public TraktProfileResponse(@i(name = "name") String str, @i(name = "private") Boolean bool, @i(name = "username") String str2, @i(name = "vip") Boolean bool2, @i(name = "location") String str3, @i(name = "vip_ep") Boolean bool3) {
        this.f7741a = str;
        this.f7742b = bool;
        this.f7743c = str2;
        this.d = bool2;
        this.f7744e = str3;
        this.f = bool3;
    }

    public final TraktProfileResponse copy(@i(name = "name") String str, @i(name = "private") Boolean bool, @i(name = "username") String str2, @i(name = "vip") Boolean bool2, @i(name = "location") String str3, @i(name = "vip_ep") Boolean bool3) {
        return new TraktProfileResponse(str, bool, str2, bool2, str3, bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktProfileResponse) {
            TraktProfileResponse traktProfileResponse = (TraktProfileResponse) obj;
            return g.a(this.f7741a, traktProfileResponse.f7741a) && g.a(this.f7742b, traktProfileResponse.f7742b) && g.a(this.f7743c, traktProfileResponse.f7743c) && g.a(this.d, traktProfileResponse.d) && g.a(this.f7744e, traktProfileResponse.f7744e) && g.a(this.f, traktProfileResponse.f);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7741a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f7742b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f7743c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.d;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f7744e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.f;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "TraktProfileResponse(name=" + this.f7741a + ", isPrivate=" + this.f7742b + ", username=" + this.f7743c + ", isVip=" + this.d + ", location=" + this.f7744e + ", vipEp=" + this.f + ")";
    }
}
