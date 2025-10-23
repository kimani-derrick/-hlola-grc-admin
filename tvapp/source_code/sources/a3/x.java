package a3;

import Z2.H;
import a4.C0214f;
import f2.C0695a;
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5129q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f5130r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f5131s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f5132t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f5133u;

    public /* synthetic */ x(Object obj, String str, long j7, long j8, int i7) {
        this.f5129q = i7;
        this.f5133u = obj;
        this.f5130r = str;
        this.f5131s = j7;
        this.f5132t = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f5133u;
        int i7 = this.f5129q;
        y yVar = (y) obj;
        yVar.getClass();
        switch (i7) {
            case 0:
                int i8 = H.f4603a;
                f2.f fVar = yVar.f5136c.f10095q.f9426H;
                C0695a Q4 = fVar.Q();
                fVar.R(Q4, 1016, new f2.b(Q4, this.f5130r, this.f5132t, this.f5131s));
                return;
            default:
                int i9 = H.f4603a;
                f2.f fVar2 = yVar.f5136c.f10095q.f9426H;
                C0695a Q6 = fVar2.Q();
                fVar2.R(Q6, 1008, new C0214f(Q6, this.f5130r, this.f5132t, this.f5131s));
                return;
        }
    }
}
