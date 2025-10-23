package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class AvatarResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7410b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7411c;

    public AvatarResponse(@i(name = "id") long j7, @i(name = "url") String str, @i(name = "path") String str2) {
        this.f7409a = j7;
        this.f7410b = str;
        this.f7411c = str2;
    }

    public final AvatarResponse copy(@i(name = "id") long j7, @i(name = "url") String str, @i(name = "path") String str2) {
        return new AvatarResponse(j7, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarResponse) {
            AvatarResponse avatarResponse = (AvatarResponse) obj;
            return this.f7409a == avatarResponse.f7409a && g.a(this.f7410b, avatarResponse.f7410b) && g.a(this.f7411c, avatarResponse.f7411c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f7409a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7410b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7411c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarResponse(id=");
        sb.append(this.f7409a);
        sb.append(", url=");
        sb.append(this.f7410b);
        sb.append(", path=");
        return AbstractC1111a.t(sb, this.f7411c, ")");
    }
}
