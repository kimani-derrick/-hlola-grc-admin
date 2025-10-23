package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ChangePasswordRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f7308a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7309b;

    public ChangePasswordRequest(@i(name = "old_password") String str, @i(name = "new_password") String str2) {
        g.f(str, "oldPassword");
        g.f(str2, "newPassword");
        this.f7308a = str;
        this.f7309b = str2;
    }

    public final ChangePasswordRequest copy(@i(name = "old_password") String str, @i(name = "new_password") String str2) {
        g.f(str, "oldPassword");
        g.f(str2, "newPassword");
        return new ChangePasswordRequest(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangePasswordRequest) {
            ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
            return g.a(this.f7308a, changePasswordRequest.f7308a) && g.a(this.f7309b, changePasswordRequest.f7309b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7309b.hashCode() + (this.f7308a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangePasswordRequest(oldPassword=" + this.f7308a + ", newPassword=" + this.f7309b + ")";
    }
}
