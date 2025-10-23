package o1;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.type.Quality;
import e2.C0585B;
import e2.q0;
import j1.AbstractC0809g;
import j1.AbstractC0811i;
/* renamed from: o1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1056a implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12834a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.databinding.d f12835b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0263q f12836c;

    public /* synthetic */ C1056a(androidx.databinding.d dVar, DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q, int i7) {
        this.f12834a = i7;
        this.f12835b = dVar;
        this.f12836c = dialogInterface$OnCancelListenerC0263q;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i7) {
        TvPlayerViewModel k02;
        Quality quality;
        TvPlayerActivity tvPlayerActivity;
        float f;
        switch (this.f12834a) {
            case 0:
                AbstractC0809g abstractC0809g = (AbstractC0809g) this.f12835b;
                M5.g.f(abstractC0809g, "$this_with");
                C1057b c1057b = (C1057b) this.f12836c;
                M5.g.f(c1057b, "this$0");
                if (i7 == abstractC0809g.f11634r.getId()) {
                    k02 = c1057b.k0();
                    quality = Quality.f8104q;
                } else if (i7 == abstractC0809g.f11635s.getId()) {
                    k02 = c1057b.k0();
                    quality = Quality.f8105r;
                } else if (i7 == abstractC0809g.f11637u.getId()) {
                    k02 = c1057b.k0();
                    quality = Quality.f8106s;
                } else if (i7 == abstractC0809g.f11639w.getId()) {
                    k02 = c1057b.k0();
                    quality = Quality.f8107t;
                } else {
                    if (i7 == abstractC0809g.f11638v.getId()) {
                        k02 = c1057b.k0();
                        quality = Quality.f8108u;
                    }
                    c1057b.f0(true, false);
                    return;
                }
                k02.g(quality);
                c1057b.f0(true, false);
                return;
            default:
                AbstractC0811i abstractC0811i = (AbstractC0811i) this.f12835b;
                M5.g.f(abstractC0811i, "$this_with");
                C1059d c1059d = (C1059d) this.f12836c;
                M5.g.f(c1059d, "this$0");
                RadioButton radioButton = (RadioButton) abstractC0811i.f11648r.findViewById(i7);
                q1.g m7 = c1059d.m();
                Float f7 = null;
                if (m7 instanceof TvPlayerActivity) {
                    tvPlayerActivity = (TvPlayerActivity) m7;
                } else {
                    tvPlayerActivity = null;
                }
                if (tvPlayerActivity != null) {
                    String obj = radioButton.getTag().toString();
                    M5.g.f(obj, "<this>");
                    try {
                        U5.d dVar = U5.e.f3487a;
                        dVar.getClass();
                        if (dVar.f3486q.matcher(obj).matches()) {
                            f7 = Float.valueOf(Float.parseFloat(obj));
                        }
                    } catch (NumberFormatException unused) {
                    }
                    if (f7 != null) {
                        f = f7.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    tvPlayerActivity.d0().f7814t = f;
                    P1.c cVar = (P1.c) tvPlayerActivity.c0();
                    cVar.getClass();
                    C0585B c0585b = (C0585B) cVar;
                    c0585b.q0();
                    c0585b.h0(new q0(f, c0585b.f9472w0.n.f10064r));
                }
                c1059d.f0(true, false);
                return;
        }
    }
}
