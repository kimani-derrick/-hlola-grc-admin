package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktLogoutRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7386a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7387b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7388c;

    public TraktLogoutRequest(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "token") String str3) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "token");
        this.f7386a = str;
        this.f7387b = str2;
        this.f7388c = str3;
    }

    public final TraktLogoutRequest copy(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "token") String str3) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "token");
        return new TraktLogoutRequest(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktLogoutRequest) {
            TraktLogoutRequest traktLogoutRequest = (TraktLogoutRequest) obj;
            return g.a(this.f7386a, traktLogoutRequest.f7386a) && g.a(this.f7387b, traktLogoutRequest.f7387b) && g.a(this.f7388c, traktLogoutRequest.f7388c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7388c.hashCode() + AbstractC0515y1.i(this.f7386a.hashCode() * 31, 31, this.f7387b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktLogoutRequest(clientId=");
        sb.append(this.f7386a);
        sb.append(", clientSecret=");
        sb.append(this.f7387b);
        sb.append(", token=");
        return AbstractC1111a.t(sb, this.f7388c, ")");
    }
}
