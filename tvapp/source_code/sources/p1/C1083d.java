package p1;

import A1.i;
import A5.k;
import D0.h;
import M5.g;
import M5.p;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.SubtitleSource;
import j1.AbstractC0827y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w0.C1351e;
import w4.l0;
import z5.C1527i;
/* renamed from: p1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083d extends AbstractC1080a<TvPlayerViewModel, AbstractC0827y> {

    /* renamed from: u0  reason: collision with root package name */
    public final H.e f13119u0 = l0.k(this, p.a(TvPlayerViewModel.class), new i(13, this), new i(14, this), new i(15, this));

    /* renamed from: v0  reason: collision with root package name */
    public final C1527i f13120v0 = new C1527i(new h(15, this));

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_setting_player;
    }

    @Override // q1.t
    public final q1.i h0() {
        return (TvPlayerViewModel) this.f13119u0.getValue();
    }

    @Override // q1.t
    public final void o0() {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        ((AbstractC0827y) f0()).f11755s.setHasFixedSize(true);
        C1527i c1527i = this.f13120v0;
        ((AbstractC0827y) f0()).f11755s.setAdapter((C1082c) c1527i.getValue());
        ((AbstractC0827y) f0()).f11756t.setText(R.string.title_subtitle);
        C1082c c1082c = (C1082c) c1527i.getValue();
        H.e eVar = this.f13119u0;
        List list = ((TvPlayerViewModel) eVar.getValue()).f7809o;
        if (list != null) {
            arrayList = k.m0(list);
            arrayList.add(0, new SubtitleSource(-1L, 0L, "", "", "", false));
        } else {
            arrayList = null;
        }
        c1082c.d.b(arrayList, null);
        C1082c c1082c2 = (C1082c) c1527i.getValue();
        long j7 = ((TvPlayerViewModel) eVar.getValue()).f7813s;
        String str = ((TvPlayerViewModel) eVar.getValue()).f.a().f7990h;
        c1082c2.getClass();
        g.f(str, "langCode");
        int i7 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        C1351e c1351e = c1082c2.d;
        if (i7 == 0) {
            List list2 = c1351e.f;
            g.e(list2, "currentList");
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (g.a(((SubtitleSource) obj2).f8080u, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            c1082c2.f = (SubtitleSource) obj2;
        } else {
            List list3 = c1351e.f;
            g.e(list3, "currentList");
            Iterator it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((SubtitleSource) obj).f8076q == j7) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c1082c2.f = (SubtitleSource) obj;
        }
        c1082c2.f15466a.e(c1351e.f.indexOf(c1082c2.f), 1, null);
        ((AbstractC0827y) f0()).f11754r.setOnClickListener(new C1.b(8, this));
    }
}
