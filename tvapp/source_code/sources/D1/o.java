package D1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsViewModel;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class o extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f501u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SubtitleSettingsViewModel f502v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SubtitleSettingsViewModel subtitleSettingsViewModel, String str, D5.d dVar) {
        super(2, dVar);
        this.f502v = subtitleSettingsViewModel;
        this.f503w = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new o(this.f502v, this.f503w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((o) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f501u;
        SubtitleSettingsViewModel subtitleSettingsViewModel = this.f502v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                ((C1526h) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            L1.j jVar = subtitleSettingsViewModel.f;
            this.f501u = 1;
            if (jVar.a(this.f503w, this) == aVar) {
                return aVar;
            }
        }
        subtitleSettingsViewModel.f7911h.f(new C1104f(l.f497b));
        return C1530l.f16479a;
    }
}
