package r1;

import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Season;
import j1.W;
import w0.E;
import w0.k0;
/* loaded from: classes.dex */
public final class q extends E {
    public static final D1.b f = new D1.b(3);

    /* renamed from: e  reason: collision with root package name */
    public final L5.l f13444e;

    public q(d dVar) {
        super(f);
        this.f13444e = dVar;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        int i8;
        p pVar = (p) k0Var;
        Object obj = this.d.f.get(i7);
        M5.g.e(obj, "currentList[position]");
        Season season = (Season) obj;
        W w7 = pVar.f13442u;
        w7.f11597s.setText(season.f8056r);
        Resources resources = pVar.f15576a.getResources();
        int i9 = season.f8057s;
        if (i9 > 1) {
            i8 = R.string.format_number_episodes;
        } else {
            i8 = R.string.format_number_episode;
        }
        w7.f11596r.setText(resources.getString(i8, String.valueOf(i9)));
        w7.f5662g.setOnClickListener(new D1.c(pVar, 3, season));
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        M5.g.f(recyclerView, "parent");
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i8 = W.f11595u;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        W w7 = (W) androidx.databinding.d.K0(from, R.layout.item_season, recyclerView, false, null);
        M5.g.e(w7, "inflate(LayoutInflater.f….context), parent, false)");
        return new p(w7, this.f13444e);
    }
}
