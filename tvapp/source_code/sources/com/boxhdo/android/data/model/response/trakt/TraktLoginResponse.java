package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktLoginResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7728a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f7729b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7730c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7731e;
    public final String f;

    public TraktLoginResponse(@i(name = "access_token") String str, @i(name = "created_at") Long l7, @i(name = "expires_in") Long l8, @i(name = "refresh_token") String str2, @i(name = "scope") String str3, @i(name = "token_type") String str4) {
        this.f7728a = str;
        this.f7729b = l7;
        this.f7730c = l8;
        this.d = str2;
        this.f7731e = str3;
        this.f = str4;
    }

    public final TraktLoginResponse copy(@i(name = "access_token") String str, @i(name = "created_at") Long l7, @i(name = "expires_in") Long l8, @i(name = "refresh_token") String str2, @i(name = "scope") String str3, @i(name = "token_type") String str4) {
        return new TraktLoginResponse(str, l7, l8, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktLoginResponse) {
            TraktLoginResponse traktLoginResponse = (TraktLoginResponse) obj;
            return g.a(this.f7728a, traktLoginResponse.f7728a) && g.a(this.f7729b, traktLoginResponse.f7729b) && g.a(this.f7730c, traktLoginResponse.f7730c) && g.a(this.d, traktLoginResponse.d) && g.a(this.f7731e, traktLoginResponse.f7731e) && g.a(this.f, traktLoginResponse.f);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7728a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l7 = this.f7729b;
        int hashCode2 = (hashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.f7730c;
        int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7731e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "TraktLoginResponse(accessToken=" + this.f7728a + ", createdAt=" + this.f7729b + ", expiresIn=" + this.f7730c + ", refreshToken=" + this.d + ", scope=" + this.f7731e + ", tokenType=" + this.f + ")";
    }
}
