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
import o5.c;
/* loaded from: classes.dex */
public final class ListSeasonResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7564a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7565b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7566c;

    public ListSeasonResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7564a = D.G("seasons", "continueWatch");
        c f = AbstractC1043D.f(SeasonResponse.class);
        v vVar = v.f137q;
        this.f7565b = yVar.c(f, vVar, "seasons");
        this.f7566c = yVar.c(AbstractC1043D.f(ContinueWatchResponse.class), vVar, "continueWatch");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        List list2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7564a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        list2 = (List) this.f7566c.b(nVar);
                    }
                } else {
                    list = (List) this.f7565b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new ListSeasonResponse(list, list2);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ListSeasonResponse listSeasonResponse = (ListSeasonResponse) obj;
        g.f(qVar, "writer");
        if (listSeasonResponse != null) {
            qVar.b();
            qVar.j("seasons");
            this.f7565b.f(qVar, listSeasonResponse.f7562a);
            qVar.j("continueWatch");
            this.f7566c.f(qVar, listSeasonResponse.f7563b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(40, "GeneratedJsonAdapter(ListSeasonResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
