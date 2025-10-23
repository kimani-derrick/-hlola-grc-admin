package X2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import w0.k0;
/* loaded from: classes.dex */
public final class o extends w0.L {
    public final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f4189e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f4190g;

    public o(w wVar, String[] strArr, float[] fArr) {
        this.f4190g = wVar;
        this.d = strArr;
        this.f4189e = fArr;
    }

    @Override // w0.L
    public final int a() {
        return this.d.length;
    }

    @Override // w0.L
    public final void d(k0 k0Var, final int i7) {
        s sVar = (s) k0Var;
        String[] strArr = this.d;
        if (i7 < strArr.length) {
            sVar.f4197u.setText(strArr[i7]);
        }
        int i8 = this.f;
        View view = sVar.f4198v;
        View view2 = sVar.f15576a;
        if (i7 == i8) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: X2.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                o oVar = o.this;
                int i9 = oVar.f;
                int i10 = i7;
                w wVar = oVar.f4190g;
                if (i10 != i9) {
                    wVar.setPlaybackSpeed(oVar.f4189e[i10]);
                }
                wVar.f4207A.dismiss();
            }
        });
    }

    @Override // w0.L
    public final k0 f(RecyclerView recyclerView, int i7) {
        return new s(LayoutInflater.from(this.f4190g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }
}
