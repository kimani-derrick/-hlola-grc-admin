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
public final class TraktSeasonJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7760a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7761b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7762c;

    public TraktSeasonJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7760a = D.G("ids", "number");
        v vVar = v.f137q;
        this.f7761b = yVar.c(TraktIds.class, vVar, "ids");
        this.f7762c = yVar.c(Integer.class, vVar, "number");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        TraktIds traktIds = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7760a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        num = (Integer) this.f7762c.b(nVar);
                    }
                } else {
                    traktIds = (TraktIds) this.f7761b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new TraktSeason(traktIds, num);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktSeason traktSeason = (TraktSeason) obj;
        g.f(qVar, "writer");
        if (traktSeason != null) {
            qVar.b();
            qVar.j("ids");
            this.f7761b.f(qVar, traktSeason.f7758a);
            qVar.j("number");
            this.f7762c.f(qVar, traktSeason.f7759b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(33, "GeneratedJsonAdapter(TraktSeason)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
