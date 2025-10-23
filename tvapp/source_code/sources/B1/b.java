package B1;

import L5.p;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.settings.TvSettingsFragment;
import j1.AbstractC0783A;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class b extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f156u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSettingsFragment f157v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(D5.d dVar, TvSettingsFragment tvSettingsFragment) {
        super(2, dVar);
        this.f157v = tvSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        b bVar = new b(dVar, this.f157v);
        bVar.f156u = obj;
        return bVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((b) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f156u).a();
        if (a7 != null) {
            k kVar = (k) a7;
            boolean z7 = kVar instanceof i;
            TvSettingsFragment tvSettingsFragment = this.f157v;
            if (z7) {
                ((AbstractC0783A) tvSettingsFragment.f0()).f11540v.setText(((i) kVar).f168a.f8093b);
            } else if (!M5.g.a(kVar, j.f169a) && M5.g.a(kVar, j.f170b)) {
                tvSettingsFragment.n0(new q1.l(R.string.message_logout_successful), true);
                tvSettingsFragment.r0();
            }
        }
        return C1530l.f16479a;
    }
}
