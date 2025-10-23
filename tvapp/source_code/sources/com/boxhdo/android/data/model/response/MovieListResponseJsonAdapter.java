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
public final class MovieListResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7579a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7580b;

    public MovieListResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7579a = D.G("movies");
        this.f7580b = yVar.c(AbstractC1043D.f(MovieResponse.class), v.f137q, "movies");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7579a);
            if (X6 != -1) {
                if (X6 == 0) {
                    list = (List) this.f7580b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new MovieListResponse(list);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        MovieListResponse movieListResponse = (MovieListResponse) obj;
        g.f(qVar, "writer");
        if (movieListResponse != null) {
            qVar.b();
            qVar.j("movies");
            this.f7580b.f(qVar, movieListResponse.f7578a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(MovieListResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
