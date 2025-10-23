package r1;

import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Episode;
import j1.AbstractC0791I;
import w0.E;
import w0.k0;
import w4.l0;
/* loaded from: classes.dex */
public final class c extends E {
    public static final D1.b f = new D1.b(2);

    /* renamed from: e  reason: collision with root package name */
    public final L5.l f13417e;

    public c(d dVar) {
        super(f);
        this.f13417e = dVar;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        C1113b c1113b = (C1113b) k0Var;
        Object obj = this.d.f.get(i7);
        M5.g.e(obj, "currentList[position]");
        Episode episode = (Episode) obj;
        AbstractC0791I abstractC0791I = c1113b.f13415u;
        abstractC0791I.f11566s.setText(c1113b.f15576a.getResources().getString(R.string.format_episode, Long.valueOf(episode.f7971v), episode.f7970u));
        ImageView imageView = abstractC0791I.f11565r;
        M5.g.e(imageView, "imageEpisode");
        J0.j a7 = J0.a.a(imageView.getContext());
        S0.f fVar = new S0.f(imageView.getContext());
        fVar.f2984c = episode.f7968s;
        fVar.b(imageView);
        fVar.f3004z = Integer.valueOf((int) R.drawable.drawable_default_episode);
        fVar.f2968A = null;
        fVar.f2969B = Integer.valueOf((int) R.drawable.drawable_default_episode);
        fVar.f2970C = null;
        a7.b(fVar.a());
        abstractC0791I.f11567t.setText(l0.q(episode.f7972w, "dd/MM/yyyy"));
        abstractC0791I.f11568u.setOnClickListener(new D1.c(c1113b, 2, episode));
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        M5.g.f(recyclerView, "parent");
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i8 = AbstractC0791I.f11564v;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0791I abstractC0791I = (AbstractC0791I) androidx.databinding.d.K0(from, R.layout.item_episode, recyclerView, false, null);
        M5.g.e(abstractC0791I, "inflate(LayoutInflater.f….context), parent, false)");
        return new C1113b(abstractC0791I, this.f13417e);
    }
}
