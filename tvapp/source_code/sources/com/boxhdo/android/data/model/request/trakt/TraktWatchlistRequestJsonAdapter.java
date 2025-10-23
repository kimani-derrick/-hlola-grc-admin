package com.boxhdo.android.data.model.request.trakt;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class TraktWatchlistRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7400a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7401b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Constructor f7402c;

    public TraktWatchlistRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7400a = D.G("movies", "seasons", "shows", "episodes");
        this.f7401b = yVar.c(AbstractC1043D.f(TraktItemRequest.class), v.f137q, "movies");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        int i7 = -1;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7400a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 == 3) {
                                list4 = (List) this.f7401b.b(nVar);
                                i7 &= -9;
                            }
                        } else {
                            list3 = (List) this.f7401b.b(nVar);
                            i7 &= -5;
                        }
                    } else {
                        list2 = (List) this.f7401b.b(nVar);
                        i7 &= -3;
                    }
                } else {
                    list = (List) this.f7401b.b(nVar);
                    i7 &= -2;
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (i7 == -16) {
            return new TraktWatchlistRequest(list, list2, list3, list4);
        }
        Constructor constructor = this.f7402c;
        if (constructor == null) {
            constructor = TraktWatchlistRequest.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, Integer.TYPE, e.f12959c);
            this.f7402c = constructor;
            g.e(constructor, "TraktWatchlistRequest::c…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, list2, list3, list4, Integer.valueOf(i7), null);
        g.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TraktWatchlistRequest) newInstance;
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktWatchlistRequest traktWatchlistRequest = (TraktWatchlistRequest) obj;
        g.f(qVar, "writer");
        if (traktWatchlistRequest != null) {
            qVar.b();
            qVar.j("movies");
            k kVar = this.f7401b;
            kVar.f(qVar, traktWatchlistRequest.f7397a);
            qVar.j("seasons");
            kVar.f(qVar, traktWatchlistRequest.f7398b);
            qVar.j("shows");
            kVar.f(qVar, traktWatchlistRequest.f7399c);
            qVar.j("episodes");
            kVar.f(qVar, traktWatchlistRequest.d);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(TraktWatchlistRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
