package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class LatestVersionResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7540a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7541b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7542c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7543e;
    public final Integer f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f7544g;

    public LatestVersionResponse(@i(name = "id") long j7, @i(name = "version") String str, @i(name = "version_code") Integer num, @i(name = "change_log") String str2, @i(name = "link_download") String str3, @i(name = "force_updated") Integer num2, @i(name = "status") Integer num3) {
        this.f7540a = j7;
        this.f7541b = str;
        this.f7542c = num;
        this.d = str2;
        this.f7543e = str3;
        this.f = num2;
        this.f7544g = num3;
    }

    public final LatestVersionResponse copy(@i(name = "id") long j7, @i(name = "version") String str, @i(name = "version_code") Integer num, @i(name = "change_log") String str2, @i(name = "link_download") String str3, @i(name = "force_updated") Integer num2, @i(name = "status") Integer num3) {
        return new LatestVersionResponse(j7, str, num, str2, str3, num2, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatestVersionResponse) {
            LatestVersionResponse latestVersionResponse = (LatestVersionResponse) obj;
            return this.f7540a == latestVersionResponse.f7540a && g.a(this.f7541b, latestVersionResponse.f7541b) && g.a(this.f7542c, latestVersionResponse.f7542c) && g.a(this.d, latestVersionResponse.d) && g.a(this.f7543e, latestVersionResponse.f7543e) && g.a(this.f, latestVersionResponse.f) && g.a(this.f7544g, latestVersionResponse.f7544g);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        long j7 = this.f7540a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7541b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        Integer num = this.f7542c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.f7543e;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Integer num2 = this.f;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Integer num3 = this.f7544g;
        if (num3 != null) {
            i8 = num3.hashCode();
        }
        return i13 + i8;
    }

    public final String toString() {
        return "LatestVersionResponse(id=" + this.f7540a + ", version=" + this.f7541b + ", versionCode=" + this.f7542c + ", changeLog=" + this.d + ", linkDownload=" + this.f7543e + ", forceUpdate=" + this.f + ", status=" + this.f7544g + ")";
    }
}
