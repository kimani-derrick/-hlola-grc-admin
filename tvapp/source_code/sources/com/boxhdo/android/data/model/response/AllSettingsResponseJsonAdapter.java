package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class AllSettingsResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7406a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7407b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7408c;
    public final k d;

    public AllSettingsResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7406a = D.G("player", "download", "app_token");
        v vVar = v.f137q;
        this.f7407b = yVar.c(ListPlayerResponse.class, vVar, "player");
        this.f7408c = yVar.c(DownloaderResponse.class, vVar, "downloader");
        this.d = yVar.c(String.class, vVar, "appToken");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        ListPlayerResponse listPlayerResponse = null;
        DownloaderResponse downloaderResponse = null;
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7406a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            str = (String) this.d.b(nVar);
                        }
                    } else {
                        downloaderResponse = (DownloaderResponse) this.f7408c.b(nVar);
                    }
                } else {
                    listPlayerResponse = (ListPlayerResponse) this.f7407b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new AllSettingsResponse(listPlayerResponse, downloaderResponse, str);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        AllSettingsResponse allSettingsResponse = (AllSettingsResponse) obj;
        g.f(qVar, "writer");
        if (allSettingsResponse != null) {
            qVar.b();
            qVar.j("player");
            this.f7407b.f(qVar, allSettingsResponse.f7403a);
            qVar.j("download");
            this.f7408c.f(qVar, allSettingsResponse.f7404b);
            qVar.j("app_token");
            this.d.f(qVar, allSettingsResponse.f7405c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(41, "GeneratedJsonAdapter(AllSettingsResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
