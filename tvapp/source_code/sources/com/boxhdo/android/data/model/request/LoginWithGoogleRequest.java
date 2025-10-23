package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class LoginWithGoogleRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7324a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7325b;

    public LoginWithGoogleRequest(@i(name = "token") String str, @i(name = "provider") String str2) {
        g.f(str, "idToken");
        g.f(str2, "provider");
        this.f7324a = str;
        this.f7325b = str2;
    }

    public final LoginWithGoogleRequest copy(@i(name = "token") String str, @i(name = "provider") String str2) {
        g.f(str, "idToken");
        g.f(str2, "provider");
        return new LoginWithGoogleRequest(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginWithGoogleRequest) {
            LoginWithGoogleRequest loginWithGoogleRequest = (LoginWithGoogleRequest) obj;
            return g.a(this.f7324a, loginWithGoogleRequest.f7324a) && g.a(this.f7325b, loginWithGoogleRequest.f7325b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7325b.hashCode() + (this.f7324a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginWithGoogleRequest(idToken=" + this.f7324a + ", provider=" + this.f7325b + ")";
    }

    public /* synthetic */ LoginWithGoogleRequest(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? "google" : str2);
    }
}
