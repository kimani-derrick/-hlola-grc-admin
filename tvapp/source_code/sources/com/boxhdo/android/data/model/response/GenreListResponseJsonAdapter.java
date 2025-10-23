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
public final class GenreListResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7516a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7517b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7518c;

    public GenreListResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7516a = D.G("genres", "countries");
        c f = AbstractC1043D.f(GenreResponse.class);
        v vVar = v.f137q;
        this.f7517b = yVar.c(f, vVar, "genres");
        this.f7518c = yVar.c(AbstractC1043D.f(CountryResponse.class), vVar, "countries");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        List list2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7516a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        list2 = (List) this.f7518c.b(nVar);
                    }
                } else {
                    list = (List) this.f7517b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new GenreListResponse(list, list2);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        GenreListResponse genreListResponse = (GenreListResponse) obj;
        g.f(qVar, "writer");
        if (genreListResponse != null) {
            qVar.b();
            qVar.j("genres");
            this.f7517b.f(qVar, genreListResponse.f7514a);
            qVar.j("countries");
            this.f7518c.f(qVar, genreListResponse.f7515b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(GenreListResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
