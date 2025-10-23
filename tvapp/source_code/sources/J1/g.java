package J1;

import com.boxhdo.android.data.model.response.ContinueWatchResponse;
import com.boxhdo.android.data.model.response.EpisodeResponse;
import com.boxhdo.android.data.model.response.ListEpisodeResponse;
import com.boxhdo.domain.model.Episode;
import com.boxhdo.domain.model.ListEpisode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class g implements l {
    public static ListEpisode a(ListEpisodeResponse listEpisodeResponse) {
        ContinueWatchResponse continueWatchResponse;
        ContinueWatchResponse continueWatchResponse2;
        long j7;
        long j8;
        String str;
        long j9;
        String str2;
        int i7;
        int i8;
        long j10;
        boolean z7;
        Long l7;
        Double d;
        Long l8;
        Object obj;
        M5.g.f(listEpisodeResponse, "dto");
        List list = listEpisodeResponse.f7552b;
        if (list != null) {
            continueWatchResponse = (ContinueWatchResponse) A5.k.c0(list);
        } else {
            continueWatchResponse = null;
        }
        Iterable iterable = listEpisodeResponse.f7551a;
        if (iterable == null) {
            iterable = A5.t.f135q;
        }
        Iterable<EpisodeResponse> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(A5.m.P(iterable2));
        for (EpisodeResponse episodeResponse : iterable2) {
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        Long l9 = ((ContinueWatchResponse) obj).f7441e;
                        long j11 = episodeResponse.f7491a;
                        if (l9 != null && l9.longValue() == j11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                continueWatchResponse2 = (ContinueWatchResponse) obj;
            } else {
                continueWatchResponse2 = null;
            }
            long j12 = episodeResponse.f7491a;
            Long l10 = episodeResponse.f7492b;
            if (l10 != null) {
                j7 = l10.longValue();
            } else {
                j7 = -1;
            }
            String str3 = episodeResponse.f7493c;
            if (str3 == null) {
                str3 = "";
            }
            String Z6 = U5.n.Z(str3, "{width}-{height}", "500-281");
            Long l11 = episodeResponse.d;
            if (l11 != null) {
                j8 = l11.longValue();
            } else {
                j8 = -1;
            }
            String str4 = episodeResponse.f7494e;
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
            long j13 = 0;
            Long l12 = episodeResponse.f;
            if (l12 != null) {
                j9 = l12.longValue();
            } else {
                j9 = 0;
            }
            String str5 = episodeResponse.f7495g;
            if (str5 == null) {
                str2 = "";
            } else {
                str2 = str5;
            }
            Integer num = episodeResponse.f7496h;
            if (num != null) {
                i7 = num.intValue();
            } else {
                i7 = 0;
            }
            if (continueWatchResponse2 != null && (l8 = continueWatchResponse2.f7443h) != null) {
                j13 = l8.longValue();
            }
            long j14 = j13;
            if (continueWatchResponse2 != null && (d = continueWatchResponse2.f7444i) != null) {
                i8 = p6.d.B(d.doubleValue());
            } else {
                i8 = 0;
            }
            if (continueWatchResponse != null && (l7 = continueWatchResponse.f7441e) != null) {
                j10 = j12;
                if (l7.longValue() == episodeResponse.f7491a) {
                    z7 = true;
                    arrayList.add(new Episode(j10, j7, Z6, j8, str, j9, str2, i7, j14, i8, z7));
                }
            } else {
                j10 = j12;
            }
            z7 = false;
            arrayList.add(new Episode(j10, j7, Z6, j8, str, j9, str2, i7, j14, i8, z7));
        }
        return new ListEpisode(arrayList);
    }

    @Override // J1.l
    public final /* bridge */ /* synthetic */ Object s(Object obj) {
        return a((ListEpisodeResponse) obj);
    }
}
