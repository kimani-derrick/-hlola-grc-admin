package g2;

import e2.C0585B;
import e2.SurfaceHolder$CallbackC0629y;
import f2.C0695a;
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10712q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a3.y f10713r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ i2.e f10714s;

    public /* synthetic */ r(a3.y yVar, i2.e eVar, int i7) {
        this.f10712q = i7;
        this.f10713r = yVar;
        this.f10714s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10712q) {
            case 0:
                a3.y yVar = this.f10713r;
                yVar.getClass();
                int i7 = Z2.H.f4603a;
                C0585B c0585b = yVar.f5136c.f10095q;
                c0585b.getClass();
                f2.f fVar = c0585b.f9426H;
                C0695a Q4 = fVar.Q();
                fVar.R(Q4, 1007, new f2.b(Q4, this.f10714s, 23));
                return;
            default:
                a3.y yVar2 = this.f10713r;
                i2.e eVar = this.f10714s;
                yVar2.getClass();
                synchronized (eVar) {
                }
                SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = yVar2.f5136c;
                int i8 = Z2.H.f4603a;
                f2.f fVar2 = surfaceHolder$CallbackC0629y.f10095q.f9426H;
                fVar2.R(fVar2.N((H2.A) fVar2.f10351t.f16464e), 1013, new f2.b(10));
                return;
        }
    }
}
