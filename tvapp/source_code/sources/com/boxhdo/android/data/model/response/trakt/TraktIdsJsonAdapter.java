package com.boxhdo.android.data.model.response.trakt;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class TraktIdsJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7725a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7726b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7727c;

    public TraktIdsJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7725a = D.G("imdb", "slug", "tmdb", "trakt");
        v vVar = v.f137q;
        this.f7726b = yVar.c(String.class, vVar, "imdb");
        this.f7727c = yVar.c(Long.class, vVar, "tmdb");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        Long l7 = null;
        Long l8 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7725a);
            if (X6 != -1) {
                k kVar = this.f7726b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        k kVar2 = this.f7727c;
                        if (X6 != 2) {
                            if (X6 == 3) {
                                l8 = (Long) kVar2.b(nVar);
                            }
                        } else {
                            l7 = (Long) kVar2.b(nVar);
                        }
                    } else {
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
        return new TraktIds(str, str2, l7, l8);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktIds traktIds = (TraktIds) obj;
        g.f(qVar, "writer");
        if (traktIds != null) {
            qVar.b();
            qVar.j("imdb");
            k kVar = this.f7726b;
            kVar.f(qVar, traktIds.f7722a);
            qVar.j("slug");
            kVar.f(qVar, traktIds.f7723b);
            qVar.j("tmdb");
            k kVar2 = this.f7727c;
            kVar2.f(qVar, traktIds.f7724c);
            qVar.j("trakt");
            kVar2.f(qVar, traktIds.d);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(30, "GeneratedJsonAdapter(TraktIds)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
