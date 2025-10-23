package j0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import w0.L;
import w0.k0;
/* renamed from: j0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779a extends L {
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11513e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final C0782d f11514g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractC0781c f11515h;

    public C0779a(AbstractC0781c abstractC0781c, int i7, int i8, int i9) {
        this.f11515h = abstractC0781c;
        this.d = i7;
        this.f11513e = i9;
        this.f = i8;
        this.f11514g = (C0782d) abstractC0781c.f11524s.get(i9);
    }

    @Override // w0.L
    public final int a() {
        C0782d c0782d = this.f11514g;
        if (c0782d == null) {
            return 0;
        }
        return (c0782d.f11534c - c0782d.f11533b) + 1;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        C0782d c0782d;
        CharSequence charSequence;
        boolean z7 = true;
        C0780b c0780b = (C0780b) k0Var;
        TextView textView = c0780b.f11516u;
        if (textView != null && (c0782d = this.f11514g) != null) {
            int i8 = c0782d.f11533b + i7;
            CharSequence[] charSequenceArr = c0782d.d;
            if (charSequenceArr == null) {
                charSequence = String.format(c0782d.f11535e, Integer.valueOf(i8));
            } else {
                charSequence = charSequenceArr[i8];
            }
            textView.setText(charSequence);
        }
        AbstractC0781c abstractC0781c = this.f11515h;
        ArrayList arrayList = abstractC0781c.f11523r;
        int i9 = this.f11513e;
        if (((VerticalGridView) arrayList.get(i9)).getSelectedPosition() != i7) {
            z7 = false;
        }
        abstractC0781c.c(c0780b.f15576a, z7, i9, false);
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        TextView textView;
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(this.d, (ViewGroup) recyclerView, false);
        int i8 = this.f;
        if (i8 != 0) {
            textView = (TextView) inflate.findViewById(i8);
        } else {
            textView = (TextView) inflate;
        }
        return new C0780b(inflate, textView);
    }

    @Override // w0.L
    public final void h(k0 k0Var) {
        ((C0780b) k0Var).f15576a.setFocusable(this.f11515h.isActivated());
    }
}
