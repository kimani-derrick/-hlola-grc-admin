package J1;

import com.boxhdo.android.data.model.response.MovieResponse;
import com.boxhdo.android.data.model.response.VoteResponse;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Vote;
import com.boxhdo.domain.type.MediaType;
import java.util.List;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: q  reason: collision with root package name */
    public final i f1308q;

    /* renamed from: r  reason: collision with root package name */
    public final b f1309r;

    /* renamed from: s  reason: collision with root package name */
    public final e f1310s;

    /* renamed from: t  reason: collision with root package name */
    public final t f1311t;

    /* renamed from: u  reason: collision with root package name */
    public final c f1312u;

    public m(i iVar, b bVar, e eVar, t tVar, c cVar) {
        M5.g.f(iVar, "genreMapper");
        M5.g.f(bVar, "castMapper");
        M5.g.f(eVar, "countryMapper");
        M5.g.f(tVar, "voteMapper");
        M5.g.f(cVar, "companyMapper");
        this.f1308q = iVar;
        this.f1309r = bVar;
        this.f1310s = eVar;
        this.f1311t = tVar;
        this.f1312u = cVar;
    }

    @Override // J1.l
    /* renamed from: a */
    public final Movie s(MovieResponse movieResponse) {
        String str;
        long j7;
        String str2;
        String str3;
        int i7;
        MediaType mediaType;
        String str4;
        String str5;
        boolean z7;
        int i8;
        int i9;
        String str6;
        double d;
        long j8;
        Vote vote;
        boolean z8;
        M5.g.f(movieResponse, "dto");
        String str7 = movieResponse.f7582b;
        if (str7 == null) {
            str7 = "";
        }
        String Z6 = U5.n.Z(str7, "{width}-{height}", "800-450");
        String str8 = movieResponse.f;
        if (str8 == null) {
            str8 = "";
        }
        String Z7 = U5.n.Z(str8, "{width}-{height}", "200-300");
        String str9 = movieResponse.f7583c;
        if (str9 == null) {
            str = "";
        } else {
            str = str9;
        }
        Long l7 = movieResponse.d;
        if (l7 != null) {
            j7 = l7.longValue();
        } else {
            j7 = 0;
        }
        String str10 = movieResponse.f7584e;
        if (str10 == null) {
            str2 = "";
        } else {
            str2 = str10;
        }
        String str11 = movieResponse.f7585g;
        if (str11 == null) {
            str3 = "";
        } else {
            str3 = str11;
        }
        Integer num = movieResponse.f7586h;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        Integer num2 = movieResponse.f7587i;
        if (num2 != null && num2.intValue() == 1) {
            mediaType = MediaType.f8096s;
        } else {
            mediaType = MediaType.f8097t;
        }
        MediaType mediaType2 = mediaType;
        String str12 = movieResponse.f7588j;
        if (str12 == null) {
            str4 = "";
        } else {
            str4 = str12;
        }
        String str13 = movieResponse.f7589k;
        if (str13 == null) {
            str5 = "";
        } else {
            str5 = str13;
        }
        Integer num3 = movieResponse.f7590l;
        if (num3 != null && num3.intValue() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        Integer num4 = movieResponse.f7591m;
        if (num4 != null) {
            i8 = num4.intValue();
        } else {
            i8 = 0;
        }
        Integer num5 = movieResponse.n;
        if (num5 != null) {
            i9 = num5.intValue();
        } else {
            i9 = 0;
        }
        String str14 = movieResponse.f7592o;
        if (str14 == null) {
            str6 = "";
        } else {
            str6 = str14;
        }
        Double d7 = movieResponse.f7593p;
        if (d7 != null) {
            d = d7.doubleValue();
        } else {
            d = 0.0d;
        }
        double d8 = d;
        Long l8 = movieResponse.f7594q;
        if (l8 != null) {
            j8 = l8.longValue();
        } else {
            j8 = 0;
        }
        i iVar = this.f1308q;
        iVar.getClass();
        List x7 = AbstractC0958a.x(iVar, movieResponse.f7595r);
        List list = movieResponse.f7597t;
        if (list == null) {
            list = A5.t.f135q;
        }
        e eVar = this.f1310s;
        eVar.getClass();
        List x8 = AbstractC0958a.x(eVar, list);
        b bVar = this.f1309r;
        bVar.getClass();
        List x9 = AbstractC0958a.x(bVar, movieResponse.f7596s);
        c cVar = this.f1312u;
        cVar.getClass();
        List x10 = AbstractC0958a.x(cVar, movieResponse.f7598u);
        VoteResponse voteResponse = movieResponse.f7600w;
        if (voteResponse != null) {
            this.f1311t.getClass();
            vote = t.a(voteResponse);
        } else {
            vote = null;
        }
        Vote vote2 = vote;
        Integer num6 = movieResponse.f7599v;
        if (num6 != null && num6.intValue() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new Movie(movieResponse.f7581a, Z6, Z7, str, j7, str2, str3, i7, mediaType2, str4, str5, z7, i8, i9, str6, d8, j8, x7, x8, x9, x10, z8, vote2, 2097152);
    }
}
