package B1;

import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.settings.TvSettingsFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class c extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f158u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSettingsFragment f159v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(D5.d dVar, TvSettingsFragment tvSettingsFragment) {
        super(2, dVar);
        this.f159v = tvSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new c(dVar, this.f159v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((c) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f158u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TvSettingsFragment tvSettingsFragment = this.f159v;
            T4.c cVar = new T4.c(29, tvSettingsFragment.h0().f7903j);
            b bVar = new b(null, tvSettingsFragment);
            this.f158u = 1;
            if (s.e(cVar, bVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
