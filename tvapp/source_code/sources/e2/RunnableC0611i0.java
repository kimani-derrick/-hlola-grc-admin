package e2;

import android.util.Pair;
/* renamed from: e2.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0611i0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f9987q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.D f9988r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Pair f9989s;

    public /* synthetic */ RunnableC0611i0(androidx.fragment.app.D d, Pair pair, int i7) {
        this.f9987q = i7;
        this.f9988r = d;
        this.f9989s = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9987q) {
            case 0:
                Pair pair = this.f9989s;
                ((f2.f) ((J3.m) this.f9988r.f5884s).f1400i).e(((Integer) pair.first).intValue(), (H2.A) pair.second);
                return;
            case 1:
                Pair pair2 = this.f9989s;
                ((f2.f) ((J3.m) this.f9988r.f5884s).f1400i).J(((Integer) pair2.first).intValue(), (H2.A) pair2.second);
                return;
            case 2:
                Pair pair3 = this.f9989s;
                ((f2.f) ((J3.m) this.f9988r.f5884s).f1400i).f(((Integer) pair3.first).intValue(), (H2.A) pair3.second);
                return;
            default:
                Pair pair4 = this.f9989s;
                ((f2.f) ((J3.m) this.f9988r.f5884s).f1400i).H(((Integer) pair4.first).intValue(), (H2.A) pair4.second);
                return;
        }
    }
}
