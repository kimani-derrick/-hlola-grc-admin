package B1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.settings.TvSettingsViewModel;
import com.boxhdo.domain.model.trakt.TraktProfile;
import com.google.android.gms.internal.measurement.K1;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class l extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f171u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSettingsViewModel f172v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TvSettingsViewModel tvSettingsViewModel, D5.d dVar) {
        super(2, dVar);
        this.f172v = tvSettingsViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new l(this.f172v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((l) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object s6;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f171u;
        TvSettingsViewModel tvSettingsViewModel = this.f172v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                s6 = ((C1526h) obj).f16471q;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            K1 k12 = tvSettingsViewModel.f7900g;
            this.f171u = 1;
            s6 = k12.s(this);
            if (s6 == aVar) {
                return aVar;
            }
        }
        if (!(s6 instanceof C1525g)) {
            tvSettingsViewModel.f7903j.f(new C1104f(new i((TraktProfile) s6)));
        }
        return C1530l.f16479a;
    }
}
