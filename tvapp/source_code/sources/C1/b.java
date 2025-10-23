package C1;

import X.i;
import X2.B;
import X2.C0129k;
import X2.q;
import X2.w;
import Z2.H;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.splash.TvSplashFragment;
import com.boxhdo.android.tv.ui.splash.TvSplashViewModel;
import e2.C0585B;
import e2.v0;
import j1.AbstractC0785C;
import o1.C1057b;
import o1.C1059d;
import p1.C1083d;
import w0.L;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f360q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f361r;

    public /* synthetic */ b(int i7, Object obj) {
        this.f360q = i7;
        this.f361r = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        L l7;
        Object obj = this.f361r;
        switch (this.f360q) {
            case 0:
                TvSplashFragment tvSplashFragment = (TvSplashFragment) obj;
                M5.g.f(tvSplashFragment, "this$0");
                Button button = ((AbstractC0785C) tvSplashFragment.f0()).f11543r;
                M5.g.e(button, "binding.buttonRetry");
                button.setVisibility(8);
                ProgressBar progressBar = ((AbstractC0785C) tvSplashFragment.f0()).f11545t;
                M5.g.e(progressBar, "binding.loading");
                progressBar.setVisibility(0);
                TvSplashViewModel tvSplashViewModel = (TvSplashViewModel) tvSplashFragment.f7905u0.getValue();
                tvSplashViewModel.d(false, new h(tvSplashViewModel, null));
                return;
            case 1:
                w.a((w) obj);
                return;
            case 2:
                w wVar = ((C0129k) obj).f4185g;
                v0 v0Var = wVar.f4271x0;
                if (v0Var != null && ((P1.c) v0Var).n(29)) {
                    W2.h V6 = ((C0585B) wVar.f4271x0).V();
                    v0 v0Var2 = wVar.f4271x0;
                    int i7 = H.f4603a;
                    V6.getClass();
                    W2.g gVar = new W2.g(V6);
                    gVar.a(1);
                    gVar.g(1);
                    ((C0585B) v0Var2).j0(new W2.h(gVar));
                    wVar.f4266v.f4195e[1] = wVar.getResources().getString(R.string.exo_track_selection_auto);
                    wVar.f4207A.dismiss();
                    return;
                }
                return;
            case 3:
                q qVar = (q) obj;
                int e3 = qVar.e();
                w wVar2 = qVar.f4194x;
                View view2 = wVar2.f4233P;
                if (e3 == 0) {
                    view2.getClass();
                    l7 = wVar2.f4268w;
                } else if (e3 == 1) {
                    view2.getClass();
                    l7 = wVar2.f4272y;
                } else {
                    wVar2.f4207A.dismiss();
                    return;
                }
                wVar2.e(l7, view2);
                return;
            case 4:
                w wVar3 = ((C0129k) obj).f4185g;
                v0 v0Var3 = wVar3.f4271x0;
                if (v0Var3 != null && ((P1.c) v0Var3).n(29)) {
                    W2.h V7 = ((C0585B) wVar3.f4271x0).V();
                    v0 v0Var4 = wVar3.f4271x0;
                    V7.getClass();
                    W2.g gVar2 = new W2.g(V7);
                    gVar2.a(3);
                    gVar2.f3901u = -3;
                    ((C0585B) v0Var4).j0(new W2.h(gVar2));
                    wVar3.f4207A.dismiss();
                    return;
                }
                return;
            case 5:
                B.a((B) obj, view);
                return;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                C1057b c1057b = (C1057b) obj;
                M5.g.f(c1057b, "this$0");
                c1057b.f0(true, false);
                return;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                C1059d c1059d = (C1059d) obj;
                M5.g.f(c1059d, "this$0");
                c1059d.f0(true, false);
                return;
            default:
                C1083d c1083d = (C1083d) obj;
                M5.g.f(c1083d, "this$0");
                q1.g m7 = c1083d.m();
                if (m7 != null) {
                    m7.onBackPressed();
                    return;
                }
                return;
        }
    }
}
