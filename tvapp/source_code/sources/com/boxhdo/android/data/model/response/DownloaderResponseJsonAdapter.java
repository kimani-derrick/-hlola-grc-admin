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
public final class DownloaderResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7462a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7463b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7464c;

    public DownloaderResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7462a = D.G("allow", "deeplink", "url_download");
        v vVar = v.f137q;
        this.f7463b = yVar.c(Integer.class, vVar, "allow");
        this.f7464c = yVar.c(String.class, vVar, "deeplink");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7462a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7464c;
                    if (X6 != 1) {
                        if (X6 == 2) {
                            str2 = (String) kVar.b(nVar);
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                    }
                } else {
                    num = (Integer) this.f7463b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new DownloaderResponse(num, str, str2);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        DownloaderResponse downloaderResponse = (DownloaderResponse) obj;
        g.f(qVar, "writer");
        if (downloaderResponse != null) {
            qVar.b();
            qVar.j("allow");
            this.f7463b.f(qVar, downloaderResponse.f7459a);
            qVar.j("deeplink");
            k kVar = this.f7464c;
            kVar.f(qVar, downloaderResponse.f7460b);
            qVar.j("url_download");
            kVar.f(qVar, downloaderResponse.f7461c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(40, "GeneratedJsonAdapter(DownloaderResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
