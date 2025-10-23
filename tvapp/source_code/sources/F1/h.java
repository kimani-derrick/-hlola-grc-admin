package F1;

import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import j1.AbstractC0787E;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ int f636u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateFragment f637v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(D5.d dVar, TVUpdateFragment tVUpdateFragment) {
        super(2, dVar);
        this.f637v = tVUpdateFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        h hVar = new h(dVar, this.f637v);
        hVar.f636u = ((Number) obj).intValue();
        return hVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        C1530l c1530l = C1530l.f16479a;
        ((h) h((D5.d) obj2, Integer.valueOf(((Number) obj).intValue()))).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        int i7 = this.f636u;
        TVUpdateFragment tVUpdateFragment = this.f637v;
        ((AbstractC0787E) tVUpdateFragment.f0()).f11554x.setProgress(i7);
        ((AbstractC0787E) tVUpdateFragment.f0()).f11556z.setText(i7 + "%");
        if (i7 > 0) {
            ((AbstractC0787E) tVUpdateFragment.f0()).f11554x.setIndeterminate(false);
        }
        return C1530l.f16479a;
    }
}
