package D1;

import L5.p;
import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f493u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SubtitleSettingsFragment f494v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(D5.d dVar, SubtitleSettingsFragment subtitleSettingsFragment) {
        super(2, dVar);
        this.f494v = subtitleSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new i(dVar, this.f494v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((i) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f493u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            SubtitleSettingsFragment subtitleSettingsFragment = this.f494v;
            h hVar = new h(null, subtitleSettingsFragment);
            this.f493u = 1;
            if (P.k(subtitleSettingsFragment, enumC0337o, hVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
