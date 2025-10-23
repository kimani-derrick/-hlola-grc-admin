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
public final class s extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public Object f52u;

    /* renamed from: v  reason: collision with root package name */
    public int f53v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvSearchViewModel f54w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f55x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(TvSearchViewModel tvSearchViewModel, String str, D5.d dVar) {
        super(2, dVar);
        this.f54w = tvSearchViewModel;
        this.f55x = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new s(this.f54w, this.f55x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((s) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f53v;
        TvSearchViewModel tvSearchViewModel = this.f54w;
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
            F f = tvSearchViewModel.f;
            Locale locale = Locale.getDefault();
            M5.g.e(locale, "getDefault()");
            String upperCase = this.f55x.toUpperCase(locale);
            M5.g.e(upperCase, "toUpperCase(...)");
            this.f53v = 1;
            a7 = f.a(upperCase, 1, 50, this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            tvSearchViewModel.f7897g.f(new C1104f(new o(((Page) a7).f8051c)));
        }
        Throwable a8 = C1526h.a(a7);
        if (a8 != null) {
            this.f52u = a7;
            this.f53v = 2;
            if (tvSearchViewModel.e(a8, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
