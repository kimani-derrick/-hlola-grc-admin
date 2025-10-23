package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import X.i;
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
public final class EpisodeDetailResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7484a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7485b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7486c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7487e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final k f7488g;

    /* renamed from: h  reason: collision with root package name */
    public final k f7489h;

    /* renamed from: i  reason: collision with root package name */
    public final k f7490i;

    public EpisodeDetailResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7484a = D.G("air_date", "audio_status", "episode_number", "file_version", "id", "is_fullhd", "is_include_sub", "is_sub_extracted", "mark", "movie_id", "name", "original_quality", "overview", "preview_path", "preview_status", "season_id", "status_release", "still_path", "file_size", "streaming", "sub_type", "subs");
        v vVar = v.f137q;
        this.f7485b = yVar.c(String.class, vVar, "airDate");
        this.f7486c = yVar.c(Integer.class, vVar, "audioStatus");
        this.d = yVar.c(Long.TYPE, vVar, "id");
        this.f7487e = yVar.c(Double.class, vVar, "mark");
        this.f = yVar.c(Long.class, vVar, "seasonId");
        this.f7488g = yVar.c(FileSizeResponse.class, vVar, "fileSize");
        this.f7489h = yVar.c(StreamingResponse.class, vVar, "streaming");
        this.f7490i = yVar.c(AbstractC1043D.f(SubResponse.class), vVar, "subs");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Long l8 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Double d = null;
        String str2 = null;
        Integer num7 = null;
        String str3 = null;
        String str4 = null;
        Integer num8 = null;
        Long l9 = null;
        Integer num9 = null;
        String str5 = null;
        FileSizeResponse fileSizeResponse = null;
        StreamingResponse streamingResponse = null;
        Integer num10 = null;
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7484a);
            Double d7 = d;
            k kVar = this.d;
            Integer num11 = num6;
            k kVar2 = this.f7485b;
            Integer num12 = num5;
            k kVar3 = this.f7486c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    d = d7;
                    num6 = num11;
                    break;
                case 0:
                    str = (String) kVar2.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 1:
                    num = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 2:
                    num2 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 3:
                    num3 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 4:
                    l7 = (Long) kVar.b(nVar);
                    if (l7 == null) {
                        throw e.j("id", "id", nVar);
                    }
                    d = d7;
                    num6 = num11;
                    break;
                case 5:
                    num4 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    num5 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    continue;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    num6 = (Integer) kVar3.b(nVar);
                    d = d7;
                    break;
                case 8:
                    d = (Double) this.f7487e.b(nVar);
                    num6 = num11;
                    break;
                case 9:
                    l8 = (Long) kVar.b(nVar);
                    if (l8 == null) {
                        throw e.j("movieId", "movie_id", nVar);
                    }
                    d = d7;
                    num6 = num11;
                    break;
                case 10:
                    str2 = (String) kVar2.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 11:
                    num7 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 12:
                    str3 = (String) kVar2.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 13:
                    str4 = (String) kVar2.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 14:
                    num8 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 15:
                    l9 = (Long) this.f.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 16:
                    num9 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 17:
                    str5 = (String) kVar2.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 18:
                    fileSizeResponse = (FileSizeResponse) this.f7488g.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 19:
                    streamingResponse = (StreamingResponse) this.f7489h.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 20:
                    num10 = (Integer) kVar3.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                case 21:
                    list = (List) this.f7490i.b(nVar);
                    d = d7;
                    num6 = num11;
                    break;
                default:
                    d = d7;
                    num6 = num11;
                    break;
            }
            num5 = num12;
        }
        Integer num13 = num5;
        Integer num14 = num6;
        Double d8 = d;
        nVar.h();
        if (l7 != null) {
            long longValue = l7.longValue();
            if (l8 != null) {
                return new EpisodeDetailResponse(str, num, num2, num3, longValue, num4, num13, num14, d8, l8.longValue(), str2, num7, str3, str4, num8, l9, num9, str5, fileSizeResponse, streamingResponse, num10, list);
            }
            throw e.e("movieId", "movie_id", nVar);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        EpisodeDetailResponse episodeDetailResponse = (EpisodeDetailResponse) obj;
        g.f(qVar, "writer");
        if (episodeDetailResponse != null) {
            qVar.b();
            qVar.j("air_date");
            k kVar = this.f7485b;
            kVar.f(qVar, episodeDetailResponse.f7465a);
            qVar.j("audio_status");
            k kVar2 = this.f7486c;
            kVar2.f(qVar, episodeDetailResponse.f7466b);
            qVar.j("episode_number");
            kVar2.f(qVar, episodeDetailResponse.f7467c);
            qVar.j("file_version");
            kVar2.f(qVar, episodeDetailResponse.d);
            qVar.j("id");
            Long valueOf = Long.valueOf(episodeDetailResponse.f7468e);
            k kVar3 = this.d;
            kVar3.f(qVar, valueOf);
            qVar.j("is_fullhd");
            kVar2.f(qVar, episodeDetailResponse.f);
            qVar.j("is_include_sub");
            kVar2.f(qVar, episodeDetailResponse.f7469g);
            qVar.j("is_sub_extracted");
            kVar2.f(qVar, episodeDetailResponse.f7470h);
            qVar.j("mark");
            this.f7487e.f(qVar, episodeDetailResponse.f7471i);
            qVar.j("movie_id");
            kVar3.f(qVar, Long.valueOf(episodeDetailResponse.f7472j));
            qVar.j("name");
            kVar.f(qVar, episodeDetailResponse.f7473k);
            qVar.j("original_quality");
            kVar2.f(qVar, episodeDetailResponse.f7474l);
            qVar.j("overview");
            kVar.f(qVar, episodeDetailResponse.f7475m);
            qVar.j("preview_path");
            kVar.f(qVar, episodeDetailResponse.n);
            qVar.j("preview_status");
            kVar2.f(qVar, episodeDetailResponse.f7476o);
            qVar.j("season_id");
            this.f.f(qVar, episodeDetailResponse.f7477p);
            qVar.j("status_release");
            kVar2.f(qVar, episodeDetailResponse.f7478q);
            qVar.j("still_path");
            kVar.f(qVar, episodeDetailResponse.f7479r);
            qVar.j("file_size");
            this.f7488g.f(qVar, episodeDetailResponse.f7480s);
            qVar.j("streaming");
            this.f7489h.f(qVar, episodeDetailResponse.f7481t);
            qVar.j("sub_type");
            kVar2.f(qVar, episodeDetailResponse.f7482u);
            qVar.j("subs");
            this.f7490i.f(qVar, episodeDetailResponse.f7483v);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(EpisodeDetailResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
