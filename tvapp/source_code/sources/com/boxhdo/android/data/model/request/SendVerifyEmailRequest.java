package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class SendVerifyEmailRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7351a;

    public SendVerifyEmailRequest(@i(name = "email") String str) {
        g.f(str, "email");
        this.f7351a = str;
    }

    public final SendVerifyEmailRequest copy(@i(name = "email") String str) {
        g.f(str, "email");
        return new SendVerifyEmailRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendVerifyEmailRequest) && g.a(this.f7351a, ((SendVerifyEmailRequest) obj).f7351a);
    }

    public final int hashCode() {
        return this.f7351a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("SendVerifyEmailRequest(email="), this.f7351a, ")");
    }
}
