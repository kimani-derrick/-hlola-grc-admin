package n1;

import android.app.AlertDialog;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import com.boxhdo.android.tv.ui.activity.main.TvActivity;
import com.boxhdo.domain.model.LatestVersion;
import k3.AbstractC0958a;
import n0.C0999A;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class l extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12639u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvActivity f12640v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(D5.d dVar, TvActivity tvActivity) {
        super(2, dVar);
        this.f12640v = tvActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        l lVar = new l(dVar, this.f12640v);
        lVar.f12639u = obj;
        return lVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((l) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f12639u).a();
        if (a7 != null) {
            h hVar = (h) a7;
            boolean z7 = hVar instanceof g;
            TvActivity tvActivity = this.f12640v;
            if (z7) {
                try {
                    C0999A c0999a = tvActivity.f13235O;
                    if (c0999a != null) {
                        LatestVersion latestVersion = ((g) hVar).f12633a;
                        M5.g.f(latestVersion, "version");
                        c0999a.j(new h1.o(latestVersion));
                    } else {
                        M5.g.l("navController");
                        throw null;
                    }
                } catch (Exception unused) {
                }
            } else if (M5.g.a(hVar, f.f12631a)) {
                new AlertDialog.Builder(tvActivity).setTitle(tvActivity.getString(R.string.title_could_not_load)).setMessage(tvActivity.getString(R.string.description_could_not_load, ((TVViewModel) tvActivity.f7791T.getValue()).f7787l)).setNegativeButton(R.string.title_close, new k(tvActivity)).create().show();
            } else {
                M5.g.a(hVar, f.f12632b);
            }
        }
        return C1530l.f16479a;
    }
}
