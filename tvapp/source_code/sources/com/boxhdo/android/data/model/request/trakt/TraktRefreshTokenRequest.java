package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktRefreshTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7391a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7392b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7393c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7394e;

    public TraktRefreshTokenRequest(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "refresh_token") String str3, @i(name = "grant_type") String str4, @i(name = "redirect_uri") String str5) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "refreshToken");
        g.f(str4, "grantType");
        g.f(str5, "redirectUri");
        this.f7391a = str;
        this.f7392b = str2;
        this.f7393c = str3;
        this.d = str4;
        this.f7394e = str5;
    }

    public final TraktRefreshTokenRequest copy(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "refresh_token") String str3, @i(name = "grant_type") String str4, @i(name = "redirect_uri") String str5) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "refreshToken");
        g.f(str4, "grantType");
        g.f(str5, "redirectUri");
        return new TraktRefreshTokenRequest(str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktRefreshTokenRequest) {
            TraktRefreshTokenRequest traktRefreshTokenRequest = (TraktRefreshTokenRequest) obj;
            return g.a(this.f7391a, traktRefreshTokenRequest.f7391a) && g.a(this.f7392b, traktRefreshTokenRequest.f7392b) && g.a(this.f7393c, traktRefreshTokenRequest.f7393c) && g.a(this.d, traktRefreshTokenRequest.d) && g.a(this.f7394e, traktRefreshTokenRequest.f7394e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7394e.hashCode() + AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(this.f7391a.hashCode() * 31, 31, this.f7392b), 31, this.f7393c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktRefreshTokenRequest(clientId=");
        sb.append(this.f7391a);
        sb.append(", clientSecret=");
        sb.append(this.f7392b);
        sb.append(", refreshToken=");
        sb.append(this.f7393c);
        sb.append(", grantType=");
        sb.append(this.d);
        sb.append(", redirectUri=");
        return AbstractC1111a.t(sb, this.f7394e, ")");
    }
}
