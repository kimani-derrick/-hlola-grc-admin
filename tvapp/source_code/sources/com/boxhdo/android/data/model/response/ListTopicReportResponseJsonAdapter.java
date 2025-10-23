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
import o5.e;
/* loaded from: classes.dex */
public final class ListTopicReportResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7568a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7569b;

    public ListTopicReportResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7568a = D.G("topics");
        this.f7569b = yVar.c(AbstractC1043D.f(TopicReportResponse.class), v.f137q, "topics");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7568a);
            if (X6 != -1) {
                if (X6 == 0 && (list = (List) this.f7569b.b(nVar)) == null) {
                    throw e.j("topics", "topics", nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (list != null) {
            return new ListTopicReportResponse(list);
        }
        throw e.e("topics", "topics", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ListTopicReportResponse listTopicReportResponse = (ListTopicReportResponse) obj;
        g.f(qVar, "writer");
        if (listTopicReportResponse != null) {
            qVar.b();
            qVar.j("topics");
            this.f7569b.f(qVar, listTopicReportResponse.f7567a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(45, "GeneratedJsonAdapter(ListTopicReportResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
