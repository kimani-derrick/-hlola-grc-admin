package A1;

import K1.F;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.search.TvSearchViewModel;
import com.boxhdo.domain.model.Page;
import java.util.Locale;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class r extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f48u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvSearchViewModel f49v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f50w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f51x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TvSearchViewModel tvSearchViewModel, String str, int i7, D5.d dVar) {
        super(2, dVar);
        this.f49v = tvSearchViewModel;
        this.f50w = str;
        this.f51x = i7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new r(this.f49v, this.f50w, this.f51x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((r) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f48u;
        TvSearchViewModel tvSearchViewModel = this.f49v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                a7 = ((C1526h) obj).f16471q;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            F f = tvSearchViewModel.f;
            Locale locale = Locale.getDefault();
            M5.g.e(locale, "getDefault()");
            String upperCase = this.f50w.toUpperCase(locale);
            M5.g.e(upperCase, "toUpperCase(...)");
            this.f48u = 1;
            a7 = f.a(upperCase, this.f51x, 50, this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            tvSearchViewModel.f7897g.f(new C1104f(new p(((Page) a7).f8051c)));
        }
        return C1530l.f16479a;
    }
}
