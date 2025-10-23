package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class LoginCodeResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7570a;

    public LoginCodeResponse(@i(name = "code") String str) {
        this.f7570a = str;
    }

    public final LoginCodeResponse copy(@i(name = "code") String str) {
        return new LoginCodeResponse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginCodeResponse) && g.a(this.f7570a, ((LoginCodeResponse) obj).f7570a);
    }

    public final int hashCode() {
        String str = this.f7570a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("LoginCodeResponse(code="), this.f7570a, ")");
    }
}
