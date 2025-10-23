package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class GenreResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7522a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7523b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7524c;
    public final k d;

    public GenreResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7522a = D.G("id", "name", "slug", "is_popular");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7523b = yVar.c(cls, vVar, "id");
        this.f7524c = yVar.c(String.class, vVar, "name");
        this.d = yVar.c(Integer.class, vVar, "isPopular");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7522a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7524c;
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 == 3) {
                                num = (Integer) this.d.b(nVar);
                            }
                        } else {
                            str2 = (String) kVar.b(nVar);
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                    }
                } else {
                    l7 = (Long) this.f7523b.b(nVar);
                    if (l7 == null) {
                        throw e.j("id", "id", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            return new GenreResponse(l7.longValue(), str, str2, num);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        GenreResponse genreResponse = (GenreResponse) obj;
        g.f(qVar, "writer");
        if (genreResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7523b.f(qVar, Long.valueOf(genreResponse.f7519a));
            qVar.j("name");
            k kVar = this.f7524c;
            kVar.f(qVar, genreResponse.f7520b);
            qVar.j("slug");
            kVar.f(qVar, genreResponse.f7521c);
            qVar.j("is_popular");
            this.d.f(qVar, genreResponse.d);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(GenreResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
