package q1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.Z;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.ContinueWatch;
import j1.AbstractC0789G;
/* loaded from: classes.dex */
public final class v extends AbstractC0281a0 {
    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
        u uVar;
        int i7;
        if (obj instanceof ContinueWatch) {
            if (z7 instanceof u) {
                uVar = (u) z7;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                ContinueWatch continueWatch = (ContinueWatch) obj;
                M5.g.f(continueWatch, "movie");
                AbstractC0789G abstractC0789G = uVar.f13268b;
                ImageView imageView = abstractC0789G.f11560r;
                M5.g.e(imageView, "binding.imageMovie");
                J0.j a7 = J0.a.a(imageView.getContext());
                S0.f fVar = new S0.f(imageView.getContext());
                fVar.f2984c = continueWatch.f7956w;
                fVar.b(imageView);
                a7.b(fVar.a());
                Integer num = continueWatch.f7948B;
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                abstractC0789G.f11561s.setProgress(i7);
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
        int i7 = AbstractC0789G.f11559t;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0789G abstractC0789G = (AbstractC0789G) androidx.databinding.d.K0(from, R.layout.item_continue_watch, viewGroup, false, null);
        M5.g.e(abstractC0789G, "inflate(LayoutInflater.f….context), parent, false)");
        return new u(abstractC0789G);
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
    }
}
