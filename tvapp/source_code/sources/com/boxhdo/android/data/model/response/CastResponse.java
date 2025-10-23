package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class CastResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7415a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7416b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7417c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7418e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7419g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7420h;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f7421i;

    public CastResponse(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "profile_path") String str2, @i(name = "slug") String str3, @i(name = "birthday") String str4, @i(name = "deathday") String str5, @i(name = "biography") String str6, @i(name = "place_of_birth") String str7, @i(name = "total_movies") Integer num) {
        this.f7415a = j7;
        this.f7416b = str;
        this.f7417c = str2;
        this.d = str3;
        this.f7418e = str4;
        this.f = str5;
        this.f7419g = str6;
        this.f7420h = str7;
        this.f7421i = num;
    }

    public final CastResponse copy(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "profile_path") String str2, @i(name = "slug") String str3, @i(name = "birthday") String str4, @i(name = "deathday") String str5, @i(name = "biography") String str6, @i(name = "place_of_birth") String str7, @i(name = "total_movies") Integer num) {
        return new CastResponse(j7, str, str2, str3, str4, str5, str6, str7, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CastResponse) {
            CastResponse castResponse = (CastResponse) obj;
            return this.f7415a == castResponse.f7415a && g.a(this.f7416b, castResponse.f7416b) && g.a(this.f7417c, castResponse.f7417c) && g.a(this.d, castResponse.d) && g.a(this.f7418e, castResponse.f7418e) && g.a(this.f, castResponse.f) && g.a(this.f7419g, castResponse.f7419g) && g.a(this.f7420h, castResponse.f7420h) && g.a(this.f7421i, castResponse.f7421i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        long j7 = this.f7415a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7416b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7417c;
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
        String str4 = this.f7418e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f7419g;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f7420h;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Integer num = this.f7421i;
        if (num != null) {
            i8 = num.hashCode();
        }
        return i15 + i8;
    }

    public final String toString() {
        return "CastResponse(id=" + this.f7415a + ", name=" + this.f7416b + ", profilePath=" + this.f7417c + ", slug=" + this.d + ", birthday=" + this.f7418e + ", deathday=" + this.f + ", biography=" + this.f7419g + ", placeOfBirth=" + this.f7420h + ", totalMovies=" + this.f7421i + ")";
    }
}
