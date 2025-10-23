package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class SyncRequest {

    /* renamed from: a  reason: collision with root package name */
    public final int f7354a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7355b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7356c;
    public final String d;

    public SyncRequest(@i(name = "is_logged") int i7, @i(name = "device_unique_id") String str, @i(name = "fcm_token") String str2, @i(name = "platform") String str3) {
        g.f(str, "deviceUniqueId");
        g.f(str2, "fcmToken");
        g.f(str3, "platform");
        this.f7354a = i7;
        this.f7355b = str;
        this.f7356c = str2;
        this.d = str3;
    }

    public final SyncRequest copy(@i(name = "is_logged") int i7, @i(name = "device_unique_id") String str, @i(name = "fcm_token") String str2, @i(name = "platform") String str3) {
        g.f(str, "deviceUniqueId");
        g.f(str2, "fcmToken");
        g.f(str3, "platform");
        return new SyncRequest(i7, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SyncRequest) {
            SyncRequest syncRequest = (SyncRequest) obj;
            return this.f7354a == syncRequest.f7354a && g.a(this.f7355b, syncRequest.f7355b) && g.a(this.f7356c, syncRequest.f7356c) && g.a(this.d, syncRequest.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC0515y1.i(AbstractC0515y1.i(this.f7354a * 31, 31, this.f7355b), 31, this.f7356c);
    }

    public final String toString() {
        return "SyncRequest(isLogged=" + this.f7354a + ", deviceUniqueId=" + this.f7355b + ", fcmToken=" + this.f7356c + ", platform=" + this.d + ")";
    }
}
