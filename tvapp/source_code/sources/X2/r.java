package X2;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import e2.v0;
import w0.V;
import w0.k0;
/* loaded from: classes.dex */
public final class r extends w0.L {
    public final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f4195e;
    public final Drawable[] f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f4196g;

    public r(w wVar, String[] strArr, Drawable[] drawableArr) {
        this.f4196g = wVar;
        this.d = strArr;
        this.f4195e = new String[strArr.length];
        this.f = drawableArr;
    }

    @Override // w0.L
    public final int a() {
        return this.d.length;
    }

    @Override // w0.L
    public final long b(int i7) {
        return i7;
    }

    @Override // w0.L
    public final void d(k0 k0Var, int i7) {
        V v5;
        q qVar = (q) k0Var;
        boolean k5 = k(i7);
        View view = qVar.f15576a;
        if (k5) {
            v5 = new V(-1, -2);
        } else {
            v5 = new V(0, 0);
        }
        view.setLayoutParams(v5);
        qVar.f4191u.setText(this.d[i7]);
        String str = this.f4195e[i7];
        TextView textView = qVar.f4192v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f[i7];
        ImageView imageView = qVar.f4193w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        w wVar = this.f4196g;
        return new q(wVar, LayoutInflater.from(wVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, (ViewGroup) recyclerView, false));
    }

    public final boolean k(int i7) {
        w wVar = this.f4196g;
        v0 v0Var = wVar.f4271x0;
        if (v0Var == null) {
            return false;
        }
        if (i7 != 0) {
            if (i7 != 1) {
                return true;
            }
            if (!((P1.c) v0Var).n(30) || !((P1.c) wVar.f4271x0).n(29)) {
                return false;
            }
            return true;
        }
        return ((P1.c) v0Var).n(13);
    }
}
