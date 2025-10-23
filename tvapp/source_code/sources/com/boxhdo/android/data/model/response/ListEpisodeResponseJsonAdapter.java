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
public final class ListEpisodeResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7553a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7554b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7555c;

    public ListEpisodeResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7553a = D.G("episodes", "continueWatch");
        c f = AbstractC1043D.f(EpisodeResponse.class);
        v vVar = v.f137q;
        this.f7554b = yVar.c(f, vVar, "episodes");
        this.f7555c = yVar.c(AbstractC1043D.f(ContinueWatchResponse.class), vVar, "continueWatch");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        List list2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7553a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        list2 = (List) this.f7555c.b(nVar);
                    }
                } else {
                    list = (List) this.f7554b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new ListEpisodeResponse(list, list2);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ListEpisodeResponse listEpisodeResponse = (ListEpisodeResponse) obj;
        g.f(qVar, "writer");
        if (listEpisodeResponse != null) {
            qVar.b();
            qVar.j("episodes");
            this.f7554b.f(qVar, listEpisodeResponse.f7551a);
            qVar.j("continueWatch");
            this.f7555c.f(qVar, listEpisodeResponse.f7552b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(41, "GeneratedJsonAdapter(ListEpisodeResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
