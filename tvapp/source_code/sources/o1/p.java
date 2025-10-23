package o1;

import android.widget.TextView;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import j1.AbstractC0825w;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1524f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class p extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12868u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12869v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12869v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        p pVar = new p(dVar, this.f12869v);
        pVar.f12868u = obj;
        return pVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((p) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String string;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f12868u).a();
        if (a7 != null) {
            C1524f c1524f = (C1524f) a7;
            TvPlayerActivity tvPlayerActivity = this.f12869v;
            AbstractC0825w abstractC0825w = tvPlayerActivity.W;
            if (abstractC0825w != null) {
                abstractC0825w.f11743D.setText(h4.b.v(tvPlayerActivity.d0().f7815u));
                int i7 = (tvPlayerActivity.d0().f7816v > 0L ? 1 : (tvPlayerActivity.d0().f7816v == 0L ? 0 : -1));
                TextView textView = abstractC0825w.f11742C;
                if (i7 < 0) {
                    string = tvPlayerActivity.getString(R.string.format_backward_time_seek, h4.b.v(Math.abs(tvPlayerActivity.d0().f7816v)));
                } else {
                    string = tvPlayerActivity.getString(R.string.format_forward_time_seek, h4.b.v(tvPlayerActivity.d0().f7816v));
                }
                textView.setText(string);
            }
        }
        return C1530l.f16479a;
    }
}
