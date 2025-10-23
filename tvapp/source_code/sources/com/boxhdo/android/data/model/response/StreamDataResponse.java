package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class StreamDataResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7653a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7654b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7655c;

    public StreamDataResponse(@i(name = "quality") String str, @i(name = "type") String str2, @i(name = "url") String str3) {
        this.f7653a = str;
        this.f7654b = str2;
        this.f7655c = str3;
    }

    public final StreamDataResponse copy(@i(name = "quality") String str, @i(name = "type") String str2, @i(name = "url") String str3) {
        return new StreamDataResponse(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreamDataResponse) {
            StreamDataResponse streamDataResponse = (StreamDataResponse) obj;
            return g.a(this.f7653a, streamDataResponse.f7653a) && g.a(this.f7654b, streamDataResponse.f7654b) && g.a(this.f7655c, streamDataResponse.f7655c);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7653a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7654b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7655c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamDataResponse(quality=");
        sb.append(this.f7653a);
        sb.append(", type=");
        sb.append(this.f7654b);
        sb.append(", url=");
        return AbstractC1111a.t(sb, this.f7655c, ")");
    }
}
