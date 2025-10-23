package Z2;

import android.util.Pair;
import g2.C0720k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4641q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f4642r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f4643s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f4644t;

    public /* synthetic */ l(Object obj, int i7, Object obj2, int i8) {
        this.f4641q = i8;
        this.f4643s = obj;
        this.f4642r = i7;
        this.f4644t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4641q) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f4643s).iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    if (!oVar.d) {
                        int i7 = this.f4642r;
                        if (i7 != -1) {
                            oVar.f4646b.b(i7);
                        }
                        oVar.f4647c = true;
                        ((m) this.f4644t).c(oVar.f4645a);
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) this.f4644t;
                ((f2.f) ((J3.m) ((androidx.fragment.app.D) this.f4643s).f5884s).f1400i).F(((Integer) pair.first).intValue(), (H2.A) pair.second, this.f4642r);
                return;
            case 2:
                j2.n nVar = (j2.n) this.f4643s;
                int i8 = nVar.f11833a;
                j2.o oVar2 = (j2.o) this.f4644t;
                oVar2.getClass();
                oVar2.F(i8, nVar.f11834b, this.f4642r);
                return;
            default:
                ((u0.b) ((C0720k) this.f4643s).f10695c).g(this.f4642r, this.f4644t);
                return;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i7, int i8) {
        this.f4641q = i8;
        this.f4643s = obj;
        this.f4644t = obj2;
        this.f4642r = i7;
    }
}
