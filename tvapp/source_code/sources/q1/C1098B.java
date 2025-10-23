package q1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.Z;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Network;
import j1.AbstractC0798P;
/* renamed from: q1.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098B extends AbstractC0281a0 {
    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
        C1097A c1097a;
        if (obj instanceof Network) {
            if (z7 instanceof C1097A) {
                c1097a = (C1097A) z7;
            } else {
                c1097a = null;
            }
            if (c1097a != null) {
                Network network = (Network) obj;
                M5.g.f(network, "network");
                ImageView imageView = c1097a.f13220b.f11583r;
                M5.g.e(imageView, "binding.imageNetwork");
                J0.j a7 = J0.a.a(imageView.getContext());
                S0.f fVar = new S0.f(imageView.getContext());
                fVar.f2984c = network.f8048s;
                fVar.b(imageView);
                a7.b(fVar.a());
            }
        }
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final Z d(ViewGroup viewGroup) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        LayoutInflater from = LayoutInflater.from(context);
        int i7 = AbstractC0798P.f11582s;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0798P abstractC0798P = (AbstractC0798P) androidx.databinding.d.K0(from, R.layout.item_network, viewGroup, false, null);
        M5.g.e(abstractC0798P, "inflate(LayoutInflater.f….context), parent, false)");
        return new C1097A(abstractC0798P);
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
    }
}
