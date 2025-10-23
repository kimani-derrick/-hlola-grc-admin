package u1;

import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.login.TvLoginFragment;
import com.boxhdo.android.tv.ui.login.TvLoginViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: u1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257c extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f14677u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvLoginFragment f14678v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257c(D5.d dVar, TvLoginFragment tvLoginFragment) {
        super(2, dVar);
        this.f14678v = tvLoginFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1257c(dVar, this.f14678v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1257c) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f14677u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvLoginFragment tvLoginFragment = this.f14678v;
            T4.c cVar = new T4.c(29, ((TvLoginViewModel) tvLoginFragment.f7843u0.getValue()).f7845h);
            C1256b c1256b = new C1256b(null, tvLoginFragment);
            this.f14677u = 1;
            if (s.e(cVar, c1256b, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
