package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class SubResponse {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7664a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7665b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7666c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f7667e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7668g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7669h;

    public SubResponse(@i(name = "episode_id") Long l7, @i(name = "file_name") String str, @i(name = "id") long j7, @i(name = "is_deleted") Integer num, @i(name = "is_sync") Integer num2, @i(name = "lang") String str2, @i(name = "lang_code") String str3, @i(name = "link") String str4) {
        this.f7664a = l7;
        this.f7665b = str;
        this.f7666c = j7;
        this.d = num;
        this.f7667e = num2;
        this.f = str2;
        this.f7668g = str3;
        this.f7669h = str4;
    }

    public final SubResponse copy(@i(name = "episode_id") Long l7, @i(name = "file_name") String str, @i(name = "id") long j7, @i(name = "is_deleted") Integer num, @i(name = "is_sync") Integer num2, @i(name = "lang") String str2, @i(name = "lang_code") String str3, @i(name = "link") String str4) {
        return new SubResponse(l7, str, j7, num, num2, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubResponse) {
            SubResponse subResponse = (SubResponse) obj;
            return g.a(this.f7664a, subResponse.f7664a) && g.a(this.f7665b, subResponse.f7665b) && this.f7666c == subResponse.f7666c && g.a(this.d, subResponse.d) && g.a(this.f7667e, subResponse.f7667e) && g.a(this.f, subResponse.f) && g.a(this.f7668g, subResponse.f7668g) && g.a(this.f7669h, subResponse.f7669h);
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
        int i7 = 0;
        Long l7 = this.f7664a;
        if (l7 == null) {
            hashCode = 0;
        } else {
            hashCode = l7.hashCode();
        }
        int i8 = hashCode * 31;
        String str = this.f7665b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j7 = this.f7666c;
        int i9 = (((i8 + hashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Integer num2 = this.f7667e;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str3 = this.f7668g;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str4 = this.f7669h;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i13 + i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubResponse(episodeId=");
        sb.append(this.f7664a);
        sb.append(", fileName=");
        sb.append(this.f7665b);
        sb.append(", id=");
        sb.append(this.f7666c);
        sb.append(", isDeleted=");
        sb.append(this.d);
        sb.append(", isSync=");
        sb.append(this.f7667e);
        sb.append(", lang=");
        sb.append(this.f);
        sb.append(", langCode=");
        sb.append(this.f7668g);
        sb.append(", link=");
        return AbstractC1111a.t(sb, this.f7669h, ")");
    }
}
