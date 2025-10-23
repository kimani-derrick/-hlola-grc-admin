package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class TopicReportResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7690a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7691b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7692c;

    public TopicReportResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7690a = D.G("id", "title");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7691b = yVar.c(cls, vVar, "id");
        this.f7692c = yVar.c(String.class, vVar, "title");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7690a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        str = (String) this.f7692c.b(nVar);
                    }
                } else {
                    l7 = (Long) this.f7691b.b(nVar);
                    if (l7 == null) {
                        throw e.j("id", "id", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            return new TopicReportResponse(l7.longValue(), str);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TopicReportResponse topicReportResponse = (TopicReportResponse) obj;
        g.f(qVar, "writer");
        if (topicReportResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7691b.f(qVar, Long.valueOf(topicReportResponse.f7688a));
            qVar.j("title");
            this.f7692c.f(qVar, topicReportResponse.f7689b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(41, "GeneratedJsonAdapter(TopicReportResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
