package w1;

import com.boxhdo.android.tv.ui.movies.TvMoviesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: w1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f15712u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMoviesFragment f15713v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375d(TvMoviesFragment tvMoviesFragment, D5.d dVar) {
        super(2, dVar);
        this.f15713v = tvMoviesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1375d c1375d = new C1375d(this.f15713v, dVar);
        c1375d.f15712u = obj;
        return c1375d;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1375d) h(dVar, (n) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        n nVar = (n) this.f15712u;
        if (!M5.g.a(nVar, l.f15724a) && (nVar instanceof m)) {
            TvMoviesFragment tvMoviesFragment = this.f15713v;
            if (!tvMoviesFragment.f7861K1) {
                tvMoviesFragment.O0(((m) nVar).f15725a);
            }
            tvMoviesFragment.f7861K1 = false;
        }
        return C1530l.f16479a;
    }
}
