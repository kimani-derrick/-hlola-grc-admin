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
public final class TraktMovieJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7738a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7739b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7740c;
    public final k d;

    public TraktMovieJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7738a = D.G("ids", "title", "year");
        v vVar = v.f137q;
        this.f7739b = yVar.c(TraktIds.class, vVar, "ids");
        this.f7740c = yVar.c(String.class, vVar, "title");
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
            int X6 = nVar.X(this.f7738a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            num = (Integer) this.d.b(nVar);
                        }
                    } else {
                        str = (String) this.f7740c.b(nVar);
                    }
                } else {
                    traktIds = (TraktIds) this.f7739b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new TraktMovie(traktIds, str, num);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktMovie traktMovie = (TraktMovie) obj;
        g.f(qVar, "writer");
        if (traktMovie != null) {
            qVar.b();
            qVar.j("ids");
            this.f7739b.f(qVar, traktMovie.f7735a);
            qVar.j("title");
            this.f7740c.f(qVar, traktMovie.f7736b);
            qVar.j("year");
            this.d.f(qVar, traktMovie.f7737c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(32, "GeneratedJsonAdapter(TraktMovie)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
