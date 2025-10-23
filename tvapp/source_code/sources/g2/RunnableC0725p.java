package g2;

import f2.C0695a;
/* renamed from: g2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0725p implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10707q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a3.y f10708r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Exception f10709s;

    public /* synthetic */ RunnableC0725p(a3.y yVar, Exception exc, int i7) {
        this.f10707q = i7;
        this.f10708r = yVar;
        this.f10709s = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.f10709s;
        a3.y yVar = this.f10708r;
        int i7 = this.f10707q;
        yVar.getClass();
        switch (i7) {
            case 0:
                int i8 = Z2.H.f4603a;
                f2.f fVar = yVar.f5136c.f10095q.f9426H;
                C0695a Q4 = fVar.Q();
                fVar.R(Q4, 1029, new f2.d(Q4, exc, 12));
                return;
            default:
                int i9 = Z2.H.f4603a;
                f2.f fVar2 = yVar.f5136c.f10095q.f9426H;
                C0695a Q6 = fVar2.Q();
                fVar2.R(Q6, 1014, new f2.b(Q6, exc, 19));
                return;
        }
    }
}
