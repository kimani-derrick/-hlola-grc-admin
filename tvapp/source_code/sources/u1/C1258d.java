package u1;

import L5.p;
import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.login.TvLoginFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: u1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258d extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f14679u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvLoginFragment f14680v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1258d(D5.d dVar, TvLoginFragment tvLoginFragment) {
        super(2, dVar);
        this.f14680v = tvLoginFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1258d(dVar, this.f14680v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1258d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f14679u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TvLoginFragment tvLoginFragment = this.f14680v;
            C1257c c1257c = new C1257c(null, tvLoginFragment);
            this.f14679u = 1;
            if (P.k(tvLoginFragment, enumC0337o, c1257c, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
