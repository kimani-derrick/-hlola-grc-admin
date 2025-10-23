package com.boxhdo.android.data.model.response.trakt;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TraktDeviceCodeResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7715a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7716b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7717c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f7718e;

    public TraktDeviceCodeResponse(@i(name = "device_code") String str, @i(name = "user_code") String str2, @i(name = "verification_url") String str3, @i(name = "expire_in") Long l7, @i(name = "scope") Integer num) {
        this.f7715a = str;
        this.f7716b = str2;
        this.f7717c = str3;
        this.d = l7;
        this.f7718e = num;
    }

    public final TraktDeviceCodeResponse copy(@i(name = "device_code") String str, @i(name = "user_code") String str2, @i(name = "verification_url") String str3, @i(name = "expire_in") Long l7, @i(name = "scope") Integer num) {
        return new TraktDeviceCodeResponse(str, str2, str3, l7, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktDeviceCodeResponse) {
            TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) obj;
            return g.a(this.f7715a, traktDeviceCodeResponse.f7715a) && g.a(this.f7716b, traktDeviceCodeResponse.f7716b) && g.a(this.f7717c, traktDeviceCodeResponse.f7717c) && g.a(this.d, traktDeviceCodeResponse.d) && g.a(this.f7718e, traktDeviceCodeResponse.f7718e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7715a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7716b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7717c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l7 = this.d;
        int hashCode4 = (hashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num = this.f7718e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TraktDeviceCodeResponse(deviceCode=" + this.f7715a + ", userCode=" + this.f7716b + ", verificationUrl=" + this.f7717c + ", expireIn=" + this.d + ", interval=" + this.f7718e + ")";
    }
}
