package D1;

import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsFragment;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f491u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SubtitleSettingsFragment f492v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(D5.d dVar, SubtitleSettingsFragment subtitleSettingsFragment) {
        super(2, dVar);
        this.f492v = subtitleSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new h(dVar, this.f492v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f491u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            SubtitleSettingsFragment subtitleSettingsFragment = this.f492v;
            T4.c cVar = new T4.c(29, ((SubtitleSettingsViewModel) subtitleSettingsFragment.f7908u0.getValue()).f7911h);
            g gVar = new g(null, subtitleSettingsFragment);
            this.f491u = 1;
            if (s.e(cVar, gVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
