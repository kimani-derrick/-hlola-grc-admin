package c1;

import M5.g;
/* renamed from: c1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387a {

    /* renamed from: a  reason: collision with root package name */
    public final long f7225a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7226b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7227c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7228e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final Float f7229g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7230h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f7231i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f7232j;

    /* renamed from: k  reason: collision with root package name */
    public final Long f7233k;

    /* renamed from: l  reason: collision with root package name */
    public final Float f7234l;

    /* renamed from: m  reason: collision with root package name */
    public final Long f7235m;

    public C0387a(long j7, String str, String str2, String str3, String str4, String str5, Float f, long j8, Long l7, Long l8, Long l9, Float f7, Long l10) {
        this.f7225a = j7;
        this.f7226b = str;
        this.f7227c = str2;
        this.d = str3;
        this.f7228e = str4;
        this.f = str5;
        this.f7229g = f;
        this.f7230h = j8;
        this.f7231i = l7;
        this.f7232j = l8;
        this.f7233k = l9;
        this.f7234l = f7;
        this.f7235m = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0387a)) {
            return false;
        }
        C0387a c0387a = (C0387a) obj;
        if (this.f7225a == c0387a.f7225a && g.a(this.f7226b, c0387a.f7226b) && g.a(this.f7227c, c0387a.f7227c) && g.a(this.d, c0387a.d) && g.a(this.f7228e, c0387a.f7228e) && g.a(this.f, c0387a.f) && g.a(this.f7229g, c0387a.f7229g) && this.f7230h == c0387a.f7230h && g.a(this.f7231i, c0387a.f7231i) && g.a(this.f7232j, c0387a.f7232j) && g.a(this.f7233k, c0387a.f7233k) && g.a(this.f7234l, c0387a.f7234l) && g.a(this.f7235m, c0387a.f7235m)) {
            return true;
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
        int hashCode8;
        int hashCode9;
        int hashCode10;
        long j7 = this.f7225a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7226b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7227c;
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
        String str4 = this.f7228e;
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
        Float f = this.f7229g;
        if (f == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f.hashCode();
        }
        long j8 = this.f7230h;
        int i14 = (((i13 + hashCode6) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        Long l7 = this.f7231i;
        if (l7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Long l8 = this.f7232j;
        if (l8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Long l9 = this.f7233k;
        if (l9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Float f7 = this.f7234l;
        if (f7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = f7.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Long l10 = this.f7235m;
        if (l10 != null) {
            i8 = l10.hashCode();
        }
        return i18 + i8;
    }

    public final String toString() {
        return "ContinueWatchEntity(movieId=" + this.f7225a + ", movieName=" + this.f7226b + ", posterPath=" + this.f7227c + ", backdropPath=" + this.d + ", overview=" + this.f7228e + ", releaseDate=" + this.f + ", rating=" + this.f7229g + ", episodeId=" + this.f7230h + ", seasonNumber=" + this.f7231i + ", episodeNumber=" + this.f7232j + ", time=" + this.f7233k + ", percent=" + this.f7234l + ", tmdbId=" + this.f7235m + ")";
    }
}
