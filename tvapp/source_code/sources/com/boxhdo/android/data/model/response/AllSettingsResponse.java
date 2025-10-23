package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class AllSettingsResponse {

    /* renamed from: a  reason: collision with root package name */
    public final ListPlayerResponse f7403a;

    /* renamed from: b  reason: collision with root package name */
    public final DownloaderResponse f7404b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7405c;

    public AllSettingsResponse(@i(name = "player") ListPlayerResponse listPlayerResponse, @i(name = "download") DownloaderResponse downloaderResponse, @i(name = "app_token") String str) {
        this.f7403a = listPlayerResponse;
        this.f7404b = downloaderResponse;
        this.f7405c = str;
    }

    public final AllSettingsResponse copy(@i(name = "player") ListPlayerResponse listPlayerResponse, @i(name = "download") DownloaderResponse downloaderResponse, @i(name = "app_token") String str) {
        return new AllSettingsResponse(listPlayerResponse, downloaderResponse, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AllSettingsResponse) {
            AllSettingsResponse allSettingsResponse = (AllSettingsResponse) obj;
            return g.a(this.f7403a, allSettingsResponse.f7403a) && g.a(this.f7404b, allSettingsResponse.f7404b) && g.a(this.f7405c, allSettingsResponse.f7405c);
        }
        return false;
    }

    public final int hashCode() {
        ListPlayerResponse listPlayerResponse = this.f7403a;
        int hashCode = (listPlayerResponse == null ? 0 : listPlayerResponse.hashCode()) * 31;
        DownloaderResponse downloaderResponse = this.f7404b;
        int hashCode2 = (hashCode + (downloaderResponse == null ? 0 : downloaderResponse.hashCode())) * 31;
        String str = this.f7405c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllSettingsResponse(player=");
        sb.append(this.f7403a);
        sb.append(", downloader=");
        sb.append(this.f7404b);
        sb.append(", appToken=");
        return AbstractC1111a.t(sb, this.f7405c, ")");
    }
}
