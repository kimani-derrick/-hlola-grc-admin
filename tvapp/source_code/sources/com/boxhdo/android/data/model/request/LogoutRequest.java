package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class LogoutRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7329a;

    public LogoutRequest(@i(name = "refreshToken") String str) {
        g.f(str, "refreshToken");
        this.f7329a = str;
    }

    public final LogoutRequest copy(@i(name = "refreshToken") String str) {
        g.f(str, "refreshToken");
        return new LogoutRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogoutRequest) && g.a(this.f7329a, ((LogoutRequest) obj).f7329a);
    }

    public final int hashCode() {
        return this.f7329a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("LogoutRequest(refreshToken="), this.f7329a, ")");
    }
}
