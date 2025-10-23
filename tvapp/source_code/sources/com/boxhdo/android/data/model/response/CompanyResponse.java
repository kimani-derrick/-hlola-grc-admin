package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class CompanyResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7425a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7426b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7427c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7428e;
    public final String f;

    public CompanyResponse(@i(name = "id") long j7, @i(name = "logo_path") String str, @i(name = "logo_url") String str2, @i(name = "name") String str3, @i(name = "origin_country") String str4, @i(name = "slug") String str5) {
        this.f7425a = j7;
        this.f7426b = str;
        this.f7427c = str2;
        this.d = str3;
        this.f7428e = str4;
        this.f = str5;
    }

    public final CompanyResponse copy(@i(name = "id") long j7, @i(name = "logo_path") String str, @i(name = "logo_url") String str2, @i(name = "name") String str3, @i(name = "origin_country") String str4, @i(name = "slug") String str5) {
        return new CompanyResponse(j7, str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompanyResponse) {
            CompanyResponse companyResponse = (CompanyResponse) obj;
            return this.f7425a == companyResponse.f7425a && g.a(this.f7426b, companyResponse.f7426b) && g.a(this.f7427c, companyResponse.f7427c) && g.a(this.d, companyResponse.d) && g.a(this.f7428e, companyResponse.f7428e) && g.a(this.f, companyResponse.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j7 = this.f7425a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7426b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7427c;
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
        String str4 = this.f7428e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompanyResponse(id=");
        sb.append(this.f7425a);
        sb.append(", logoPath=");
        sb.append(this.f7426b);
        sb.append(", logoUrl=");
        sb.append(this.f7427c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", country=");
        sb.append(this.f7428e);
        sb.append(", slug=");
        return AbstractC1111a.t(sb, this.f, ")");
    }
}
