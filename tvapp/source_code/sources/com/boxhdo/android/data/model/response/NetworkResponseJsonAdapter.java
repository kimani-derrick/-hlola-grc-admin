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
public final class NetworkResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7614a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7615b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7616c;

    public NetworkResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7614a = D.G("id", "name", "logo_path");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7615b = yVar.c(cls, vVar, "id");
        this.f7616c = yVar.c(String.class, vVar, "name");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7614a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7616c;
                    if (X6 != 1) {
                        if (X6 == 2) {
                            str2 = (String) kVar.b(nVar);
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                    }
                } else {
                    l7 = (Long) this.f7615b.b(nVar);
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
            return new NetworkResponse(l7.longValue(), str, str2);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        NetworkResponse networkResponse = (NetworkResponse) obj;
        g.f(qVar, "writer");
        if (networkResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7615b.f(qVar, Long.valueOf(networkResponse.f7611a));
            qVar.j("name");
            k kVar = this.f7616c;
            kVar.f(qVar, networkResponse.f7612b);
            qVar.j("logo_path");
            kVar.f(qVar, networkResponse.f7613c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(37, "GeneratedJsonAdapter(NetworkResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
