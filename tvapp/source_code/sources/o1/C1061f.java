package o1;

import android.widget.ImageView;
import androidx.fragment.app.M;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import j1.AbstractC0803a;
import j1.AbstractC0821s;
import j1.AbstractC0825w;
import n0.C0999A;
/* renamed from: o1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1061f implements M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12849a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12850b;

    public /* synthetic */ C1061f(int i7, Object obj) {
        this.f12849a = i7;
        this.f12850b = obj;
    }

    @Override // androidx.fragment.app.M
    public final void a() {
        int i7;
        AbstractC0825w abstractC0825w;
        ImageView imageView;
        Integer num;
        AbstractC0821s abstractC0821s;
        i1.c cVar;
        n0.v e3;
        Object obj = this.f12850b;
        switch (this.f12849a) {
            case 0:
                int i8 = TvPlayerActivity.f7794Y;
                TvPlayerActivity tvPlayerActivity = (TvPlayerActivity) obj;
                M5.g.f(tvPlayerActivity, "this$0");
                int I6 = tvPlayerActivity.W().I();
                AbstractC0803a abstractC0803a = (AbstractC0803a) tvPlayerActivity.U();
                if (I6 > 0) {
                    i7 = 393216;
                } else {
                    i7 = 131072;
                }
                abstractC0803a.f11607r.setDescendantFocusability(i7);
                if (I6 <= 0 && (abstractC0825w = tvPlayerActivity.W) != null && (imageView = abstractC0825w.f11745s) != null) {
                    imageView.requestFocus();
                    return;
                }
                return;
            default:
                TvMainFragment tvMainFragment = (TvMainFragment) obj;
                M5.g.f(tvMainFragment, "this$0");
                C0999A c0999a = tvMainFragment.y0;
                if (c0999a != null && (e3 = c0999a.e()) != null) {
                    num = Integer.valueOf(e3.f12607x);
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == R.id.home) {
                    tvMainFragment.r0().e(tvMainFragment.f7839v0);
                    abstractC0821s = (AbstractC0821s) tvMainFragment.f0();
                    cVar = i1.c.f11324r;
                } else if (num != null && num.intValue() == R.id.search) {
                    tvMainFragment.r0().e(true);
                    abstractC0821s = (AbstractC0821s) tvMainFragment.f0();
                    cVar = i1.c.f11323q;
                } else if (num != null && num.intValue() == R.id.movies) {
                    tvMainFragment.r0().e(true);
                    abstractC0821s = (AbstractC0821s) tvMainFragment.f0();
                    cVar = i1.c.f11325s;
                } else if (num != null && num.intValue() == R.id.tvSeries) {
                    tvMainFragment.r0().e(true);
                    abstractC0821s = (AbstractC0821s) tvMainFragment.f0();
                    cVar = i1.c.f11326t;
                } else if (num != null && num.intValue() == R.id.myList) {
                    tvMainFragment.r0().e(true);
                    abstractC0821s = (AbstractC0821s) tvMainFragment.f0();
                    cVar = i1.c.f11327u;
                } else if (num != null && num.intValue() == R.id.settings) {
                    tvMainFragment.r0().e(true);
                    abstractC0821s = (AbstractC0821s) tvMainFragment.f0();
                    cVar = i1.c.f11328v;
                } else {
                    return;
                }
                abstractC0821s.f11717r.setSelected(cVar);
                return;
        }
    }
}
