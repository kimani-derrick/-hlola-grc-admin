package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class RegisterRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7340a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7341b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7342c;

    public RegisterRequest(@i(name = "email") String str, @i(name = "name") String str2, @i(name = "password") String str3) {
        g.f(str, "email");
        g.f(str2, "name");
        g.f(str3, "password");
        this.f7340a = str;
        this.f7341b = str2;
        this.f7342c = str3;
    }

    public final RegisterRequest copy(@i(name = "email") String str, @i(name = "name") String str2, @i(name = "password") String str3) {
        g.f(str, "email");
        g.f(str2, "name");
        g.f(str3, "password");
        return new RegisterRequest(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterRequest) {
            RegisterRequest registerRequest = (RegisterRequest) obj;
            return g.a(this.f7340a, registerRequest.f7340a) && g.a(this.f7341b, registerRequest.f7341b) && g.a(this.f7342c, registerRequest.f7342c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7342c.hashCode() + AbstractC0515y1.i(this.f7340a.hashCode() * 31, 31, this.f7341b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterRequest(email=");
        sb.append(this.f7340a);
        sb.append(", name=");
        sb.append(this.f7341b);
        sb.append(", password=");
        return AbstractC1111a.t(sb, this.f7342c, ")");
    }
}
