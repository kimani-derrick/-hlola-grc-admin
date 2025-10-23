package a3;

import H2.A;
import H2.U;
import Z2.H;
import e2.C0585B;
import e2.SurfaceHolder$CallbackC0629y;
import f2.C0695a;
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5126q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ y f5127r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ i2.e f5128s;

    public /* synthetic */ w(y yVar, i2.e eVar, int i7) {
        this.f5126q = i7;
        this.f5127r = yVar;
        this.f5128s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5126q) {
            case 0:
                y yVar = this.f5127r;
                i2.e eVar = this.f5128s;
                yVar.getClass();
                synchronized (eVar) {
                }
                SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = yVar.f5136c;
                int i7 = H.f4603a;
                f2.f fVar = surfaceHolder$CallbackC0629y.f10095q.f9426H;
                C0695a N6 = fVar.N((A) fVar.f10351t.f16464e);
                fVar.R(N6, 1020, new U(N6, eVar, 18));
                return;
            default:
                y yVar2 = this.f5127r;
                yVar2.getClass();
                int i8 = H.f4603a;
                C0585B c0585b = yVar2.f5136c.f10095q;
                c0585b.getClass();
                f2.f fVar2 = c0585b.f9426H;
                C0695a Q4 = fVar2.Q();
                fVar2.R(Q4, 1015, new f2.b(Q4, this.f5128s, 6));
                return;
        }
    }
}
