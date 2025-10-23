package u1;

import L5.p;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import com.boxhdo.android.tv.ui.activity.main.TvActivity;
import com.boxhdo.android.tv.ui.login.TvLoginFragment;
import j1.AbstractC0819q;
import k3.AbstractC0958a;
import q1.C1104f;
import q1.l;
import q1.t;
import z5.C1530l;
/* renamed from: u1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256b extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f14675u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvLoginFragment f14676v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256b(D5.d dVar, TvLoginFragment tvLoginFragment) {
        super(2, dVar);
        this.f14676v = tvLoginFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1256b c1256b = new C1256b(dVar, this.f14676v);
        c1256b.f14675u = obj;
        return c1256b;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1256b) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        TvActivity tvActivity;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f14675u).a();
        if (a7 != null) {
            k kVar = (k) a7;
            if (!M5.g.a(kVar, C1262h.f14688b)) {
                boolean a8 = M5.g.a(kVar, C1262h.f14687a);
                TvLoginFragment tvLoginFragment = this.f14676v;
                if (a8) {
                    tvLoginFragment.n0(new l(R.string.message_login_fail), true);
                } else if (kVar instanceof i) {
                    SpannableString spannableString = new SpannableString(tvLoginFragment.u().getString(R.string.message_input_code, ((i) kVar).f14689a.f8089b));
                    TextView textView = ((AbstractC0819q) tvLoginFragment.f0()).f11714s;
                    spannableString.setSpan(new ForegroundColorSpan(A.b.a(textView.getContext(), R.color.colorPrimary)), U5.f.m0(spannableString, ":", 6) + 1, spannableString.length(), 34);
                    textView.setText(spannableString);
                } else if (kVar instanceof j) {
                    q1.g m7 = tvLoginFragment.m();
                    if (m7 instanceof TvActivity) {
                        tvActivity = (TvActivity) m7;
                    } else {
                        tvActivity = null;
                    }
                    if (tvActivity != null) {
                        TVViewModel tVViewModel = (TVViewModel) tvActivity.f7791T.getValue();
                        tVViewModel.d(false, new n1.i(tVViewModel, null));
                    }
                    tvLoginFragment.n0(new l(R.string.message_login_success), true);
                    t.p0(tvLoginFragment);
                }
            }
        }
        return C1530l.f16479a;
    }
}
