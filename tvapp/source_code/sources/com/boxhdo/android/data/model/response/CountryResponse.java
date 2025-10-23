package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class CountryResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7452a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7453b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7454c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f7455e;

    public CountryResponse(@i(name = "id") long j7, @i(name = "iso_3166_1") String str, @i(name = "english_name") String str2, @i(name = "slug") String str3, @i(name = "publish") Integer num) {
        this.f7452a = j7;
        this.f7453b = str;
        this.f7454c = str2;
        this.d = str3;
        this.f7455e = num;
    }

    public final CountryResponse copy(@i(name = "id") long j7, @i(name = "iso_3166_1") String str, @i(name = "english_name") String str2, @i(name = "slug") String str3, @i(name = "publish") Integer num) {
        return new CountryResponse(j7, str, str2, str3, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountryResponse) {
            CountryResponse countryResponse = (CountryResponse) obj;
            return this.f7452a == countryResponse.f7452a && g.a(this.f7453b, countryResponse.f7453b) && g.a(this.f7454c, countryResponse.f7454c) && g.a(this.d, countryResponse.d) && g.a(this.f7455e, countryResponse.f7455e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j7 = this.f7452a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7453b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7454c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num = this.f7455e;
        if (num != null) {
            i8 = num.hashCode();
        }
        return i11 + i8;
    }

    public final String toString() {
        return "CountryResponse(id=" + this.f7452a + ", iso=" + this.f7453b + ", name=" + this.f7454c + ", slug=" + this.d + ", publish=" + this.f7455e + ")";
    }
}
