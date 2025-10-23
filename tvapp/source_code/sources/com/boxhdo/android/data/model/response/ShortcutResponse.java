package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ShortcutResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7647a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7648b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7649c;

    public ShortcutResponse(@i(name = "id") String str, @i(name = "title") String str2, @i(name = "filter") List<FilterResponse> list) {
        this.f7647a = str;
        this.f7648b = str2;
        this.f7649c = list;
    }

    public final ShortcutResponse copy(@i(name = "id") String str, @i(name = "title") String str2, @i(name = "filter") List<FilterResponse> list) {
        return new ShortcutResponse(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShortcutResponse) {
            ShortcutResponse shortcutResponse = (ShortcutResponse) obj;
            return g.a(this.f7647a, shortcutResponse.f7647a) && g.a(this.f7648b, shortcutResponse.f7648b) && g.a(this.f7649c, shortcutResponse.f7649c);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7647a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7648b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f7649c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ShortcutResponse(id=" + this.f7647a + ", title=" + this.f7648b + ", filter=" + this.f7649c + ")";
    }
}
