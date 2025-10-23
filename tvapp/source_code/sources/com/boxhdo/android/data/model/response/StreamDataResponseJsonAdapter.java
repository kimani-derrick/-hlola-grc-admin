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
public final class StreamDataResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7656a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7657b;

    public StreamDataResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7656a = D.G("quality", "type", "url");
        this.f7657b = yVar.c(String.class, v.f137q, "quality");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7656a);
            if (X6 != -1) {
                k kVar = this.f7657b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            str3 = (String) kVar.b(nVar);
                        }
                    } else {
                        str2 = (String) kVar.b(nVar);
                    }
                } else {
                    str = (String) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new StreamDataResponse(str, str2, str3);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        StreamDataResponse streamDataResponse = (StreamDataResponse) obj;
        g.f(qVar, "writer");
        if (streamDataResponse != null) {
            qVar.b();
            qVar.j("quality");
            k kVar = this.f7657b;
            kVar.f(qVar, streamDataResponse.f7653a);
            qVar.j("type");
            kVar.f(qVar, streamDataResponse.f7654b);
            qVar.j("url");
            kVar.f(qVar, streamDataResponse.f7655c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(40, "GeneratedJsonAdapter(StreamDataResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
