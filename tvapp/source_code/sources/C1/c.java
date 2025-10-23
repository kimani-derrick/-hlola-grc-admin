package C1;

import F5.i;
import L5.p;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.splash.TvSplashFragment;
import com.boxhdo.android.tv.ui.splash.TvSplashViewModel;
import com.boxhdo.domain.model.LatestVersion;
import h1.o;
import k3.AbstractC0958a;
import q1.C1104f;
import q1.l;
import w4.l0;
import z5.C1530l;
/* loaded from: classes.dex */
public final class c extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f362u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSplashFragment f363v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(D5.d dVar, TvSplashFragment tvSplashFragment) {
        super(2, dVar);
        this.f363v = tvSplashFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        c cVar = new c(dVar, this.f363v);
        cVar.f362u = obj;
        return cVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((c) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        LatestVersion latestVersion;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f362u).a();
        if (a7 != null) {
            int ordinal = ((g) a7).ordinal();
            TvSplashFragment tvSplashFragment = this.f363v;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 && (latestVersion = ((TvSplashViewModel) tvSplashFragment.f7905u0.getValue()).f7907h) != null) {
                        tvSplashFragment.i0(new o(latestVersion));
                    }
                } else {
                    tvSplashFragment.n0(new l(R.string.msg_unknown_error), true);
                }
            } else {
                tvSplashFragment.getClass();
                try {
                    l0.o(tvSplashFragment).h(R.id.goToMain, null);
                } catch (Exception unused) {
                }
            }
        }
        return C1530l.f16479a;
    }
}
