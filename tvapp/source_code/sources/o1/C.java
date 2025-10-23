package o1;

import W5.InterfaceC0116x;
import a1.C0197a;
import android.content.SharedPreferences;
import com.boxhdo.android.data.model.preference.GeneralPreference;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.GeneralConfig;
import com.boxhdo.domain.model.SubtitleSource;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class C extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TvPlayerViewModel f12821u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SubtitleSource f12822v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(TvPlayerViewModel tvPlayerViewModel, SubtitleSource subtitleSource, D5.d dVar) {
        super(2, dVar);
        this.f12821u = tvPlayerViewModel;
        this.f12822v = subtitleSource;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C(this.f12821u, this.f12822v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        SubtitleSource subtitleSource = this.f12822v;
        long j7 = subtitleSource.f8076q;
        TvPlayerViewModel tvPlayerViewModel = this.f12821u;
        tvPlayerViewModel.f7813s = j7;
        GeneralConfig a7 = tvPlayerViewModel.f.a();
        String str = subtitleSource.f8080u;
        M5.g.f(str, "<set-?>");
        a7.f7990h = str;
        L1.k kVar = tvPlayerViewModel.f7802g;
        kVar.getClass();
        int ordinal = a7.f7988e.ordinal();
        int ordinal2 = a7.f.ordinal();
        String str2 = a7.f7990h;
        GeneralPreference generalPreference = new GeneralPreference(a7.f7985a, a7.f7986b, a7.f7987c, a7.d, ordinal, ordinal2, a7.f7989g, str2);
        String v5 = g6.o.f10858a.v();
        C0197a c0197a = kVar.f1920a;
        SharedPreferences.Editor edit = c0197a.f4980a.edit();
        if (generalPreference instanceof String) {
            ((B0.a) edit).putString(v5, (String) generalPreference);
        } else if (generalPreference instanceof Float) {
            ((B0.a) edit).putFloat(v5, ((Number) generalPreference).floatValue());
        } else if (generalPreference instanceof Integer) {
            ((B0.a) edit).putInt(v5, ((Number) generalPreference).intValue());
        } else if (generalPreference instanceof Long) {
            ((B0.a) edit).putLong(v5, ((Number) generalPreference).longValue());
        } else if (generalPreference instanceof Boolean) {
            ((B0.a) edit).putBoolean(v5, ((Boolean) generalPreference).booleanValue());
        } else {
            ((B0.a) edit).putString(v5, c0197a.f4981b.a(GeneralPreference.class).e(generalPreference));
        }
        ((B0.a) edit).apply();
        EpisodeSource episodeSource = tvPlayerViewModel.f7810p;
        if (episodeSource != null) {
            tvPlayerViewModel.f7805j.f(new C1104f(new x(episodeSource)));
        }
        return C1530l.f16479a;
    }
}
