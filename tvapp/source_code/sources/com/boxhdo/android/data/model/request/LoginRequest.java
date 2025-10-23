package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class LoginRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7320a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7321b;

    public LoginRequest(@i(name = "email") String str, @i(name = "password") String str2) {
        g.f(str, "email");
        g.f(str2, "password");
        this.f7320a = str;
        this.f7321b = str2;
    }

    public final LoginRequest copy(@i(name = "email") String str, @i(name = "password") String str2) {
        g.f(str, "email");
        g.f(str2, "password");
        return new LoginRequest(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginRequest) {
            LoginRequest loginRequest = (LoginRequest) obj;
            return g.a(this.f7320a, loginRequest.f7320a) && g.a(this.f7321b, loginRequest.f7321b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7321b.hashCode() + (this.f7320a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginRequest(email=" + this.f7320a + ", password=" + this.f7321b + ")";
    }
}
