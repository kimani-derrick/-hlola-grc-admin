package B1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.settings.TvSettingsViewModel;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class n extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public Object f175u;

    /* renamed from: v  reason: collision with root package name */
    public int f176v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvSettingsViewModel f177w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TvSettingsViewModel tvSettingsViewModel, D5.d dVar) {
        super(2, dVar);
        this.f177w = tvSettingsViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new n(this.f177w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((n) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object P6;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f176v;
        TvSettingsViewModel tvSettingsViewModel = this.f177w;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return C1530l.f16479a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
            P6 = ((C1526h) obj).f16471q;
        } else {
            AbstractC0958a.H(obj);
            T4.c cVar = tvSettingsViewModel.f7901h;
            this.f176v = 1;
            P6 = cVar.P(this);
            if (P6 == aVar) {
                return aVar;
            }
        }
        if (!(P6 instanceof C1525g)) {
            ((Boolean) P6).getClass();
            tvSettingsViewModel.f7903j.f(new C1104f(j.f170b));
        }
        Throwable a7 = C1526h.a(P6);
        if (a7 != null) {
            this.f175u = P6;
            this.f176v = 2;
            if (tvSettingsViewModel.e(a7, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
