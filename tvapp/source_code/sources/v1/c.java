package v1;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Movie;
import j1.AbstractC0802U;
import w0.E;
import w0.k0;
/* loaded from: classes.dex */
public final class c extends E {
    public static final D1.b f = new D1.b(4);

    /* renamed from: e  reason: collision with root package name */
    public final L5.l f15253e;

    public c(A5.a aVar) {
        super(f);
        this.f15253e = aVar;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        C1316b c1316b = (C1316b) k0Var;
        Object obj = this.d.f.get(i7);
        M5.g.e(obj, "currentList[position]");
        Movie movie = (Movie) obj;
        AbstractC0802U abstractC0802U = c1316b.f15251u;
        ImageView imageView = abstractC0802U.f11592r;
        M5.g.e(imageView, "imageMovie");
        J0.j a7 = J0.a.a(imageView.getContext());
        S0.f fVar = new S0.f(imageView.getContext());
        fVar.f2984c = movie.f8031s;
        fVar.b(imageView);
        View view = abstractC0802U.f5662g;
        fVar.f2991l = p6.l.R(A5.j.Z(new V0.a[]{new V0.a(view.getResources().getDimension(R.dimen.dp_4))}));
        a7.b(fVar.a());
        view.setOnClickListener(new D1.c(c1316b.f15252v, 4, movie));
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        M5.g.f(recyclerView, "parent");
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i8 = AbstractC0802U.f11591s;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0802U abstractC0802U = (AbstractC0802U) androidx.databinding.d.K0(from, R.layout.item_relate, recyclerView, false, null);
        M5.g.e(abstractC0802U, "inflate(LayoutInflater.f….context), parent, false)");
        return new C1316b(this, abstractC0802U);
    }
}
