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
public final class ListPlayerResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7559a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7560b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7561c;
    public final k d;

    public ListPlayerResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7559a = D.G("allowed", "percent_show", "force", "players");
        v vVar = v.f137q;
        this.f7560b = yVar.c(Boolean.class, vVar, "allowed");
        this.f7561c = yVar.c(Integer.class, vVar, "percentShow");
        this.d = yVar.c(AbstractC1043D.f(PlayerResponse.class), vVar, "players");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7559a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7561c;
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 == 3) {
                                list = (List) this.d.b(nVar);
                            }
                        } else {
                            num2 = (Integer) kVar.b(nVar);
                        }
                    } else {
                        num = (Integer) kVar.b(nVar);
                    }
                } else {
                    bool = (Boolean) this.f7560b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new ListPlayerResponse(bool, num, num2, list);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ListPlayerResponse listPlayerResponse = (ListPlayerResponse) obj;
        g.f(qVar, "writer");
        if (listPlayerResponse != null) {
            qVar.b();
            qVar.j("allowed");
            this.f7560b.f(qVar, listPlayerResponse.f7556a);
            qVar.j("percent_show");
            k kVar = this.f7561c;
            kVar.f(qVar, listPlayerResponse.f7557b);
            qVar.j("force");
            kVar.f(qVar, listPlayerResponse.f7558c);
            qVar.j("players");
            this.d.f(qVar, listPlayerResponse.d);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(40, "GeneratedJsonAdapter(ListPlayerResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
