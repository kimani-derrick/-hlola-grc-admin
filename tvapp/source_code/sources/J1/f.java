package J1;

import com.boxhdo.android.data.model.response.EpisodeDetailResponse;
import com.boxhdo.android.data.model.response.FileSizeResponse;
import com.boxhdo.android.data.model.response.StreamDataResponse;
import com.boxhdo.android.data.model.response.StreamingResponse;
import com.boxhdo.android.data.model.response.SubResponse;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.StreamSource;
import com.boxhdo.domain.model.StreamUrl;
import com.boxhdo.domain.model.SubtitleSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements l {
    public static EpisodeSource a(EpisodeDetailResponse episodeDetailResponse) {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        A5.t tVar;
        ArrayList arrayList8;
        A5.t tVar2;
        ArrayList arrayList9;
        List list2;
        Long l7;
        List list3;
        Long l8;
        List list4;
        Long l9;
        List list5;
        Long l10;
        List list6;
        Long l11;
        long j7;
        String str7;
        String str8;
        String str9;
        boolean z7;
        Object obj;
        M5.g.f(episodeDetailResponse, "dto");
        String str10 = episodeDetailResponse.n;
        if (str10 != null) {
            list = U5.f.u0(str10, new String[]{"|"});
        } else {
            list = null;
        }
        if (list != null) {
            str = (String) A5.k.X(list);
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (list != null) {
            if (1 <= A5.l.K(list)) {
                obj = list.get(1);
            } else {
                obj = null;
            }
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        String str11 = episodeDetailResponse.f7473k;
        if (str11 == null) {
            str4 = "";
        } else {
            str4 = str11;
        }
        String str12 = episodeDetailResponse.f7479r;
        if (str12 != null) {
            str5 = U5.n.Z(str12, "{width}-{height}", "1920-1080");
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        List list7 = episodeDetailResponse.f7483v;
        if (list7 != null) {
            List<SubResponse> list8 = list7;
            arrayList = new ArrayList(A5.m.P(list8));
            for (SubResponse subResponse : list8) {
                long j8 = subResponse.f7666c;
                Long l12 = subResponse.f7664a;
                if (l12 != null) {
                    j7 = l12.longValue();
                } else {
                    j7 = 0;
                }
                String str13 = subResponse.f7669h;
                if (str13 == null) {
                    str7 = "";
                } else {
                    str7 = str13;
                }
                String str14 = subResponse.f;
                if (str14 == null) {
                    str8 = "";
                } else {
                    str8 = str14;
                }
                String str15 = subResponse.f7668g;
                if (str15 == null) {
                    str9 = "";
                } else {
                    str9 = str15;
                }
                Integer num = subResponse.f7667e;
                if (num != null && num.intValue() == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                arrayList.add(new SubtitleSource(j8, j7, str7, str8, str9, z7));
            }
        } else {
            arrayList = null;
        }
        A5.t tVar3 = A5.t.f135q;
        if (arrayList == null) {
            arrayList2 = tVar3;
        } else {
            arrayList2 = arrayList;
        }
        FileSizeResponse fileSizeResponse = episodeDetailResponse.f7480s;
        StreamingResponse streamingResponse = episodeDetailResponse.f7481t;
        if (streamingResponse != null && (list6 = streamingResponse.f7659b) != null) {
            List<StreamDataResponse> list9 = list6;
            arrayList3 = new ArrayList(A5.m.P(list9));
            for (StreamDataResponse streamDataResponse : list9) {
                String str16 = streamDataResponse.f7655c;
                if (fileSizeResponse != null) {
                    l11 = fileSizeResponse.d;
                } else {
                    l11 = null;
                }
                arrayList3.add(new StreamUrl(str16, streamDataResponse.f7654b, l11));
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 == null) {
            arrayList4 = tVar3;
        } else {
            arrayList4 = arrayList3;
        }
        if (streamingResponse != null && (list5 = streamingResponse.f7661e) != null) {
            List<StreamDataResponse> list10 = list5;
            arrayList5 = new ArrayList(A5.m.P(list10));
            for (StreamDataResponse streamDataResponse2 : list10) {
                String str17 = streamDataResponse2.f7655c;
                if (fileSizeResponse != null) {
                    l10 = fileSizeResponse.f7507c;
                } else {
                    l10 = null;
                }
                arrayList5.add(new StreamUrl(str17, streamDataResponse2.f7654b, l10));
            }
        } else {
            arrayList5 = null;
        }
        if (arrayList5 == null) {
            arrayList6 = tVar3;
        } else {
            arrayList6 = arrayList5;
        }
        if (streamingResponse != null && (list4 = streamingResponse.f7660c) != null) {
            List list11 = list4;
            arrayList7 = new ArrayList(A5.m.P(list11));
            Iterator it = list11.iterator();
            while (it.hasNext()) {
                StreamDataResponse streamDataResponse3 = (StreamDataResponse) it.next();
                String str18 = streamDataResponse3.f7655c;
                Iterator it2 = it;
                if (fileSizeResponse != null) {
                    l9 = fileSizeResponse.f7505a;
                } else {
                    l9 = null;
                }
                arrayList7.add(new StreamUrl(str18, streamDataResponse3.f7654b, l9));
                it = it2;
            }
        } else {
            arrayList7 = null;
        }
        if (arrayList7 == null) {
            arrayList7 = tVar3;
        }
        if (streamingResponse != null && (list3 = streamingResponse.d) != null) {
            List list12 = list3;
            arrayList8 = new ArrayList(A5.m.P(list12));
            Iterator it3 = list12.iterator();
            while (it3.hasNext()) {
                StreamDataResponse streamDataResponse4 = (StreamDataResponse) it3.next();
                Iterator it4 = it3;
                String str19 = streamDataResponse4.f7655c;
                A5.t tVar4 = tVar3;
                if (fileSizeResponse != null) {
                    l8 = fileSizeResponse.f7506b;
                } else {
                    l8 = null;
                }
                arrayList8.add(new StreamUrl(str19, streamDataResponse4.f7654b, l8));
                it3 = it4;
                tVar3 = tVar4;
            }
            tVar = tVar3;
        } else {
            tVar = tVar3;
            arrayList8 = null;
        }
        if (arrayList8 == null) {
            tVar2 = tVar;
        } else {
            tVar2 = arrayList8;
        }
        if (streamingResponse != null && (list2 = streamingResponse.f7658a) != null) {
            List<StreamDataResponse> list13 = list2;
            ArrayList arrayList10 = new ArrayList(A5.m.P(list13));
            for (StreamDataResponse streamDataResponse5 : list13) {
                String str20 = streamDataResponse5.f7655c;
                if (fileSizeResponse != null) {
                    l7 = fileSizeResponse.d;
                } else {
                    l7 = null;
                }
                arrayList10.add(new StreamUrl(str20, streamDataResponse5.f7654b, l7));
            }
            arrayList9 = arrayList10;
        } else {
            arrayList9 = null;
        }
        if (arrayList9 != null) {
            tVar = arrayList9;
        }
        return new EpisodeSource(episodeDetailResponse.f7468e, str4, str6, str2, length, arrayList2, new StreamSource(arrayList4, arrayList6, arrayList7, tVar2, tVar));
    }

    @Override // J1.l
    public final /* bridge */ /* synthetic */ Object s(Object obj) {
        return a((EpisodeDetailResponse) obj);
    }
}
