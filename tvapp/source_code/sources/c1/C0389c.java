package c1;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: c1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389c {

    /* renamed from: a  reason: collision with root package name */
    public final long f7243a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7244b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7245c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7246e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7247g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7248h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7249i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7250j;

    /* renamed from: k  reason: collision with root package name */
    public final Long f7251k;

    public C0389c(long j7, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l7) {
        g.f(str, "overview");
        g.f(str2, "title");
        g.f(str3, "mediaType");
        g.f(str4, "posterUrl");
        g.f(str5, "backdropUrl");
        g.f(str6, "releaseDate");
        g.f(str7, "countries");
        g.f(str8, "genres");
        this.f7243a = j7;
        this.f7244b = j8;
        this.f7245c = str;
        this.d = str2;
        this.f7246e = str3;
        this.f = str4;
        this.f7247g = str5;
        this.f7248h = str6;
        this.f7249i = str7;
        this.f7250j = str8;
        this.f7251k = l7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0389c)) {
            return false;
        }
        C0389c c0389c = (C0389c) obj;
        if (this.f7243a == c0389c.f7243a && this.f7244b == c0389c.f7244b && g.a(this.f7245c, c0389c.f7245c) && g.a(this.d, c0389c.d) && g.a(this.f7246e, c0389c.f7246e) && g.a(this.f, c0389c.f) && g.a(this.f7247g, c0389c.f7247g) && g.a(this.f7248h, c0389c.f7248h) && g.a(this.f7249i, c0389c.f7249i) && g.a(this.f7250j, c0389c.f7250j) && g.a(this.f7251k, c0389c.f7251k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f7243a;
        long j8 = this.f7244b;
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f7245c), 31, this.d), 31, this.f7246e), 31, this.f), 31, this.f7247g), 31, this.f7248h), 31, this.f7249i), 31, this.f7250j);
        Long l7 = this.f7251k;
        if (l7 == null) {
            hashCode = 0;
        } else {
            hashCode = l7.hashCode();
        }
        return i7 + hashCode;
    }

    public final String toString() {
        return "WatchListEntity(movieId=" + this.f7243a + ", tmdbId=" + this.f7244b + ", overview=" + this.f7245c + ", title=" + this.d + ", mediaType=" + this.f7246e + ", posterUrl=" + this.f + ", backdropUrl=" + this.f7247g + ", releaseDate=" + this.f7248h + ", countries=" + this.f7249i + ", genres=" + this.f7250j + ", id=" + this.f7251k + ")";
    }
}
