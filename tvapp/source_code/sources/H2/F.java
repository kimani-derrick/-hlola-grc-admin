package H2;

import android.util.Pair;
import java.io.IOException;
/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f893q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0016q f894r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0020v f895s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ IOException f896t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f897u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f898v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f899w;

    public /* synthetic */ F(Object obj, Object obj2, C0016q c0016q, C0020v c0020v, IOException iOException, boolean z7, int i7) {
        this.f893q = i7;
        this.f898v = obj;
        this.f899w = obj2;
        this.f894r = c0016q;
        this.f895s = c0020v;
        this.f896t = iOException;
        this.f897u = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f893q) {
            case 0:
                C.d dVar = (C.d) this.f898v;
                ((H) this.f899w).p(dVar.f324r, (A) dVar.f325s, this.f894r, this.f895s, this.f896t, this.f897u);
                return;
            default:
                f2.f fVar = (f2.f) ((J3.m) ((androidx.fragment.app.D) this.f898v).f5884s).f1400i;
                Pair pair = (Pair) this.f899w;
                fVar.p(((Integer) pair.first).intValue(), (A) pair.second, this.f894r, this.f895s, this.f896t, this.f897u);
                return;
        }
    }
}
