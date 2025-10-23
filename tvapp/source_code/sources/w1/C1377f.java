package w1;

import com.boxhdo.android.tv.ui.movies.TvMoviesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: w1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TvMoviesFragment f15716u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377f(TvMoviesFragment tvMoviesFragment, D5.d dVar) {
        super(2, dVar);
        this.f15716u = tvMoviesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1377f(this.f15716u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1377f) h(dVar, (q1.m) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        int i7 = TvMoviesFragment.f7859L1;
        TvMoviesFragment tvMoviesFragment = this.f15716u;
        tvMoviesFragment.R0();
        tvMoviesFragment.Q0();
        tvMoviesFragment.P0();
        return C1530l.f16479a;
    }
}
