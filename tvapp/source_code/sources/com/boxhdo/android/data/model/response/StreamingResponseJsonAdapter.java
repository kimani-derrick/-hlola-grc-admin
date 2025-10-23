package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class StreamingResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7662a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7663b;

    public StreamingResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7662a = D.G("auto", "1080", "360", "480", "720");
        this.f7663b = yVar.c(AbstractC1043D.f(StreamDataResponse.class), v.f137q, "auto");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7662a);
            if (X6 != -1) {
                k kVar = this.f7663b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 != 3) {
                                if (X6 == 4) {
                                    list5 = (List) kVar.b(nVar);
                                }
                            } else {
                                list4 = (List) kVar.b(nVar);
                            }
                        } else {
                            list3 = (List) kVar.b(nVar);
                        }
                    } else {
                        list2 = (List) kVar.b(nVar);
                    }
                } else {
                    list = (List) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new StreamingResponse(list, list2, list3, list4, list5);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        StreamingResponse streamingResponse = (StreamingResponse) obj;
        g.f(qVar, "writer");
        if (streamingResponse != null) {
            qVar.b();
            qVar.j("auto");
            k kVar = this.f7663b;
            kVar.f(qVar, streamingResponse.f7658a);
            qVar.j("1080");
            kVar.f(qVar, streamingResponse.f7659b);
            qVar.j("360");
            kVar.f(qVar, streamingResponse.f7660c);
            qVar.j("480");
            kVar.f(qVar, streamingResponse.d);
            qVar.j("720");
            kVar.f(qVar, streamingResponse.f7661e);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(StreamingResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
