package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class CastResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7422a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7423b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7424c;
    public final k d;

    public CastResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7422a = D.G("id", "name", "profile_path", "slug", "birthday", "deathday", "biography", "place_of_birth", "total_movies");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7423b = yVar.c(cls, vVar, "id");
        this.f7424c = yVar.c(String.class, vVar, "name");
        this.d = yVar.c(Integer.class, vVar, "totalMovies");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7422a);
            k kVar = this.f7424c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7423b.b(nVar);
                    if (l7 != null) {
                        break;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 1:
                    str = (String) kVar.b(nVar);
                    break;
                case 2:
                    str2 = (String) kVar.b(nVar);
                    break;
                case 3:
                    str3 = (String) kVar.b(nVar);
                    break;
                case 4:
                    str4 = (String) kVar.b(nVar);
                    break;
                case 5:
                    str5 = (String) kVar.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str6 = (String) kVar.b(nVar);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    str7 = (String) kVar.b(nVar);
                    break;
                case 8:
                    num = (Integer) this.d.b(nVar);
                    break;
            }
        }
        nVar.h();
        if (l7 != null) {
            return new CastResponse(l7.longValue(), str, str2, str3, str4, str5, str6, str7, num);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        CastResponse castResponse = (CastResponse) obj;
        g.f(qVar, "writer");
        if (castResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7423b.f(qVar, Long.valueOf(castResponse.f7415a));
            qVar.j("name");
            k kVar = this.f7424c;
            kVar.f(qVar, castResponse.f7416b);
            qVar.j("profile_path");
            kVar.f(qVar, castResponse.f7417c);
            qVar.j("slug");
            kVar.f(qVar, castResponse.d);
            qVar.j("birthday");
            kVar.f(qVar, castResponse.f7418e);
            qVar.j("deathday");
            kVar.f(qVar, castResponse.f);
            qVar.j("biography");
            kVar.f(qVar, castResponse.f7419g);
            qVar.j("place_of_birth");
            kVar.f(qVar, castResponse.f7420h);
            qVar.j("total_movies");
            this.d.f(qVar, castResponse.f7421i);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(34, "GeneratedJsonAdapter(CastResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
