package s1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.home.TvHomeViewModel;
import com.boxhdo.domain.model.Movie;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144s extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13575u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f13576v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvHomeViewModel f13577w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Movie f13578x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144s(boolean z7, TvHomeViewModel tvHomeViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f13576v = z7;
        this.f13577w = tvHomeViewModel;
        this.f13578x = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1144s(this.f13576v, this.f13577w, this.f13578x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1144s) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13575u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            if (this.f13576v) {
                this.f13575u = 1;
                if (AbstractC0117y.f(400L, this) == aVar) {
                    return aVar;
                }
            }
        }
        this.f13577w.f7834k.f(new C1140o(this.f13578x));
        return C1530l.f16479a;
    }
}
