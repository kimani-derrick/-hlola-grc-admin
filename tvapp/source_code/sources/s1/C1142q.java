package s1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.home.TvHomeViewModel;
import com.boxhdo.domain.model.HomeRow;
import com.boxhdo.domain.model.Shortcut;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* renamed from: s1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142q extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13568u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeViewModel f13569v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142q(TvHomeViewModel tvHomeViewModel, D5.d dVar) {
        super(2, dVar);
        this.f13569v = tvHomeViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1142q(this.f13569v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1142q) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        Object obj2 = E5.a.f612q;
        int i7 = this.f13568u;
        TvHomeViewModel tvHomeViewModel = this.f13569v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
                a7 = ((C1526h) obj).f16471q;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            K1.l lVar = tvHomeViewModel.f7830g;
            this.f13568u = 1;
            a7 = lVar.a(this);
            if (a7 == obj2) {
                return obj2;
            }
        }
        if (!(a7 instanceof C1525g)) {
            List list = (List) a7;
            if (!list.isEmpty()) {
                ArrayList m02 = A5.k.m0((Collection) tvHomeViewModel.f7832i.getValue());
                if (m02.size() > 1) {
                    if (((HomeRow) m02.get(1)) instanceof HomeRow.ContinueWatchRow) {
                        m02.set(1, new HomeRow.ContinueWatchRow(new Shortcut(15, null, null), A5.k.m0(list)));
                    } else {
                        m02.add(1, new HomeRow.ContinueWatchRow(new Shortcut(15, null, null), A5.k.m0(list)));
                    }
                    tvHomeViewModel.f7832i.f(m02);
                }
            }
        }
        return C1530l.f16479a;
    }
}
