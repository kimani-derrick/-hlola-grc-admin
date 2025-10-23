package o1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import android.widget.TextView;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import e2.C0585B;
import j1.AbstractC0825w;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12854u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12855v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12855v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new i(dVar, this.f12855v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        ((i) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
        return E5.a.f612q;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        TextView textView;
        DefaultTimeBar defaultTimeBar;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12854u;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0958a.H(obj);
        do {
            int i8 = TvPlayerActivity.f7794Y;
            TvPlayerActivity tvPlayerActivity = this.f12855v;
            if (((P1.c) tvPlayerActivity.c0()).r()) {
                AbstractC0825w abstractC0825w = tvPlayerActivity.W;
                if (abstractC0825w != null && (defaultTimeBar = abstractC0825w.f11750x) != null) {
                    defaultTimeBar.setPosition(((C0585B) tvPlayerActivity.c0()).M());
                }
                AbstractC0825w abstractC0825w2 = tvPlayerActivity.W;
                if (abstractC0825w2 != null) {
                    textView = abstractC0825w2.f11741B;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setText(h4.b.v(((C0585B) tvPlayerActivity.c0()).M()));
                }
            }
            this.f12854u = 1;
        } while (AbstractC0117y.f(1000L, this) != aVar);
        return aVar;
    }
}
