package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class NetworkResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7611a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7612b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7613c;

    public NetworkResponse(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "logo_path") String str2) {
        this.f7611a = j7;
        this.f7612b = str;
        this.f7613c = str2;
    }

    public final NetworkResponse copy(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "logo_path") String str2) {
        return new NetworkResponse(j7, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkResponse) {
            NetworkResponse networkResponse = (NetworkResponse) obj;
            return this.f7611a == networkResponse.f7611a && g.a(this.f7612b, networkResponse.f7612b) && g.a(this.f7613c, networkResponse.f7613c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f7611a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7612b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7613c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(id=");
        sb.append(this.f7611a);
        sb.append(", name=");
        sb.append(this.f7612b);
        sb.append(", logoPath=");
        return AbstractC1111a.t(sb, this.f7613c, ")");
    }
}
