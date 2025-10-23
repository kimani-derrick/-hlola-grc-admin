package s1;

import androidx.leanback.widget.C0280a;
import androidx.leanback.widget.J;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import com.boxhdo.domain.model.HomeRow;
import com.boxhdo.domain.model.Shortcut;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.ArrayList;
import java.util.List;
import k3.AbstractC0958a;
import q1.x;
import z5.C1530l;
/* renamed from: s1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f13550u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13551v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129d(TvHomeFragment tvHomeFragment, D5.d dVar) {
        super(2, dVar);
        this.f13551v = tvHomeFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1129d c1129d = new C1129d(this.f13551v, dVar);
        c1129d.f13550u = obj;
        return c1129d;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1129d) h(dVar, (List) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String str;
        Shortcut shortcut;
        AbstractC0958a.H(obj);
        List list = (List) this.f13550u;
        if (!list.isEmpty()) {
            int i7 = TvHomeFragment.f7827L1;
            TvHomeFragment tvHomeFragment = this.f13551v;
            tvHomeFragment.J0().f11652s.b();
            ShimmerFrameLayout shimmerFrameLayout = tvHomeFragment.J0().f11652s;
            M5.g.e(shimmerFrameLayout, "shimmerBinding.shimmerLayout");
            shimmerFrameLayout.setVisibility(8);
            List list2 = list;
            ArrayList arrayList = new ArrayList(A5.m.P(list2));
            int i8 = 0;
            for (Object obj2 : list2) {
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    HomeRow homeRow = (HomeRow) obj2;
                    C0280a c0280a = new C0280a((x) tvHomeFragment.f7829K1.getValue());
                    if (homeRow instanceof HomeRow.MovieRow) {
                        HomeRow.MovieRow movieRow = (HomeRow.MovieRow) homeRow;
                        c0280a.e(0, movieRow.f7998b);
                        shortcut = movieRow.f7997a;
                    } else if (homeRow instanceof HomeRow.NetworkRow) {
                        HomeRow.NetworkRow networkRow = (HomeRow.NetworkRow) homeRow;
                        c0280a.e(0, networkRow.f8002c);
                        shortcut = networkRow.f8001b;
                    } else {
                        if (homeRow instanceof HomeRow.ContinueWatchRow) {
                            c0280a.e(0, ((HomeRow.ContinueWatchRow) homeRow).f7996b);
                            str = tvHomeFragment.u().getString(R.string.continue_watch);
                            M5.g.e(str, "{\n                      …                        }");
                        } else {
                            str = "";
                        }
                        arrayList.add(new J(new B0.d(5, str, false), c0280a, 0));
                        i8 = i9;
                    }
                    str = shortcut.f8062r;
                    arrayList.add(new J(new B0.d(5, str, false), c0280a, 0));
                    i8 = i9;
                } else {
                    A5.l.O();
                    throw null;
                }
            }
            C0280a c0280a2 = tvHomeFragment.f13223B1;
            c0280a2.f();
            c0280a2.e(0, arrayList);
        }
        return C1530l.f16479a;
    }
}
