package D1;

import android.view.View;
import androidx.leanback.widget.O;
import com.boxhdo.domain.model.Episode;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Season;
import com.boxhdo.domain.model.Subtitle;
import com.boxhdo.domain.model.SubtitleSource;
import p1.C1082c;
import r1.C1113b;
import r1.p;
import w0.C1351e;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f482q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f483r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f484s;

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f482q = i7;
        this.f483r = obj;
        this.f484s = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f482q) {
            case 0:
                e eVar = (e) this.f483r;
                M5.g.f(eVar, "this$0");
                Subtitle subtitle = (Subtitle) this.f484s;
                M5.g.f(subtitle, "$item");
                eVar.f487e.c(subtitle);
                return;
            case 1:
                C1082c c1082c = (C1082c) this.f483r;
                M5.g.f(c1082c, "this$0");
                SubtitleSource subtitleSource = (SubtitleSource) this.f484s;
                M5.g.f(subtitleSource, "$item");
                c1082c.f13118e.c(subtitleSource);
                C1351e c1351e = c1082c.d;
                int indexOf = c1351e.f.indexOf(c1082c.f);
                c1082c.f = subtitleSource;
                O o7 = c1082c.f15466a;
                o7.e(indexOf, 1, null);
                o7.e(c1351e.f.indexOf(c1082c.f), 1, null);
                return;
            case 2:
                C1113b c1113b = (C1113b) this.f483r;
                M5.g.f(c1113b, "this$0");
                Episode episode = (Episode) this.f484s;
                M5.g.f(episode, "$item");
                c1113b.f13416v.c(episode);
                return;
            case 3:
                p pVar = (p) this.f483r;
                M5.g.f(pVar, "this$0");
                Season season = (Season) this.f484s;
                M5.g.f(season, "$item");
                pVar.f13443v.c(season);
                return;
            default:
                v1.c cVar = (v1.c) this.f483r;
                M5.g.f(cVar, "this$0");
                Movie movie = (Movie) this.f484s;
                M5.g.f(movie, "$movie");
                cVar.f15253e.c(movie);
                return;
        }
    }
}
