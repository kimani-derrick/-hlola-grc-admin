package l5;

import android.util.DisplayMetrics;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import w0.C;
/* renamed from: l5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0977a extends C {

    /* renamed from: q  reason: collision with root package name */
    public final h5.d f12269q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12270r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0977a(DpadRecyclerView dpadRecyclerView, h5.d dVar) {
        super(dpadRecyclerView.getContext());
        M5.g.f(dVar, "layoutInfo");
        this.f12269q = dVar;
    }

    @Override // w0.C
    public float b(DisplayMetrics displayMetrics) {
        return super.b(displayMetrics) * this.f12269q.f11019b.f10164u;
    }

    @Override // w0.C
    public final int d(int i7) {
        int d = super.d(i7);
        int l7 = this.f12269q.f11020c.l();
        if (l7 > 0) {
            return Math.max(d, (i7 * 30) / l7);
        }
        return d;
    }
}
