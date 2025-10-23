package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class LoginResponse {

    /* renamed from: a  reason: collision with root package name */
    public final UserResponse f7573a;

    /* renamed from: b  reason: collision with root package name */
    public final TokenDataResponse f7574b;

    public LoginResponse(@i(name = "user") UserResponse userResponse, @i(name = "tokens") TokenDataResponse tokenDataResponse) {
        g.f(userResponse, "user");
        g.f(tokenDataResponse, "tokens");
        this.f7573a = userResponse;
        this.f7574b = tokenDataResponse;
    }

    public final LoginResponse copy(@i(name = "user") UserResponse userResponse, @i(name = "tokens") TokenDataResponse tokenDataResponse) {
        g.f(userResponse, "user");
        g.f(tokenDataResponse, "tokens");
        return new LoginResponse(userResponse, tokenDataResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginResponse) {
            LoginResponse loginResponse = (LoginResponse) obj;
            return g.a(this.f7573a, loginResponse.f7573a) && g.a(this.f7574b, loginResponse.f7574b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7574b.hashCode() + (this.f7573a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginResponse(user=" + this.f7573a + ", tokens=" + this.f7574b + ")";
    }
}
