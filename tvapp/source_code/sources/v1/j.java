package v1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class j extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f15266u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailFragment f15267v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(D5.d dVar, TvMovieDetailFragment tvMovieDetailFragment) {
        super(2, dVar);
        this.f15267v = tvMovieDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        j jVar = new j(dVar, this.f15267v);
        jVar.f15266u = obj;
        return jVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((j) h(dVar, (InterfaceC0116x) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f15266u;
        TvMovieDetailFragment tvMovieDetailFragment = this.f15267v;
        AbstractC0117y.p(interfaceC0116x, null, 0, new e(null, tvMovieDetailFragment), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new g(null, tvMovieDetailFragment), 3);
        AbstractC0117y.p(interfaceC0116x, null, 0, new i(null, tvMovieDetailFragment), 3);
        return C1530l.f16479a;
    }
}
