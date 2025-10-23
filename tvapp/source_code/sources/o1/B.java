package o1;

import K1.C0051b;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.Movie;
import k3.AbstractC0958a;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class B extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12818u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerViewModel f12819v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Movie f12820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(TvPlayerViewModel tvPlayerViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f12819v = tvPlayerViewModel;
        this.f12820w = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new B(this.f12819v, this.f12820w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((B) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12818u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                ((C1526h) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0051b c0051b = this.f12819v.f7803h;
            this.f12818u = 1;
            if (c0051b.a(this.f12820w, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
