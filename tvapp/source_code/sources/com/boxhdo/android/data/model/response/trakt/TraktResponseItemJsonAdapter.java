package com.boxhdo.android.data.model.response.trakt;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class TraktResponseItemJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7753a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7754b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7755c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7756e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final k f7757g;

    public TraktResponseItemJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7753a = D.G("id", "listed_at", "movie", "rank", "season", "show", "type");
        v vVar = v.f137q;
        this.f7754b = yVar.c(Long.class, vVar, "id");
        this.f7755c = yVar.c(String.class, vVar, "listedAt");
        this.d = yVar.c(TraktMovie.class, vVar, "movie");
        this.f7756e = yVar.c(Integer.class, vVar, "rank");
        this.f = yVar.c(TraktSeason.class, vVar, "season");
        this.f7757g = yVar.c(TraktShow.class, vVar, "show");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        TraktMovie traktMovie = null;
        Integer num = null;
        TraktSeason traktSeason = null;
        TraktShow traktShow = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7753a);
            k kVar = this.f7755c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7754b.b(nVar);
                    break;
                case 1:
                    str = (String) kVar.b(nVar);
                    break;
                case 2:
                    traktMovie = (TraktMovie) this.d.b(nVar);
                    break;
                case 3:
                    num = (Integer) this.f7756e.b(nVar);
                    break;
                case 4:
                    traktSeason = (TraktSeason) this.f.b(nVar);
                    break;
                case 5:
                    traktShow = (TraktShow) this.f7757g.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = (String) kVar.b(nVar);
                    break;
            }
        }
        nVar.h();
        return new TraktResponseItem(l7, str, traktMovie, num, traktSeason, traktShow, str2);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktResponseItem traktResponseItem = (TraktResponseItem) obj;
        g.f(qVar, "writer");
        if (traktResponseItem != null) {
            qVar.b();
            qVar.j("id");
            this.f7754b.f(qVar, traktResponseItem.f7748a);
            qVar.j("listed_at");
            k kVar = this.f7755c;
            kVar.f(qVar, traktResponseItem.f7749b);
            qVar.j("movie");
            this.d.f(qVar, traktResponseItem.f7750c);
            qVar.j("rank");
            this.f7756e.f(qVar, traktResponseItem.d);
            qVar.j("season");
            this.f.f(qVar, traktResponseItem.f7751e);
            qVar.j("show");
            this.f7757g.f(qVar, traktResponseItem.f);
            qVar.j("type");
            kVar.f(qVar, traktResponseItem.f7752g);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(TraktResponseItem)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
