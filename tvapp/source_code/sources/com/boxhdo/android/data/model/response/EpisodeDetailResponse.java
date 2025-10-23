package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class EpisodeDetailResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7465a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7466b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7467c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7468e;
    public final Integer f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f7469g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f7470h;

    /* renamed from: i  reason: collision with root package name */
    public final Double f7471i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7472j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7473k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f7474l;

    /* renamed from: m  reason: collision with root package name */
    public final String f7475m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final Integer f7476o;

    /* renamed from: p  reason: collision with root package name */
    public final Long f7477p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f7478q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7479r;

    /* renamed from: s  reason: collision with root package name */
    public final FileSizeResponse f7480s;

    /* renamed from: t  reason: collision with root package name */
    public final StreamingResponse f7481t;

    /* renamed from: u  reason: collision with root package name */
    public final Integer f7482u;

    /* renamed from: v  reason: collision with root package name */
    public final List f7483v;

    public EpisodeDetailResponse(@i(name = "air_date") String str, @i(name = "audio_status") Integer num, @i(name = "episode_number") Integer num2, @i(name = "file_version") Integer num3, @i(name = "id") long j7, @i(name = "is_fullhd") Integer num4, @i(name = "is_include_sub") Integer num5, @i(name = "is_sub_extracted") Integer num6, @i(name = "mark") Double d, @i(name = "movie_id") long j8, @i(name = "name") String str2, @i(name = "original_quality") Integer num7, @i(name = "overview") String str3, @i(name = "preview_path") String str4, @i(name = "preview_status") Integer num8, @i(name = "season_id") Long l7, @i(name = "status_release") Integer num9, @i(name = "still_path") String str5, @i(name = "file_size") FileSizeResponse fileSizeResponse, @i(name = "streaming") StreamingResponse streamingResponse, @i(name = "sub_type") Integer num10, @i(name = "subs") List<SubResponse> list) {
        this.f7465a = str;
        this.f7466b = num;
        this.f7467c = num2;
        this.d = num3;
        this.f7468e = j7;
        this.f = num4;
        this.f7469g = num5;
        this.f7470h = num6;
        this.f7471i = d;
        this.f7472j = j8;
        this.f7473k = str2;
        this.f7474l = num7;
        this.f7475m = str3;
        this.n = str4;
        this.f7476o = num8;
        this.f7477p = l7;
        this.f7478q = num9;
        this.f7479r = str5;
        this.f7480s = fileSizeResponse;
        this.f7481t = streamingResponse;
        this.f7482u = num10;
        this.f7483v = list;
    }

    public final EpisodeDetailResponse copy(@i(name = "air_date") String str, @i(name = "audio_status") Integer num, @i(name = "episode_number") Integer num2, @i(name = "file_version") Integer num3, @i(name = "id") long j7, @i(name = "is_fullhd") Integer num4, @i(name = "is_include_sub") Integer num5, @i(name = "is_sub_extracted") Integer num6, @i(name = "mark") Double d, @i(name = "movie_id") long j8, @i(name = "name") String str2, @i(name = "original_quality") Integer num7, @i(name = "overview") String str3, @i(name = "preview_path") String str4, @i(name = "preview_status") Integer num8, @i(name = "season_id") Long l7, @i(name = "status_release") Integer num9, @i(name = "still_path") String str5, @i(name = "file_size") FileSizeResponse fileSizeResponse, @i(name = "streaming") StreamingResponse streamingResponse, @i(name = "sub_type") Integer num10, @i(name = "subs") List<SubResponse> list) {
        return new EpisodeDetailResponse(str, num, num2, num3, j7, num4, num5, num6, d, j8, str2, num7, str3, str4, num8, l7, num9, str5, fileSizeResponse, streamingResponse, num10, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EpisodeDetailResponse) {
            EpisodeDetailResponse episodeDetailResponse = (EpisodeDetailResponse) obj;
            return g.a(this.f7465a, episodeDetailResponse.f7465a) && g.a(this.f7466b, episodeDetailResponse.f7466b) && g.a(this.f7467c, episodeDetailResponse.f7467c) && g.a(this.d, episodeDetailResponse.d) && this.f7468e == episodeDetailResponse.f7468e && g.a(this.f, episodeDetailResponse.f) && g.a(this.f7469g, episodeDetailResponse.f7469g) && g.a(this.f7470h, episodeDetailResponse.f7470h) && g.a(this.f7471i, episodeDetailResponse.f7471i) && this.f7472j == episodeDetailResponse.f7472j && g.a(this.f7473k, episodeDetailResponse.f7473k) && g.a(this.f7474l, episodeDetailResponse.f7474l) && g.a(this.f7475m, episodeDetailResponse.f7475m) && g.a(this.n, episodeDetailResponse.n) && g.a(this.f7476o, episodeDetailResponse.f7476o) && g.a(this.f7477p, episodeDetailResponse.f7477p) && g.a(this.f7478q, episodeDetailResponse.f7478q) && g.a(this.f7479r, episodeDetailResponse.f7479r) && g.a(this.f7480s, episodeDetailResponse.f7480s) && g.a(this.f7481t, episodeDetailResponse.f7481t) && g.a(this.f7482u, episodeDetailResponse.f7482u) && g.a(this.f7483v, episodeDetailResponse.f7483v);
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int i7 = 0;
        String str = this.f7465a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = hashCode * 31;
        Integer num = this.f7466b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Integer num2 = this.f7467c;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Integer num3 = this.d;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        long j7 = this.f7468e;
        int i11 = (((i10 + hashCode4) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        Integer num4 = this.f;
        if (num4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num4.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        Integer num5 = this.f7469g;
        if (num5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num5.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Integer num6 = this.f7470h;
        if (num6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num6.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Double d = this.f7471i;
        if (d == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = d.hashCode();
        }
        long j8 = this.f7472j;
        int i15 = (((i14 + hashCode8) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        String str2 = this.f7473k;
        if (str2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str2.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        Integer num7 = this.f7474l;
        if (num7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num7.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        String str3 = this.f7475m;
        if (str3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str3.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        String str4 = this.n;
        if (str4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str4.hashCode();
        }
        int i19 = (i18 + hashCode12) * 31;
        Integer num8 = this.f7476o;
        if (num8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num8.hashCode();
        }
        int i20 = (i19 + hashCode13) * 31;
        Long l7 = this.f7477p;
        if (l7 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l7.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        Integer num9 = this.f7478q;
        if (num9 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num9.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        String str5 = this.f7479r;
        if (str5 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str5.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        FileSizeResponse fileSizeResponse = this.f7480s;
        if (fileSizeResponse == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = fileSizeResponse.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        StreamingResponse streamingResponse = this.f7481t;
        if (streamingResponse == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = streamingResponse.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        Integer num10 = this.f7482u;
        if (num10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num10.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        List list = this.f7483v;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i26 + i7;
    }

    public final String toString() {
        return "EpisodeDetailResponse(airDate=" + this.f7465a + ", audioStatus=" + this.f7466b + ", episodeNumber=" + this.f7467c + ", fileVersion=" + this.d + ", id=" + this.f7468e + ", isFullhd=" + this.f + ", isIncludeSub=" + this.f7469g + ", isSubExtracted=" + this.f7470h + ", mark=" + this.f7471i + ", movieId=" + this.f7472j + ", name=" + this.f7473k + ", originalQuality=" + this.f7474l + ", overview=" + this.f7475m + ", previewPath=" + this.n + ", previewStatus=" + this.f7476o + ", seasonId=" + this.f7477p + ", statusRelease=" + this.f7478q + ", stillPath=" + this.f7479r + ", fileSize=" + this.f7480s + ", streaming=" + this.f7481t + ", subType=" + this.f7482u + ", subs=" + this.f7483v + ")";
    }
}
