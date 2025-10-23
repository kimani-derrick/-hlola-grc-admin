package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class PlayerResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7624a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7625b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7626c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f7627e;
    public final Integer f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7628g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7629h;

    public PlayerResponse(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "logo_path") String str2, @i(name = "is_free") Integer num, @i(name = "is_recommended") Integer num2, @i(name = "star") Integer num3, @i(name = "link_download") String str3, @i(name = "deeplink") String str4) {
        this.f7624a = j7;
        this.f7625b = str;
        this.f7626c = str2;
        this.d = num;
        this.f7627e = num2;
        this.f = num3;
        this.f7628g = str3;
        this.f7629h = str4;
    }

    public final PlayerResponse copy(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "logo_path") String str2, @i(name = "is_free") Integer num, @i(name = "is_recommended") Integer num2, @i(name = "star") Integer num3, @i(name = "link_download") String str3, @i(name = "deeplink") String str4) {
        return new PlayerResponse(j7, str, str2, num, num2, num3, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayerResponse) {
            PlayerResponse playerResponse = (PlayerResponse) obj;
            return this.f7624a == playerResponse.f7624a && g.a(this.f7625b, playerResponse.f7625b) && g.a(this.f7626c, playerResponse.f7626c) && g.a(this.d, playerResponse.d) && g.a(this.f7627e, playerResponse.f7627e) && g.a(this.f, playerResponse.f) && g.a(this.f7628g, playerResponse.f7628g) && g.a(this.f7629h, playerResponse.f7629h);
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
        long j7 = this.f7624a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7625b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7626c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.f7627e;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Integer num3 = this.f;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str3 = this.f7628g;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str4 = this.f7629h;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i14 + i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerResponse(id=");
        sb.append(this.f7624a);
        sb.append(", name=");
        sb.append(this.f7625b);
        sb.append(", logoPath=");
        sb.append(this.f7626c);
        sb.append(", isFree=");
        sb.append(this.d);
        sb.append(", isRecommended=");
        sb.append(this.f7627e);
        sb.append(", star=");
        sb.append(this.f);
        sb.append(", linkDownLoad=");
        sb.append(this.f7628g);
        sb.append(", deepLink=");
        return AbstractC1111a.t(sb, this.f7629h, ")");
    }
}
