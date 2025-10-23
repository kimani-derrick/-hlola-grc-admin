package J1;

import com.boxhdo.android.data.model.response.ContinueWatchResponse;
import com.boxhdo.android.data.model.response.ListEpisodeResponse;
import com.boxhdo.android.data.model.response.ListSeasonResponse;
import com.boxhdo.android.data.model.response.SeasonResponse;
import com.boxhdo.domain.model.ListSeason;
import com.boxhdo.domain.model.Season;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class p implements l {

    /* renamed from: q  reason: collision with root package name */
    public final g f1314q;

    public p(g gVar) {
        M5.g.f(gVar, "episodeMapper");
        this.f1314q = gVar;
    }

    @Override // J1.l
    /* renamed from: a */
    public final ListSeason s(ListSeasonResponse listSeasonResponse) {
        ContinueWatchResponse continueWatchResponse;
        int i7;
        boolean z7;
        Long l7;
        M5.g.f(listSeasonResponse, "dto");
        List list = listSeasonResponse.f7563b;
        if (list != null) {
            continueWatchResponse = (ContinueWatchResponse) A5.k.c0(list);
        } else {
            continueWatchResponse = null;
        }
        Iterable iterable = listSeasonResponse.f7562a;
        if (iterable == null) {
            iterable = A5.t.f135q;
        }
        Iterable<SeasonResponse> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(A5.m.P(iterable2));
        for (SeasonResponse seasonResponse : iterable2) {
            long j7 = seasonResponse.f7639a;
            String str = seasonResponse.f7640b;
            if (str == null) {
                str = "";
            }
            List list2 = seasonResponse.f;
            if (list2 != null) {
                i7 = list2.size();
            } else {
                i7 = 0;
            }
            String str2 = seasonResponse.f7642e;
            if (str2 == null) {
                str2 = "";
            }
            if (continueWatchResponse != null && (l7 = continueWatchResponse.d) != null && l7.longValue() == seasonResponse.f7639a) {
                z7 = true;
            } else {
                z7 = false;
            }
            ListEpisodeResponse listEpisodeResponse = new ListEpisodeResponse(list2, list);
            this.f1314q.getClass();
            arrayList.add(new Season(j7, str, i7, str2, z7, g.a(listEpisodeResponse).f8012a));
        }
        return new ListSeason(arrayList);
    }
}
