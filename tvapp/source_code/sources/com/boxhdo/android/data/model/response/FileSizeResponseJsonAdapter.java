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
public final class FileSizeResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7508a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7509b;

    public FileSizeResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7508a = D.G("360", "480", "720", "1080");
        this.f7509b = yVar.c(Long.class, v.f137q, "x360");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        Long l10 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7508a);
            if (X6 != -1) {
                k kVar = this.f7509b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 == 3) {
                                l10 = (Long) kVar.b(nVar);
                            }
                        } else {
                            l9 = (Long) kVar.b(nVar);
                        }
                    } else {
                        l8 = (Long) kVar.b(nVar);
                    }
                } else {
                    l7 = (Long) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new FileSizeResponse(l7, l8, l9, l10);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        FileSizeResponse fileSizeResponse = (FileSizeResponse) obj;
        g.f(qVar, "writer");
        if (fileSizeResponse != null) {
            qVar.b();
            qVar.j("360");
            k kVar = this.f7509b;
            kVar.f(qVar, fileSizeResponse.f7505a);
            qVar.j("480");
            kVar.f(qVar, fileSizeResponse.f7506b);
            qVar.j("720");
            kVar.f(qVar, fileSizeResponse.f7507c);
            qVar.j("1080");
            kVar.f(qVar, fileSizeResponse.d);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(38, "GeneratedJsonAdapter(FileSizeResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
