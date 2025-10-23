package com.boxhdo.android.data.model.request.trakt;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class TraktIdsRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7369a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7370b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Constructor f7371c;

    public TraktIdsRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7369a = D.G("tmdb");
        this.f7370b = yVar.c(Long.TYPE, v.f137q, "tmdb");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        Long l7 = 0L;
        nVar.b();
        int i7 = -1;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7369a);
            if (X6 != -1) {
                if (X6 == 0) {
                    l7 = (Long) this.f7370b.b(nVar);
                    if (l7 != null) {
                        i7 = -2;
                    } else {
                        throw e.j("tmdb", "tmdb", nVar);
                    }
                } else {
                    continue;
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (i7 == -2) {
            return new TraktIdsRequest(l7.longValue());
        }
        Constructor constructor = this.f7371c;
        if (constructor == null) {
            constructor = TraktIdsRequest.class.getDeclaredConstructor(Long.TYPE, Integer.TYPE, e.f12959c);
            this.f7371c = constructor;
            g.e(constructor, "TraktIdsRequest::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(l7, Integer.valueOf(i7), null);
        g.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TraktIdsRequest) newInstance;
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktIdsRequest traktIdsRequest = (TraktIdsRequest) obj;
        g.f(qVar, "writer");
        if (traktIdsRequest != null) {
            qVar.b();
            qVar.j("tmdb");
            this.f7370b.f(qVar, Long.valueOf(traktIdsRequest.f7368a));
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(37, "GeneratedJsonAdapter(TraktIdsRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
