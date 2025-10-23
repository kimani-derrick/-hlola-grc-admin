package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class UpdateUserInfoRequest {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7361b;

    public UpdateUserInfoRequest(@i(name = "avatar_id") Long l7, @i(name = "name") String str) {
        g.f(str, "name");
        this.f7360a = l7;
        this.f7361b = str;
    }

    public final UpdateUserInfoRequest copy(@i(name = "avatar_id") Long l7, @i(name = "name") String str) {
        g.f(str, "name");
        return new UpdateUserInfoRequest(l7, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateUserInfoRequest) {
            UpdateUserInfoRequest updateUserInfoRequest = (UpdateUserInfoRequest) obj;
            return g.a(this.f7360a, updateUserInfoRequest.f7360a) && g.a(this.f7361b, updateUserInfoRequest.f7361b);
        }
        return false;
    }

    public final int hashCode() {
        Long l7 = this.f7360a;
        return this.f7361b.hashCode() + ((l7 == null ? 0 : l7.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateUserInfoRequest(avatarId=" + this.f7360a + ", name=" + this.f7361b + ")";
    }
}
