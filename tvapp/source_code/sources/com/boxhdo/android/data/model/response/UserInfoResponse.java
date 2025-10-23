package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class UserInfoResponse {

    /* renamed from: a  reason: collision with root package name */
    public final UserResponse f7693a;

    public UserInfoResponse(@i(name = "user") UserResponse userResponse) {
        g.f(userResponse, "user");
        this.f7693a = userResponse;
    }

    public final UserInfoResponse copy(@i(name = "user") UserResponse userResponse) {
        g.f(userResponse, "user");
        return new UserInfoResponse(userResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserInfoResponse) && g.a(this.f7693a, ((UserInfoResponse) obj).f7693a);
    }

    public final int hashCode() {
        return this.f7693a.hashCode();
    }

    public final String toString() {
        return "UserInfoResponse(user=" + this.f7693a + ")";
    }
}
