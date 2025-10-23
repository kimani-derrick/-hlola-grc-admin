package t1;

import androidx.activity.n;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import n0.C0999A;
/* renamed from: t1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227c extends n {
    public final /* synthetic */ TvMainFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1227c(TvMainFragment tvMainFragment) {
        super(true);
        this.d = tvMainFragment;
    }

    @Override // androidx.activity.n
    public final void b() {
        TvMainFragment tvMainFragment = this.d;
        if (tvMainFragment.f7839v0) {
            tvMainFragment.u0();
            return;
        }
        C0999A c0999a = tvMainFragment.y0;
        if (c0999a != null) {
            c0999a.l(R.id.home, false);
        }
        e(false);
    }
}
