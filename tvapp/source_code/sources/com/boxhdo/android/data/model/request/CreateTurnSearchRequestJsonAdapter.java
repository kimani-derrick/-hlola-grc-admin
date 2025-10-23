package com.boxhdo.android.data.model.request;

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
public final class CreateTurnSearchRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7314a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7315b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7316c;

    public CreateTurnSearchRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7314a = D.G("movieId", "keyword");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7315b = yVar.c(cls, vVar, "movieId");
        this.f7316c = yVar.c(String.class, vVar, "keyword");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7314a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1 && (str = (String) this.f7316c.b(nVar)) == null) {
                        throw e.j("keyword", "keyword", nVar);
                    }
                } else {
                    l7 = (Long) this.f7315b.b(nVar);
                    if (l7 == null) {
                        throw e.j("movieId", "movieId", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            long longValue = l7.longValue();
            if (str != null) {
                return new CreateTurnSearchRequest(longValue, str);
            }
            throw e.e("keyword", "keyword", nVar);
        }
        throw e.e("movieId", "movieId", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        CreateTurnSearchRequest createTurnSearchRequest = (CreateTurnSearchRequest) obj;
        g.f(qVar, "writer");
        if (createTurnSearchRequest != null) {
            qVar.b();
            qVar.j("movieId");
            this.f7315b.f(qVar, Long.valueOf(createTurnSearchRequest.f7312a));
            qVar.j("keyword");
            this.f7316c.f(qVar, createTurnSearchRequest.f7313b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(45, "GeneratedJsonAdapter(CreateTurnSearchRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
