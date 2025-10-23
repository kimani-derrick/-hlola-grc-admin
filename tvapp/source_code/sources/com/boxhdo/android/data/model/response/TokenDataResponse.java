package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TokenDataResponse {

    /* renamed from: a  reason: collision with root package name */
    public final TokenResponse f7680a;

    /* renamed from: b  reason: collision with root package name */
    public final TokenResponse f7681b;

    public TokenDataResponse(@i(name = "access") TokenResponse tokenResponse, @i(name = "refresh") TokenResponse tokenResponse2) {
        g.f(tokenResponse, "accessToken");
        g.f(tokenResponse2, "refreshToken");
        this.f7680a = tokenResponse;
        this.f7681b = tokenResponse2;
    }

    public final TokenDataResponse copy(@i(name = "access") TokenResponse tokenResponse, @i(name = "refresh") TokenResponse tokenResponse2) {
        g.f(tokenResponse, "accessToken");
        g.f(tokenResponse2, "refreshToken");
        return new TokenDataResponse(tokenResponse, tokenResponse2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenDataResponse) {
            TokenDataResponse tokenDataResponse = (TokenDataResponse) obj;
            return g.a(this.f7680a, tokenDataResponse.f7680a) && g.a(this.f7681b, tokenDataResponse.f7681b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7681b.hashCode() + (this.f7680a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenDataResponse(accessToken=" + this.f7680a + ", refreshToken=" + this.f7681b + ")";
    }
}
