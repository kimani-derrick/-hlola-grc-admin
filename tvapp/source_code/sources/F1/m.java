package F1;

import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f646u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateFragment f647v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(D5.d dVar, TVUpdateFragment tVUpdateFragment) {
        super(2, dVar);
        this.f647v = tVUpdateFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new m(dVar, this.f647v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((m) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f646u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            TVUpdateFragment tVUpdateFragment = this.f647v;
            l lVar = new l(null, tVUpdateFragment);
            this.f646u = 1;
            if (P.k(tVUpdateFragment, enumC0337o, lVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
