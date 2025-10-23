package w0;

import android.view.View;
import java.util.List;
/* renamed from: w0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346A {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15432a;

    /* renamed from: b  reason: collision with root package name */
    public int f15433b;

    /* renamed from: c  reason: collision with root package name */
    public int f15434c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f15435e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f15436g;

    /* renamed from: h  reason: collision with root package name */
    public int f15437h;

    /* renamed from: i  reason: collision with root package name */
    public int f15438i;

    /* renamed from: j  reason: collision with root package name */
    public int f15439j;

    /* renamed from: k  reason: collision with root package name */
    public List f15440k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15441l;

    public final void a(View view) {
        int f;
        int f7;
        int size = this.f15440k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < size; i8++) {
            View view3 = ((k0) this.f15440k.get(i8)).f15576a;
            V v5 = (V) view3.getLayoutParams();
            if (view3 != view && !v5.f15490a.m() && (f7 = (v5.f15490a.f() - this.d) * this.f15435e) >= 0 && f7 < i7) {
                view2 = view3;
                if (f7 == 0) {
                    break;
                }
                i7 = f7;
            }
        }
        if (view2 == null) {
            f = -1;
        } else {
            f = ((V) view2.getLayoutParams()).f15490a.f();
        }
        this.d = f;
    }

    public final View b(a0 a0Var) {
        List list = this.f15440k;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((k0) this.f15440k.get(i7)).f15576a;
                V v5 = (V) view.getLayoutParams();
                if (!v5.f15490a.m() && this.d == v5.f15490a.f()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d = a0Var.d(this.d);
        this.d += this.f15435e;
        return d;
    }
}
