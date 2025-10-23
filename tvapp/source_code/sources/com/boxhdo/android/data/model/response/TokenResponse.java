package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TokenResponse {

    /* renamed from: a  reason: collision with root package name */
    public String f7684a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7685b;

    public TokenResponse(@i(name = "token") String str, @i(name = "expires") String str2) {
        g.f(str, "token");
        g.f(str2, "expires");
        this.f7684a = str;
        this.f7685b = str2;
    }

    public final TokenResponse copy(@i(name = "token") String str, @i(name = "expires") String str2) {
        g.f(str, "token");
        g.f(str2, "expires");
        return new TokenResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenResponse) {
            TokenResponse tokenResponse = (TokenResponse) obj;
            return g.a(this.f7684a, tokenResponse.f7684a) && g.a(this.f7685b, tokenResponse.f7685b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7685b.hashCode() + (this.f7684a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f7684a;
        return "TokenResponse(token=" + str + ", expires=" + this.f7685b + ")";
    }
}
