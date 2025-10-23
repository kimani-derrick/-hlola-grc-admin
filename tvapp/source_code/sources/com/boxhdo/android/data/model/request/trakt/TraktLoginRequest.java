package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktLoginRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7380a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7381b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7382c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7383e;

    public TraktLoginRequest(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "code") String str3, @i(name = "grant_type") String str4, @i(name = "redirect_uri") String str5) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "code");
        g.f(str4, "grantType");
        g.f(str5, "redirectUri");
        this.f7380a = str;
        this.f7381b = str2;
        this.f7382c = str3;
        this.d = str4;
        this.f7383e = str5;
    }

    public final TraktLoginRequest copy(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "code") String str3, @i(name = "grant_type") String str4, @i(name = "redirect_uri") String str5) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "code");
        g.f(str4, "grantType");
        g.f(str5, "redirectUri");
        return new TraktLoginRequest(str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktLoginRequest) {
            TraktLoginRequest traktLoginRequest = (TraktLoginRequest) obj;
            return g.a(this.f7380a, traktLoginRequest.f7380a) && g.a(this.f7381b, traktLoginRequest.f7381b) && g.a(this.f7382c, traktLoginRequest.f7382c) && g.a(this.d, traktLoginRequest.d) && g.a(this.f7383e, traktLoginRequest.f7383e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7383e.hashCode() + AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(this.f7380a.hashCode() * 31, 31, this.f7381b), 31, this.f7382c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktLoginRequest(clientId=");
        sb.append(this.f7380a);
        sb.append(", clientSecret=");
        sb.append(this.f7381b);
        sb.append(", code=");
        sb.append(this.f7382c);
        sb.append(", grantType=");
        sb.append(this.d);
        sb.append(", redirectUri=");
        return AbstractC1111a.t(sb, this.f7383e, ")");
    }
}
