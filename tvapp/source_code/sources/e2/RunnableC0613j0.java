package e2;

import H2.C0016q;
import H2.C0020v;
import android.util.Pair;
/* renamed from: e2.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0613j0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f9992q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.D f9993r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Pair f9994s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0016q f9995t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0020v f9996u;

    public /* synthetic */ RunnableC0613j0(androidx.fragment.app.D d, Pair pair, C0016q c0016q, C0020v c0020v, int i7) {
        this.f9992q = i7;
        this.f9993r = d;
        this.f9994s = pair;
        this.f9995t = c0016q;
        this.f9996u = c0020v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9992q) {
            case 0:
                Pair pair = this.f9994s;
                ((f2.f) ((J3.m) this.f9993r.f5884s).f1400i).C(((Integer) pair.first).intValue(), (H2.A) pair.second, this.f9995t, this.f9996u);
                return;
            case 1:
                Pair pair2 = this.f9994s;
                ((f2.f) ((J3.m) this.f9993r.f5884s).f1400i).a(((Integer) pair2.first).intValue(), (H2.A) pair2.second, this.f9995t, this.f9996u);
                return;
            default:
                Pair pair3 = this.f9994s;
                ((f2.f) ((J3.m) this.f9993r.f5884s).f1400i).t(((Integer) pair3.first).intValue(), (H2.A) pair3.second, this.f9995t, this.f9996u);
                return;
        }
    }
}
