package u1;

import L5.p;
import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import W5.p0;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.login.TvLoginViewModel;
import com.boxhdo.domain.model.trakt.TraktDevice;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* renamed from: u1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261g extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public Object f14684u;

    /* renamed from: v  reason: collision with root package name */
    public int f14685v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvLoginViewModel f14686w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261g(TvLoginViewModel tvLoginViewModel, D5.d dVar) {
        super(2, dVar);
        this.f14686w = tvLoginViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1261g(this.f14686w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1261g) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        int Y6;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f14685v;
        TvLoginViewModel tvLoginViewModel = this.f14686w;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return C1530l.f16479a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
            a7 = ((C1526h) obj).f16471q;
        } else {
            AbstractC0958a.H(obj);
            M1.b bVar = tvLoginViewModel.f;
            this.f14685v = 1;
            a7 = bVar.a(this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            TraktDevice traktDevice = (TraktDevice) a7;
            tvLoginViewModel.f7845h.f(new C1104f(new i(traktDevice)));
            p0 p3 = AbstractC0117y.p(P.i(tvLoginViewModel), null, 0, new C1260f(traktDevice, tvLoginViewModel, null), 3);
            do {
                Y6 = p3.Y(p3.K());
                if (Y6 == 0) {
                    break;
                }
            } while (Y6 != 1);
        }
        Throwable a8 = C1526h.a(a7);
        if (a8 != null) {
            this.f14684u = a7;
            this.f14685v = 2;
            if (tvLoginViewModel.e(a8, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
