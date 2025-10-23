package B1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.settings.TvSettingsViewModel;
import k3.AbstractC0958a;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f173u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSettingsViewModel f174v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TvSettingsViewModel tvSettingsViewModel, D5.d dVar) {
        super(2, dVar);
        this.f174v = tvSettingsViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new m(this.f174v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((m) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f173u;
        TvSettingsViewModel tvSettingsViewModel = this.f174v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                a7 = ((C1526h) obj).f16471q;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            L1.d dVar = tvSettingsViewModel.f7902i;
            this.f173u = 1;
            a7 = dVar.a(this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            tvSettingsViewModel.f7904k.f((String) a7);
        }
        return C1530l.f16479a;
    }
}
