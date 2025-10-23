package D1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Subtitle;
import j1.Y;
import w0.E;
import w0.k0;
/* loaded from: classes.dex */
public final class e extends E {
    public static final b f = new b(0);

    /* renamed from: e  reason: collision with root package name */
    public final L5.l f487e;

    public e(f fVar) {
        super(f);
        this.f487e = fVar;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        int i8;
        d dVar = (d) k0Var;
        Object obj = this.d.f.get(i7);
        M5.g.e(obj, "currentList[position]");
        Subtitle subtitle = (Subtitle) obj;
        Y y3 = dVar.f485u;
        y3.f11603s.setText(subtitle.f8074b);
        String str = subtitle.f8073a;
        TextView textView = y3.f11602r;
        textView.setText(str);
        c cVar = new c(dVar.f486v, 0, subtitle);
        View view = dVar.f15576a;
        view.setOnClickListener(cVar);
        Context context = view.getContext();
        if (subtitle.f8075c) {
            i8 = R.color.colorPrimary;
        } else {
            i8 = R.color.white;
        }
        int a7 = A.b.a(context, i8);
        y3.f11603s.setTextColor(a7);
        textView.setTextColor(a7);
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        M5.g.f(recyclerView, "parent");
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i8 = Y.f11601u;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        Y y3 = (Y) androidx.databinding.d.K0(from, R.layout.item_subtitle, recyclerView, false, null);
        M5.g.e(y3, "inflate(LayoutInflater.f….context), parent, false)");
        return new d(this, y3);
    }
}
