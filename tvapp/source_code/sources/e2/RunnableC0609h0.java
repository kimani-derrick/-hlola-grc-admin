package e2;

import H2.C0020v;
import android.util.Pair;
/* renamed from: e2.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0609h0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f9976q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.D f9977r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Pair f9978s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0020v f9979t;

    public /* synthetic */ RunnableC0609h0(androidx.fragment.app.D d, Pair pair, C0020v c0020v, int i7) {
        this.f9976q = i7;
        this.f9977r = d;
        this.f9978s = pair;
        this.f9979t = c0020v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9976q) {
            case 0:
                Pair pair = this.f9978s;
                ((f2.f) ((J3.m) this.f9977r.f5884s).f1400i).k(((Integer) pair.first).intValue(), (H2.A) pair.second, this.f9979t);
                return;
            default:
                Pair pair2 = this.f9978s;
                int intValue = ((Integer) pair2.first).intValue();
                H2.A a7 = (H2.A) pair2.second;
                a7.getClass();
                ((f2.f) ((J3.m) this.f9977r.f5884s).f1400i).q(intValue, a7, this.f9979t);
                return;
        }
    }
}
