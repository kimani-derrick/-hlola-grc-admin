package v1;

import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class k extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f15268u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailFragment f15269v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(D5.d dVar, TvMovieDetailFragment tvMovieDetailFragment) {
        super(2, dVar);
        this.f15269v = tvMovieDetailFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new k(dVar, this.f15269v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((k) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f15268u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TvMovieDetailFragment tvMovieDetailFragment = this.f15269v;
            j jVar = new j(null, tvMovieDetailFragment);
            this.f15268u = 1;
            if (P.k(tvMovieDetailFragment, enumC0337o, jVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
