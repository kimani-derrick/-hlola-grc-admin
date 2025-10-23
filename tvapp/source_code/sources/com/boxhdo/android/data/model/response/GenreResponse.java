package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class GenreResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7519a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7520b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7521c;
    public final Integer d;

    public GenreResponse(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "slug") String str2, @i(name = "is_popular") Integer num) {
        this.f7519a = j7;
        this.f7520b = str;
        this.f7521c = str2;
        this.d = num;
    }

    public final GenreResponse copy(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "slug") String str2, @i(name = "is_popular") Integer num) {
        return new GenreResponse(j7, str, str2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenreResponse) {
            GenreResponse genreResponse = (GenreResponse) obj;
            return this.f7519a == genreResponse.f7519a && g.a(this.f7520b, genreResponse.f7520b) && g.a(this.f7521c, genreResponse.f7521c) && g.a(this.d, genreResponse.d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j7 = this.f7519a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7520b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7521c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.d;
        if (num != null) {
            i8 = num.hashCode();
        }
        return i10 + i8;
    }

    public final String toString() {
        return "GenreResponse(id=" + this.f7519a + ", name=" + this.f7520b + ", slug=" + this.f7521c + ", isPopular=" + this.d + ")";
    }
}
