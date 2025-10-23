package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class RefreshTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7337a;

    public RefreshTokenRequest(@i(name = "refreshToken") String str) {
        g.f(str, "refreshToken");
        this.f7337a = str;
    }

    public final RefreshTokenRequest copy(@i(name = "refreshToken") String str) {
        g.f(str, "refreshToken");
        return new RefreshTokenRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshTokenRequest) && g.a(this.f7337a, ((RefreshTokenRequest) obj).f7337a);
    }

    public final int hashCode() {
        return this.f7337a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("RefreshTokenRequest(refreshToken="), this.f7337a, ")");
    }
}
