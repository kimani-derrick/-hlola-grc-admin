package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktLoginDeviceRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7375a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7376b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7377c;

    public TraktLoginDeviceRequest(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "code") String str3) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "code");
        this.f7375a = str;
        this.f7376b = str2;
        this.f7377c = str3;
    }

    public final TraktLoginDeviceRequest copy(@i(name = "client_id") String str, @i(name = "client_secret") String str2, @i(name = "code") String str3) {
        g.f(str, "clientId");
        g.f(str2, "clientSecret");
        g.f(str3, "code");
        return new TraktLoginDeviceRequest(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktLoginDeviceRequest) {
            TraktLoginDeviceRequest traktLoginDeviceRequest = (TraktLoginDeviceRequest) obj;
            return g.a(this.f7375a, traktLoginDeviceRequest.f7375a) && g.a(this.f7376b, traktLoginDeviceRequest.f7376b) && g.a(this.f7377c, traktLoginDeviceRequest.f7377c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7377c.hashCode() + AbstractC0515y1.i(this.f7375a.hashCode() * 31, 31, this.f7376b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktLoginDeviceRequest(clientId=");
        sb.append(this.f7375a);
        sb.append(", clientSecret=");
        sb.append(this.f7376b);
        sb.append(", code=");
        return AbstractC1111a.t(sb, this.f7377c, ")");
    }
}
