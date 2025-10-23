package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class FileSizeResponse {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7505a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f7506b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7507c;
    public final Long d;

    public FileSizeResponse(@i(name = "360") Long l7, @i(name = "480") Long l8, @i(name = "720") Long l9, @i(name = "1080") Long l10) {
        this.f7505a = l7;
        this.f7506b = l8;
        this.f7507c = l9;
        this.d = l10;
    }

    public final FileSizeResponse copy(@i(name = "360") Long l7, @i(name = "480") Long l8, @i(name = "720") Long l9, @i(name = "1080") Long l10) {
        return new FileSizeResponse(l7, l8, l9, l10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileSizeResponse) {
            FileSizeResponse fileSizeResponse = (FileSizeResponse) obj;
            return g.a(this.f7505a, fileSizeResponse.f7505a) && g.a(this.f7506b, fileSizeResponse.f7506b) && g.a(this.f7507c, fileSizeResponse.f7507c) && g.a(this.d, fileSizeResponse.d);
        }
        return false;
    }

    public final int hashCode() {
        Long l7 = this.f7505a;
        int hashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l8 = this.f7506b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.f7507c;
        int hashCode3 = (hashCode2 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.d;
        return hashCode3 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "FileSizeResponse(x360=" + this.f7505a + ", x480=" + this.f7506b + ", x720=" + this.f7507c + ", x1080=" + this.d + ")";
    }
}
