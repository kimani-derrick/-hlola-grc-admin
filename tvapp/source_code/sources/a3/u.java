package a3;

import H2.A;
import Z2.H;
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5121q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ y f5122r;

    public /* synthetic */ u(y yVar, int i7, long j7) {
        this.f5122r = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f5122r;
        int i7 = this.f5121q;
        yVar.getClass();
        switch (i7) {
            case 0:
                int i8 = H.f4603a;
                f2.f fVar = yVar.f5136c.f10095q.f9426H;
                fVar.R(fVar.N((A) fVar.f10351t.f16464e), 1018, new f2.b(16));
                return;
            default:
                int i9 = H.f4603a;
                f2.f fVar2 = yVar.f5136c.f10095q.f9426H;
                fVar2.R(fVar2.N((A) fVar2.f10351t.f16464e), 1021, new f2.b(20));
                return;
        }
    }

    public /* synthetic */ u(y yVar, long j7, int i7) {
        this.f5122r = yVar;
    }
}
