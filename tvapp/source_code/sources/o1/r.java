package o1;

import W5.AbstractC0117y;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import e2.C0585B;
import j1.AbstractC0825w;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class r extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12872u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12873v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12873v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        r rVar = new r(dVar, this.f12873v);
        rVar.f12872u = obj;
        return rVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((r) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        ImageView imageView;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f12872u).a();
        if (a7 != null && ((Boolean) a7).booleanValue()) {
            TvPlayerActivity tvPlayerActivity = this.f12873v;
            long j7 = tvPlayerActivity.d0().f7815u;
            P1.c cVar = (P1.c) tvPlayerActivity.c0();
            cVar.getClass();
            cVar.w(((C0585B) cVar).K(), j7, false);
            P1.c cVar2 = (P1.c) tvPlayerActivity.c0();
            cVar2.getClass();
            ((C0585B) cVar2).g0(true);
            LinearLayout linearLayout = null;
            AbstractC0117y.p(P.g(tvPlayerActivity), null, 0, new j(null, tvPlayerActivity), 3);
            tvPlayerActivity.g0(true);
            AbstractC0825w abstractC0825w = tvPlayerActivity.W;
            if (abstractC0825w != null && (imageView = abstractC0825w.f11745s) != null) {
                imageView.requestFocus();
            }
            AbstractC0825w abstractC0825w2 = tvPlayerActivity.W;
            if (abstractC0825w2 != null) {
                linearLayout = abstractC0825w2.f11751y;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
        return C1530l.f16479a;
    }
}
