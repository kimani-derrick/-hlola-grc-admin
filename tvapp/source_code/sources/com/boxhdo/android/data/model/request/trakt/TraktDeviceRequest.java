package com.boxhdo.android.data.model.request.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktDeviceRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7365a;

    public TraktDeviceRequest(@i(name = "client_id") String str) {
        g.f(str, "clientId");
        this.f7365a = str;
    }

    public final TraktDeviceRequest copy(@i(name = "client_id") String str) {
        g.f(str, "clientId");
        return new TraktDeviceRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktDeviceRequest) && g.a(this.f7365a, ((TraktDeviceRequest) obj).f7365a);
    }

    public final int hashCode() {
        return this.f7365a.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("TraktDeviceRequest(clientId="), this.f7365a, ")");
    }
}
