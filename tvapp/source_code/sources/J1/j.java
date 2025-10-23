package J1;

import com.boxhdo.android.data.model.response.HomeResponse;
import com.boxhdo.android.data.model.response.MovieResponse;
import com.boxhdo.domain.model.HomeRow;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Shortcut;
import com.boxhdo.domain.model.Vote;
import com.boxhdo.domain.type.MediaType;
import com.boxhdo.domain.type.NetworkType;
import java.util.List;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: q  reason: collision with root package name */
    public final m f1303q;

    /* renamed from: r  reason: collision with root package name */
    public final q f1304r;

    /* renamed from: s  reason: collision with root package name */
    public final h f1305s;

    /* renamed from: t  reason: collision with root package name */
    public final r f1306t;

    /* renamed from: u  reason: collision with root package name */
    public final n f1307u;

    public j(m mVar, q qVar, h hVar, r rVar, n nVar) {
        M5.g.f(mVar, "movieMapper");
        M5.g.f(qVar, "shortcutMapper");
        M5.g.f(hVar, "filterMapper");
        M5.g.f(rVar, "tabsMapper");
        M5.g.f(nVar, "networkMapper");
        this.f1303q = mVar;
        this.f1304r = qVar;
        this.f1305s = hVar;
        this.f1306t = rVar;
        this.f1307u = nVar;
    }

    @Override // J1.l
    public final Object s(Object obj) {
        NetworkType networkType;
        Movie movie;
        HomeResponse homeResponse = (HomeResponse) obj;
        M5.g.f(homeResponse, "dto");
        m mVar = this.f1303q;
        Integer num = homeResponse.f7526b;
        if (num != null && num.intValue() == 1) {
            List list = homeResponse.f7528e;
            if (list != null) {
                P5.d dVar = P5.e.f2815q;
                int size = list.size();
                dVar.getClass();
                movie = mVar.s((MovieResponse) list.get(P5.e.f2816r.e().nextInt(size)));
            } else {
                movie = new Movie(0L, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, 0, (MediaType) null, (String) null, (String) null, false, 0, 0, (String) null, 0.0d, 0L, (List) null, (List) null, (List) null, (List) null, false, (Vote) null, 16777215);
            }
            return new HomeRow.SliderRow(movie);
        }
        h hVar = this.f1305s;
        String str = "";
        List list2 = homeResponse.f;
        String str2 = homeResponse.f7527c;
        String str3 = homeResponse.f7525a;
        if (num != null && num.intValue() == 3) {
            if (str3 == null) {
                str3 = "";
            }
            if (str2 != null) {
                str = str2;
            }
            hVar.getClass();
            Shortcut shortcut = new Shortcut(str3, str, 0, AbstractC0958a.x(hVar, list2));
            r rVar = this.f1306t;
            rVar.getClass();
            return new HomeRow.TabsRow(shortcut, AbstractC0958a.x(rVar, homeResponse.f7530h));
        } else if (num != null && num.intValue() == 2) {
            if (str3 == null) {
                str3 = "";
            }
            if (str2 != null) {
                str = str2;
            }
            hVar.getClass();
            Shortcut shortcut2 = new Shortcut(str3, str, 0, AbstractC0958a.x(hVar, list2));
            mVar.getClass();
            return new HomeRow.MovieRow(shortcut2, AbstractC0958a.x(mVar, homeResponse.f7529g), MediaType.f8095r);
        } else if (num != null && num.intValue() == 4) {
            if (M5.g.a(str3, "companies")) {
                networkType = NetworkType.f8100q;
            } else {
                networkType = NetworkType.f8101r;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str2 != null) {
                str = str2;
            }
            Shortcut shortcut3 = new Shortcut(12, str3, str);
            n nVar = this.f1307u;
            nVar.getClass();
            return new HomeRow.NetworkRow(networkType, shortcut3, AbstractC0958a.x(nVar, homeResponse.f7532j));
        } else {
            q qVar = this.f1304r;
            qVar.getClass();
            return new HomeRow.ShortCutRow(AbstractC0958a.x(qVar, homeResponse.d));
        }
    }
}
