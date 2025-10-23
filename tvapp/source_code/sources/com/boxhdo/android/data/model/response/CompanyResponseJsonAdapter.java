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
public final class CompanyResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7429a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7430b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7431c;

    public CompanyResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7429a = D.G("id", "logo_path", "logo_url", "name", "origin_country", "slug");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7430b = yVar.c(cls, vVar, "id");
        this.f7431c = yVar.c(String.class, vVar, "logoPath");
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
        while (nVar.n()) {
            int X6 = nVar.X(this.f7429a);
            k kVar = this.f7431c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7430b.b(nVar);
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
            }
        }
        nVar.h();
        if (l7 != null) {
            return new CompanyResponse(l7.longValue(), str, str2, str3, str4, str5);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        CompanyResponse companyResponse = (CompanyResponse) obj;
        g.f(qVar, "writer");
        if (companyResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7430b.f(qVar, Long.valueOf(companyResponse.f7425a));
            qVar.j("logo_path");
            k kVar = this.f7431c;
            kVar.f(qVar, companyResponse.f7426b);
            qVar.j("logo_url");
            kVar.f(qVar, companyResponse.f7427c);
            qVar.j("name");
            kVar.f(qVar, companyResponse.d);
            qVar.j("origin_country");
            kVar.f(qVar, companyResponse.f7428e);
            qVar.j("slug");
            kVar.f(qVar, companyResponse.f);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(37, "GeneratedJsonAdapter(CompanyResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
