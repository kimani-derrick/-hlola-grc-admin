package s1;

import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: s1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136k extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13563u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13564v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136k(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13564v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1136k(this.f13564v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1136k) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13563u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TvHomeFragment tvHomeFragment = this.f13564v;
            C1135j c1135j = new C1135j(tvHomeFragment, null);
            this.f13563u = 1;
            if (P.k(tvHomeFragment, enumC0337o, c1135j, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
