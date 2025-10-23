package p1;

import D1.f;
import L5.l;
import M5.g;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.SubtitleSource;
import j1.AbstractC0800S;
import w0.C1351e;
import w0.E;
import w0.k0;
/* renamed from: p1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082c extends E {

    /* renamed from: g  reason: collision with root package name */
    public static final D1.b f13117g = new D1.b(1);

    /* renamed from: e  reason: collision with root package name */
    public final l f13118e;
    public SubtitleSource f;

    public C1082c(f fVar) {
        super(f13117g);
        this.f13118e = fVar;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        int i8;
        C1081b c1081b = (C1081b) k0Var;
        C1351e c1351e = this.d;
        Object obj = c1351e.f.get(i7);
        g.e(obj, "currentList[position]");
        SubtitleSource subtitleSource = (SubtitleSource) obj;
        String str = subtitleSource.f8079t;
        int length = str.length();
        View view = c1081b.f15576a;
        AbstractC0800S abstractC0800S = c1081b.f13115u;
        if (length == 0) {
            abstractC0800S.f11588s.setText(view.getResources().getString(R.string.no_subtitle));
        } else {
            abstractC0800S.f11588s.setText(str);
        }
        ImageView imageView = abstractC0800S.f11587r;
        g.e(imageView, "binding.imageTick");
        C1082c c1082c = c1081b.f13116v;
        if (!g.a(c1082c.f, subtitleSource)) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        imageView.setVisibility(i8);
        abstractC0800S.f5662g.setOnClickListener(new D1.c(c1082c, 1, subtitleSource));
        SubtitleSource subtitleSource2 = this.f;
        if ((subtitleSource2 == null && i7 == 0) || (subtitleSource2 != null && ((SubtitleSource) c1351e.f.get(i7)).f8076q == subtitleSource2.f8076q)) {
            view.requestFocus();
        }
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        g.f(recyclerView, "parent");
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i8 = AbstractC0800S.f11586t;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0800S abstractC0800S = (AbstractC0800S) androidx.databinding.d.K0(from, R.layout.item_player_settings, recyclerView, false, null);
        g.e(abstractC0800S, "inflate(LayoutInflater.f….context), parent, false)");
        return new C1081b(this, abstractC0800S);
    }
}
