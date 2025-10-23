package B1;

import L5.p;
import com.boxhdo.android.tv.ui.settings.TvSettingsFragment;
import j1.AbstractC0783A;
import java.util.Locale;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f160u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSettingsFragment f161v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D5.d dVar, TvSettingsFragment tvSettingsFragment) {
        super(2, dVar);
        this.f161v = tvSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        d dVar2 = new d(dVar, this.f161v);
        dVar2.f160u = obj;
        return dVar2;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((d) h(dVar, (String) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Locale locale = new Locale((String) this.f160u);
        ((AbstractC0783A) this.f161v.f0()).f11539u.setText(locale.getDisplayLanguage(locale));
        return C1530l.f16479a;
    }
}
