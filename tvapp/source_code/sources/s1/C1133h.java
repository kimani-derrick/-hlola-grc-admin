package s1;

import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13558u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133h(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13558u = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1133h(this.f13558u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1133h) h(dVar, (q1.m) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        int i7 = TvHomeFragment.f7827L1;
        TvHomeFragment tvHomeFragment = this.f13558u;
        tvHomeFragment.R0();
        tvHomeFragment.Q0();
        tvHomeFragment.P0();
        return C1530l.f16479a;
    }
}
