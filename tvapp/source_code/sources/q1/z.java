package q1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.Z;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Movie;
import j1.AbstractC0795M;
/* loaded from: classes.dex */
public final class z extends AbstractC0281a0 {
    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
        y yVar;
        if (obj instanceof Movie) {
            String str = null;
            if (z7 instanceof y) {
                yVar = (y) z7;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                Movie movie = (Movie) obj;
                AbstractC0795M abstractC0795M = yVar.f13276b;
                ImageView imageView = abstractC0795M.f11577r;
                M5.g.e(imageView, "binding.imageMovie");
                if (movie != null) {
                    str = movie.f8031s;
                }
                J0.j a7 = J0.a.a(imageView.getContext());
                S0.f fVar = new S0.f(imageView.getContext());
                fVar.f2984c = str;
                fVar.b(imageView);
                fVar.f2991l = p6.l.R(A5.j.Z(new V0.a[]{new V0.a(abstractC0795M.f5662g.getResources().getDimension(R.dimen.dp_4))}));
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
        int i7 = AbstractC0795M.f11576s;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0795M abstractC0795M = (AbstractC0795M) androidx.databinding.d.K0(from, R.layout.item_movie, viewGroup, false, null);
        M5.g.e(abstractC0795M, "inflate(LayoutInflater.f….context), parent, false)");
        return new y(abstractC0795M);
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
    }
}
