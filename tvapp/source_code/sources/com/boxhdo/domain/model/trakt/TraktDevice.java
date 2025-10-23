package com.boxhdo.domain.model.trakt;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class TraktDevice {

    /* renamed from: a  reason: collision with root package name */
    public final String f8088a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8089b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8090c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8091e;

    public TraktDevice(int i7, long j7, String str, String str2, String str3) {
        this.f8088a = str;
        this.f8089b = str2;
        this.f8090c = str3;
        this.d = j7;
        this.f8091e = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktDevice) {
            TraktDevice traktDevice = (TraktDevice) obj;
            return g.a(this.f8088a, traktDevice.f8088a) && g.a(this.f8089b, traktDevice.f8089b) && g.a(this.f8090c, traktDevice.f8090c) && this.d == traktDevice.d && this.f8091e == traktDevice.f8091e;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(this.f8088a.hashCode() * 31, 31, this.f8089b), 31, this.f8090c);
        long j7 = this.d;
        return ((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f8091e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktDevice(deviceCode=");
        sb.append(this.f8088a);
        sb.append(", userCode=");
        sb.append(this.f8089b);
        sb.append(", verificationUrl=");
        sb.append(this.f8090c);
        sb.append(", expireIn=");
        sb.append(this.d);
        sb.append(", interval=");
        return AbstractC0515y1.n(sb, this.f8091e, ")");
    }
}
