package com.boxhdo.android.data.model.response.trakt;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class TraktShowJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7766a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7767b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7768c;
    public final k d;

    public TraktShowJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7766a = D.G("ids", "title", "year");
        v vVar = v.f137q;
        this.f7767b = yVar.c(TraktIds.class, vVar, "ids");
        this.f7768c = yVar.c(String.class, vVar, "title");
        this.d = yVar.c(Integer.class, vVar, "year");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        TraktIds traktIds = null;
        String str = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7766a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            num = (Integer) this.d.b(nVar);
                        }
                    } else {
                        str = (String) this.f7768c.b(nVar);
                    }
                } else {
                    traktIds = (TraktIds) this.f7767b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new TraktShow(traktIds, str, num);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktShow traktShow = (TraktShow) obj;
        g.f(qVar, "writer");
        if (traktShow != null) {
            qVar.b();
            qVar.j("ids");
            this.f7767b.f(qVar, traktShow.f7763a);
            qVar.j("title");
            this.f7768c.f(qVar, traktShow.f7764b);
            qVar.j("year");
            this.d.f(qVar, traktShow.f7765c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(31, "GeneratedJsonAdapter(TraktShow)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
