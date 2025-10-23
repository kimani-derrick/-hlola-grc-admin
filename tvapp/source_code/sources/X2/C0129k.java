package X2;

import H2.m0;
import O3.U;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import e2.C0585B;
import e2.v0;
import java.util.ArrayList;
import java.util.List;
import w0.k0;
/* renamed from: X2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129k extends w0.L {
    public List d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w f4184e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f4185g;

    public C0129k(w wVar, int i7) {
        this.f = i7;
        this.f4185g = wVar;
        this.f4184e = wVar;
    }

    @Override // w0.L
    public final int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // w0.L
    public /* bridge */ /* synthetic */ void d(k0 k0Var, int i7) {
        switch (this.f) {
            case 1:
                o((s) k0Var, i7);
                return;
            default:
                o(k0Var, i7);
                return;
        }
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        return new s(LayoutInflater.from(this.f4184e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }

    public boolean k(W2.h hVar) {
        for (int i7 = 0; i7 < this.d.size(); i7++) {
            if (hVar.f3920O.containsKey(((t) this.d.get(i7)).f4199a.f9691r)) {
                return true;
            }
        }
        return false;
    }

    public void l(List list) {
        Drawable drawable;
        String str;
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= ((U) list).f2623t) {
                break;
            }
            t tVar = (t) ((U) list).get(i7);
            if (tVar.f4199a.f9694u[tVar.f4200b]) {
                z7 = true;
                break;
            }
            i7++;
        }
        w wVar = this.f4185g;
        ImageView imageView = wVar.f4229M;
        if (imageView != null) {
            if (z7) {
                drawable = wVar.f4255p0;
            } else {
                drawable = wVar.f4257q0;
            }
            imageView.setImageDrawable(drawable);
            if (z7) {
                str = wVar.f4259r0;
            } else {
                str = wVar.f4261s0;
            }
            wVar.f4229M.setContentDescription(str);
        }
        this.d = list;
    }

    /* renamed from: m */
    public void o(s sVar, int i7) {
        int i8;
        int i9 = this.f;
        n(sVar, i7);
        switch (i9) {
            case 1:
                if (i7 > 0) {
                    t tVar = (t) this.d.get(i7 - 1);
                    if (tVar.f4199a.f9694u[tVar.f4200b]) {
                        i8 = 0;
                    } else {
                        i8 = 4;
                    }
                    sVar.f4198v.setVisibility(i8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void n(s sVar, int i7) {
        final v0 v0Var = this.f4184e.f4271x0;
        if (v0Var == null) {
            return;
        }
        if (i7 == 0) {
            p(sVar);
            return;
        }
        boolean z7 = true;
        final t tVar = (t) this.d.get(i7 - 1);
        final m0 m0Var = tVar.f4199a.f9691r;
        int i8 = 0;
        if (((C0585B) v0Var).V().f3920O.get(m0Var) == null || !tVar.f4199a.f9694u[tVar.f4200b]) {
            z7 = false;
        }
        sVar.f4197u.setText(tVar.f4201c);
        if (!z7) {
            i8 = 4;
        }
        sVar.f4198v.setVisibility(i8);
        sVar.f15576a.setOnClickListener(new View.OnClickListener() { // from class: X2.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0129k c0129k = C0129k.this;
                c0129k.getClass();
                P1.c cVar = (P1.c) v0Var;
                if (cVar.n(29)) {
                    C0585B c0585b = (C0585B) cVar;
                    W2.h V6 = c0585b.V();
                    V6.getClass();
                    W2.g gVar = new W2.g(V6);
                    t tVar2 = tVar;
                    gVar.e(new W2.u(m0Var, O3.E.x(Integer.valueOf(tVar2.f4200b))));
                    gVar.g(tVar2.f4199a.f9691r.f1135s);
                    c0585b.j0(new W2.h(gVar));
                    c0129k.q(tVar2.f4201c);
                    c0129k.f4184e.f4207A.dismiss();
                }
            }
        });
    }

    public final void p(s sVar) {
        int i7;
        switch (this.f) {
            case 0:
                sVar.f4197u.setText(R.string.exo_track_selection_auto);
                v0 v0Var = this.f4185g.f4271x0;
                v0Var.getClass();
                if (k(((C0585B) v0Var).V())) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                sVar.f4198v.setVisibility(i7);
                sVar.f15576a.setOnClickListener(new C1.b(2, this));
                return;
            default:
                sVar.f4197u.setText(R.string.exo_track_selection_none);
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i9 < this.d.size()) {
                        t tVar = (t) this.d.get(i9);
                        if (tVar.f4199a.f9694u[tVar.f4200b]) {
                            i8 = 4;
                        } else {
                            i9++;
                        }
                    }
                }
                sVar.f4198v.setVisibility(i8);
                sVar.f15576a.setOnClickListener(new C1.b(4, this));
                return;
        }
    }

    public final void q(String str) {
        switch (this.f) {
            case 0:
                this.f4185g.f4266v.f4195e[1] = str;
                return;
            default:
                return;
        }
    }

    private final void r(String str) {
    }
}
