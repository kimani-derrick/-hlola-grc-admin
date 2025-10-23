package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ListAvatarsResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7548a;

    public ListAvatarsResponse(@i(name = "avatars") List<AvatarResponse> list) {
        this.f7548a = list;
    }

    public final ListAvatarsResponse copy(@i(name = "avatars") List<AvatarResponse> list) {
        return new ListAvatarsResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListAvatarsResponse) && g.a(this.f7548a, ((ListAvatarsResponse) obj).f7548a);
    }

    public final int hashCode() {
        List list = this.f7548a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "ListAvatarsResponse(avatars=" + this.f7548a + ")";
    }
}
