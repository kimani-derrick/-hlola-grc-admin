package w1;

import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.movies.TvMoviesFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: w1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f15714u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvMoviesFragment f15715v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376e(TvMoviesFragment tvMoviesFragment, D5.d dVar) {
        super(2, dVar);
        this.f15715v = tvMoviesFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1376e(this.f15715v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1376e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f15714u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            int i8 = TvMoviesFragment.f7859L1;
            TvMoviesFragment tvMoviesFragment = this.f15715v;
            T4.c cVar = new T4.c(29, tvMoviesFragment.T0().f7863h);
            C1375d c1375d = new C1375d(tvMoviesFragment, null);
            this.f15714u = 1;
            if (s.e(cVar, c1375d, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
