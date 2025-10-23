package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class DownloaderResponse {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f7459a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7460b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7461c;

    public DownloaderResponse(@i(name = "allow") Integer num, @i(name = "deeplink") String str, @i(name = "url_download") String str2) {
        this.f7459a = num;
        this.f7460b = str;
        this.f7461c = str2;
    }

    public final DownloaderResponse copy(@i(name = "allow") Integer num, @i(name = "deeplink") String str, @i(name = "url_download") String str2) {
        return new DownloaderResponse(num, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DownloaderResponse) {
            DownloaderResponse downloaderResponse = (DownloaderResponse) obj;
            return g.a(this.f7459a, downloaderResponse.f7459a) && g.a(this.f7460b, downloaderResponse.f7460b) && g.a(this.f7461c, downloaderResponse.f7461c);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f7459a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f7460b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7461c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloaderResponse(allow=");
        sb.append(this.f7459a);
        sb.append(", deeplink=");
        sb.append(this.f7460b);
        sb.append(", urlDownload=");
        return AbstractC1111a.t(sb, this.f7461c, ")");
    }
}
