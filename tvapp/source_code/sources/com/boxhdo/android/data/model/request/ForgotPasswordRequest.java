package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ForgotPasswordRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7317a;

    public ForgotPasswordRequest(@i(name = "email") String str) {
        g.f(str, "email");
        this.f7317a = str;
    }

    public final ForgotPasswordRequest copy(@i(name = "email") String str) {
        g.f(str, "email");
        return new ForgotPasswordRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForgotPasswordRequest) && g.a(this.f7317a, ((ForgotPasswordRequest) obj).f7317a);
    }

    public final int hashCode() {
        return this.f7317a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("ForgotPasswordRequest(email="), this.f7317a, ")");
    }
}
