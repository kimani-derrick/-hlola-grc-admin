package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class UserResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7696a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7697b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7698c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7699e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final AvatarResponse f7700g;

    public UserResponse(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "email") String str2, @i(name = "status") int i7, @i(name = "country") String str3, @i(name = "is_email_verified") int i8, @i(name = "avatar") AvatarResponse avatarResponse) {
        g.f(str, "name");
        g.f(str2, "email");
        this.f7696a = j7;
        this.f7697b = str;
        this.f7698c = str2;
        this.d = i7;
        this.f7699e = str3;
        this.f = i8;
        this.f7700g = avatarResponse;
    }

    public final UserResponse copy(@i(name = "id") long j7, @i(name = "name") String str, @i(name = "email") String str2, @i(name = "status") int i7, @i(name = "country") String str3, @i(name = "is_email_verified") int i8, @i(name = "avatar") AvatarResponse avatarResponse) {
        g.f(str, "name");
        g.f(str2, "email");
        return new UserResponse(j7, str, str2, i7, str3, i8, avatarResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserResponse) {
            UserResponse userResponse = (UserResponse) obj;
            return this.f7696a == userResponse.f7696a && g.a(this.f7697b, userResponse.f7697b) && g.a(this.f7698c, userResponse.f7698c) && this.d == userResponse.d && g.a(this.f7699e, userResponse.f7699e) && this.f == userResponse.f && g.a(this.f7700g, userResponse.f7700g);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f7696a;
        int i7 = (AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7697b), 31, this.f7698c) + this.d) * 31;
        int i8 = 0;
        String str = this.f7699e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (((i7 + hashCode) * 31) + this.f) * 31;
        AvatarResponse avatarResponse = this.f7700g;
        if (avatarResponse != null) {
            i8 = avatarResponse.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        return "UserResponse(id=" + this.f7696a + ", name=" + this.f7697b + ", email=" + this.f7698c + ", status=" + this.d + ", country=" + this.f7699e + ", isEmailVerified=" + this.f + ", avatar=" + this.f7700g + ")";
    }
}
