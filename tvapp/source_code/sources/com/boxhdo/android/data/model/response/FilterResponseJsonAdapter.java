package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class FilterResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7512a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7513b;

    public FilterResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7512a = D.G("id", "title");
        this.f7513b = yVar.c(String.class, v.f137q, "id");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7512a);
            if (X6 != -1) {
                k kVar = this.f7513b;
                if (X6 != 0) {
                    if (X6 == 1) {
                        str2 = (String) kVar.b(nVar);
                    }
                } else {
                    str = (String) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new FilterResponse(str, str2);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        FilterResponse filterResponse = (FilterResponse) obj;
        g.f(qVar, "writer");
        if (filterResponse != null) {
            qVar.b();
            qVar.j("id");
            k kVar = this.f7513b;
            kVar.f(qVar, filterResponse.f7510a);
            qVar.j("title");
            kVar.f(qVar, filterResponse.f7511b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(36, "GeneratedJsonAdapter(FilterResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
