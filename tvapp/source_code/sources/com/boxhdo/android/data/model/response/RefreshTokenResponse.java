package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class RefreshTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    public final TokenDataResponse f7633a;

    public RefreshTokenResponse(@i(name = "tokens") TokenDataResponse tokenDataResponse) {
        g.f(tokenDataResponse, "tokens");
        this.f7633a = tokenDataResponse;
    }

    public final RefreshTokenResponse copy(@i(name = "tokens") TokenDataResponse tokenDataResponse) {
        g.f(tokenDataResponse, "tokens");
        return new RefreshTokenResponse(tokenDataResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshTokenResponse) && g.a(this.f7633a, ((RefreshTokenResponse) obj).f7633a);
    }

    public final int hashCode() {
        return this.f7633a.hashCode();
    }

    public final String toString() {
        return "RefreshTokenResponse(tokens=" + this.f7633a + ")";
    }
}
