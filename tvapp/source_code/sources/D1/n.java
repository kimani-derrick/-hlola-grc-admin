package D1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsViewModel;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class n extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public Object f498u;

    /* renamed from: v  reason: collision with root package name */
    public int f499v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ SubtitleSettingsViewModel f500w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SubtitleSettingsViewModel subtitleSettingsViewModel, D5.d dVar) {
        super(2, dVar);
        this.f500w = subtitleSettingsViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new n(this.f500w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((n) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f499v;
        SubtitleSettingsViewModel subtitleSettingsViewModel = this.f500w;
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
            L1.d dVar = subtitleSettingsViewModel.f7910g;
            this.f499v = 1;
            a7 = dVar.a(this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            subtitleSettingsViewModel.f7911h.f(new C1104f(new k((String) a7)));
        }
        Throwable a8 = C1526h.a(a7);
        if (a8 != null) {
            this.f498u = a7;
            this.f499v = 2;
            if (subtitleSettingsViewModel.e(a8, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
