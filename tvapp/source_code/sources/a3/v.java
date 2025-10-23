package a3;

import Z2.H;
import a4.C0214f;
import android.view.Surface;
import e2.C0585B;
import f2.C0695a;
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ y f5123q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f5124r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f5125s;

    public /* synthetic */ v(y yVar, Surface surface, long j7) {
        this.f5123q = yVar;
        this.f5124r = surface;
        this.f5125s = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f5123q;
        yVar.getClass();
        int i7 = H.f4603a;
        C0585B c0585b = yVar.f5136c.f10095q;
        f2.f fVar = c0585b.f9426H;
        C0695a Q4 = fVar.Q();
        Object obj = this.f5124r;
        fVar.R(Q4, 26, new f2.c(Q4, obj, this.f5125s));
        if (c0585b.f9449f0 == obj) {
            c0585b.f9421B.e(26, new C0214f(5));
        }
    }
}
