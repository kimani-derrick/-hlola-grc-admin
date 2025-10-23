package D1;

import L5.p;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsFragment;
import com.boxhdo.domain.model.Subtitle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k3.AbstractC0958a;
import q1.C1104f;
import w4.l0;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f489u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SubtitleSettingsFragment f490v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(D5.d dVar, SubtitleSettingsFragment subtitleSettingsFragment) {
        super(2, dVar);
        this.f490v = subtitleSettingsFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        g gVar = new g(dVar, this.f490v);
        gVar.f489u = obj;
        return gVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((g) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f489u).a();
        if (a7 != null) {
            m mVar = (m) a7;
            boolean z7 = mVar instanceof k;
            SubtitleSettingsFragment subtitleSettingsFragment = this.f490v;
            if (z7) {
                Locale[] availableLocales = Locale.getAvailableLocales();
                M5.g.e(availableLocales, "getAvailableLocales()");
                List<Locale> Z6 = A5.j.Z(availableLocales);
                ArrayList arrayList = new ArrayList(A5.m.P(Z6));
                for (Locale locale : Z6) {
                    String language = locale.getLanguage();
                    M5.g.e(language, "locale.language");
                    String displayLanguage = locale.getDisplayLanguage();
                    M5.g.e(displayLanguage, "locale.displayLanguage");
                    arrayList.add(new Subtitle(language, displayLanguage, M5.g.a(locale.getLanguage(), ((k) mVar).f495a)));
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((Subtitle) next).f8074b)) {
                        arrayList2.add(next);
                    }
                }
                ((e) subtitleSettingsFragment.f7909v0.getValue()).d.b(arrayList2, null);
            } else if (!M5.g.a(mVar, l.f496a) && M5.g.a(mVar, l.f497b)) {
                l0.o(subtitleSettingsFragment).k();
            }
        }
        return C1530l.f16479a;
    }
}
