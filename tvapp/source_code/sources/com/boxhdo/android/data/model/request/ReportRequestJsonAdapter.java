package com.boxhdo.android.data.model.request;

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
public final class ReportRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7348a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7349b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7350c;
    public final k d;

    public ReportRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7348a = D.G("movie_id", "topics", "message");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7349b = yVar.c(cls, vVar, "movieId");
        this.f7350c = yVar.c(AbstractC1043D.f(Long.class), vVar, "topicIds");
        this.d = yVar.c(String.class, vVar, "message");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        List list = null;
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7348a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            str = (String) this.d.b(nVar);
                        }
                    } else {
                        list = (List) this.f7350c.b(nVar);
                        if (list == null) {
                            throw e.j("topicIds", "topics", nVar);
                        }
                    }
                } else {
                    l7 = (Long) this.f7349b.b(nVar);
                    if (l7 == null) {
                        throw e.j("movieId", "movie_id", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            long longValue = l7.longValue();
            if (list != null) {
                return new ReportRequest(longValue, list, str);
            }
            throw e.e("topicIds", "topics", nVar);
        }
        throw e.e("movieId", "movie_id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ReportRequest reportRequest = (ReportRequest) obj;
        g.f(qVar, "writer");
        if (reportRequest != null) {
            qVar.b();
            qVar.j("movie_id");
            this.f7349b.f(qVar, Long.valueOf(reportRequest.f7345a));
            qVar.j("topics");
            this.f7350c.f(qVar, reportRequest.f7346b);
            qVar.j("message");
            this.d.f(qVar, reportRequest.f7347c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(ReportRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
