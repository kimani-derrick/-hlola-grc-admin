package C1;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.splash.TvSplashFragment;
import com.boxhdo.android.tv.ui.splash.TvSplashViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f364u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSplashFragment f365v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D5.d dVar, TvSplashFragment tvSplashFragment) {
        super(2, dVar);
        this.f365v = tvSplashFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new d(dVar, this.f365v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f364u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvSplashFragment tvSplashFragment = this.f365v;
            T4.c cVar = new T4.c(29, ((TvSplashViewModel) tvSplashFragment.f7905u0.getValue()).f7906g);
            c cVar2 = new c(null, tvSplashFragment);
            this.f364u = 1;
            if (s.e(cVar, cVar2, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
