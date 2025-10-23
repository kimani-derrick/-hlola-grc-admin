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
public final class CountryResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7456a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7457b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7458c;
    public final k d;

    public CountryResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7456a = D.G("id", "iso_3166_1", "english_name", "slug", "publish");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7457b = yVar.c(cls, vVar, "id");
        this.f7458c = yVar.c(String.class, vVar, "iso");
        this.d = yVar.c(Integer.class, vVar, "publish");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7456a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7458c;
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 != 3) {
                                if (X6 == 4) {
                                    num = (Integer) this.d.b(nVar);
                                }
                            } else {
                                str3 = (String) kVar.b(nVar);
                            }
                        } else {
                            str2 = (String) kVar.b(nVar);
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                    }
                } else {
                    l7 = (Long) this.f7457b.b(nVar);
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
            return new CountryResponse(l7.longValue(), str, str2, str3, num);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        CountryResponse countryResponse = (CountryResponse) obj;
        g.f(qVar, "writer");
        if (countryResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7457b.f(qVar, Long.valueOf(countryResponse.f7452a));
            qVar.j("iso_3166_1");
            k kVar = this.f7458c;
            kVar.f(qVar, countryResponse.f7453b);
            qVar.j("english_name");
            kVar.f(qVar, countryResponse.f7454c);
            qVar.j("slug");
            kVar.f(qVar, countryResponse.d);
            qVar.j("publish");
            this.d.f(qVar, countryResponse.f7455e);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(37, "GeneratedJsonAdapter(CountryResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
