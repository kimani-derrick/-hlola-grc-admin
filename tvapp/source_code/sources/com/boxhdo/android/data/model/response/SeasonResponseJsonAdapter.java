package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class SeasonResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7643a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7644b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7645c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7646e;
    public final k f;

    public SeasonResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7643a = D.G("id", "name", "episode_count", "season_number", "air_date", "episodes");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7644b = yVar.c(cls, vVar, "id");
        this.f7645c = yVar.c(String.class, vVar, "name");
        this.d = yVar.c(Long.class, vVar, "episodeCount");
        this.f7646e = yVar.c(Integer.class, vVar, "seasonNumber");
        this.f = yVar.c(AbstractC1043D.f(EpisodeResponse.class), vVar, "episodes");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        Long l8 = null;
        Integer num = null;
        String str2 = null;
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7643a);
            k kVar = this.f7645c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7644b.b(nVar);
                    if (l7 != null) {
                        break;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 1:
                    str = (String) kVar.b(nVar);
                    break;
                case 2:
                    l8 = (Long) this.d.b(nVar);
                    break;
                case 3:
                    num = (Integer) this.f7646e.b(nVar);
                    break;
                case 4:
                    str2 = (String) kVar.b(nVar);
                    break;
                case 5:
                    list = (List) this.f.b(nVar);
                    break;
            }
        }
        nVar.h();
        if (l7 != null) {
            return new SeasonResponse(l7.longValue(), str, l8, num, str2, list);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        SeasonResponse seasonResponse = (SeasonResponse) obj;
        g.f(qVar, "writer");
        if (seasonResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7644b.f(qVar, Long.valueOf(seasonResponse.f7639a));
            qVar.j("name");
            k kVar = this.f7645c;
            kVar.f(qVar, seasonResponse.f7640b);
            qVar.j("episode_count");
            this.d.f(qVar, seasonResponse.f7641c);
            qVar.j("season_number");
            this.f7646e.f(qVar, seasonResponse.d);
            qVar.j("air_date");
            kVar.f(qVar, seasonResponse.f7642e);
            qVar.j("episodes");
            this.f.f(qVar, seasonResponse.f);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(36, "GeneratedJsonAdapter(SeasonResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
